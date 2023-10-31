package com.smallclover.h2d.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smallclover.h2d.entity.BiogMain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BiogMainMapper extends BaseMapper<BiogMain> {

    BiogMain getBiogMainById(Integer id);

    List<BiogMain> getBiogMainByName(String name);
}