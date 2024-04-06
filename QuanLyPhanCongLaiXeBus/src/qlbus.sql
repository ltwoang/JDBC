CREATE DATABASE quan_ly_phan_cong_lai_xe;

USE quan_ly_phan_cong_lai_xe;

CREATE TABLE IF NOT EXISTS LaiXe (
    ma_lx INT AUTO_INCREMENT PRIMARY KEY,
    ho_ten VARCHAR(255) NOT NULL,
    dia_chi VARCHAR(255),
    so_dt VARCHAR(20),
    trinh_do CHAR(1)
);

CREATE TABLE IF NOT EXISTS Tuyen (
    ma_tuyen INT AUTO_INCREMENT PRIMARY KEY,
    khoang_cach DOUBLE,
    so_diem_dung INT
);

CREATE TABLE IF NOT EXISTS BangPhanCong (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ma_lx INT,
    ma_tuyen INT,
    so_luot INT,
    FOREIGN KEY (ma_lx) REFERENCES lai_xe(ma_lx),
    FOREIGN KEY (ma_tuyen) REFERENCES tuyen(ma_tuyen)
);