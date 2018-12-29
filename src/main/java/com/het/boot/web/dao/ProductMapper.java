package com.het.boot.web.dao;

import com.het.boot.web.dao.aspect.SetDomain;
import com.het.boot.web.model.Product;
import org.springframework.cache.annotation.CacheConfig;

import java.util.Map;

@CacheConfig(cacheNames = "products")
public interface ProductMapper {
    int insert(Product record);

    @SetDomain
    Product getById(Map<String, Object> params);
}