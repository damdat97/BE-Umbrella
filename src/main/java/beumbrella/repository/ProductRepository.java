package beumbrella.repository;

import beumbrella.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "select * from products order by id desc limit 4", nativeQuery = true)
    Iterable<Product> findNewProduct();
    Iterable<Product>findAllByNameContaining(String name);
    Iterable<Product>findAllByPriceBetween(int from, int to);
    @Query(value = "select * from products where user_id = :user_id ",nativeQuery = true)
    Iterable<Product> findByUserId(@Param("user_id") Long user_id);
}
