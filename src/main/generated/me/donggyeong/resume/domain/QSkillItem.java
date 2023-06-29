package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSkillItem is a Querydsl query type for SkillItem
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSkillItem extends EntityPathBase<SkillItem> {

    private static final long serialVersionUID = -714431140L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSkillItem skillItem = new QSkillItem("skillItem");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final QSkillCategory skillCategory;

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QSkillItem(String variable) {
        this(SkillItem.class, forVariable(variable), INITS);
    }

    public QSkillItem(Path<? extends SkillItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSkillItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSkillItem(PathMetadata metadata, PathInits inits) {
        this(SkillItem.class, metadata, inits);
    }

    public QSkillItem(Class<? extends SkillItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.skillCategory = inits.isInitialized("skillCategory") ? new QSkillCategory(forProperty("skillCategory"), inits.get("skillCategory")) : null;
    }

}

