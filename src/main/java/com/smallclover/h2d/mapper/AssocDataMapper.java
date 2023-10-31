package com.smallclover.h2d.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smallclover.h2d.entity.AssocData;
import com.smallclover.h2d.entity.other.Relation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssocDataMapper extends BaseMapper<AssocData> {

    List<Relation> getRelationByPersonId(Integer personId);
}