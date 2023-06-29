package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.SkillCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QSkillCategory.skillCategory;

@Repository
public class SkillCategoryRepositoryCustomImpl implements SkillCategoryRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public SkillCategoryRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<SkillCategory> findAllInUseOrderBySequence() {
        List<SkillCategory> result = jpaQueryFactory
                .selectFrom(skillCategory)
                .where(eqInUse())
                .orderBy(sequenceAsc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return skillCategory.inUse.eq(true);
    }

    private OrderSpecifier<?> sequenceAsc(){
        return new OrderSpecifier(Order.ASC, skillCategory.sequence);
    }
}
