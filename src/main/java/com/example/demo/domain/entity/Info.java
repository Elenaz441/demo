package com.example.demo.domain.entity;

import com.example.demo.adapter.repository.base.BaseDomainEntity;
import com.example.demo.adapter.web.annotation.DateConstraint;
import com.example.demo.domain.entity.context.InfoContext;
import lombok.NonNull;
import lombok.Value;

import java.util.Date;

@Value
public class Info extends BaseDomainEntity<Long> {
    @NonNull
    @DateConstraint
    Date date;

    public static Info createInfoFrom(InfoContext context) {
        return new Info(
                context.getDate()
        );
    }
}
