package service;

import dao.categoryDao;
import dao.impl.categoryDaoImpl;
import vo.Category;

import java.util.List;

public class CategoryService {
    private categoryDao category=new categoryDaoImpl();

    public List<Category> findAll(){
        return category.findAll();
    }
}
