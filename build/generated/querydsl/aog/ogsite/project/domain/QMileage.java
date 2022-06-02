package aog.ogsite.project.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMileage is a Querydsl query type for Mileage
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMileage extends EntityPathBase<Mileage> {

    private static final long serialVersionUID = -277627537L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMileage mileage = new QMileage("mileage");

    public final QBaseTimeEntity _super = new QBaseTimeEntity(this);

    //inherited
    public final DatePath<java.time.LocalDate> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final StringPath mileageContent = createString("mileageContent");

    public final NumberPath<Integer> mileagePrice = createNumber("mileagePrice", Integer.class);

    //inherited
    public final DatePath<java.time.LocalDate> modifiedAt = _super.modifiedAt;

    public QMileage(String variable) {
        this(Mileage.class, forVariable(variable), INITS);
    }

    public QMileage(Path<? extends Mileage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMileage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMileage(PathMetadata metadata, PathInits inits) {
        this(Mileage.class, metadata, inits);
    }

    public QMileage(Class<? extends Mileage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

