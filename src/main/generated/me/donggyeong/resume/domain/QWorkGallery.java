package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkGallery is a Querydsl query type for WorkGallery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkGallery extends EntityPathBase<WorkGallery> {

    private static final long serialVersionUID = -1680463527L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkGallery workGallery = new QWorkGallery("workGallery");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final QWorkExperience workExperience;

    public QWorkGallery(String variable) {
        this(WorkGallery.class, forVariable(variable), INITS);
    }

    public QWorkGallery(Path<? extends WorkGallery> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkGallery(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkGallery(PathMetadata metadata, PathInits inits) {
        this(WorkGallery.class, metadata, inits);
    }

    public QWorkGallery(Class<? extends WorkGallery> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.workExperience = inits.isInitialized("workExperience") ? new QWorkExperience(forProperty("workExperience"), inits.get("workExperience")) : null;
    }

}

