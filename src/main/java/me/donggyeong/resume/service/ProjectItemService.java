package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.ProjectItem;
import me.donggyeong.resume.dto.ProjectItemViewResponse;
import me.donggyeong.resume.repository.ProjectItemRepository;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProjectItemService {

    private final ProjectItemRepository projectItemRepository;

    public List<ProjectItem> findAllInUseOrderByEndDateDesc() {
        return projectItemRepository.findAllInUseOrderByEndDateDesc();
    }

    public List<String> getYearList(List<ProjectItemViewResponse> projectItemList) {
        List<String> strList = new ArrayList<>();
        for (ProjectItemViewResponse el : projectItemList) {
            strList.add(el.getEndDate().format(DateTimeFormatter.ofPattern("yyyy")));
        }
        List<String> noDuplicates = strList.stream().distinct().collect(Collectors.toList());
        Collections.sort(noDuplicates);
        return noDuplicates;
    }

    public ProjectItem findById(long projectItemId) {
        return projectItemRepository.findById(projectItemId)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + projectItemId));
    }
}
