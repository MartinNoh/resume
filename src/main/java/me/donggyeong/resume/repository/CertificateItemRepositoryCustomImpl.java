package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.CertificateItem;
import me.donggyeong.resume.domain.ProjectItem;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QCertificateItem.certificateItem;
import static me.donggyeong.resume.domain.QProjectItem.projectItem;

@Repository
public class CertificateItemRepositoryCustomImpl implements CertificateItemRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public CertificateItemRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<CertificateItem> findAllInUseOrderByAcquisitionDateAsc() {
        List<CertificateItem> result = jpaQueryFactory
                .selectFrom(certificateItem)
                .where(eqInUse())
                .orderBy(acquisitionDateAsc(), nameAsc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return certificateItem.inUse.eq(true);
    }

    private OrderSpecifier<?> acquisitionDateAsc(){
        return new OrderSpecifier(Order.ASC, certificateItem.acquisitionDate);
    }

    private OrderSpecifier<?> nameAsc(){
        return new OrderSpecifier(Order.ASC, certificateItem.name);
    }
}
