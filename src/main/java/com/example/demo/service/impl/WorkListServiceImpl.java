package com.example.demo.service.impl;

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

    @Override
    public List<WorkListResponse> getWorkLists() {
        return workListRepository.findAll().stream()
                .map(workListFactory::createWorkListResponseFrom)
                .collect(Collectors.toList());
    }

    @Override
    public WorkListResponse addNewWorkList(CreateWorkListRequest request) {
        WorkList workList = WorkList.createWorkListFrom(request);
        WorkList finalWorkList = workList;
        workList.setEvents(request.getEvents()
                .stream()
                .map(event -> Event.createEventFrom(event, finalWorkList))
                .collect(Collectors.toList()));
        workList = workListRepository.save(workList);
        return workListFactory.createWorkListResponseFrom(workList);
    }
}
