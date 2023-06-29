package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;
import me.donggyeong.resume.repository.WorkExperienceRepository;
import me.donggyeong.resume.repository.WorkGalleryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WorkGalleryService {

    private final WorkGalleryRepository workGalleryRepository;

    public List<WorkGallery> findAllInUseOrderBySequence() {
        return workGalleryRepository.findAllInUseOrderBySequence();
    }
}
