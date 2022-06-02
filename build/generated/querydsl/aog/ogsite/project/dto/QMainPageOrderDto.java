package aog.ogsite.project.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * aog.ogsite.project.dto.QMainPageOrderDto is a Querydsl Projection type for MainPageOrderDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QMainPageOrderDto extends ConstructorExpression<MainPageOrderDto> {

    private static final long serialVersionUID = -104587081L;

    public QMainPageOrderDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<Long> orderItemId, com.querydsl.core.types.Expression<Long> itemId, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<java.time.LocalDate> orderedAt, com.querydsl.core.types.Expression<aog.ogsite.project.domain.OrderStatus> orderStatus, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<Integer> count, com.querydsl.core.types.Expression<String> url, com.querydsl.core.types.Expression<String> color) {
        super(MainPageOrderDto.class, new Class<?>[]{long.class, long.class, long.class, String.class, String.class, java.time.LocalDate.class, aog.ogsite.project.domain.OrderStatus.class, int.class, int.class, String.class, String.class}, id, orderItemId, itemId, name, itemName, orderedAt, orderStatus, price, count, url, color);
    }

}

