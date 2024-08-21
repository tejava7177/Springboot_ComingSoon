package org.comingSoonPrac.springDeveloper.controller;


import org.comingSoonPrac.springDeveloper.service.TestService;
import org.comingSoonPrac.springDeveloper.model.Member;
import org.comingSoonPrac.springDeveloper.model.member_new;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;


    @GetMapping("/test")
    public List<Member> getAllMembers(){
        List<Member> members = testService.getAllMembers();
        return members;
    }

    @GetMapping("/test/new")
    public List<member_new> getAllnew_Members(){
        List<member_new> members = testService.getAllnew_Members();
        return members;
    }
}
