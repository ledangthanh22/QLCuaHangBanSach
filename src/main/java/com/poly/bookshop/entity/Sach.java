package com.poly.bookshop.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "kich_thuoc_id")
    private KichThuoc kichThuoc;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "loai_sach_id")
    private LoaiSach loaiSach;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "loai_bia_id")
    private BiaSach loaiBia;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "nxb_id")
    private NhaXuatBan nhaXuatBan;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "tac_gia_id")
    private TacGia tacGia;

    @OneToMany(mappedBy = "sach",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<HoaDonCT> hoaDonCTs = new ArrayList<>();

}
