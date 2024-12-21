INSERT INTO tai_khoan (id, address, email, username, password)
VALUES (3, NULL, 'user3@example.com3', 'user3', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu'),
       (4, NULL, 'user4@example.còm', 'user4fsdfs', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu'),
       (5, 'HN', 'user5@example.com', 'user5', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu'),
       (6, 'TPHCM', 'user6@example.com', 'user6', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu'),
       (7, 'HN', 'user7@example.com', 'user7', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu'),
       (8, 'HN', 'user8@example.com', 'user8', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu'),
       (9, 'TPHCM', 'user9@example.com', 'user9', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu'),
       (10, 'HN', 'user10@example.com', 'user10', '$2a$10$eHr2PUaHvEPxgWurIQsj4u7td.wa/uOT2vO3rGSwQ2QFkfuZwfIGu');


-- Dumping data for table quan_li_dien_thoai.khach_hang: ~10 rows (approximately)
INSERT INTO khach_hang (id_kh, ten_kh, email, so_dien_thoai, dia_chi)
VALUES (1, 'Nguyễn Văn A', 'a.nguyen@example.com', '0912345671', 'Hà Nội, Việt Nam'),
       (2, 'Trần Thị B', 'b.tran@example.com', '0912345672', 'Hồ Chí Minh, Việt Nam'),
       (3, 'Lê Văn C', 'c.le@example.com', '0912345673', 'Đà Nẵng, Việt Nam'),
       (4, 'Phạm Thị D', 'd.pham@example.com', '0912345674', 'Hải Phòng, Việt Nam'),
       (5, 'Vũ Văn E', 'e.vu@example.com', '0912345675', 'Cần Thơ, Việt Nam'),
       (6, 'Hoàng Thị F', 'f.hoang@example.com', '0912345676', 'Huế, Việt Nam'),
       (7, 'Ngô Văn G', 'g.ngo@example.com', '0912345677', 'Quảng Ninh, Việt Nam'),
       (8, 'Đỗ Thị H', 'h.do@example.com', '0912345678', 'Nha Trang, Việt Nam'),
       (9, 'Bùi Văn I', 'i.bui@example.com', '0912345679', 'Vũng Tàu, Việt Nam'),
       (10, 'Đặng Thị K', 'k.dang@example.com', '0912345680', 'Phú Quốc, Việt Nam');



-- Dumping data for table quan_li_dien_thoai.loai_san_pham: ~3 rows (approximately)
INSERT INTO loai_san_pham (id_loai, ten_loai)
VALUES (1, 'Smartphone'),
       (2, 'Tablet'),
       (3, 'Feature Phone');

-- Dumping data for table quan_li_dien_thoai.nha_san_xuat: ~5 rows (approximately)
INSERT INTO nha_san_xuat (id_nsx, ten_nsx, quoc_gia)
VALUES (1, 'Apple', 'USA'),
       (2, 'Samsung', 'South Korea'),
       (3, 'Xiaomi', 'China'),
       (4, 'Oppo', 'China'),
       (5, 'Vivo', 'China');

-- Dumping data for table quan_li_dien_thoai.san_pham: ~6 rows (approximately)
INSERT INTO san_pham (id_sp, ten_sp, gia, so_luong, mo_ta, id_loai, id_nsx)
VALUES (1, 'iPhone 13', 999.99, 50, 'iPhone 13 with 128GB', 1, 1),
       (2, 'Samsung Galaxy S21', 799.99, 40, 'Galaxy S21 with 128GB', 1, 2),
       (3, 'Xiaomi Mi 11', 699.99, 30, 'Xiaomi Mi 11 with 256GB', 1, 3),
       (4, 'Oppo Find X3', 899.99, 25, 'Oppo Find X3 with 128GB', 1, 4),
       (5, 'Vivo X60', 799.99, 35, 'Vivo X60 with 128GB', 1, 5),
       (6, 'Sản phẩm B', 150000.00, 20, 'Mô tả chi tiết cho sản phẩm A.', 1, 1);


-- Dumping data for table quan_li_dien_thoai.hoa_don: ~3 rows (approximately)
INSERT INTO hoa_don (id_hd, ngay_lap, tong_tien, id_kh)
VALUES (1, '2024-01-15', 1999.98, 1),
       (2, '2024-01-16', 1599.98, 2),
       (3, '2024-01-17', 799.99, 3);


-- Dumping data for table quan_li_dien_thoai.chi_tiet_hoa_don: ~3 rows (approximately)
INSERT INTO chi_tiet_hoa_don (id_cthd, id_hd, id_sp, so_luong, don_gia)
VALUES (1, 1, 1, 2, 999.99),
       (2, 2, 2, 2, 799.99),
       (3, 3, 3, 1, 799.99);



