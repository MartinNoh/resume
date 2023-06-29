package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.WorkCompany;

import java.util.List;

public interface WorkCompanyRepositoryCustom {
    List<WorkCompany> findAllInUseOrderByStartYear();
}
