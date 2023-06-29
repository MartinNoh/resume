package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.EducationGallery;
import me.donggyeong.resume.domain.WorkGallery;

import java.util.List;

public interface EducationGalleryRepositoryCustom {
    List<EducationGallery> findAllInUseOrderBySequence();
}
