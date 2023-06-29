package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.CertificateItem;
import me.donggyeong.resume.domain.ProjectItem;
import me.donggyeong.resume.dto.ProjectItemViewResponse;
import me.donggyeong.resume.repository.CertificateItemRepository;
import me.donggyeong.resume.repository.CertificateRepository;
import me.donggyeong.resume.repository.ProjectItemRepository;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CertificateItemService {

    private final CertificateItemRepository certificateItemRepository;


    public List<CertificateItem> findAllInUseOrderByEndDateDesc() {
        return certificateItemRepository.findAllInUseOrderByAcquisitionDateAsc();
    }
}
