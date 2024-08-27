package org.comingSoonPrac.springDeveloper.controller;

import org.comingSoonPrac.springDeveloper.model.TextEntry;
import org.comingSoonPrac.springDeveloper.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "file:///Users/simjuheun/Desktop/Springboot_ComingSoon/springboot-study/MadeGame-main/blackjack/index.html")  // 프론트엔드가 실행되는 주소 (일반적으로 3000번 포트)

public class TextController {

    @Autowired
    private TextRepository textRepository;

    @PostMapping("/saveText")
    public TextEntry saveText(@RequestBody TextEntry textEntry) {
        return textRepository.save(textEntry);
    }
}