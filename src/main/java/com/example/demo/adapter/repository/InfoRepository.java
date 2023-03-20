package com.example.demo.adapter.repository;

import com.example.demo.adapter.repository.base.BaseRepository;
import com.example.demo.adapter.repository.generator.IdGenerator;
import com.example.demo.domain.entity.Info;
import org.springframework.stereotype.Component;

@Component
public class InfoRepository extends BaseRepository<Info, Long> {
    public InfoRepository(IdGenerator<Long> idGenerator){
        super(idGenerator);
    }
}
