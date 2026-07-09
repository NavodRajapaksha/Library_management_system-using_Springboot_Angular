package com.navod.LibMS.dto.auth.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Authresponse {

    private String accessToken;
    private String tokenType;
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
