package dataAccess.hibernate;

import dataAccess.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    public void add(Category category) {
        System.out.println("HibernateCategoryDao.add() methodu çalıştı.");
    }
}

