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

public class ShipperDTO {

    private String name;

    private String phone;

    private Date createAt;

    private Date updateAt;
}
