package com.example.storage02.service;

import com.example.storage02.model.Subject;
import com.example.storage02.repository.SubjectRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectService implements ISubjectService {

    private final SubjectRepo subjectRepo;

    @Override
    public Subject findById(long id) {
        return subjectRepo.findById(id).orElse(null);
    }
}
