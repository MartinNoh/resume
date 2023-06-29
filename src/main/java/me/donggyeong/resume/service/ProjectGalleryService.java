package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.ProjectGallery;
import me.donggyeong.resume.domain.WorkGallery;
import me.donggyeong.resume.repository.ProjectGalleryRepository;
import me.donggyeong.resume.repository.WorkGalleryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectGalleryService {

    private final ProjectGalleryRepository projectGalleryRepository;

    public List<ProjectGallery> findAllByProjectItemIdInUseOrderBySequence(Long projectItemId) {
        return projectGalleryRepository.findAllByProjectItemIdInUseOrderBySequence(projectItemId);
    }
}
