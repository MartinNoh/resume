package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkCompany is a Querydsl query type for WorkCompany
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkCompany extends EntityPathBase<WorkCompany> {

    private static final long serialVersionUID = -533664124L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkCompany workCompany = new QWorkCompany("workCompany");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath inUse = createBoolean("inUse");

    public final BooleanPath isPresent = createBoolean("isPresent");

    public final StringPath name = createString("name");

    public final StringPath role = createString("role");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final QWork work;

    public final ListPath<WorkExperience, QWorkExperience> workExperienceList = this.<WorkExperience, QWorkExperience>createList("workExperienceList", WorkExperience.class, QWorkExperience.class, PathInits.DIRECT2);

    public QWorkCompany(String variable) {
        this(WorkCompany.class, forVariable(variable), INITS);
    }

    public QWorkCompany(Path<? extends WorkCompany> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkCompany(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkCompany(PathMetadata metadata, PathInits inits) {
        this(WorkCompany.class, metadata, inits);
    }

    public QWorkCompany(Class<? extends WorkCompany> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.work = inits.isInitialized("work") ? new QWork(forProperty("work")) : null;
    }

}

