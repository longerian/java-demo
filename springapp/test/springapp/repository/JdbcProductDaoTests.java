package springapp.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import springapp.domain.Product;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by huifeng.hxl on 2015/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"../../JdbcProductDaoTests-context.xml"})
public class JdbcProductDaoTests extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private ProductDao productDao;


    public void setProductDao(ProductDao productDao) {
        System.out.println("set product dao " + productDao);
        this.productDao = productDao;
    }

    protected void onSetUpInTransaction() throws Exception {
        super.deleteFromTables(new String[] {"products"});
        super.executeSqlScript("file:db/load_data.sql", true);
    }

    @Test
    public void testGetProductList() {

        List<Product> products = productDao.getProductList();

        assertEquals("wrong number of products?", 3, products.size());

    }

    @Test
    public void testSaveProduct() {

        List<Product> products = productDao.getProductList();

        for (Product p : products) {
            p.setPrice(200.12);
            productDao.saveProduct(p);
        }

        List<Product> updatedProducts = productDao.getProductList();
        for (Product p : updatedProducts) {
            assertEquals("wrong price of product?", 200.12, p.getPrice());
        }

    }

}
