package com.example.demo.web.controller;

import com.example.demo.domain.dto.request.CreateProductRequest;
import com.example.demo.domain.dto.response.ProductResponse;
import com.example.demo.factory.ProductFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {

    ProductFactory productFactory;

    @PostMapping("/products/add")
    public ResponseEntity<ProductResponse> addProduct(@RequestBody @Valid CreateProductRequest productRequest) {
        return new ResponseEntity<>(productFactory.createProductResponseFrom(productRequest), HttpStatus.OK);
    }
}
