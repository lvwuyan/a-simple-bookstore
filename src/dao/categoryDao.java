package dao;

import vo.Category;

import java.util.List;

public interface categoryDao {
    public void add(Category category);

    public void delete(Category category);

    public List<Category> findAll();
}
