package aog.ogsite.project.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * aog.ogsite.project.dto.QWeeklyBestDto is a Querydsl Projection type for WeeklyBestDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QWeeklyBestDto extends ConstructorExpression<WeeklyBestDto> {

    private static final long serialVersionUID = -860237476L;

    public QWeeklyBestDto(com.querydsl.core.types.Expression<Long> itemIdx, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> itemInfo, com.querydsl.core.types.Expression<String> imgUrl) {
        super(WeeklyBestDto.class, new Class<?>[]{long.class, String.class, int.class, String.class, String.class}, itemIdx, itemName, price, itemInfo, imgUrl);
    }

    public QWeeklyBestDto(com.querydsl.core.types.Expression<Long> itemIdx, com.querydsl.core.types.Expression<String> itemName, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> imgUrl) {
        super(WeeklyBestDto.class, new Class<?>[]{long.class, String.class, int.class, String.class}, itemIdx, itemName, price, imgUrl);
    }

}

