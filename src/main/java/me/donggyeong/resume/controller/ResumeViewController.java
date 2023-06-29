package me.donggyeong.resume.controller;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.*;
import me.donggyeong.resume.dto.*;
import me.donggyeong.resume.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ResumeViewController {

    private final ProfileService profileService;
    private final ProfileStatService profileStatService;
    private final ProfileGalleryService profileGalleryService;
    private final SkillService skillService;
    private final SkillCategoryService skillCategoryService;
    private final SkillItemService skillItemService;
    private final WorkService workService;
    private final WorkCompanyService workCompanyService;
    private final WorkExperienceService workExperienceService;
    private final WorkGalleryService workGalleryService;
    private final ProjectService projectService;
    private final ProjectItemService projectItemService;
    private final ProjectGalleryService projectGalleryService;
    private final EducationService educationService;
    private final EducationInstituteService educationInstituteService;
    private final EducationLearningService educationLearningService;
    private final EducationGalleryService educationGalleryService;
    private final CertificateService certificateService;
    private final CertificateItemService certificateItemService;
    private final ContactService contactService;

    @GetMapping("/resume")
    public String getMain(Model model) {
        // Profile
        Profile profile = profileService.findFirstByOrderByIdDesc();
        List<ProfileStatViewResponse> profileStatList = profileStatService.findAllInUseOrderBySequence().stream()
                .map(ProfileStatViewResponse::new)
                .toList();
        List<ProfileGalleryViewResponse> profileGalleryList = profileGalleryService.findAllInUseOrderBySequence().stream()
                .map(ProfileGalleryViewResponse::new)
                .toList();

        // Skill
        Skill skill= skillService.findFirstByOrderByIdDesc();
        List<SkillCategoryViewResponse> skillCategoryList = skillCategoryService.findAllInUseOrderBySequence().stream()
                .map(SkillCategoryViewResponse::new)
                .toList();
        List<SkillItemViewResponse> skillItemList = skillItemService.findAllInUseOrderBySequence().stream()
                .map(SkillItemViewResponse::new)
                .toList();

        // Work
        Work work = workService.findFirstByOrderByIdDesc();
        List<WorkCompanyViewResponse> workCompanyList = workCompanyService.findAllInUseOrderByStartYear().stream()
                .map(WorkCompanyViewResponse::new)
                .toList();
        List<WorkExperienceViewResponse> workExperienceList = workExperienceService.findAllInUseOrderByStartDate().stream()
                .map(WorkExperienceViewResponse::new)
                .toList();
        List<WorkGalleryViewResponse> workGalleryList = workGalleryService.findAllInUseOrderBySequence().stream()
                .map(WorkGalleryViewResponse::new)
                .toList();

        // Project
        Project project = projectService.findFirstByOrderByIdDesc();
        List<ProjectItemViewResponse> projectItemList = projectItemService.findAllInUseOrderByEndDateDesc().stream()
                .map(ProjectItemViewResponse::new)
                .toList();
        List<String> projectItemYearList = projectItemService.getYearList(projectItemList);

        //Education
        Education education = educationService.findFirstByOrderByIdDesc();
        List<EducationInstituteViewResponse> educationInstituteList = educationInstituteService.findAllInUseOrderByStartYear().stream()
                .map(EducationInstituteViewResponse::new)
                .toList();
        List<EducationLearningViewResponse> educationLearningList = educationLearningService.findAllInUseOrderByStartDate().stream()
                .map(EducationLearningViewResponse::new)
                .toList();
        List<EducationGalleryViewResponse> educationGalleryList = educationGalleryService.findAllInUseOrderBySequence().stream()
                .map(EducationGalleryViewResponse::new)
                .toList();

        // Certificate
        Certificate certificate = certificateService.findFirstByOrderByIdDesc();
        List<CertificateItemViewResponse> certificateItemList = certificateItemService.findAllInUseOrderByEndDateDesc().stream()
                .map(CertificateItemViewResponse::new)
                .toList();

        // Contact
        Contact contact = contactService.findFirstByOrderByIdDesc();

        model.addAttribute("profile", new ProfileViewResponse(profile));
        model.addAttribute("profileStatList", profileStatList);
        model.addAttribute("profileGalleryList", profileGalleryList);
        model.addAttribute("skill", new SkillViewResponse(skill));
        model.addAttribute("skillCategoryList", skillCategoryList);
        model.addAttribute("skillItemList", skillItemList);
        model.addAttribute("work", new WorkViewResponse(work));
        model.addAttribute("workCompanyList", workCompanyList);
        model.addAttribute("workExperienceList", workExperienceList);
        model.addAttribute("workGalleryList", workGalleryList);
        model.addAttribute("project", new ProjectViewResponse(project));
        model.addAttribute("projectItemList", projectItemList);
        model.addAttribute("projectItemYearList", projectItemYearList);
        model.addAttribute("education", new EducationViewResponse(education));
        model.addAttribute("educationInstituteList", educationInstituteList);
        model.addAttribute("educationLearningList", educationLearningList);
        model.addAttribute("educationGalleryList", educationGalleryList);
        model.addAttribute("certificate", new CertificateViewResponse(certificate));
        model.addAttribute("certificateItemList", certificateItemList);
        model.addAttribute("contact", new ContactViewResponse(contact));

        return "content/main";
    }

    @GetMapping("/project-detail")
    public String getProjectDetail(@RequestParam(value = "projectItemId") Long projectItemId, Model model) {
        // return portfolio_ver1
        if (projectItemId == 1L) {
            return "content/project_detail_content/portfolio_ver1";
        }

        ProjectItem projectItem = projectItemService.findById(projectItemId);
        List<ProjectGalleryViewResponse> projectGalleryList = projectGalleryService.findAllByProjectItemIdInUseOrderBySequence(projectItemId).stream()
                .map(ProjectGalleryViewResponse::new)
                .toList();

        model.addAttribute("projectItem", new ProjectItemViewResponse(projectItem));
        model.addAttribute("projectGalleryList", projectGalleryList);
        return "content/project_detail_content/project_detail";
    }
}
