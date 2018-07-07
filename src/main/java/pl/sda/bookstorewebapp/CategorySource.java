package pl.sda.bookstorewebapp;

import java.util.List;
import java.util.Optional;

public interface CategorySource {
    void updateCategory(Category category);
    List<Category> findCategoriesByName(String name);
    List<Category> getCategories();
    Optional<Category> findCategoryById(Integer id);
}
