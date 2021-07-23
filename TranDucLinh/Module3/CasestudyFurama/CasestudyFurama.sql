create database CasestudyFurama;
use casestudyFurama;
CREATE TABLE bo_phan (
  idbo_phan VARCHAR(10) NOT NULL,
  Ten_bo_phan varchar(10) NOT NULL,
    PRIMARY KEY (idbo_phan));
      CREATE TABLE trinh_do (
  idtrinh_do VARCHAR(10) NOT NULL,
  Trinh_do varchar(20) NOT NULL,
    PRIMARY KEY (idtrinh_do));
     CREATE TABLE vi_tri(
  idvi_tri VARCHAR(10) NOT NULL,
  Ten_vi_tri varchar(20) NOT NULL,
    PRIMARY KEY (idvi_tri));
    CREATE TABLE nhan_vien (
  idnhan_vien VARCHAR(10) NOT NULL,
  Ho VARCHAR(20) NOT NULL,
  Ten VARCHAR(10) NOT NULL,
   idvi_tri VARCHAR(10) NOT NULL,
    idtrinh_do VARCHAR(10) NOT NULL,
	idbo_phan VARCHAR(10) NOT NULL,
  Ngay_sinh DATE NOT NULL,
Luong varchar(30) not null,
  CMND VARCHAR(10) NOT NULL,
  SDT VARCHAR(11) NOT NULL,
  Email VARCHAR(20) NOT NULL,
  Dia_chi VARCHAR(20) NOT NULL,
  PRIMARY KEY (idnhan_vien));
alter table nhan_vien add foreign key (idbo_phan) REFERENCES bo_phan(idbo_phan);
alter table nhan_vien add foreign key (idtrinh_do) REFERENCES trinh_do(idtrinh_do);
alter table nhan_vien add foreign key (idvi_tri) REFERENCES vi_tri(idvi_tri);
CREATE TABLE hop_dong (
  idhop_dong VARCHAR(10) NOT NULL,
idnhan_vien VARCHAR(10) NOT NULL,
  idkhach_hang VARCHAR(10) NOT NULL,
  iddich_vu VARCHAR(10) NOT NULL,
  Ngay_bat_dau DATE NOT NULL,
  Ngay_ket_thuc DATE NOT NULL,
  Tien_dat_coc INT NOT NULL,
  Tong_tien INT NOT NULL,
  PRIMARY KEY (idhop_dong));
 CREATE TABLE hop_dong_chi_tiet (
  idhop_dong_chi_tiet INT NOT NULL,
  idhop_dong VARCHAR(10) NOT NULL,
  iddich_vu_di_ken VARCHAR(10) NOT NULL,
  So_luong INT NOT NULL,
  PRIMARY KEY (idhop_dong_chi_tiet));
   CREATE TABLE dich_vu_di_kem (
  iddich_vu_di_ken INT NOT NULL,
  Ten_dich_vu VARCHAR(10) NOT NULL,
  Gia VARCHAR(10) NOT NULL,
  Don_vi INT NOT NULL,
    Trang_thai_kha_dung varchar(20) NOT NULL,
  PRIMARY KEY (iddich_vu_di_ken));
  alter table hop_dong_chi_tiet add foreign key (idhop_dong) REFERENCES hop_dong(idhop_dong);
alter table hop_dong_chi_tiet add foreign key (iddich_vu_di_kem) REFERENCES dich_vu_di_kem(iddich_vu_di_ken);

drop table khach_hang;

CREATE TABLE khach_hang (
  idkhach_hang VARCHAR(10) PRIMARY KEY,
  Ho VARCHAR(20) NOT NULL,
  Ten VARCHAR(10) NOT NULL,
Ngay_sinh DATE NOT NULL,
  CMND VARCHAR(10) NOT NULL,
  SDT VARCHAR(11) NOT NULL,
  Email VARCHAR(20) NOT NULL,
  Dia_chi VARCHAR(20) NOT NULL,
  idloai_khach varchar(10),
  foreign key(idloai_khach) REFERENCES loai_khach(idloai_khach)
  );
  
  
   CREATE TABLE loai_khach (
  idloai_khach VARCHAR(10) NOT NULL,
  Ten_loai_khach VARCHAR(20) NOT NULL,
  PRIMARY KEY (idloai_khach));
alter table khach_hang add foreign key (idloai_khach) references loai_khach(idloai_khach);
CREATE TABLE dich_vu (
  iddich_vu VARCHAR(10) NOT NULL,
  Ten_dich_vu VARCHAR(45) NOT NULL,
  Dien_tich FLOAT NOT NULL,
  So_tang INT NOT NULL,
  So_nguoi_toi_da INT NOT NULL,
  idkieu_thue VARCHAR(10) NOT NULL,
  idloai_dich_vu VARCHAR(10) NOT NULL,
  Trang_thai VARCHAR(20) NOT NULL,
  PRIMARY KEY (iddich_vu));
  
  CREATE TABLE kieu_thue (
  idkieu_thue VARCHAR(10) NOT NULL,
  Ten_kieu_thue VARCHAR(20) NOT NULL,
  Gia INT NOT NULL,
  PRIMARY KEY (idkieu_thue));
  
  CREATE TABLE loai_dich_vu (
  idloai_dich_vu VARCHAR(10) NOT NULL,
  Ten_dich_vu VARCHAR(10) NOT NULL,
  PRIMARY KEY (idloai_dich_vu));
  alter table dich_vu add foreign key (idkieu_thue) references kieu_thue(idkieu_thue);
alter table dich_vu add foreign key (idloai_dich_vu) references loai_dich_vu(idloai_dich_vu);

alter table hop_dong add foreign key(idnhan_vien) references nhan_vien(idnhan_vien);
alter table hop_dong add foreign key(idkhach_hang) references khach_hang(idkhach_hang);
alter table hop_dong add foreign key(iddich_vu) references dich_vu(iddich_vu);
alter table khach_hang add foreign key (idloai_khach) references loai_khach(idloai_khach);
alter table khach_hang add column idloai_khach varchar(10);
alter table hop_dong_chi_tiet add iddich_vu_di_kem int;
insert into casestudyFurama.khach_hang
values
(1,'Nguyễn Văn','Dũng','1993-04-22','0236599947',0236599947,'dungcuteo@gmail.com','Vinh',1);

select * from casestudyFurama.khach_hang;

insert into casestudyFurama.loai_khach
values 
(1,'Diamond')

/*Tại vì m chưa thêm dữ liệu trong table loai_khach nên khóa ngoại báo lỗi vì không tìm được khóa chings bên table loai_khach*/
/*Giờ m add dữ liệu vào table loai_khach trước rồi mới add được dữ liệu khach_hang*/
/*OK rồi đó có chi thì nt qa ... đi ăn cái đã*/