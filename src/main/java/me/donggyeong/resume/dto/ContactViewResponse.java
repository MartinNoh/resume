package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Contact;
import me.donggyeong.resume.domain.Work;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ContactViewResponse {
    private Long id;
    private String description;
    private String mapLink;
    private String location;
    private String emailAddress;
    private String callNumber;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ContactViewResponse(Contact contact) {
        this.id = contact.getId();
        this.description = contact.getDescription();
        this.mapLink = contact.getMapLink();
        this.location = contact.getLocation();
        this.emailAddress = contact.getEmailAddress();
        this.callNumber = contact.getCallNumber();
        this.inUse = contact.getInUse();
        this.createdAt = contact.getCreatedAt();
        this.updatedAt = contact.getUpdatedAt();
    }
}
