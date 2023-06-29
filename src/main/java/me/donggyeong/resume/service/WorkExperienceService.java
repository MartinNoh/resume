package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.repository.WorkCompanyRepository;
import me.donggyeong.resume.repository.WorkExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WorkExperienceService {

    private final WorkExperienceRepository workExperienceRepository;

    public List<WorkExperience> findAllInUseOrderByStartDate() {
        return workExperienceRepository.findAllInUseOrderByStartDate();
    }
}
