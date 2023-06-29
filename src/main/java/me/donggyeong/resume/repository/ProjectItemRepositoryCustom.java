package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProjectItem;
import me.donggyeong.resume.domain.WorkGallery;

import java.util.List;

public interface ProjectItemRepositoryCustom {
    List<ProjectItem> findAllInUseOrderByEndDateDesc();
}
