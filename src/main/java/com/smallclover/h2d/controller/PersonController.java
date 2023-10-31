package com.smallclover.h2d.controller;

import com.smallclover.h2d.dto.*;
import com.smallclover.h2d.service.PersonService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author wangshun
 */
@Tag(name = "人物API", description = "人物相关API")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @Operation(summary = "通过人物ID获取人物详情", description = "通过人物ID获取人物详情")
    @GetMapping("/person/{id}")
    public Person personDetail(@PathVariable("id") Integer personId){
        return personService.getPersonById(personId);
    }

    @GetMapping("/search")
    public List<Person> search(@RequestParam("personName") String personName){
        return personService.getPersonListByName(personName);
    }

    @GetMapping("/relation")
    public RelationGraph relation(){
        return personService.getRelationById(32540);
    }

}
