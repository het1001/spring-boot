package com.het.boot.web.dao;

import com.het.boot.web.model.Permission;

public interface PermissionMapper {
    int insert(Permission record);

    int insertSelective(Permission record);
}