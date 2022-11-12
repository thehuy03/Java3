use master
go

drop database if exists ps21795_DangTheHuy_SOF203_ASM 
create database ps21795_DangTheHuy_SOF203_ASM
use ps21795_DangTheHuy_SOF203_ASM

go
create table nguoiDung(
	userNames varchar(50) primary key not null,
	passwords varchar(50),
	roles varchar(50)
)
go
create table students(
	maSV varchar(7) primary key not null,
	hoTen nvarchar(50) not null,
	email varchar(50),
	sdt varchar(10),
	gioiTinh bit,
	diaChi nvarchar(50),
	hinh varchar(50)
)
go
create table grade(
	id int identity(1,1) primary key not null,
	masv varchar(7) references	students(maSV)  on update cascade on delete cascade,
	tiengAnh float null,
	tinHoc float null,
	GDTC float null
)
go
insert into students
values ('ps21795',N'Đặng Thế Huy','huy@gamil.com','0908358034',0,N'200 Bà Trưng','img/1.jpg'),
		('ps21776',N'La Đặng Bình An','an@gamil.com','0983358034',0,N'234 Trần Quốc Toản','img/2.jpg'),
		('ps21675',N'Trần Quốc Trung','trung@gamil.com','0708358034',0,N'5 Tự Do','img/3.jpg'),
		('ps22798',N'Nguyễn Hữu Hùng','hung@gamil.com','0456358034',0,N'357 Phạm Ngũ Lão','img/4.jpg'),
		('ps21895',N'Nguyễn Thị Nở','no@gamil.com','0908238034',1,N'25 Cộng Hòa','img/5.jpg');
go
insert into nguoiDung
values('admin','123','admin')
go
insert into grade
values('ps21795',7.5,8.5,9.3),
		('ps21776',6.5,7.0,8.0),
		('ps21675',5.0,8.0,10),
		('ps22798',5.0,7.0,7.0),
		('ps21895',7.5,8.75,9.3);

go
drop trigger if exists ThemSV_Grade
create trigger ThemSV_Grade on students after insert 
as
begin 
	insert into grade values ((select maSV from inserted),0.0,0.0,0.0)
end

insert into students 
values('ps2345',N'ITACHI','ITA@gamil.com','0908358034',0,N'200 Bà Trưng','img/1.jpg');

select * from students
select * from grade