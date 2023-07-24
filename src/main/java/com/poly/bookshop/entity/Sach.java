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

import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Sach",uniqueConstraints = {@UniqueConstraint(columnNames = {"loai_sach_id","loai_bia_id","nxb_id","kich_thuoc_id"})})
public class Sach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_sach")
    private String tenSach;

    @Column(name = "anh")
    private String anh;

    @Column(name = "gia")
    private Double gia;

    @Column(name = "gia_giam")
    private Double giaGiam;

    @Column(name = "nam_xuat_ban")
    private Integer namXuatBan;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_luong_ton")
    private Integer soLuongTon;

    @Column(name = "tinh_trang_sach")
    private Boolean tinhTrangSach;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kich_thuoc_id",referencedColumnName = "id")
    private KichThuoc kichThuoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loai_sach_id",referencedColumnName = "id")
    private LoaiSach loaiSach;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loai_bia_id",referencedColumnName = "id")
    private LoaiBia loaiBia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nxb_id",referencedColumnName = "id")
    private NhaXuatBan nhaXuatBan;


}
