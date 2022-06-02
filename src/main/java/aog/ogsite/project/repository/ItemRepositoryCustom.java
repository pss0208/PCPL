package aog.ogsite.project.repository;


import aog.ogsite.project.domain.SearchItem;
import aog.ogsite.project.dto.ItemDto;
import aog.ogsite.project.dto.WeeklyBestDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ItemRepositoryCustom {
    Page<ItemDto> searchAllItem(Pageable pageable);

    Page<ItemDto> searchAllItemByCondition(SearchItem searchItem, Pageable pageable);

    Page<ItemDto> findAllItem(Pageable pageable, String firstCategory, String secondCategory);

    Page<ItemDto> findSaleItem(Pageable pageable, String firstCategory);

    Long searchMaxItemIdx();

    ItemDto findAllItemInBasket(Long itemId);

    List<WeeklyBestDto> findWeeklyBestItem(String firstCategory, String secondCategory, boolean rep);

    List<WeeklyBestDto> findNewArrivalItem(String firstCategory, String secondCategory, boolean rep);

}
