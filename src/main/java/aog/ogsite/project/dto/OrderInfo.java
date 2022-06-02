package aog.ogsite.project.dto;


import aog.ogsite.project.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderInfo {
    private String name;

    private OrderStatus orderStatus;

    private String itemName;

    private int orderPrice;
}
