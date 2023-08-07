package com.poly.bookshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTO {

    private Long oderCode;

    private Date OderDate;

    private String customerName;

    private String staffName;

    private String shipName;

    private String shippingName;

    private String paymentName;

    private Double totalMoney;

}
