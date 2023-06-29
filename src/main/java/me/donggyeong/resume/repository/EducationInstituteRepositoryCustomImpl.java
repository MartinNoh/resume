package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.EducationInstitute;
import me.donggyeong.resume.domain.WorkCompany;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QEducationInstitute.educationInstitute;
import static me.donggyeong.resume.domain.QWorkCompany.workCompany;

@Repository
public class EducationInstituteRepositoryCustomImpl implements EducationInstituteRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public EducationInstituteRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<EducationInstitute> findAllInUseOrderByStartYear() {
        List<EducationInstitute> result = jpaQueryFactory
                .selectFrom(educationInstitute)
                .where(eqInUse())
                .orderBy(startDateDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return educationInstitute.inUse.eq(true);
    }

    private OrderSpecifier<?> startDateDesc(){
        return new OrderSpecifier(Order.DESC, educationInstitute.startDate);
    }
}
