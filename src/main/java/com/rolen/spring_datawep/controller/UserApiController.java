package com.rolen.spring_datawep.controller;

import com.rolen.spring_datawep.dto.AddUserRequest;
import com.rolen.spring_datawep.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {
    private final UserService userService;

    @PostMapping("/user")
    public String signUp(AddUserRequest request) {
        userService.save(request);
        return "redirect:/login";   // 가입 완료 -> 로그인 페이지 이동
    }
}
