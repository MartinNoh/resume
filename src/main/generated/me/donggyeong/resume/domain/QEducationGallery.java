package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEducationGallery is a Querydsl query type for EducationGallery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEducationGallery extends EntityPathBase<EducationGallery> {

    private static final long serialVersionUID = -1213158606L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEducationGallery educationGallery = new QEducationGallery("educationGallery");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final QEducationInstitute educationInstitute;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QEducationGallery(String variable) {
        this(EducationGallery.class, forVariable(variable), INITS);
    }

    public QEducationGallery(Path<? extends EducationGallery> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEducationGallery(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEducationGallery(PathMetadata metadata, PathInits inits) {
        this(EducationGallery.class, metadata, inits);
    }

    public QEducationGallery(Class<? extends EducationGallery> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.educationInstitute = inits.isInitialized("educationInstitute") ? new QEducationInstitute(forProperty("educationInstitute"), inits.get("educationInstitute")) : null;
    }

}

