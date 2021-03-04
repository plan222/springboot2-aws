package com.plan222.springboot.config.auth.dto;

import com.plan222.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class AnotherSessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public AnotherSessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
