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
public class StaffDTO {

    private String name;

    private Boolean gender;

    private Date birthOfDay;

    private String phone;

    private String email;

    private String address;

    private String positionName;
}
