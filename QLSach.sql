CREATE DATABASE QLCuaHangSach
GO
USE QLCuaHangSach
GO
CREATE TABLE Sach
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_sach NVARCHAR(250) NOT NULL,
anh VARCHAR(250) NULL,
gia MONEY NULL,
gia_giam MONEY NULL,
nam_xuat_ban INT NULL,
mo_ta NVARCHAR(MAX) NULL,
so_luong_ton INT NULL,
tinh_trang_sach BIT NULL,
trang_thai BIT NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
nxb_id BIGINT ,
loai_sach_id BIGINT,
kich_thuoc_id BIGINT,
loai_bia_id BIGINT,
tac_gia_id BIGINT
)
GO
CREATE TABLE Tac_Gia
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_tac_gia NVARCHAR(50) NOT NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
mo_ta NVARCHAR(250) NULL
)
GO
CREATE TABLE Loai_Sach
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_loai_sach NVARCHAR(50) NOT NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
mo_ta NVARCHAR(250) NULL
)
GO
CREATE TABLE Loai_Bia
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_loai_bia NVARCHAR(50) NOT NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
mo_ta NVARCHAR(250) NULL
)
GO
CREATE TABLE Kich_Thuoc
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_kich_thuoc NVARCHAR(50) NOT NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL
)
GO
CREATE TABLE Nha_Xuat_Ban
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_nxb NVARCHAR(50) NOT NULL,
so_dien_thoai CHAR(12) NULL,
email NVARCHAR(250) NULL,
dia_chi NVARCHAR(250) NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
)
GO
CREATE TABLE Hoa_Don_Chi_Tiet
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_sach NVARCHAR(250) NULL,
gia MONEY NULL,
so_luong INT NULL,
giam_gia MONEY NULL,
hoa_don_id BIGINT ,
sach_id BIGINT

)
GO
CREATE TABLE Hoa_Don
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ngay_tao DATE NULL,
ngay_giao DATE NULL,
ngay_nhan DATE NULL,
ten_nguoi_nhan NVARCHAR(250) NULL,
so_dien_thoai CHAR(12) NULL,
dia_chi NVARCHAR(250) NULL,
thanh_pho NVARCHAR(200) NULL,
quoc_gia NVARCHAR(30) NULL,
tong_tien MONEY NULL,
mo_ta NVARCHAR(MAX),
trang_thai NVARCHAR(50) NULL,
khach_hang_id BIGINT NOT NULL,
nhan_vien_id BIGINT NOT NULL,
thanh_toan_id BIGINT NOT NULL,
van_chuyen_id BIGINT NOT NULL,
nguoi_giao_id BIGINT NOT NULL,
)
GO
CREATE TABLE HT_Thanh_Toan
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten NVARCHAR(50) NOT NULL,
mo_ta NVARCHAR(250) NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
)
CREATE TABLE Nguoi_Giao_Hang
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten NVARCHAR(50) NULL,
so_dien_thoai CHAR(12) NULL,
ngay_tao DATE NULL,
ngay_giao DATE NULL,
)
GO
CREATE TABLE PT_Van_Chuyen
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten NVARCHAR(50) NOT NULL,
gia MONEY NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
mo_ta NVARCHAR(250) NULL
)
GO
CREATE TABLE Khach_Hang
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_khach_hang NVARCHAR(50) NULL,
gioi_tinh BIT NULL,
ngay_sinh DATE NULL,
so_dien_thoai CHAR(12) NULL,
email VARCHAR(250) NULL,
dia_chi NVARCHAR(250) NULL,
mat_khau VARCHAR(50) NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
)
GO
CREATE TABLE Nhan_Vien
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_nhan_vien NVARCHAR(50) NULL,
gioi_tinh BIT NULL,
ngay_sinh DATE NULL,
so_dien_thoai CHAR(12) NULL,
email VARCHAR(250) NULL,
dia_chi NVARCHAR(250) NULL,
mat_khau VARCHAR(50) NULL,
trang_thai BIT NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
chuc_vu_id BIGINT NOT NULL
)
GO
CREATE TABLE Chuc_Vu
(
id BIGINT IDENTITY(1000,1) PRIMARY KEY NOT NULL,
ten_chuc_vu NVARCHAR(50) NULL,
ngay_tao DATE NULL,
ngay_sua DATE NULL,
)
--NhanVien vs ChucVu
ALTER TABLE Nhan_Vien ADD FOREIGN KEY (chuc_vu_id) REFERENCES Chuc_Vu(id)
--Sach vs NXB
ALTER TABLE Sach ADD FOREIGN KEY (nxb_id) REFERENCES Nha_Xuat_Ban(id)
--Sach vs TacGia
ALTER TABLE Sach ADD FOREIGN KEY (tac_gia_id) REFERENCES Tac_Gia(id)
--Sach vs LoaiSach
ALTER TABLE Sach ADD FOREIGN KEY (loai_sach_id) REFERENCES Loai_Sach(id)
--Sach vs LoaiBia
ALTER TABLE Sach ADD FOREIGN KEY (loai_bia_id) REFERENCES Loai_Bia(id)
--Sach vs KichThuoc
ALTER TABLE Sach ADD FOREIGN KEY (kich_thuoc_id) REFERENCES Kich_Thuoc(id)
--HoaDonCT vs Sach
ALTER TABLE Hoa_Don_Chi_Tiet ADD FOREIGN KEY (sach_id) REFERENCES Sach(id)
--HoaDonCT vs HoaDon
ALTER TABLE Hoa_Don_Chi_Tiet ADD FOREIGN KEY (hoa_don_id) REFERENCES Hoa_Don(id)
--HoaDon vs KhachHang
ALTER TABLE Hoa_Don ADD FOREIGN KEY (khach_hang_id) REFERENCES Khach_Hang(id)
--HoaDon vs NhanVien
ALTER TABLE Hoa_Don ADD FOREIGN KEY (nhan_vien_id) REFERENCES Nhan_Vien(id)
--HoaDon vs HinhThucThanhToan
ALTER TABLE Hoa_Don ADD FOREIGN KEY (thanh_toan_id) REFERENCES HT_Thanh_Toan(id)
--HoaDon vs PhuongThucVanChuyen
ALTER TABLE Hoa_Don ADD FOREIGN KEY (van_chuyen_id) REFERENCES PT_Van_Chuyen(id)
--HoaDon vs NguoiGiaoHang
ALTER TABLE Hoa_Don ADD FOREIGN KEY (nguoi_giao_id) REFERENCES Nguoi_Giao_Hang(id)

