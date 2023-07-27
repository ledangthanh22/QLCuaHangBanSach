package com.poly.bookshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Loai_Sach")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_loai_sach")
    private String name;

    @Column(name = "mo_ta")
    private String describe;

    @Column(name = "ngay_tao")
    private Date createAt;

    @Column(name = "ngay_sua")
    private Date updateAt;

    @JsonIgnore
    @OneToMany(mappedBy = "loaiSach")
    private List<Book> books = new ArrayList<>();
}
