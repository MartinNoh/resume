package me.donggyeong.resume.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SkillCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private Skill skill;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "icon_shape", nullable = false)
    private String iconShape;

    @Column(name = "icon_color", nullable = false)
    private String iconColor;

    @Column(name = "sequence", nullable = false)
    private Integer sequence;

    @Column(name = "in_use", nullable = false)
    private Boolean inUse;

    @PrePersist
    public void prePersist() {
        this.inUse = this.inUse == null ? true : this.inUse;
    }

    @CreatedDate // 엔티티가 생성될 때 시간 저장
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate // 엔티티가 수정될 때 시간 저장
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "skillCategory", cascade = CascadeType.REMOVE)
    private List<SkillItem> skillItemList;

    @Builder // 빌더 패턴으로 객체 생성
    public SkillCategory(Skill skill, String name, String iconShape, String iconColor, Integer sequence, boolean inUse) {
        this.skill = skill;
        this.name = name;
        this.iconShape = iconShape;
        this.iconColor = iconColor;
        this.sequence = sequence;
        this.inUse = inUse;
    }

    public void update(Skill skill, String name, String iconShape, String iconColor, Integer sequence, boolean inUse) {
        this.skill = skill;
        this.name = name;
        this.iconShape = iconShape;
        this.iconColor = iconColor;
        this.sequence = sequence;
        this.inUse = inUse;
    }
}
