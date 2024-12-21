package com.springmvc.service.impl;

import com.springmvc.model.entity.NhaSanXuat;
import com.springmvc.repository.NhaSanXuatRepository;
import com.springmvc.service.NhaSanXuatService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Service
public class NhaSanXuatServiceImpl implements NhaSanXuatService {
    NhaSanXuatRepository nhaSanXuatRepository;
    @Override
    public List<NhaSanXuat> getAllNhaSanXuat() {
        return nhaSanXuatRepository.findAll();
    }
}
