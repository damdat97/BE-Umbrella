package beumbrella.service.impl;

import beumbrella.model.CategoryDetail;
import beumbrella.repository.CategoryDetailRepository;
import beumbrella.service.CategoryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryDetailServiceImpl implements CategoryDetailService {
    @Autowired
    CategoryDetailRepository categoryDetailRepository;

    @Override
    public Iterable<CategoryDetail> findAll() {
        return categoryDetailRepository.findAll();
    }

    @Override
    public Optional<CategoryDetail> findById(Long id) {
        return categoryDetailRepository.findById(id);
    }

    @Override
    public void save(CategoryDetail categoryDetail) {
        categoryDetailRepository.save(categoryDetail);

    }

    @Override
    public void remove(Long id) {
categoryDetailRepository.deleteById(id);
    }
}
