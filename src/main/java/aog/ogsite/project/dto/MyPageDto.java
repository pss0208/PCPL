package aog.ogsite.project.dto;


import aog.ogsite.project.domain.MemberGrade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyPageDto {
    private String name;
    private MemberGrade grade;
    private int mileage;
}
