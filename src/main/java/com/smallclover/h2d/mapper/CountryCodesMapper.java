package com.smallclover.h2d.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smallclover.h2d.entity.CountryCodes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryCodesMapper extends BaseMapper<CountryCodes> {
}