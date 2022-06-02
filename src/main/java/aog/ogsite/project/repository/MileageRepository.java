package aog.ogsite.project.repository;


import aog.ogsite.project.domain.Member;
import aog.ogsite.project.domain.Mileage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MileageRepository extends JpaRepository<Mileage, Long> {
    Page<Mileage> findAllByMember(Member member, Pageable pageable);
}
