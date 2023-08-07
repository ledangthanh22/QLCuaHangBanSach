package com.poly.bookshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Sach")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_sach")
    private String name;

    @Column(name = "anh")
    private String image;

    @Column(name = "gia")
    private Double price;

    @Column(name = "gia_giam")
    private Double reducedPrice;

    @Column(name = "nam_xuat_ban")
    private Integer year;

    @Column(name = "mo_ta")
    private String describe;

    @Column(name = "so_luong_ton")
    private Integer quantity;

    @Column(name = "tinh_trang_sach")
    private Boolean bookStatus;

    @Column(name = "trang_thai")
    private Integer status;

    @Column(name = "ngay_tao")
    private Date createAt;

    @Column(name = "ngay_sua")
    private Date updateAt;

    @ManyToOne()
    @JoinColumn(name = "kich_thuoc_id")
    private Size size;

    @ManyToOne()
    @JoinColumn(name = "loai_sach_id")
    private Category category;

    @ManyToOne()
    @JoinColumn(name = "loai_bia_id")
    private BookCover bookCover;

    @ManyToOne()
    @JoinColumn(name = "nxb_id")
    private Publishing publishing;

    @ManyToOne()
    @JoinColumn(name = "tac_gia_id")
    private Author author;

//    @JsonIgnore
//    @OneToMany(mappedBy = "book")
//    private List<OrderDetail> orderDetails = new ArrayList<>();

}
