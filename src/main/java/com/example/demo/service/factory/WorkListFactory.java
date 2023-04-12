package com.example.demo.service.factory;

import com.example.demo.adapter.repository.EventRepository;
import com.example.demo.domain.dto.response.WorkListResponse;
import com.example.demo.domain.entity.WorkList;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class WorkListFactory {

    public WorkListResponse createWorkListResponseFrom(WorkList workList) {
        List<String> events = new LinkedList<>();
        workList.getEvents().forEach(event -> events.add(event.getName()));
        return new WorkListResponse(
                workList.getName(),
                events
        );
    }
}
