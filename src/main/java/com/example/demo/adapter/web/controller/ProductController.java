package com.example.demo.adapter.web.controller;

import com.example.demo.adapter.web.annotation.AdminApiV1;
import com.example.demo.adapter.web.annotation.DateConstraint;
import com.example.demo.domain.dto.request.CreateProductRequest;
import com.example.demo.domain.dto.response.ProductResponse;
import com.example.demo.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Validated
@AdminApiV1
@RequiredArgsConstructor
@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {

    ProductService productService;

    @PostMapping("/products/add")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody @Valid CreateProductRequest productRequest) {
        return new ResponseEntity<>(productService.addNewProduct(productRequest), HttpStatus.OK);
    }

    @GetMapping("/products/list")
    public ResponseEntity<List<ProductResponse>> getProducts() {
        return new ResponseEntity<>(productService.getProductList(), HttpStatus.OK);
    }
}
