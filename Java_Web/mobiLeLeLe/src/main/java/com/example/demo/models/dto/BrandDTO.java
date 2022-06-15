package com.example.demo.models.dto;

import java.util.List;

public class BrandDTO {
    private String name;
    private List<ModelDTO> models;

    public String getName() {
        return name;
    }

    public BrandDTO setName(String name) {
        this.name = name;
        return this;
    }

    public List<ModelDTO> getModels() {
        return models;
    }

    public BrandDTO setModels(List<ModelDTO> models) {
        this.models = models;
        return this;
    }
}
