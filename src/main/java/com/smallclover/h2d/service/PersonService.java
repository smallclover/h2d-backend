package com.smallclover.h2d.service;

import com.smallclover.h2d.dto.Person;
import com.smallclover.h2d.dto.RelationGraph;
import com.smallclover.h2d.entity.BiogMain;
import com.smallclover.h2d.entity.other.Relation;

import java.util.List;

/**
 *
 * @author wangshun
 */
public interface PersonService {

    /**
     * 获取传记人物
     * @param personId 传记人物ID
     * @return 传记人物全部信息
     */
    Person getPersonById(Integer personId);

    List<Person> getPersonListByName(String personName);

    RelationGraph getRelationById(Integer personId);
}
