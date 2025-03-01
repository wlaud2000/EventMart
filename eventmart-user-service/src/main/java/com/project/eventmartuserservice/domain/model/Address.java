package com.project.eventmartuserservice.domain.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private Long id;
    private Long userId;
    private String city;
    private String gu;
    private String dong;
    private String detailAddress;
}
