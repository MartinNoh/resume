package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.EducationGallery;
import me.donggyeong.resume.domain.WorkGallery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QEducationGallery.educationGallery;
import static me.donggyeong.resume.domain.QWorkGallery.workGallery;

@Repository
public class EducationGalleryRepositoryCustomImpl implements EducationGalleryRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public EducationGalleryRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<EducationGallery> findAllInUseOrderBySequence() {
        List<EducationGallery> result = jpaQueryFactory
                .selectFrom(educationGallery)
                .where(eqInUse())
                .orderBy(sequenceDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return educationGallery.inUse.eq(true);
    }

    private OrderSpecifier<?> sequenceDesc(){
        return new OrderSpecifier(Order.DESC, educationGallery.sequence);
    }
}
