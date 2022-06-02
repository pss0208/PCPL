package aog.ogsite.project.service;


import aog.ogsite.project.domain.OrderItem;
import aog.ogsite.project.domain.OrderStatus;

public interface OrderItemService {
    OrderItem findOrderItemById(Long id);

    void chagneOrderStatus(Long id, OrderStatus orderStatus);
}
