package com.poly.bookshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Hoa_Don_Chi_Tiet")
public class OderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_sach")
    private String bookName;

    @Column(name = "so_luong")
    private Integer quantity;

    @Column(name = "gia")
    private Double price;

    @Column(name = "giam_gia")
    private Double reducedPrice;


    @ManyToOne()
    @JoinColumn(name = "sach_id")
    private Book book;

    @ManyToOne()
    @JoinColumn(name = "hoa_don_id")
    private Oder oder;

}
