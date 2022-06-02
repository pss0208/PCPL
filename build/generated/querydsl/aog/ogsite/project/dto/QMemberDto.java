package aog.ogsite.project.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * aog.ogsite.project.dto.QMemberDto is a Querydsl Projection type for MemberDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QMemberDto extends ConstructorExpression<MemberDto> {

    private static final long serialVersionUID = -8579673L;

    public QMemberDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<String> loginId, com.querydsl.core.types.Expression<aog.ogsite.project.domain.MemberGrade> memberGrade, com.querydsl.core.types.Expression<String> phoneNumber, com.querydsl.core.types.Expression<Integer> visitCount, com.querydsl.core.types.Expression<Integer> orderCount, com.querydsl.core.types.Expression<java.time.LocalDate> createdAt) {
        super(MemberDto.class, new Class<?>[]{long.class, String.class, String.class, aog.ogsite.project.domain.MemberGrade.class, String.class, int.class, int.class, java.time.LocalDate.class}, id, name, loginId, memberGrade, phoneNumber, visitCount, orderCount, createdAt);
    }

}

