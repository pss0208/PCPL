package aog.ogsite.project.domain;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SearchMember {
    //타임리프의 name이 이 부분과 같아야 한다.
    private String searchCondition;
    private String searchKeyword;
}
