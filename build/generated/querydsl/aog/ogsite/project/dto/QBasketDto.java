package aog.ogsite.project.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * aog.ogsite.project.dto.QBasketDto is a Querydsl Projection type for BasketDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QBasketDto extends ConstructorExpression<BasketDto> {

    private static final long serialVersionUID = 1305052923L;

    public QBasketDto(com.querydsl.core.types.Expression<Long> basketId, com.querydsl.core.types.Expression<Integer> basketCount, com.querydsl.core.types.Expression<Long> itemId, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<String> color, com.querydsl.core.types.Expression<String> imgUrl, com.querydsl.core.types.Expression<Integer> price) {
        super(BasketDto.class, new Class<?>[]{long.class, int.class, long.class, String.class, String.class, String.class, int.class}, basketId, basketCount, itemId, itemName, color, imgUrl, price);
    }

}

