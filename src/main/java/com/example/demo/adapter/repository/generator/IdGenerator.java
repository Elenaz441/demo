package com.example.demo.adapter.repository.generator;

public interface IdGenerator<ID> {
    ID generateNextFor(Class<?> clazz);
}
