package com.niksensei.projects.vaycasa.dto;

import com.niksensei.projects.vaycasa.entity.User;
import com.niksensei.projects.vaycasa.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
