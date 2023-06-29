package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.domain.WorkExperience;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QWorkCompany.workCompany;
import static me.donggyeong.resume.domain.QWorkExperience.workExperience;

@Repository
public class WorkExperienceRepositoryCustomImpl implements WorkExperienceRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public WorkExperienceRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<WorkExperience> findAllInUseOrderByStartDate() {
        List<WorkExperience> result = jpaQueryFactory
                .selectFrom(workExperience)
                .where(eqInUse())
                .orderBy(startDateDesc(), projectDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return workExperience.inUse.eq(true);
    }

    private OrderSpecifier<?> startDateDesc(){
        return new OrderSpecifier(Order.DESC, workExperience.startDate);
    }

    private OrderSpecifier<?> projectDesc(){
        return new OrderSpecifier(Order.DESC, workExperience.project);
    }
}
