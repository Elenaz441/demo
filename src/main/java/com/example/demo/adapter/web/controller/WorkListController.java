package com.example.demo.adapter.web.controller;

import com.example.demo.domain.dto.request.CreateWorkListRequest;
import com.example.demo.domain.dto.response.WorkListResponse;
import com.example.demo.service.WorkListService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;


@RestController
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class WorkListController {

    WorkListService workListService;

    @GetMapping("/view-lists")
    public ResponseEntity<List<WorkListResponse>> getWorkLists() {
        return new ResponseEntity<>(workListService.getWorkLists(), HttpStatus.OK);
    }

    @PostMapping("/add-list")
    public ResponseEntity<WorkListResponse> addWorkList(@RequestBody CreateWorkListRequest workListRequest) {
        return new ResponseEntity<>(workListService.addNewWorkList(workListRequest), HttpStatus.OK);
    }
}
