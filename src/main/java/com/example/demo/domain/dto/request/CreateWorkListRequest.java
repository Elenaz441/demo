package com.example.demo.domain.dto.request;

import lombok.Value;

import java.util.List;

@Value
public class CreateWorkListRequest {

    String name;

    List<String> events;

}
