package com.navod.LibMS.controller;

import com.navod.LibMS.dto.auth.RegisterRequestDto;
import com.navod.LibMS.dto.auth.response.Authresponse;
import com.navod.LibMS.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {

    private final AuthService authService;

    // register
    @PostMapping("/register")
    public ResponseEntity<Authresponse> register(@Valid @RequestBody RegisterRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(authService.register(requestDto));
    }

    // login
}
