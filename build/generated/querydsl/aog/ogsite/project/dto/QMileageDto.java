package aog.ogsite.project.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * aog.ogsite.project.dto.QMileageDto is a Querydsl Projection type for MileageDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QMileageDto extends ConstructorExpression<MileageDto> {

    private static final long serialVersionUID = 1890109491L;

    public QMileageDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<Integer> mileagePrice, com.querydsl.core.types.Expression<String> mileageContent) {
        super(MileageDto.class, new Class<?>[]{long.class, int.class, String.class}, id, mileagePrice, mileageContent);
    }

}

