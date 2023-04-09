package com.example.demo.service;

import com.example.demo.domain.dto.request.CreateWorkListRequest;
import com.example.demo.domain.dto.response.WorkListResponse;

import java.util.List;

public interface WorkListService {

    List<WorkListResponse> getWorkLists();

    WorkListResponse addNewWorkList(CreateWorkListRequest request);
}
