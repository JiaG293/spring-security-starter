package com.springmvc.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sp", nullable = false)
    private Long id;

    @Column(name = "ten_sp", nullable = false, length = 100)
    private String tenSp;

    @Column(name = "gia", nullable = false, precision = 15, scale = 2)
    private BigDecimal gia;

    @ColumnDefault("0")
    @Column(name = "so_luong")
    private Integer soLuong;

    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_loai")
    private LoaiSanPham idLoai;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_nsx")
    private NhaSanXuat idNsx;

}