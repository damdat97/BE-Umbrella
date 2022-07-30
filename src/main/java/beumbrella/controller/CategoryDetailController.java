package beumbrella.controller;

import beumbrella.model.Category;
import beumbrella.model.CategoryDetail;
import beumbrella.model.Product;
import beumbrella.service.impl.CategoryDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/category-details")
public class CategoryDetailController {
    @Autowired
    CategoryDetailServiceImpl categoryDetailService;
    @GetMapping
    public ResponseEntity<Iterable<CategoryDetail>> findAll() {
        return new ResponseEntity<>(categoryDetailService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CategoryDetail>> findById(@PathVariable long id) {
        return new ResponseEntity<>(categoryDetailService.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Iterable<CategoryDetail>> add(@RequestBody CategoryDetail categoryDetail) {
        categoryDetailService.save(categoryDetail);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDetail> edit(@PathVariable long id, @RequestBody CategoryDetail categoryDetail) {
        Optional<CategoryDetail> categoryDetail1 = categoryDetailService.findById(id);
        if (!categoryDetail1.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        categoryDetail.setId(categoryDetail1.get().getId());
        categoryDetailService.save(categoryDetail);
        return new ResponseEntity<>(categoryDetail, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoryDetail> update(@PathVariable long id) {
        categoryDetailService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
