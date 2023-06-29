package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.ProfileStat;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QProfileStat.profileStat;

@Repository
public class ProfileStatRepositoryCustomImpl implements ProfileStatRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public ProfileStatRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<ProfileStat> findAllInUseOrderBySequence() {
        List<ProfileStat> result = jpaQueryFactory
                .selectFrom(profileStat)
                .where(eqInUse())
                .orderBy(sequenceAsc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return profileStat.inUse.eq(true);
    }

    private OrderSpecifier<?> sequenceAsc(){
        return new OrderSpecifier(Order.ASC, profileStat.sequence);
    }
}
