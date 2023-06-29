package me.donggyeong.resume.controller;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.dto.AddWorkCompanyRequest;
import me.donggyeong.resume.service.WorkCompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ResumeApiController {

    private final WorkCompanyService workCompanyService;

    @PostMapping("/api/work-companies")
    // 요청 본문 값 매핑
    public ResponseEntity<WorkCompany> addWorkCompany(@RequestBody AddWorkCompanyRequest request) {
        WorkCompany savedWorkCompany = workCompanyService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedWorkCompany);
    }
}
