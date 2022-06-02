package aog.ogsite.project.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * aog.ogsite.project.dto.QOrderDto is a Querydsl Projection type for OrderDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QOrderDto extends ConstructorExpression<OrderDto> {

    private static final long serialVersionUID = 1052158639L;

    public QOrderDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<Long> orderItemId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<java.time.LocalDate> orderedAt, com.querydsl.core.types.Expression<String> payment, com.querydsl.core.types.Expression<Integer> orderPrice, com.querydsl.core.types.Expression<aog.ogsite.project.domain.OrderStatus> orderStatus) {
        super(OrderDto.class, new Class<?>[]{long.class, long.class, String.class, String.class, java.time.LocalDate.class, String.class, int.class, aog.ogsite.project.domain.OrderStatus.class}, id, orderItemId, name, itemName, orderedAt, payment, orderPrice, orderStatus);
    }

}

