package com.may.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author May
 * @creat 2022-04-06 14:10
 */
public interface MybatisMapper {

    @Mapper
    public String getName(String name);


}
