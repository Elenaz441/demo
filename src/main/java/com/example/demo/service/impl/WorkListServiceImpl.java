package com.example.demo.service.impl;

import com.example.demo.adapter.repository.EventRepository;
import com.example.demo.adapter.repository.WorkListRepository;
import com.example.demo.domain.dto.request.CreateWorkListRequest;
import com.example.demo.domain.dto.response.WorkListResponse;
import com.example.demo.domain.entity.Event;
import com.example.demo.domain.entity.WorkList;
import com.example.demo.service.WorkListService;
import com.example.demo.service.factory.WorkListFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class WorkListServiceImpl implements WorkListService {

    WorkListRepository workListRepository;
    WorkListFactory workListFactory;
    EventRepository eventRepository;

    @Override
    public List<WorkListResponse> getWorkLists() {
        return workListRepository.findAll().stream()
                .map(workListFactory::createWorkListResponseFrom)
                .collect(Collectors.toList());
    }

    @Override
    public WorkListResponse addNewWorkList(CreateWorkListRequest request) {
        WorkList workList = WorkList.createWorkListFrom(request);
        workList = workListRepository.save(workList);
        List<String> events = request.getEvents();
        WorkList finalWorkList = workList;
        events.forEach(event -> addNewEvent(event, finalWorkList));
        return workListFactory.createWorkListResponseFrom(workList);
    }

    private void addNewEvent(String name, WorkList workList) {
        Event event = Event.createEventFrom(name, workList);
        event = eventRepository.save(event);
    }
}
