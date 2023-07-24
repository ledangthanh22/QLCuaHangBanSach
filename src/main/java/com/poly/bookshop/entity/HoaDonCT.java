package com.poly.bookshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Hoa_Don_Chi_Tiet",uniqueConstraints = {@UniqueConstraint(columnNames = {"hoa_don_id","sach_id"})})
public class HoaDonCT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_sach")
    private String tenSach;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "gia")
    private Double Gia;

    @Column(name = "giam_gia")
    private Double giamGia;

    @Column(name = "ghi_chu")
    private String GhiChu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sach_id",referencedColumnName = "id")
    private Sach sach;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hoa_don_id",referencedColumnName = "id")
    private HoaDon hoaDon;

}
