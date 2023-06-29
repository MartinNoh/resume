package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEducation is a Querydsl query type for Education
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEducation extends EntityPathBase<Education> {

    private static final long serialVersionUID = 1298916352L;

    public static final QEducation education = new QEducation("education");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath description = createString("description");

    public final ListPath<EducationInstitute, QEducationInstitute> educationInstituteList = this.<EducationInstitute, QEducationInstitute>createList("educationInstituteList", EducationInstitute.class, QEducationInstitute.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath inUse = createBoolean("inUse");

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QEducation(String variable) {
        super(Education.class, forVariable(variable));
    }

    public QEducation(Path<? extends Education> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEducation(PathMetadata metadata) {
        super(Education.class, metadata);
    }

}

