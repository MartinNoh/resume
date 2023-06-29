package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.Contact;
import me.donggyeong.resume.domain.Work;
import me.donggyeong.resume.repository.ContactRepository;
import me.donggyeong.resume.repository.WorkRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public Contact findFirstByOrderByIdDesc() {
        return contactRepository.findFirstByOrderByIdDesc();
    }
}
