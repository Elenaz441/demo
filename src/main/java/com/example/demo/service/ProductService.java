package com.example.demo.service;

import com.example.demo.domain.dto.request.CreateProductRequest;
import com.example.demo.domain.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> getProductList();

    ProductResponse addNewProduct(CreateProductRequest request);
}
