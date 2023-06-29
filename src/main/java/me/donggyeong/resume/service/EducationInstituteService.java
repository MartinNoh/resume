package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.EducationInstitute;
import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.repository.EducationInstituteRepository;
import me.donggyeong.resume.repository.WorkCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EducationInstituteService {

    private final EducationInstituteRepository educationInstituteRepository;

    public List<EducationInstitute> findAllInUseOrderByStartYear() {
        return educationInstituteRepository.findAllInUseOrderByStartYear();
    }
}
