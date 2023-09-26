package com.birds.api.model;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
