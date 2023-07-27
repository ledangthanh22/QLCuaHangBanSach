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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Hoa_Don")
public class Oder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tong_tien")
    private Double totalMoney;

    @Column(name = "ten_nguoi_nhan")
    private String shipName;

    @Column(name = "so_dien_thoai")
    private String shipPhone;

    @Column(name = "dia_chi")
    private String shipAddress;

    @Column(name = "thanh_pho")
    private String shipCity;

    @Column(name = "quoc_gia")
    private String shipCountry;

    @Column(name = "trang_thai")
    private String status;

    @Column(name = "ngay_tao")
    private Date OderDate;

    @Column(name = "ngay_giao")
    private Date deliveryDate;

    @Column(name = "ngay_nhan")
    private Date receivedDate;

    @ManyToOne()
    @JoinColumn(name = "khach_hang_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name = "nhan_vien_id")
    private Staff  staff;

    @ManyToOne()
    @JoinColumn(name = "van_chuyen_id")
    private Shipping shipping;

    @ManyToOne()
    @JoinColumn(name = "thanh_toan_id")
    private Payment payment;

    @ManyToOne()
    @JoinColumn(name = "nguoi_giao_id")
    private Shipper shipper;

    @JsonIgnore
    @OneToMany(mappedBy = "hoaDon")
    private List<OderDetail> oderDetails = new ArrayList<>();
}
