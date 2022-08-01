package beumbrella.service;

import beumbrella.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductService extends IGeneralService<Product>{
    Iterable<Product> findNewProduct();
    Iterable<Product>findAllByNameContaining(String name);
    Iterable<Product>findAllByPriceBetween(int from, int to);
    @Query(value = "select * from products where user_id = :user_id ",nativeQuery = true)
    Iterable<Product> findByUserId(@Param("user_id") Long user_id);
}
