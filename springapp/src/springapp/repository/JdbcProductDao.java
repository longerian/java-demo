package springapp.repository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import springapp.domain.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by huifeng.hxl on 2015/3/1.
 */
public class JdbcProductDao extends SimpleJdbcDaoSupport implements ProductDao {

    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public List<Product> getProductList() {
        logger.info("Getting products!");
        List<Product> products = getSimpleJdbcTemplate().query(
                "select id, description, price from products",
                new ProductMapper());
        return products;
    }

    @Override
    public void saveProduct(Product product) {
        logger.info("Saving products: " + product.getDescription());
        int count = getSimpleJdbcTemplate().update(
                "update products set description = :description, price = :price where id = :id",
                new MapSqlParameterSource().addValue("description", product.getDescription())
                    .addValue("price", product.getPrice())
                    .addValue("id", product.getId()));
        logger.info("Rows affected: " + count);
    }

    private static class ProductMapper implements ParameterizedRowMapper<Product> {

        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product prod = new Product();
            prod.setId(rs.getInt("id"));
            prod.setDescription(rs.getString("description"));
            prod.setPrice(new Double(rs.getDouble("price")));
            return prod;
        }

    }

}
