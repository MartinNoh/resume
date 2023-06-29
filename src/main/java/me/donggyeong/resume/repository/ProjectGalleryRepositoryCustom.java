package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProjectGallery;
import me.donggyeong.resume.domain.WorkGallery;

import java.util.List;

public interface ProjectGalleryRepositoryCustom {
    List<ProjectGallery> findAllByProjectItemIdInUseOrderBySequence(Long projectItemId);
}
