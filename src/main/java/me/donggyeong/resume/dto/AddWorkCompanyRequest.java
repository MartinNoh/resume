package me.donggyeong.resume.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.WorkCompany;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddWorkCompanyRequest {
    private String name;
    private String role;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isPresent;
    private String imagePath;

    public WorkCompany toEntity() { // 생성자를 사용해 객체 생성
        return WorkCompany.builder()
                .name(name)
                .role(role)
                .startDate(startDate)
                .endDate(endDate)
                .isPresent(isPresent)
                .imagePath(imagePath)
                .build();
    }
}
