package com.navod.LibMS.service.impl;

import com.navod.LibMS.dto.auth.RegisterRequestDto;
import com.navod.LibMS.dto.auth.response.Authresponse;
import com.navod.LibMS.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public Authresponse register(RegisterRequestDto requestDto) {
        return null;
    }
}
