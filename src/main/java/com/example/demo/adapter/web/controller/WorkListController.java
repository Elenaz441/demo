package com.example.demo.adapter.web.controller;

import com.example.demo.adapter.repository.EventRepository;
import com.example.demo.domain.dto.request.CreateWorkListRequest;
import com.example.demo.domain.dto.response.WorkListResponse;
import com.example.demo.domain.entity.Event;
import com.example.demo.service.WorkListService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;


@RestController
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class WorkListController {

    @Autowired
    WorkListService workListService;
    EventRepository eventRepository;

    @GetMapping("/view-all-lists")
    public ResponseEntity<List<WorkListResponse>> getWorkLists() {
        return new ResponseEntity<>(workListService.getWorkLists(), HttpStatus.OK);
    }

    @GetMapping("view-by-list/{work_list_id}")
    public ResponseEntity<List<Event>> getEvents(@PathVariable Long work_list_id) {
        return new ResponseEntity<>(eventRepository.findAllByWorkListId(work_list_id), HttpStatus.OK);
    }

    @PostMapping("/add-list")
    public ResponseEntity<WorkListResponse> addWorkList(@RequestBody CreateWorkListRequest workListRequest) {
        return new ResponseEntity<>(workListService.addNewWorkList(workListRequest), HttpStatus.OK);
    }
}
