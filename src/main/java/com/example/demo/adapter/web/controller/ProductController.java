package com.example.demo.adapter.web.controller;

import com.example.demo.adapter.web.annotation.AdminApiV1;
import com.example.demo.domain.dto.request.CreateProductRequest;
import com.example.demo.domain.dto.response.ProductResponse;
import com.example.demo.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Validated
@AdminApiV1
@RequiredArgsConstructor
@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {

    ProductService productService;

    @PostMapping("/products/add")
    public ResponseEntity<ProductResponse> createProduct(@Valid @RequestBody CreateProductRequest productRequest) {
        return new ResponseEntity<>(productService.addNewProduct(productRequest), HttpStatus.OK);
    }

    @GetMapping("/products/list")
    public ResponseEntity<List<ProductResponse>> getProducts() {
        return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
    }
}
