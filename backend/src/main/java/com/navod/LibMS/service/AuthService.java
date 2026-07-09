package com.navod.LibMS.service;

import com.navod.LibMS.dto.auth.RegisterRequestDto;
import com.navod.LibMS.dto.auth.response.Authresponse;
import jakarta.validation.Valid;

public interface AuthService {
    Authresponse register(@Valid RegisterRequestDto requestDto);
}
