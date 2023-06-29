package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.EducationGallery;
import me.donggyeong.resume.domain.WorkGallery;
import me.donggyeong.resume.repository.EducationGalleryRepository;
import me.donggyeong.resume.repository.WorkGalleryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EducationGalleryService {

    private final EducationGalleryRepository educationGalleryRepository;

    public List<EducationGallery> findAllInUseOrderBySequence() {
        return educationGalleryRepository.findAllInUseOrderBySequence();
    }
}
