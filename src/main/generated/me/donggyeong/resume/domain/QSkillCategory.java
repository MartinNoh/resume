package me.donggyeong.resume.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSkillCategory is a Querydsl query type for SkillCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSkillCategory extends EntityPathBase<SkillCategory> {

    private static final long serialVersionUID = -409232697L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSkillCategory skillCategory = new QSkillCategory("skillCategory");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath iconColor = createString("iconColor");

    public final StringPath iconShape = createString("iconShape");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath inUse = createBoolean("inUse");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final QSkill skill;

    public final ListPath<SkillItem, QSkillItem> skillItemList = this.<SkillItem, QSkillItem>createList("skillItemList", SkillItem.class, QSkillItem.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public QSkillCategory(String variable) {
        this(SkillCategory.class, forVariable(variable), INITS);
    }

    public QSkillCategory(Path<? extends SkillCategory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSkillCategory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSkillCategory(PathMetadata metadata, PathInits inits) {
        this(SkillCategory.class, metadata, inits);
    }

    public QSkillCategory(Class<? extends SkillCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.skill = inits.isInitialized("skill") ? new QSkill(forProperty("skill")) : null;
    }

}

