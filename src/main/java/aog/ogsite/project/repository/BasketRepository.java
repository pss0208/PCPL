package aog.ogsite.project.repository;


import aog.ogsite.project.domain.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket, Long> {
    List<Basket> findAllByMemberId(Long id);
}
