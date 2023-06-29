package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.SkillItem;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QSkillItem.skillItem;

@Repository
public class SkillItemRepositoryCustomImpl implements SkillItemRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public SkillItemRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<SkillItem> findAllInUseOrderBySequence() {
        List<SkillItem> result = jpaQueryFactory
                .selectFrom(skillItem)
                .where(eqInUse())
                .orderBy(skillCategoryIdAsc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return skillItem.inUse.eq(true);
    }

    private OrderSpecifier<?> skillCategoryIdAsc(){
        return new OrderSpecifier(Order.ASC, skillItem.skillCategory.id);
    }
}
