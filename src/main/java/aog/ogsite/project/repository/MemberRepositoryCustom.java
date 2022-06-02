package aog.ogsite.project.repository;


import aog.ogsite.project.domain.SearchMember;
import aog.ogsite.project.dto.MemberDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface MemberRepositoryCustom {
    Page<MemberDto> searchAll(Pageable pageable);

    Page<MemberDto> searchByCondition(SearchMember search, Pageable pageable);


}
