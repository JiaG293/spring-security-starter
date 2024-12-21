package com.springmvc.service.impl;

import com.springmvc.model.entity.LoaiSanPham;
import com.springmvc.repository.LoaiSanPhamRepository;
import com.springmvc.service.LoaiSanPhamService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {
    LoaiSanPhamRepository loaiSanPhamRepository;
    @Override
    public List<LoaiSanPham> getAllLoaiSanPham() {
        return loaiSanPhamRepository.findAll();
    }
}
