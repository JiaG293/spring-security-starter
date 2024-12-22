package com.springmvc.controller;

import com.springmvc.model.entity.SanPham;
import com.springmvc.service.impl.LoaiSanPhamServiceImpl;
import com.springmvc.service.impl.NhaSanXuatServiceImpl;
import com.springmvc.service.impl.SanPhamServiceImpl;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Controller

public class SanPhamController {
    SanPhamServiceImpl sanPhamService;
    LoaiSanPhamServiceImpl loaiSanPhamService;
    NhaSanXuatServiceImpl nhaSanXuatService;

    @GetMapping
    public String home() {
        return "index";
    }

    @GetMapping("/san-pham")
    public String sanPhamListPage(Model model) {
        var sanPhamList = sanPhamService.getAllSanPham();
        if (sanPhamList != null) {
            model.addAttribute("sanPhamList", sanPhamList);
            return "sanPham/san-pham";
        } else {
            return "exception/404";
        }
    }

    @GetMapping("/san-pham/{id}")
    public String sanPhamPage(@PathVariable Long id, Model model) {
        var sanPham = sanPhamService.getSanPham(id);
        if (sanPham != null) {
            model.addAttribute("sanPham", sanPham);
            return "san-pham-detail";
        } else {
            return "exception/404";
        }
    }

    @GetMapping("/san-pham/add")
    public String addSanPhamPage(Model model) {
        var loaiSanPhamList = loaiSanPhamService.getAllLoaiSanPham();
        var nhaSanXuatList = nhaSanXuatService.getAllNhaSanXuat();
        model.addAttribute("sanPham", new SanPham());
        model.addAttribute("loaiSanPhamList", loaiSanPhamList);
        model.addAttribute("nhaSanXuatList", nhaSanXuatList);
        return "sanPham/add";
    }

    @PostMapping("/san-pham/add/save")
    public String addSanPham(@Valid @ModelAttribute SanPham sanPham, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            var loaiSanPhamList = loaiSanPhamService.getAllLoaiSanPham();
            var nhaSanXuatList = nhaSanXuatService.getAllNhaSanXuat();
            model.addAttribute("loaiSanPhamList", loaiSanPhamList);
            model.addAttribute("nhaSanXuatList", nhaSanXuatList);
            return "sanPham/add";
        } else {
            sanPhamService.saveSanPham(sanPham);
            return "redirect:/san-pham";
        }
    }


    @GetMapping("/san-pham/edit/{id}")
    public String sanPhamEditPage(@PathVariable Long id, Model model) {
        var sanPham = sanPhamService.getSanPham(id);
        var loaiSanPhamList = loaiSanPhamService.getAllLoaiSanPham();
        var nhaSanXuatList = nhaSanXuatService.getAllNhaSanXuat();
        if (sanPham != null) {
            model.addAttribute("sanPham", sanPham);
            model.addAttribute("loaiSanPhamList", loaiSanPhamList);
            model.addAttribute("nhaSanXuatList", nhaSanXuatList);
            return "sanPham/edit";
        } else {
            return "exception/404";
        }
    }

    @PostMapping("/san-pham/edit/{id}/save")
    public String updateSanPham(@PathVariable Long id, @ModelAttribute SanPham sanPham) {
        sanPhamService.updateSanPham(id, sanPham);
        return "redirect:/san-pham";
    }

    @GetMapping("/san-pham/delete/{id}")
    public String deleteSanPham(@PathVariable Long id) {
        sanPhamService.deleteSanPham(id);
        return "redirect:/san-pham";
    }



}