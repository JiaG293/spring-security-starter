package com.springmvc.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "nha_san_xuat")
public class NhaSanXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nsx", nullable = false)
    private Long id;

    @Column(name = "ten_nsx", nullable = false, length = 100)
    private String tenNsx;

    @Column(name = "quoc_gia", length = 50)
    private String quocGia;

}