package com.het.boot.web.dao;

import com.het.boot.web.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}