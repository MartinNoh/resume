package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.ProfileGallery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QProfileGallery.profileGallery;

@Repository
public class ProfileGalleryRepositoryCustomImpl implements ProfileGalleryRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public ProfileGalleryRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<ProfileGallery> findAllInUseOrderBySequence() {
        List<ProfileGallery> result = jpaQueryFactory
                .selectFrom(profileGallery)
                .where(eqInUse())
                .orderBy(sequenceDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return profileGallery.inUse.eq(true);
    }

    private OrderSpecifier<?> sequenceDesc(){
        return new OrderSpecifier(Order.DESC, profileGallery.sequence);
    }
}
