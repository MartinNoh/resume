package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProjectGallery;
import me.donggyeong.resume.domain.WorkGallery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectGalleryRepository extends JpaRepository<ProjectGallery, Long>, ProjectGalleryRepositoryCustom {
}
