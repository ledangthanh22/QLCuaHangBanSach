package com.poly.bookshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderDetailDTO {

    private String bookName;

    private Integer quantity;

    private Double price;

    private Double reducedPrice;
}
