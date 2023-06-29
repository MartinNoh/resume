package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProfileGallery is a Querydsl query type for ProfileGallery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProfileGallery extends EntityPathBase<ProfileGallery> {

    private static final long serialVersionUID = -885489647L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProfileGallery profileGallery = new QProfileGallery("profileGallery");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath inUse = createBoolean("inUse");

    public final QProfile profile;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QProfileGallery(String variable) {
        this(ProfileGallery.class, forVariable(variable), INITS);
    }

    public QProfileGallery(Path<? extends ProfileGallery> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProfileGallery(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProfileGallery(PathMetadata metadata, PathInits inits) {
        this(ProfileGallery.class, metadata, inits);
    }

    public QProfileGallery(Class<? extends ProfileGallery> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.profile = inits.isInitialized("profile") ? new QProfile(forProperty("profile")) : null;
    }

}

