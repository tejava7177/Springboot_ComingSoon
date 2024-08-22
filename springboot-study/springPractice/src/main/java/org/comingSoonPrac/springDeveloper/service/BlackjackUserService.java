package org.comingSoonPrac.springDeveloper.service;


import org.comingSoonPrac.springDeveloper.model.Blackjack_User;
import org.comingSoonPrac.springDeveloper.repository.BlackjackUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BlackjackUserService {

    @Autowired
    private BlackjackUserRepository blackjackUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Blackjack_User save(Blackjack_User blackjackUser) {
        // 비밀번호 암호화
        blackjackUser.setPassword(passwordEncoder.encode(blackjackUser.getPassword()));
        return blackjackUserRepository.save(blackjackUser);
    }
}