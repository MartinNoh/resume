package me.donggyeong.resume.repository;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import me.donggyeong.resume.domain.ProjectItem;
import me.donggyeong.resume.domain.WorkGallery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static me.donggyeong.resume.domain.QProjectItem.projectItem;
import static me.donggyeong.resume.domain.QWorkGallery.workGallery;

@Repository
public class ProjectItemRepositoryCustomImpl implements ProjectItemRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;

    public ProjectItemRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<ProjectItem> findAllInUseOrderByEndDateDesc() {
        List<ProjectItem> result = jpaQueryFactory
                .selectFrom(projectItem)
                .where(eqInUse())
                .orderBy(endDateDesc(), startDateDesc(), nameDesc())
                .fetch();
        return result;
    }

    private BooleanExpression eqInUse() {
        return projectItem.inUse.eq(true);
    }

    private OrderSpecifier<?> endDateDesc(){
        return new OrderSpecifier(Order.DESC, projectItem.endDate);
    }

    private OrderSpecifier<?> startDateDesc(){
        return new OrderSpecifier(Order.DESC, projectItem.startDate);
    }

    private OrderSpecifier<?> nameDesc(){
        return new OrderSpecifier(Order.DESC, projectItem.name);
    }
}
