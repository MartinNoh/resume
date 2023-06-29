package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.EducationGallery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationGalleryRepository extends JpaRepository<EducationGallery, Long>, EducationGalleryRepositoryCustom {
}
