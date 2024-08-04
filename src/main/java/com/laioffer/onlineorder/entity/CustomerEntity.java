package com.laioffer.onlineorder.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("customers")
public record CustomerEntity(
        /*@ID is primary key*/
        @Id Long id,
        String email,
        String password,
        boolean enabled,
        String firstName,
        String lastName
) {
}

