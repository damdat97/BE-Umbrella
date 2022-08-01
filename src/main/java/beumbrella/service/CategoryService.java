package beumbrella.service;

import beumbrella.model.Category;


public interface CategoryService extends IGeneralService<Category>{
    Iterable<Category>findAllByNameContaining(String name);
}
