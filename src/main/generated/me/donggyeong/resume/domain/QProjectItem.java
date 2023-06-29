package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectItem is a Querydsl query type for ProjectItem
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectItem extends EntityPathBase<ProjectItem> {

    private static final long serialVersionUID = 2022231076L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectItem projectItem = new QProjectItem("projectItem");

    public final StringPath briefDescription = createString("briefDescription");

    public final StringPath category = createString("category");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final StringPath feature = createString("feature");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath longDescription = createString("longDescription");

    public final StringPath mainImagePath = createString("mainImagePath");

    public final StringPath name = createString("name");

    public final QProject project;

    public final ListPath<ProjectGallery, QProjectGallery> projectGalleryList = this.<ProjectGallery, QProjectGallery>createList("projectGalleryList", ProjectGallery.class, QProjectGallery.class, PathInits.DIRECT2);

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QProjectItem(String variable) {
        this(ProjectItem.class, forVariable(variable), INITS);
    }

    public QProjectItem(Path<? extends ProjectItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectItem(PathMetadata metadata, PathInits inits) {
        this(ProjectItem.class, metadata, inits);
    }

    public QProjectItem(Class<? extends ProjectItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

