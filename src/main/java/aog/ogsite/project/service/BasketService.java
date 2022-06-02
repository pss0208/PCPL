package aog.ogsite.project.service;


import aog.ogsite.project.domain.Basket;
import aog.ogsite.project.dto.ItemDto;

import java.util.List;

public interface BasketService {
    List<Basket> findAllBasketByMemberId(Long id);

    Basket findBasketById(Long id);

    void changeBasketItemQuantity(Long id, int changeQuantity);

    void deleteBasketById(Long id);

    List<ItemDto> basketListToPayment(String itemList);
}
