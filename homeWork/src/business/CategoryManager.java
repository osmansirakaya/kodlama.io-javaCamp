package business;
import dataAccess.CategoryDao;
import entities.Category;
import entities.Course;

import java.util.Objects;

public class CategoryManager {
    private CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
    public void add(Category category) throws Exception {
        Category[] categories = new Category[]{ new Category(2,"adi")};
        for(Category category1 : categories){
            if(Objects.equals(category1.getCategoryName(), category.getCategoryName())) {
                throw new Exception("Aynı Katagori Adı Olamaz");
            }
        }
        System.out.println(category.getCategoryName()+" "+"kategori eklendi.");
        categoryDao.add(category);
    }
}
