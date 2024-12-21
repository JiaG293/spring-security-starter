package com.springmvc.service;

import com.springmvc.model.entity.SanPham;

import java.util.List;

public interface SanPhamService {
    SanPham getSanPham(Long id);
    List<SanPham> getAllSanPham();
    SanPham saveSanPham(SanPham sanPham);
    SanPham updateSanPham(Long id, SanPham sanPham);
    void deleteSanPham(Long id);
}
