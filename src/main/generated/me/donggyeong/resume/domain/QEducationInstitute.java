package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEducationInstitute is a Querydsl query type for EducationInstitute
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEducationInstitute extends EntityPathBase<EducationInstitute> {

    private static final long serialVersionUID = 2102818293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEducationInstitute educationInstitute = new QEducationInstitute("educationInstitute");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final QEducation education;

    public final ListPath<EducationGallery, QEducationGallery> educationGalleryList = this.<EducationGallery, QEducationGallery>createList("educationGalleryList", EducationGallery.class, QEducationGallery.class, PathInits.DIRECT2);

    public final ListPath<EducationLearning, QEducationLearning> educationLearningList = this.<EducationLearning, QEducationLearning>createList("educationLearningList", EducationLearning.class, QEducationLearning.class, PathInits.DIRECT2);

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath learning = createString("learning");

    public final StringPath name = createString("name");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QEducationInstitute(String variable) {
        this(EducationInstitute.class, forVariable(variable), INITS);
    }

    public QEducationInstitute(Path<? extends EducationInstitute> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEducationInstitute(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEducationInstitute(PathMetadata metadata, PathInits inits) {
        this(EducationInstitute.class, metadata, inits);
    }

    public QEducationInstitute(Class<? extends EducationInstitute> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.education = inits.isInitialized("education") ? new QEducation(forProperty("education")) : null;
    }

}

