package com.example.demo.domain.entity;

import com.example.demo.adapter.repository.base.BaseDomainEntity;
import com.example.demo.adapter.repository.generator.LongGenerator;
import com.example.demo.domain.entity.context.InfoContext;
import lombok.NonNull;
import lombok.Value;

import java.util.Date;

@Value
public class Info extends BaseDomainEntity<Long> {
    @NonNull
    Date date;
    private static LongGenerator longGenerator = new LongGenerator();

    public static Info createInfoFrom(InfoContext context) {
        Info info = new Info(
                context.getDate()
        );
        info.initId(longGenerator.generateNextFor(info.getClass()));
        return info;
    }
}
