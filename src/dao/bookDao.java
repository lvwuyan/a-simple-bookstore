package dao;

import vo.book;

import java.util.List;

public interface bookDao {
    public void select(book book);
    public void add(book book);
    public void delete(book book);
    public List<book> getBookByCategory(int category_id);
}
