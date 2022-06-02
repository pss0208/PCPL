package aog.ogsite.project.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * aog.ogsite.project.dto.QItemDto is a Querydsl Projection type for ItemDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QItemDto extends ConstructorExpression<ItemDto> {

    private static final long serialVersionUID = 1556115214L;

    public QItemDto(com.querydsl.core.types.Expression<Long> itemIdx, com.querydsl.core.types.Expression<String> imgUrl, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<String> color, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<Integer> basketCount) {
        super(ItemDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, int.class, int.class}, itemIdx, imgUrl, itemName, color, price, basketCount);
    }

    public QItemDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<String> firstCategory, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> saleStatus, com.querydsl.core.types.Expression<String> imgUrl, com.querydsl.core.types.Expression<String> color, com.querydsl.core.types.Expression<Boolean> rep, com.querydsl.core.types.Expression<Long> itemIdx) {
        super(ItemDto.class, new Class<?>[]{long.class, String.class, String.class, int.class, String.class, String.class, String.class, boolean.class, long.class}, id, itemName, firstCategory, price, saleStatus, imgUrl, color, rep, itemIdx);
    }

    public QItemDto(com.querydsl.core.types.Expression<Long> itemIdx, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<String> imgUrl, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> firstCategory, com.querydsl.core.types.Expression<String> secondCategory, com.querydsl.core.types.Expression<String> saleStatus, com.querydsl.core.types.Expression<Boolean> rep) {
        super(ItemDto.class, new Class<?>[]{long.class, String.class, String.class, int.class, String.class, String.class, String.class, boolean.class}, itemIdx, itemName, imgUrl, price, firstCategory, secondCategory, saleStatus, rep);
    }

}

