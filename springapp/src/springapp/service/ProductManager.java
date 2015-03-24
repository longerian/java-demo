package springapp.service;

import springapp.domain.Product;

import java.io.Serializable;
import java.util.List;

/**
 * Created by huifeng.hxl on 2015/2/28.
 */
public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);

    public List<Product> getProducts();

}
