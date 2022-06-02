package aog.ogsite.project.repository;


import aog.ogsite.project.domain.Item;
import aog.ogsite.project.domain.QBasket;
import aog.ogsite.project.domain.QItem;
import aog.ogsite.project.domain.SearchItem;
import aog.ogsite.project.dto.ItemDto;
import aog.ogsite.project.dto.QItemDto;
import aog.ogsite.project.dto.QWeeklyBestDto;
import aog.ogsite.project.dto.WeeklyBestDto;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.thymeleaf.util.StringUtils;

import javax.persistence.EntityManager;
import java.util.List;


public class ItemRepositoryImpl implements ItemRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public ItemRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public Page<ItemDto> searchAllItem(Pageable pageable) {
        QueryResults<ItemDto> results = queryFactory
                .select(new QItemDto(
                        QItem.item.id,
                        QItem.item.itemName,
                        QItem.item.firstCategory,
                        QItem.item.price,
                        QItem.item.saleStatus,
                        QItem.item.imgUrl,
                        QItem.item.color,
                        QItem.item.rep,
                        QItem.item.itemIdx
                ))
                .from(QItem.item)
                .where(QItem.item.rep.eq(true))
                .orderBy(QItem.item.id.desc())
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();

        List<ItemDto> content = results.getResults();
        long total = results.getTotal();

        return new PageImpl<>(content, pageable, total);
    }

    @Override
    public Page<ItemDto> searchAllItemByCondition(SearchItem search, Pageable pageable) {

        if (search.getCmode().equals("whole")) {
            QueryResults results = queryFactory
                    .select(new QItemDto(
                            QItem.item.id,
                            QItem.item.itemName,
                            QItem.item.firstCategory,
                            QItem.item.price,
                            QItem.item.saleStatus,
                            QItem.item.imgUrl,
                            QItem.item.color,
                            QItem.item.rep,
                            QItem.item.itemIdx
                    ))
                    .from(QItem.item)
                    .where(QItem.item.rep.eq(true), saleStatusEq(search.getSalestatus()), itemNameEq(search.getItem_name()))
                    .orderBy(QItem.item.id.desc())
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize())
                    .fetchResults();

            List<ItemDto> content = results.getResults();
            long total = results.getTotal();

            return new PageImpl<>(content, pageable, total);
        } else {
            QueryResults results = queryFactory
                    .select(new QItemDto(
                            QItem.item.id,
                            QItem.item.itemName,
                            QItem.item.firstCategory,
                            QItem.item.price,
                            QItem.item.saleStatus,
                            QItem.item.imgUrl,
                            QItem.item.color,
                            QItem.item.rep,
                            QItem.item.itemIdx
                    ))
                    .from(QItem.item)
                    .where(QItem.item.rep.eq(true), saleStatusEq(search.getSalestatus()), cmodeEq(search.getCmode()), itemNameEq(search.getItem_name()))
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize())
                    .fetchResults();

            List<ItemDto> content = results.getResults();
            long total = results.getTotal();

            return new PageImpl<>(content, pageable, total);
        }
    }

    @Override
    public Page<ItemDto> findAllItem(Pageable pageable, String firstCategory, String secondCategory) {
        QueryResults results = queryFactory
                .selectDistinct(new QItemDto(
                        QItem.item.itemIdx,
                        QItem.item.itemName,
                        QItem.item.imgUrl,
                        QItem.item.price,
                        QItem.item.firstCategory,
                        QItem.item.secondCategory,
                        QItem.item.saleStatus,
                        QItem.item.rep
                ))
                .from(QItem.item)
                .where(QItem.item.rep.eq(true),
                        QItem.item.firstCategory.eq(firstCategory),
                        QItem.item.secondCategory.eq(secondCategory)
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();

        List<ItemDto> content = results.getResults();
        long total = results.getTotal();

        return new PageImpl<>(content, pageable, total);
    }

    @Override
    public Page<ItemDto> findSaleItem(Pageable pageable, String firstCategory) {
        QueryResults results = queryFactory
                .selectDistinct(new QItemDto(
                        QItem.item.itemIdx,
                        QItem.item.itemName,
                        QItem.item.imgUrl,
                        QItem.item.price,
                        QItem.item.firstCategory,
                        QItem.item.secondCategory,
                        QItem.item.saleStatus,
                        QItem.item.rep
                ))
                .from(QItem.item)
                .where(QItem.item.rep.eq(true),
                        QItem.item.itemName.contains("SALE")
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();

        List<ItemDto> content = results.getResults();
        long total = results.getTotal();

        return new PageImpl<>(content, pageable, total);
    }

    @Override
    public ItemDto findAllItemInBasket(Long itemId) {
        ItemDto results = queryFactory
                .select(new QItemDto(
                        QItem.item.itemIdx,
                        QItem.item.imgUrl,
                        QItem.item.itemName,
                        QItem.item.color,
                        QItem.item.price,
                        QBasket.basket.basketCount
                ))
                .from(QItem.item)
                .leftJoin(QBasket.basket).on(QBasket.basket.eq(QItem.item.basketList.any()))
                .where(QItem.item.rep.eq(true),
                        QItem.item.id.eq(itemId)
                )
                .fetchOne();

        return results;
    }

    @Override
    public List<WeeklyBestDto> findWeeklyBestItem(String firstCategory, String secondCategory, boolean rep) {
        QueryResults<WeeklyBestDto> results = queryFactory
                .selectDistinct(new QWeeklyBestDto(
                        QItem.item.itemIdx,
                        QItem.item.itemName,
                        QItem.item.price,
                        QItem.item.itemInfo,
                        QItem.item.imgUrl
                ))
                .from(QItem.item)
                .where(QItem.item.rep.eq(true),
                        QItem.item.firstCategory.eq(firstCategory),
                        QItem.item.secondCategory.eq(secondCategory)
                )
                .limit(9L)
                .fetchResults();

        List<WeeklyBestDto> content = results.getResults();

        return content;
    }

    @Override
    public List<WeeklyBestDto> findNewArrivalItem(String firstCategory, String secondCategory, boolean rep) {
        QueryResults<WeeklyBestDto> results = queryFactory
                .selectDistinct(new QWeeklyBestDto(
                        QItem.item.itemIdx,
                        QItem.item.itemName,
                        QItem.item.price,
                        QItem.item.imgUrl
                ))
                .from(QItem.item)
                .where(QItem.item.rep.eq(true),
                        QItem.item.firstCategory.eq(firstCategory),
                        QItem.item.secondCategory.eq(secondCategory)
                )
                .limit(9L)
                .fetchResults();

        List<WeeklyBestDto> content = results.getResults();

        return content;
    }

    private BooleanExpression saleStatusEq(String saleStatusCondition) {
        if (StringUtils.isEmpty(saleStatusCondition)) {
            return null;
        }
        return QItem.item.saleStatus.equalsIgnoreCase(saleStatusCondition);
    }

    private BooleanExpression cmodeEq(String cmodeCondition) {
        if (StringUtils.isEmpty(cmodeCondition)) {
            return null;
        }
        return QItem.item.firstCategory.equalsIgnoreCase(cmodeCondition);
    }

    private BooleanExpression itemNameEq(String itemNameCondition) {
        if (StringUtils.isEmpty(itemNameCondition)) {
            return null;
        }
        return QItem.item.itemName.likeIgnoreCase("%" + itemNameCondition + "%");
    }

    @Override
    public Long searchMaxItemIdx() {
        QItem itemSub = new QItem("itemSub");
        List<Item> findItem = queryFactory
                .selectFrom(QItem.item)
                .where(QItem.item.itemIdx.eq(
                        JPAExpressions
                                .select(itemSub.itemIdx.max())
                                .from(itemSub)
                ))
                .fetch();
        return findItem.get(0).getItemIdx();
    }


}
