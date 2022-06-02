package aog.ogsite.project.service;


import aog.ogsite.project.domain.Order;
import aog.ogsite.project.domain.OrderStatus;
import aog.ogsite.project.domain.SearchOrder;
import aog.ogsite.project.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {

    List<Order> findAllOrders();
//    모든 주문내역 조회하는 메소드

    Long doOrder(Long memberId, List<Long> itemId, List<Integer> count, PaymentAddressDto paymentAddressDto, PaymentPriceDto paymentPriceDto);
//    주문 기능 메소드

    void cancelOrder(Long orderId);
//    주문 취소하는 메소드

    Long changeOrderStatus(Long orderItemId, OrderStatus orderStatus);
//    주문 상태 변경하는 메소드

    MyPageOrderStatusDto showOrderStatus(String loginId);
//    주문상태 보여주는 메소드

    OrderMainPageDto getOrderPagingDto(SearchOrder searchOrder, Pageable pageable, String loginId);

    OrderPageDto findAllOrderByPaging(Pageable pageable);

    OrderPageDto findAllOrderByConditionByPaging(SearchOrder searchOrder, Pageable pageable);

    Page<OrderDto> findAllOrder(Pageable pageable);
}
