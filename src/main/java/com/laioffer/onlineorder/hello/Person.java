package com.laioffer.onlineorder.hello;


public record Person(
        String name,
        String company,
        Address home_address,
        Book favorite_book
) {
}

