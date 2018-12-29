package com.het.boot.web.dao;

import com.het.boot.web.model.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}