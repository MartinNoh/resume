package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;

import java.util.List;

public interface WorkGalleryRepositoryCustom {
    List<WorkGallery> findAllInUseOrderBySequence();
}
