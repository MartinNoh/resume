package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkExperience is a Querydsl query type for WorkExperience
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkExperience extends EntityPathBase<WorkExperience> {

    private static final long serialVersionUID = -1951754749L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkExperience workExperience = new QWorkExperience("workExperience");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath project = createString("project");

    public final StringPath role = createString("role");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final QWorkCompany workCompany;

    public final ListPath<WorkGallery, QWorkGallery> workGalleryList = this.<WorkGallery, QWorkGallery>createList("workGalleryList", WorkGallery.class, QWorkGallery.class, PathInits.DIRECT2);

    public QWorkExperience(String variable) {
        this(WorkExperience.class, forVariable(variable), INITS);
    }

    public QWorkExperience(Path<? extends WorkExperience> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkExperience(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkExperience(PathMetadata metadata, PathInits inits) {
        this(WorkExperience.class, metadata, inits);
    }

    public QWorkExperience(Class<? extends WorkExperience> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.workCompany = inits.isInitialized("workCompany") ? new QWorkCompany(forProperty("workCompany"), inits.get("workCompany")) : null;
    }

}

