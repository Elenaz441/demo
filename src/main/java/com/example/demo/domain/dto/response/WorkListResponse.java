package com.example.demo.domain.dto.response;

import lombok.Value;

import java.util.List;

@Value
public class WorkListResponse {

    String name;

    List<String> events;

}
