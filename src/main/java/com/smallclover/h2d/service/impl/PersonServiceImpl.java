package com.smallclover.h2d.service.impl;

import com.smallclover.h2d.dto.*;
import com.smallclover.h2d.entity.AltnameData;
import com.smallclover.h2d.entity.BiogMain;
import com.smallclover.h2d.entity.other.Relation;
import com.smallclover.h2d.mapper.AltnameDataMapper;
import com.smallclover.h2d.mapper.AssocDataMapper;
import com.smallclover.h2d.mapper.BiogMainMapper;
import com.smallclover.h2d.service.PersonService;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangshun
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private BiogMainMapper biogMainMapper;
    @Autowired
    private AltnameDataMapper altnameDataMapper;
    @Autowired
    private AssocDataMapper assocDataMapper;
    @Override
    @Cacheable(value = "h2d_person", key = "#personId")
    public Person getPersonById(Integer personId) {
        BiogMain bm = biogMainMapper.getBiogMainById(personId);
        // 4是字
        List<AltnameData> altnameDataList = altnameDataMapper.getAltNameByPersonIdAndType(bm.getCPersonid(), 4);
        Person person = Person.builder()
                .cPersonid(bm.getCPersonid())
                .cName(bm.getCName())
                .cNameChn(bm.getCNameChn())
                .altNameChn(altnameDataList.getFirst().getCAltNameChn())
                .cIndexYear(bm.getCIndexYear())
                .cFemale(bm.getCFemale())
                .cBirthyear(bm.getCBirthyear())
                .cDeathyear(bm.getCDeathyear())
                .cFlEyNotes(bm.getCFlEyNotes())
                .cFlLyNotes(bm.getCFlLyNotes())
                .cByNhCode(bm.getCByNhCode())
                .cByNhYear(bm.getCByNhYear())
                .cDyNhCode(bm.getCDyNhCode())
                .cDyNhYear(bm.getCDyNhYear())
                .cDeathAge(bm.getCDeathAge())
                .cSurname(bm.getCSurname())
                .cSurnameChn(bm.getCSurnameChn())
                .cMingzi(bm.getCMingzi())
                .cMingziChn(bm.getCMingziChn())
                .cDy(bm.getCDy()).build();

//        redisTemplate.boundValueOps(bm.getCPersonid().toString()).set(person);

        return person;
    }

    @Override
    public List<Person> getPersonListByName(String personName) {
        List<Person> personList = new ArrayList<>();

        List<BiogMain> biogMainList = biogMainMapper.getBiogMainByName(personName);

        for (BiogMain bm:
             biogMainList) {
            Person person = Person.builder()
                    .cPersonid(bm.getCPersonid())
                    .cName(bm.getCName())
                    .cNameChn(bm.getCNameChn())
                    .cIndexYear(bm.getCIndexYear())
                    .cFemale(bm.getCFemale())
                    .cBirthyear(bm.getCBirthyear())
                    .cDeathyear(bm.getCDeathyear())
                    .cFlEyNotes(bm.getCFlEyNotes())
                    .cFlLyNotes(bm.getCFlLyNotes())
                    .cByNhCode(bm.getCByNhCode())
                    .cByNhYear(bm.getCByNhYear())
                    .cDyNhCode(bm.getCDyNhCode())
                    .cDyNhYear(bm.getCDyNhYear())
                    .cDeathAge(bm.getCDeathAge())
                    .cSurname(bm.getCSurname())
                    .cSurnameChn(bm.getCSurnameChn())
                    .cMingzi(bm.getCMingzi())
                    .cMingziChn(bm.getCMingziChn())
                    .cDy(bm.getCDy()).build();
            personList.add(person);
        }
        return personList;
    }

    @Override
    public RelationGraph getRelationById(Integer personId) {
        List<Relation> relations = assocDataMapper.getRelationByPersonId(personId);

        // 生成关系目录
        List<Category> categories = new ArrayList<>();
        relations.stream().map(Relation::getAssocTypeDescChn).distinct().forEach( desc ->{
            categories.add(Category.builder().name(desc).build());
        });


        List<Node> nodes = new ArrayList<>();
        Map<Integer, List<Relation>> relationMap = relations.stream().collect(Collectors.groupingBy(Relation::getSPersonId));

        relationMap.forEach((id, relationList) ->{


            nodes.add(Node.builder()
                            .id(id)
                            .name(relationList.getFirst().getSPersonChn())
                            .label(relationList.getFirst().getSPersonChn())
                            .category(categories.indexOf(Category.builder().name(relationList.getFirst().getAssocTypeDescChn()).build()))
                            .symbolSize(10*relationList.size())
//                                .x()
                            .build()
            );
        });

        List<Link> links = new ArrayList<>();
        relations.forEach(relation -> {
//            int x =RandomUtils.nextInt(400, 500);
//            // 创建节点
//            nodes.add(Node.builder()
//                    .id(relation.getSPersonId())
//                    .category(categories.indexOf(Category.builder().name(relation.getAssocTypeDescChn()).build()))
//                    .name(relation.getSPersonChn())
//                    .label(StringUtils.EMPTY)
//                    .symbolSize(50)//暂定
//                    .x(x).y(x)
//                    .build()
//            );
            if(!links.contains(Link.builder()
                    .label(relation.getAssocTypeDescChn())
                    .source(String.valueOf(relation.getSPersonId()))
                    .target(String.valueOf(relation.getMPersonId()))
                    .build())){
                links.add(Link.builder()
                        .label(relation.getAssocTypeDescChn())
                        .source(String.valueOf(relation.getSPersonId()))
                        .target(String.valueOf(relation.getMPersonId()))
                        .build()
                );
            }
            // 创建点之间的关系

        });

        String mPersonChn = relations.stream().map(Relation::getMPersonChn).findFirst().get();
//        int mX =RandomUtils.nextInt(400, 500);
        nodes.add(Node.builder()
                .id(personId)
                        .name(mPersonChn)
                        .label(mPersonChn)
                        .symbolSize(50)
//                        .x(mX).y(mX)
                .build()
        );

        return RelationGraph.builder().categories(categories).nodes(nodes).links(links).build();
    }


}
