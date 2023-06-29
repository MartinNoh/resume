package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.EducationLearning;
import me.donggyeong.resume.domain.WorkExperience;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QEducationLearning.educationLearning;
import static me.donggyeong.resume.domain.QWorkExperience.workExperience;

@Repository
public class EducationLearningRepositoryCustomImpl implements EducationLearningRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public EducationLearningRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<EducationLearning> findAllInUseOrderByStartDate() {
        List<EducationLearning> result = jpaQueryFactory
                .selectFrom(educationLearning)
                .where(eqInUse())
                .orderBy(startDateDesc(), projectDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return educationLearning.inUse.eq(true);
    }

    private OrderSpecifier<?> startDateDesc(){
        return new OrderSpecifier(Order.DESC, educationLearning.startDate);
    }

    private OrderSpecifier<?> projectDesc(){
        return new OrderSpecifier(Order.DESC, educationLearning.course);
    }
}
