package dao;

import vo.order;

public interface orderDao {
    public void add(order order);
    public void delete(order order);
    public void update(order order);
}
