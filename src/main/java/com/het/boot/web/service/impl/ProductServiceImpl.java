package com.het.boot.web.service.impl;

import com.het.boot.web.dao.ProductMapper;
import com.het.boot.web.model.Product;
import com.het.boot.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getById(long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return productMapper.getById(params);
    }
}
