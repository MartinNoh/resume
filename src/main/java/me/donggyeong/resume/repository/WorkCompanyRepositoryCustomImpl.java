package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.WorkCompany;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QSkillCategory.skillCategory;
import static me.donggyeong.resume.domain.QWorkCompany.workCompany;

@Repository
public class WorkCompanyRepositoryCustomImpl implements WorkCompanyRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public WorkCompanyRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<WorkCompany> findAllInUseOrderByStartYear() {
        List<WorkCompany> result = jpaQueryFactory
                .selectFrom(workCompany)
                .where(eqInUse())
                .orderBy(startDateDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return workCompany.inUse.eq(true);
    }

    private OrderSpecifier<?> startDateDesc(){
        return new OrderSpecifier(Order.DESC, workCompany.startDate);
    }
}
