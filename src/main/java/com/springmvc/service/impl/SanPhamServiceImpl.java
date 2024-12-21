package com.springmvc.service.impl;

import com.springmvc.model.entity.SanPham;
import com.springmvc.repository.SanPhamRepository;
import com.springmvc.service.SanPhamService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.View;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
public class SanPhamServiceImpl implements SanPhamService {
    SanPhamRepository sanPhamRepository;
    private final View error;

    @Override
    public SanPham getSanPham(Long id) {
        var sanPham =  sanPhamRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Sản phẩm với ID " + id + " không tồn tại"));
        sanPham.getIdLoai();
        sanPham.getIdNsx();
        return sanPham;
    }

    @Override
    public List<SanPham> getAllSanPham() {
        return sanPhamRepository.findAll();
    }

    @Override
    public SanPham saveSanPham(SanPham sanPham) {

        return sanPhamRepository.save(sanPham);
    }

    @Override
    public SanPham updateSanPham(Long id, SanPham sanPham) {
        var sanPhamCheck = sanPhamRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("san pham khong ton tai"));
        sanPhamCheck = sanPham;
        sanPhamRepository.save(sanPhamCheck);
        return sanPhamCheck;
    }

    @Override
    public void deleteSanPham(Long id) {
        sanPhamRepository.deleteById(id);
    }
}
