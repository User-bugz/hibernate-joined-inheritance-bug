package com.example.demo.service;

import com.example.demo.entity.DescendantEntity;
import com.example.demo.repository.DescendantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class JoinedInheritanceJpaService {

    private final DescendantRepository descendantRepository;

    @Transactional
    public void saveEntity() {
        DescendantEntity descendantEntity = new DescendantEntity();
        descendantEntity.setName("name");
        descendantEntity.setSurname("surname");
        descendantRepository.save(descendantEntity);
    }
}
