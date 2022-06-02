package aog.ogsite.project.repository;


import aog.ogsite.project.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long>, OrderRepositoryCustom {

}
