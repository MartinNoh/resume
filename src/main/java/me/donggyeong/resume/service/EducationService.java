package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.Education;
import me.donggyeong.resume.domain.Work;
import me.donggyeong.resume.repository.EducationRepository;
import me.donggyeong.resume.repository.WorkRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EducationService {

    private final EducationRepository educationRepository;

    public Education findFirstByOrderByIdDesc() {
        return educationRepository.findFirstByOrderByIdDesc();
    }
}
