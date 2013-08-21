/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.1.21-beta-community : Database - si-pensiun-kp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`si-pensiun-kp` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `si-pensiun-kp`;

/*Table structure for table `anggotakeluarga` */

DROP TABLE IF EXISTS `anggotakeluarga`;

CREATE TABLE `anggotakeluarga` (
  `nik` varchar(30) NOT NULL,
  `nama_lengkap` varchar(100) DEFAULT NULL,
  `jenis_kelamin` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(20) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `agama` varchar(20) DEFAULT NULL,
  `pendidikan` varchar(100) DEFAULT NULL,
  `pekerjaan` varchar(100) DEFAULT NULL,
  `status_perkawinan` varchar(20) DEFAULT NULL,
  `status_hub_keluarga` varchar(20) DEFAULT NULL,
  `kewarganegaraan` varchar(20) DEFAULT NULL,
  `no_paspor` varchar(35) DEFAULT NULL,
  `no_kitas_kitap` varchar(35) DEFAULT NULL,
  `nama_ayah` varchar(100) DEFAULT NULL,
  `nama_ibu` varchar(100) DEFAULT NULL,
  `id_suratKK` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `anggotakeluarga` */

insert  into `anggotakeluarga`(`nik`,`nama_lengkap`,`jenis_kelamin`,`tempat_lahir`,`tanggal_lahir`,`agama`,`pendidikan`,`pekerjaan`,`status_perkawinan`,`status_hub_keluarga`,`kewarganegaraan`,`no_paspor`,`no_kitas_kitap`,`nama_ayah`,`nama_ibu`,`id_suratKK`) values ('121','SDS','l','kL','1991-10-10','iSLAM','kULIAH','-','-','aNAK','Indonesia','-','-','Joni','Jihan','010202020'),('121212','ASDWS','L','KLATEN','1978-07-01','KATOLIK','DIPLOMA IV/STRATA I','PEGAWAI NEGRI SIPIL','KAWIN','SUAMI','WNI','-','-','SDDAAS','ASAS','1212131311313'),('121221','SDSSD','P','KLATEN','1982-07-30','HINDU','DIPLOMA III','PEGAWAI NEGRI SIPIL','KAWIN','ISTRI','WNI','-','-','DDFF','EWWW','1212131311313'),('123456788','WIDI ASTUTI','P','KLATEN','1981-08-14','ISLAM','DIPLOMA IV/STRATA I','PEGAWAI NEGRI SIPIL','KAWIN','ISTRI','WNI','-','-','WIDI','ASYARIN','3332122221'),('123456789','DINA PRASTAWAN','L','KLATEN','1980-08-14','ISLAM','DIPLOMA IV/STRATA I','PEGAWAI NEGRI SIPIL','KAWIN','SUAMI','WNI','-','-','PRATAWAN','DINAYAH','3332122221'),('123456799','JOJONI','L','KLATEN','2009-08-13','ISLAM','SD/SEDERAJAT','PELAJAR/MAHASISWA','BELUM KAWIN','ANAK KANDUNG','WNI','-','-','DINA PRASTAWAN','WIDI ASTUTI','3332122221'),('212221222','WIDI','L','KLATEN','1993-07-03','ISLAM','SLTA/SEDERAJAT','PELAJAR/MAHASISWA','BELUM KAWIN','ANAK KANDUNG','WNI','-','-','TUXCUT W','YULIANA W','3222112333222'),('212221223','NUDI','P','KLATEN','1992-07-03','ISLAM','SLTA/SEDERAJAT','PELAJAR/MAHASISWA','BELUM KAWIN','ANAK KANDUNG','WNI','-','-','TUXCUT W','YULIANA W','3222112333222'),('212221224','YULIANA W','P','KLATEN','1968-07-24','ISLAM','DIPLOMA IV/STRATA I','PEGAWAI NEGRI SIPIL','KAWIN','ISTRI','WNI','-','-','JONO','YULI','3222112333222'),('212221225','TUXCUT C','L','KLATEN','1970-07-04','ISLAM','DIPLOMA IV/STRATA I','KARYAWAN SWASTA','KAWIN','SUAMI','WNI','-','-','ONI','ITA','3222112333222'),('330209290291212','joni','L','Klaten','1990-10-10','Islam','Mahasiswa','-','belum kawin','anak','Indonesia','-','-','Drs. Marimin','Widayati','0012999222'),('332010200','Widayati','P','Klaten','1961-08-14','Islam','S1','PNS','kawin','Istri','Indonesia','-','-','Rudi','Yeni','0012999222'),('333000201000020','Drs. Marimin','L','Klaten','1952-10-23','ISlam','S1','Guru','kawin','Suami','Indonesia','-','-','Darmo','Ida','0012999222');

/*Table structure for table `data_aps` */

DROP TABLE IF EXISTS `data_aps`;

CREATE TABLE `data_aps` (
  `NIP` varchar(18) DEFAULT NULL,
  `Nama` varchar(100) DEFAULT NULL,
  `TanggalAPS` date DEFAULT NULL,
  `AlasanAPS` varchar(100) DEFAULT NULL,
  `idOP` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data_aps` */

insert  into `data_aps`(`NIP`,`Nama`,`TanggalAPS`,`AlasanAPS`,`idOP`) values ('196807241977011004','YULIANA W','2013-07-29','tidak dapat melanjutkan pekerjaan. ','P'),('198008141999031002','DINA PRASTAWAN','2013-08-14','sudah tidak dapat bekerja','P');

/*Table structure for table `data_meninggal` */

DROP TABLE IF EXISTS `data_meninggal`;

CREATE TABLE `data_meninggal` (
  `no` varchar(20) DEFAULT NULL,
  `NIP` varchar(18) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `tanggal_meninggal` date DEFAULT NULL,
  `anggota_nama` varchar(50) DEFAULT NULL,
  `anggota_alamat` varchar(100) DEFAULT NULL,
  `anggota_kabupaten` varchar(30) DEFAULT NULL,
  `anggota_pekerjaan` varchar(30) DEFAULT NULL,
  `IDOP` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data_meninggal` */

insert  into `data_meninggal`(`no`,`NIP`,`nama`,`tanggal_meninggal`,`anggota_nama`,`anggota_alamat`,`anggota_kabupaten`,`anggota_pekerjaan`,`IDOP`) values ('474.3/29/XII/II','195210231979011003','DRS. MARIMIN','2013-07-01','WIDAYATI','DUKUH TOPENG,DESA KAJEN,KECAMATAN CEPER','KLATEN','PNS','P'),('XII/AS/XZ/121','196807241977011004','YULIANA W','2013-07-30','TUXCUT C','JL. MELATI GADUNGAN RT 10 RW 11 PANDES WEDI','KLATEN','KARYAWAN SWASTA','P'),('XX/SD/11/2','198008141999031002','DINA PRASTAWAN','2013-08-15','WIDI ASTUTI','JL. MEALTI PAINGAN RT 12 RW 12 KRODAN DEPOK','SLEMAN','PEGAWAI NEGRI SIPIL','P');

/*Table structure for table `instansi` */

DROP TABLE IF EXISTS `instansi`;

CREATE TABLE `instansi` (
  `idInstansi` varchar(30) DEFAULT NULL,
  `namaInstansi` varchar(100) DEFAULT NULL,
  `namaKepala` varchar(100) DEFAULT NULL,
  `pangkatGol` varchar(1000) DEFAULT NULL,
  `nipKepala` varchar(20) DEFAULT NULL,
  `namaPegawai` varchar(100) DEFAULT NULL,
  `nipPegawai` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `instansi` */

insert  into `instansi`(`idInstansi`,`namaInstansi`,`namaKepala`,`pangkatGol`,`nipKepala`,`namaPegawai`,`nipPegawai`) values ('1223333','DINAS PENDIDIKAN KAB. KLATEN','DENI FREDIANSAH,M.PD.','PEMBINA UTAMA I/IVE','196611111978111002','DINA PRASTAWAN','198008141999031002'),('12322122','SMAN 1 Karanganom','DENI SILALAHI,M.PD.','PEMBINA UTAMA I/IVE','196611111978111001','Drs. MARIMIN','195210231979011003'),('10002100','SMAN 2 KLATEN','SUMARDI,M.Pd.','PEMBINA UTAMA/IVA','196611111978111022','YULIANA W','196807241977011004');

/*Table structure for table `kk` */

DROP TABLE IF EXISTS `kk`;

CREATE TABLE `kk` (
  `id_Suratkk` varchar(30) NOT NULL,
  `nama_kk` varchar(100) DEFAULT NULL,
  `Alamat` varchar(100) DEFAULT NULL,
  `RT` varchar(5) DEFAULT NULL,
  `RW` varchar(5) DEFAULT NULL,
  `Kelurahan_Desa` varchar(30) DEFAULT NULL,
  `Kecamatan` varchar(30) DEFAULT NULL,
  `Kabupaten_Kota` varchar(30) DEFAULT NULL,
  `kode_pos` varchar(10) DEFAULT NULL,
  `provinsi` varchar(30) DEFAULT NULL,
  `tanggal_penyimpanan_surat` date DEFAULT NULL,
  `kode_operator` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_Suratkk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `kk` */

insert  into `kk`(`id_Suratkk`,`nama_kk`,`Alamat`,`RT`,`RW`,`Kelurahan_Desa`,`Kecamatan`,`Kabupaten_Kota`,`kode_pos`,`provinsi`,`tanggal_penyimpanan_surat`,`kode_operator`) values ('0012999222','Drs.Marimin','Dukuh Topeng,Desa kajen,Kecamatan Ceper','-','-','Kajen','Ceper','Klaten','57422','Jawa tengah','2013-07-12','P'),('1212131311313','ASDWS','BIRIT KAJORAN RT 12 RW 22 WEDI KLATEN SELATAN','12','22','MLINJON','KLATEN UTARA','KLATEN','12121','JATENG','2013-07-23','D'),('3222112333222','TUXCUT C','JL. MELATI GADUNGAN RT 10 RW 11 PANDES WEDI','10','11','PANDES','WEDI','KLATEN','570032','JAWA TENGAH','2013-07-24','P'),('3332122221','DINA PRASTAWAN','JL. MEALTI PAINGAN RT 12 RW 12 KRODAN DEPOK','12','12','KRODAN','DEPOK','SLEMAN','56723','YOGYAKARTA','2013-08-14','P');

/*Table structure for table `operator` */

DROP TABLE IF EXISTS `operator`;

CREATE TABLE `operator` (
  `kode_operator` varchar(2) NOT NULL,
  `passwordpegawai` varchar(25) DEFAULT NULL,
  `namaOperator` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`kode_operator`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `operator` */

insert  into `operator`(`kode_operator`,`passwordpegawai`,`namaOperator`) values ('D','1234','Damai Kurnia Adhi, S.Kom'),('P','1234','Tugiman, S.Sos');

/*Table structure for table `pns` */

DROP TABLE IF EXISTS `pns`;

CREATE TABLE `pns` (
  `nip_baru` varchar(25) NOT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nama_pns` varchar(100) DEFAULT NULL,
  `id_SuratCPNS` varchar(40) DEFAULT NULL,
  `id_SuratPangkatTerakhir` varchar(40) DEFAULT NULL,
  `id_SuratSPTKGTerakhir` varchar(40) DEFAULT NULL,
  `id_SuratKarpeg` varchar(40) DEFAULT NULL,
  `id_SuratNikah` varchar(40) DEFAULT NULL,
  `id_Suratkk` varchar(30) DEFAULT NULL,
  `jk` varchar(10) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`nip_baru`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pns` */

insert  into `pns`(`nip_baru`,`nip_lama`,`nama_pns`,`id_SuratCPNS`,`id_SuratPangkatTerakhir`,`id_SuratSPTKGTerakhir`,`id_SuratKarpeg`,`id_SuratNikah`,`id_Suratkk`,`jk`,`status`) values ('',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1212122222122','112122323','ASDWS','X/122/SS','X/111/SDD','S222/111','SS/22/DF','SDSS/222','1212131311313','L','NIKAH'),('195210231979011003','130701386','Drs. MARIMIN','13125/C/2/796','823.4/72/2002','822.4/773/13','C. 0085821','327/40/1981','0012999222','L','NIKAH'),('196807241977011004','130570090','YULIANA W','XII/122/XS/13','XII/12/AS/III','S/II/D/123/XX','D/122/DD','SRT/122/22','3222112333222','P','NIKAH'),('198008141999031002','130570012','DINA PRASTAWAN','ZXC/SD/ASS/11','XC/SD/SAA/DD','SD/23/SDS/XU','C.12334223','XC/SD/DDD','3332122221','L','NIKAH');

/*Table structure for table `s_nikah` */

DROP TABLE IF EXISTS `s_nikah`;

CREATE TABLE `s_nikah` (
  `id_SuratNikah` varchar(40) NOT NULL,
  `tanggal_nikah` date DEFAULT NULL,
  `nama_suami` varchar(100) DEFAULT NULL,
  `nama_istri` varchar(100) DEFAULT NULL,
  `tanggal_penyimpanan_surat` date DEFAULT NULL,
  `kode_operator` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_SuratNikah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `s_nikah` */

insert  into `s_nikah`(`id_SuratNikah`,`tanggal_nikah`,`nama_suami`,`nama_istri`,`tanggal_penyimpanan_surat`,`kode_operator`) values ('327/40/1981','1981-12-26','Marimin,BA','Widayati','2013-07-10','P'),('SDSS/222','2002-07-17','ASDWS','ZZZZZ','2013-07-23','D'),('SRT/122/22','1990-07-26','TUXCUT C','YULIANA W','2013-07-24','P'),('XC/SD/DDD','2005-08-03','DINA PRASTAWAN','WIDI ASTUTI','2013-08-15','P');

/*Table structure for table `sk_cpns` */

DROP TABLE IF EXISTS `sk_cpns`;

CREATE TABLE `sk_cpns` (
  `id_SuratCPNS` varchar(40) NOT NULL,
  `tempat_surat` varchar(20) DEFAULT NULL,
  `tanggal_surat` date DEFAULT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(20) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `Profesi` varchar(30) DEFAULT NULL,
  `Sekolah` varchar(100) DEFAULT NULL,
  `tmt_cpns` varchar(20) DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `masa_kerja_tahun` varchar(5) DEFAULT NULL,
  `masa_kerja_bulan` varchar(5) DEFAULT NULL,
  `golongan` varchar(10) DEFAULT NULL,
  `berijazah` varchar(100) DEFAULT NULL,
  `tanggal_penyimpanan_surat` date DEFAULT NULL,
  `kode_operator` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_SuratCPNS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_cpns` */

insert  into `sk_cpns`(`id_SuratCPNS`,`tempat_surat`,`tanggal_surat`,`nama_pemilik`,`tempat_lahir`,`tanggal_lahir`,`Profesi`,`Sekolah`,`tmt_cpns`,`nip_lama`,`nip_baru`,`masa_kerja_tahun`,`masa_kerja_bulan`,`golongan`,`berijazah`,`tanggal_penyimpanan_surat`,`kode_operator`) values ('',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('13125/C/2/796','Jakarta','1979-02-13','MARIMIN','Klaten','1952-10-23','Guru SLTA','SMA negeri Jatinom','1976-02-01','130701386','-','3','0','II/b','Sarmud.STO th.1977','2013-07-03','P'),('X/122/SS','JAKARTA','1978-07-01','ASDWS','AASSA','1978-07-01','GURU','SMA 1 KLATEN','1975-02-01','112122323','1212122222122','5','10','III/C','SS1','2013-07-23','P'),('XII/122/XS/13','JAKARTA','1981-07-24','YULIANA W','KLATEN','1968-07-24','GURU SMA','SMAN 2 KLATEN','1980-02-01','130570090','196807241977011004','10','11','III/D','SARJANA MUDA','2013-07-24','P'),('ZXC/SD/ASS/11','JAKARTA','1999-08-01','DINA PRASTAWAN','KLATEN','1980-08-14','PEGAWAI DINAS PENDIDIKAN','DINAS PENDIDIKAN KAB. KLATEN','1998-02-01','130570012','198008141999031002','2','10','II /A','SARJANA MUDA','2013-08-15','P');

/*Table structure for table `sk_karpeg` */

DROP TABLE IF EXISTS `sk_karpeg`;

CREATE TABLE `sk_karpeg` (
  `id_SuratKarpeg` varchar(40) NOT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `tmt_cpns` date DEFAULT NULL,
  `tanggal_penyimpanan_surat` date DEFAULT NULL,
  `kode_operator` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_SuratKarpeg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_karpeg` */

insert  into `sk_karpeg`(`id_SuratKarpeg`,`nip_lama`,`nip_baru`,`nama_pemilik`,`tanggal_lahir`,`tmt_cpns`,`tanggal_penyimpanan_surat`,`kode_operator`) values ('C. 0085821','130701386','-','MARIMIN,BA','1952-10-23','1979-01-01','2013-07-08','P'),('C.12334223','130570012','198008141999031002','DINA PRASTAWAN','1980-08-14','1999-08-13','2013-08-14','P'),('D/122/DD','130570090','196807241977011004','YULIANA W','1968-07-24','1977-07-03','2013-07-24','P'),('SS/22/DF','112122323','1212122222122','ASDWS','1978-07-29','2007-07-31','2013-07-23','D');

/*Table structure for table `sk_pangkatterakhir` */

DROP TABLE IF EXISTS `sk_pangkatterakhir`;

CREATE TABLE `sk_pangkatterakhir` (
  `id_SuratPangkatTerakhir` varchar(40) NOT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(100) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `pendidikan` varchar(15) DEFAULT NULL,
  `Profesi` varchar(100) DEFAULT NULL,
  `Sekolah` varchar(100) DEFAULT NULL,
  `pangkat_baru` varchar(50) DEFAULT NULL,
  `golongan_baru` varchar(15) DEFAULT NULL,
  `tmt_baru` date DEFAULT NULL,
  `masa_kerja_golongan_tahun` varchar(10) DEFAULT NULL,
  `masa_kerja_golongan_bulan` varchar(10) DEFAULT NULL,
  `gaji_pokok` varchar(30) DEFAULT NULL,
  `tanggal_penyimpanan_surat` date DEFAULT NULL,
  `kode_operator` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_SuratPangkatTerakhir`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_pangkatterakhir` */

insert  into `sk_pangkatterakhir`(`id_SuratPangkatTerakhir`,`nama_pemilik`,`tempat_lahir`,`tanggal_lahir`,`nip_lama`,`nip_baru`,`pendidikan`,`Profesi`,`Sekolah`,`pangkat_baru`,`golongan_baru`,`tmt_baru`,`masa_kerja_golongan_tahun`,`masa_kerja_golongan_bulan`,`gaji_pokok`,`tanggal_penyimpanan_surat`,`kode_operator`) values ('823.4/72/2002','Drs. MARIMIN','KLATEN','1952-10-23','130701388','195210231979011003','S1/D4','GURU SMA','SMAN 3 KLATEN','Pembina','IV /a','2002-10-01','31','4','1122400','2013-07-05','P'),('X/111/SDD','ASDWS','KLATEN','1978-07-01','112122323','1212122222122','ASA','GURU SMA','SMAN 1 KLATEN','PEMBINA','IV A','2005-07-08','10','3','2900000','2013-07-23','P'),('XC/SD/SAA/DD','DINA PRASTAWAN','KLATEN','1980-08-14','130570012','198008141999031002','SARJANA MUDA','PEGAWAI DINAS PENDIDIKAN','DINAS PENDIDIKAN KAB. KLATEN','PANGKAT PENGATUR MUDA','IV/A','2006-08-18','2','10','3000000','2013-08-15','P'),('XII/12/AS/III','YULIANA W','KLATEN','1968-07-24','130570090','196807241977011004','S1','GURU SMA','SMAN 2 KLATEN','PANGKAT PENATA TINGKAT 1','III/D','1993-07-03','10','2','2900000','2013-07-24','P');

/*Table structure for table `sptkg_terakhir` */

DROP TABLE IF EXISTS `sptkg_terakhir`;

CREATE TABLE `sptkg_terakhir` (
  `id_SuratSPTKGTerakhir` varchar(40) DEFAULT NULL,
  `tempat_surat` varchar(50) DEFAULT NULL,
  `tanggal_surat` date DEFAULT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `pangkat_baru` varchar(50) DEFAULT NULL,
  `golongan_ruang_baru` varchar(10) DEFAULT NULL,
  `Sekolah` varchar(100) DEFAULT NULL,
  `gajipokok_lama` varchar(30) DEFAULT NULL,
  `gajipokok_baru` mediumint(9) DEFAULT NULL,
  `tmt_baru` date DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `tanggal_penyimpanan_surat` date DEFAULT NULL,
  `kode_operator` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sptkg_terakhir` */

insert  into `sptkg_terakhir`(`id_SuratSPTKGTerakhir`,`tempat_surat`,`tanggal_surat`,`nama_pemilik`,`nip_baru`,`pangkat_baru`,`golongan_ruang_baru`,`Sekolah`,`gajipokok_lama`,`gajipokok_baru`,`tmt_baru`,`nip_lama`,`tanggal_penyimpanan_surat`,`kode_operator`) values ('822.4/773/13','Klaten','2010-12-17','Drs. MARIMIN','195210231979011003','Pembina','IV/a','SMAN 1 Karanganom','2353700',2960600,'2011-03-01','130701386','2013-07-05','P'),('S222/111','TANGERANG','2013-01-31','ASDWS','1212122222122','PEMBINA','IV/A','SMA 1 KLATEN','2300000',2960000,'2006-07-07','112122323','2013-07-23','D'),('S/II/D/123/XX','JAKARTA','1990-07-28','YULIANA W','196807241977011004','PANGKAT PENATA TINGKAT 1','III/d','SMAN 2 KLATEN','2900000',3100000,'1990-07-28','130570090','2013-07-24','P'),('SD/23/SDS/XU','JAKARTA','2007-08-01','DINA PRASTAWAN','198008141999031002','PEMBINA','IV/A','DINAS PENDIDIKAN KAB. KLATEN','3000000',4400000,'2007-08-08','130570012','2013-08-14','P'),(NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
