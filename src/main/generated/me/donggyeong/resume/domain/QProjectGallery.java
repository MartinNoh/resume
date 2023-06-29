package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectGallery is a Querydsl query type for ProjectGallery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectGallery extends EntityPathBase<ProjectGallery> {

    private static final long serialVersionUID = 762265761L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectGallery projectGallery = new QProjectGallery("projectGallery");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath extension = createString("extension");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath mediaPath = createString("mediaPath");

    public final QProjectItem projectItem;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QProjectGallery(String variable) {
        this(ProjectGallery.class, forVariable(variable), INITS);
    }

    public QProjectGallery(Path<? extends ProjectGallery> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectGallery(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectGallery(PathMetadata metadata, PathInits inits) {
        this(ProjectGallery.class, metadata, inits);
    }

    public QProjectGallery(Class<? extends ProjectGallery> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.projectItem = inits.isInitialized("projectItem") ? new QProjectItem(forProperty("projectItem"), inits.get("projectItem")) : null;
    }

}

