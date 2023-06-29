package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.ProjectGallery;
import me.donggyeong.resume.domain.WorkGallery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QProjectGallery.projectGallery;
import static me.donggyeong.resume.domain.QWorkGallery.workGallery;

@Repository
public class ProjectGalleryRepositoryCustomImpl implements ProjectGalleryRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public ProjectGalleryRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<ProjectGallery> findAllByProjectItemIdInUseOrderBySequence(Long projectItemId) {
        List<ProjectGallery> result = jpaQueryFactory
                .selectFrom(projectGallery)
                .where(eqId(projectItemId), eqInUse())
                .orderBy(sequenceDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return projectGallery.inUse.eq(true);
    }

    private OrderSpecifier<?> sequenceDesc(){
        return new OrderSpecifier(Order.DESC, projectGallery.sequence);
    }

    private BooleanExpression eqId(Long projectItemId) {
        return projectGallery.projectItem.id.eq(projectItemId);
    }
}
