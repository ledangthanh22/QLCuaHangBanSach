package com.poly.bookshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ShippingDTO {

    private String name;

    private Double price;

    private String describe;

    private Date createAt;

    private Date updateAt;
}
