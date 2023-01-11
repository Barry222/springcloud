package com.barry.controller;

import com.barry.entity.Student;
import com.barry.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("feign")
@RestController
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClientt;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("index")
    public String index(){
        return feignProviderClient.index();
    }
}
