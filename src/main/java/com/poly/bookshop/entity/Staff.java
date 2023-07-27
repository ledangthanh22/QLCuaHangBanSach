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
@Table(name = "Nhan_Vien")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_nhan_vien")
    private String name;

    @Column(name = "gioi_tinh")
    private Boolean gender;

    @Column(name = "ngay_sinh")
    private Date birthOfDay;

    @Column(name = "so_dien_thoai")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "dia_chi")
    private String address;

    @Column(name = "mat_khau")
    private String password;

    @Column(name = "trang_thai")
    private Boolean status;

    @Column(name = "ngay_tao")
    private Date createAt;

    @Column(name = "ngay_sua")
    private Date updateAt;

    @JsonIgnore
    @OneToMany(mappedBy = "nhanVien")
    private List<Oder> oders = new ArrayList<>();

    @ManyToOne()
    @JoinColumn(name = "chuc_vu_id")
    private Position position;
}
