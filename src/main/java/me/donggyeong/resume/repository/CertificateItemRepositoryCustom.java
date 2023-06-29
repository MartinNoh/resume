package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.CertificateItem;
import me.donggyeong.resume.domain.ProjectItem;

import java.util.List;

public interface CertificateItemRepositoryCustom {
    List<CertificateItem> findAllInUseOrderByAcquisitionDateAsc();
}
