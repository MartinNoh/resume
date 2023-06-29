package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkGalleryRepository extends JpaRepository<WorkGallery, Long>, WorkGalleryRepositoryCustom {
}
