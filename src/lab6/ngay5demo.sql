﻿use master
go
--xóa csdl
drop database ps21795_DangTheHuy_sof203_Demo_asm
go
--1. tạo csdl
create database ps21795_DangTheHuy_sof203_Demo_asm
go
--2. chọn csdl
use ps21795_DangTheHuy_sof203_Demo_asm
go
--3. tạo bảng Users
create table Users
(
    Username varchar(50) primary key,
    Password varchar(50) not null,
    role varchar(50)
)
go
-- thêm dữ liệu vào Users
insert into Users values('trinh','123','admin')
insert into Users values('phuc','123','admin')
insert into Users values('teo','123','user')
go
select * from Users
go
--4. tạo bảng Students
create table Students
(
    MaSV char(7) primary key,
    HoTen nVarchar(50) not null,
    Email Varchar(50),
    SoDT Varchar(15),
    GioiTinh bit,
    DiaChi nVarchar(50),
    Hinh Varchar(50)
)
go
--5. tạo bảng Grade
create table Grade
(
    id int identity(1,1) primary key,
    MaSV char(7) references Students(MaSV),
    TiengAnh int,
    TinHoc int,
    GDTC int
)
go
-- Nhập bảng Students
insert into Students values('PS00001',N'Nguyễn Văn Tèo','teo@gmail.com','0907774677',1,N'123 Hai Bà Trưng','teo.jpg')
go
insert into Students values('PS00002',N'Thị Nở','no@gmail.com','0907774677',0,N'456 Hai Bà Trưng','no.jpg')
go
insert into Students values('PS00003',N'NGỌC TRINH','trinh@gmail.com','0907774677',0,N'200 Hai Bà Trưng','trinh.jpg')
go
select * from Students
go
-- Nhập bảng Grade
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS00001',7,8,9)
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS00002',10,9,9)
insert into Grade(masv,tienganh,tinhoc,GDTC) values('PS00003',10,10,10)
go

select * from Grade