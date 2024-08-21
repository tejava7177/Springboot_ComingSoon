package org.comingSoonPrac.springDeveloper.service;


import org.comingSoonPrac.springDeveloper.model.Member;
import org.comingSoonPrac.springDeveloper.model.member_new;
import org.comingSoonPrac.springDeveloper.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    org.comingSoonPrac.springDeveloper.repository.member_newRepository member_newRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }


    public List<member_new> getAllnew_Members(){
        return member_newRepository.findAll();
    }
}
