package com.example.demo.service.factory;

import com.example.demo.adapter.repository.InfoRepository;
import com.example.demo.domain.dto.request.CreateProductRequest;
import com.example.demo.domain.dto.response.ProductResponse;
import com.example.demo.domain.entity.Info;
import com.example.demo.domain.entity.Product;
import com.example.demo.domain.entity.context.InfoContext;
import com.example.demo.domain.entity.context.ProductContext;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductFactory {

    InfoRepository infoRepository;

    public ProductResponse createProductResponseFrom(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getPrice(),
                product.getDescription(),
                product.getProductionDate()
        );
    }

    public ProductContext createProductContextFrom(CreateProductRequest request) {
//        Info info = Info.createInfoFrom(new InfoContext(request.getInfo().getDate()));
//        info = infoRepository.save(info);
        return new ProductContext(
                request.getPrice(),
                request.getDescription(),
                request.getProductionDate()
        );
    }

//    private ProductResponse.Info createInfo(Info info) {
//        return new ProductResponse.Info(
//                info.getId(),
//                info.getDate()
//        );
//    }
}
