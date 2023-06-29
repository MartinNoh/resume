package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProjectItem;
import me.donggyeong.resume.domain.WorkGallery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectItemRepository extends JpaRepository<ProjectItem, Long>, ProjectItemRepositoryCustom {
}
