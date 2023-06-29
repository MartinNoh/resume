package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEducationLearning is a Querydsl query type for EducationLearning
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEducationLearning extends EntityPathBase<EducationLearning> {

    private static final long serialVersionUID = 116833086L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEducationLearning educationLearning = new QEducationLearning("educationLearning");

    public final StringPath content = createString("content");

    public final StringPath course = createString("course");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final QEducationInstitute educationInstitute;

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath inUse = createBoolean("inUse");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QEducationLearning(String variable) {
        this(EducationLearning.class, forVariable(variable), INITS);
    }

    public QEducationLearning(Path<? extends EducationLearning> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEducationLearning(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEducationLearning(PathMetadata metadata, PathInits inits) {
        this(EducationLearning.class, metadata, inits);
    }

    public QEducationLearning(Class<? extends EducationLearning> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.educationInstitute = inits.isInitialized("educationInstitute") ? new QEducationInstitute(forProperty("educationInstitute"), inits.get("educationInstitute")) : null;
    }

}

