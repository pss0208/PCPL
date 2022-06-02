package aog.ogsite.project.repository;


import aog.ogsite.project.domain.SearchOrder;
import aog.ogsite.project.dto.MainPageOrderDto;
import aog.ogsite.project.dto.OrderDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderRepositoryCustom {
    Page<OrderDto> searchAllOrder(Pageable pageable);

    Page<OrderDto> searchAllOrderByCondition(SearchOrder searchOrder, Pageable pageable);

    Page<MainPageOrderDto> mainPageSearchAllOrder(Pageable pageable, String loginId);

    Page<MainPageOrderDto> mainPageSearchAllOrderByCondition(SearchOrder searchOrder, Pageable pageable, String loginId);
}
