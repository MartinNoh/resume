package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProfileStat is a Querydsl query type for ProfileStat
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProfileStat extends EntityPathBase<ProfileStat> {

    private static final long serialVersionUID = -1154888203L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfileStat profileStat = new QProfileStat("profileStat");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath item = createString("item");

    public final QProfile profile;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QProfileStat(String variable) {
        this(ProfileStat.class, forVariable(variable), INITS);
    }

    public QProfileStat(Path<? extends ProfileStat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProfileStat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProfileStat(PathMetadata metadata, PathInits inits) {
        this(ProfileStat.class, metadata, inits);
    }

    public QProfileStat(Class<? extends ProfileStat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.profile = inits.isInitialized("profile") ? new QProfile(forProperty("profile")) : null;
    }

}

