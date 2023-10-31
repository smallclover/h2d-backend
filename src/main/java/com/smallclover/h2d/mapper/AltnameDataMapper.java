package com.smallclover.h2d.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smallclover.h2d.entity.AltnameData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AltnameDataMapper extends BaseMapper<AltnameData> {

    public List<AltnameData> getAltNameByPersonIdAndType(@Param("personId") Integer personId, @Param("codeType") Integer altNameCodeType);
}
