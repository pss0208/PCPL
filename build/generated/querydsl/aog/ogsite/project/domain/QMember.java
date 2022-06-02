package aog.ogsite.project.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 264471893L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    public final ListPath<Basket, QBasket> basketList = this.<Basket, QBasket>createList("basketList", Basket.class, QBasket.class, PathInits.DIRECT2);

    public final StringPath birthday = createString("birthday");

    //inherited
    public final DatePath<java.time.LocalDate> createdAt = _super.createdAt;

    public final ListPath<DeliveryAddress, QDeliveryAddress> deliveryAddressList = this.<DeliveryAddress, QDeliveryAddress>createList("deliveryAddressList", DeliveryAddress.class, QDeliveryAddress.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final StringPath homePhoneNumber = createString("homePhoneNumber");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath loginId = createString("loginId");

    public final QMemberAddress memberAddress;

    public final EnumPath<MemberGrade> memberGrade = createEnum("memberGrade", MemberGrade.class);

    public final ListPath<Mileage, QMileage> mileageList = this.<Mileage, QMileage>createList("mileageList", Mileage.class, QMileage.class, PathInits.DIRECT2);

    //inherited
    public final DatePath<java.time.LocalDate> modifiedAt = _super.modifiedAt;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> orderCount = createNumber("orderCount", Integer.class);

    public final ListPath<Order, QOrder> orderList = this.<Order, QOrder>createList("orderList", Order.class, QOrder.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath sex = createString("sex");

    public final NumberPath<Integer> visitCount = createNumber("visitCount", Integer.class);

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.memberAddress = inits.isInitialized("memberAddress") ? new QMemberAddress(forProperty("memberAddress")) : null;
    }

}

