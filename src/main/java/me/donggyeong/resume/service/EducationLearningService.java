package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.EducationLearning;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.repository.EducationLearningRepository;
import me.donggyeong.resume.repository.WorkExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EducationLearningService {

    private final EducationLearningRepository educationLearningRepository;

    public List<EducationLearning> findAllInUseOrderByStartDate() {
        return educationLearningRepository.findAllInUseOrderByStartDate();
    }
}
