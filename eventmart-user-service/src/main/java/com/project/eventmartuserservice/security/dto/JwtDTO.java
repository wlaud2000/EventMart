package com.project.eventmartuserservice.security.dto;

import lombok.Builder;

@Builder
public record JwtDTO (

        String accessToken,

        String refreshToken
){

}
