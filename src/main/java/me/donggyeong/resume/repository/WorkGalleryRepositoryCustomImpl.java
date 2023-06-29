package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QWorkExperience.workExperience;
import static me.donggyeong.resume.domain.QWorkGallery.workGallery;

@Repository
public class WorkGalleryRepositoryCustomImpl implements WorkGalleryRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public WorkGalleryRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<WorkGallery> findAllInUseOrderBySequence() {
        List<WorkGallery> result = jpaQueryFactory
                .selectFrom(workGallery)
                .where(eqInUse())
                .orderBy(sequenceDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return workGallery.inUse.eq(true);
    }

    private OrderSpecifier<?> sequenceDesc(){
        return new OrderSpecifier(Order.DESC, workGallery.sequence);
    }
}
