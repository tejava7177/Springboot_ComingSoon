package org.comingSoonPrac.springDeveloper.controller;


import org.comingSoonPrac.springDeveloper.model.Blackjack_User;
import org.comingSoonPrac.springDeveloper.service.BlackjackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blackjack")
public class BlackjackUserController {

    @Autowired
    private BlackjackUserService blackjackUserService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Blackjack_User blackjackUser) {
        try {
            blackjackUserService.save(blackjackUser);
            return ResponseEntity.ok("Registration successful!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Registration failed: " + e.getMessage());
        }
    }

    // ... other methods for managing Blackjack users
}