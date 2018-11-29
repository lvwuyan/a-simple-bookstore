package dao.impl;

import dao.JDBCUtil;
import dao.bookDao;
import vo.book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements bookDao {
    @Override
    public void select(book book) {

    }

    @Override
    public void add(book book) {

    }

    @Override
    public void delete(book book) {

    }

    @Override
    public List<book> getBookByCategory(int category_id) {
        List<book> list = new ArrayList<book>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select id,name,author,price,image,description,category_id from book where category_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,category_id);
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                book book = new book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getDouble("price"));
                book.setImage(rs.getString("image"));
                book.setDescription(rs.getString("description"));
                book.setCategory_id(rs.getString("category_id"));
                list.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.closeConnection(connection);
        }
        return list;
    }
}
