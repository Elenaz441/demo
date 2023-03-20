package com.example.demo.adapter.repository.base;

import lombok.Getter;


@Getter
public abstract class BaseDomainEntity<ID> {
    private ID id;

    public boolean isIdNotInitialized() {
        return id == null;
    }

    public void initId(ID id) {
        if (isIdNotInitialized())
            this.id = id;
    }
}
