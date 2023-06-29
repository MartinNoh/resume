package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.SkillCategory;
import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.dto.AddWorkCompanyRequest;
import me.donggyeong.resume.repository.SkillCategoryRepository;
import me.donggyeong.resume.repository.WorkCompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WorkCompanyService {

    private final WorkCompanyRepository workCompanyRepository;

    public List<WorkCompany> findAllInUseOrderByStartYear() {
        return workCompanyRepository.findAllInUseOrderByStartYear();
    }

    public WorkCompany save(AddWorkCompanyRequest request) {
        return workCompanyRepository.save(request.toEntity());
    }
}
