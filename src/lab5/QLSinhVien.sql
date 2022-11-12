use master;
go

drop database if exists QLSinhVien;
create database QLSinhVien;
use QLSinhVien;

create table Students(
	MaSV varchar(7) primary key,
	HoTen nvarchar(50),
	Email varchar(50),
	SDT varchar(10),
	GioiTinh bit, --1 là nam, 0 là nữ
	DiaChi nvarchar(100)
);
insert into Students values
	('SV001', N'Le Van Phung', 'phunglv@fpt.edu.vn', '0903414749', 1, N'Ninh Thuan'),
	('SV002', N'Le Quang Trung', 'trunglv@gmail.com', '0901234567', 1, N'222 Le Van Si'),
	('SV003', N'Le Thi Bao Hieu', 'hieultb@gmail.com', '0683872432', 0, N'Phan Rang'),
	('SV004', N'Le Thi H Hanh', 'hanhlth@gmail.com', '0909999999', 0, N'Quan 12');