package beumbrella.repository;

import beumbrella.model.Category;
import beumbrella.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Iterable<Category>findAllByNameContaining(String name);
}
