package springapp.repository;

import springapp.domain.Product;

import java.util.List;

/**
 * Created by huifeng.hxl on 2015/3/1.
 */
public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product product);

}
