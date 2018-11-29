package dao;

import vo.book;

public interface bookDao {
    public void select(book book);
    public void add(book book);
    public void delete(book book);
}
