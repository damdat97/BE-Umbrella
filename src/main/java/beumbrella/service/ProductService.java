package beumbrella.service;

import beumbrella.model.Product;

public interface ProductService extends IGeneralService<Product>{
    Iterable<Product> findNewProduct();
    Iterable<Product>findAllByNameContaining(String name);
    Iterable<Product>findAllByPriceBetween(int from, int to);
}
