package aog.ogsite.project.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItem is a Querydsl query type for Item
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItem extends EntityPathBase<Item> {

    private static final long serialVersionUID = -1340610418L;

    public static final QItem item = new QItem("item");

    public final ListPath<Basket, QBasket> basketList = this.<Basket, QBasket>createList("basketList", Basket.class, QBasket.class, PathInits.DIRECT2);

    public final StringPath color = createString("color");

    public final StringPath fabric = createString("fabric");

    public final StringPath firstCategory = createString("firstCategory");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgUrl = createString("imgUrl");

    public final NumberPath<Long> itemIdx = createNumber("itemIdx", Long.class);

    public final StringPath itemInfo = createString("itemInfo");

    public final StringPath itemName = createString("itemName");

    public final StringPath model = createString("model");

    public final ListPath<OrderItem, QOrderItem> orderItemList = this.<OrderItem, QOrderItem>createList("orderItemList", OrderItem.class, QOrderItem.class, PathInits.DIRECT2);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final BooleanPath rep = createBoolean("rep");

    public final StringPath saleStatus = createString("saleStatus");

    public final StringPath secondCategory = createString("secondCategory");

    public final StringPath size = createString("size");

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public final StringPath thirdCategory = createString("thirdCategory");

    public QItem(String variable) {
        super(Item.class, forVariable(variable));
    }

    public QItem(Path<? extends Item> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItem(PathMetadata metadata) {
        super(Item.class, metadata);
    }

}

