package com.poly.bookshop.dto;

import com.poly.bookshop.entity.Customer;
import com.poly.bookshop.entity.Payment;
import com.poly.bookshop.entity.Shipper;
import com.poly.bookshop.entity.Shipping;
import com.poly.bookshop.entity.Staff;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OderDTO {

    private Long oderCode;

    private Date OderDate;

    private String customerName;

    private String staffName;

    private String shipName;

    private String shippingName;

    private String paymentName;

    private Double totalMoney;

}
