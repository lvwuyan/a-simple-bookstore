package dao.impl;

import dao.JDBCUtil;
import dao.userDao;
import vo.User;

import java.sql.*;


public class userDaoImpl implements userDao {
    @Override
    public void add(User user) {
        Connection connection = null;
        Statement stat = null;
        try {
            connection = JDBCUtil.getConnection();
            stat = (Statement)connection.createStatement();
            String sql = "insert into user ";
            ResultSet resultSet = (ResultSet) stat.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.closeConnection(connection);
        }
    }

    @Override
    public void delete(User user) {

    }
}
