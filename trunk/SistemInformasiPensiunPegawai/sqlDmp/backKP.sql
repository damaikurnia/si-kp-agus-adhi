/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.5.16 : Database - si-pensiun-kp
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

insert  into `anggotakeluarga`(`nik`,`nama_lengkap`,`jenis_kelamin`,`tempat_lahir`,`tanggal_lahir`,`agama`,`pendidikan`,`pekerjaan`,`status_perkawinan`,`status_hub_keluarga`,`kewarganegaraan`,`no_paspor`,`no_kitas_kitap`,`nama_ayah`,`nama_ibu`,`id_suratKK`) values ('330209290291212','joni','L','Klaten','1990-10-10','Islam','Mahasiswa','-','belum kawin','anak','Indonesia','-','-','Drs. Marimin','Widayati','0012999222'),('332010200','Widayati','P','Klaten','1961-08-14','Islam','S1','PNS','kawin','Istri','Indonesia','-','-','Rudi','Yeni','0012999222'),('333000201000020','Drs. Marimin','L','Klaten','1952-10-23','ISlam','S1','Guru','kawin','Suami','Indonesia','-','-','Darmo','Ida','0012999222');

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
  PRIMARY KEY (`id_Suratkk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `kk` */

insert  into `kk`(`id_Suratkk`,`nama_kk`,`Alamat`,`RT`,`RW`,`Kelurahan_Desa`,`Kecamatan`,`Kabupaten_Kota`,`kode_pos`,`provinsi`) values ('0012999222','Drs.Marimin','Dukuh Topeng,Desa kajen,Kecamatan Ceper','-','-','Kajen','Ceper','Klaten','57422','Jawa tengah');

/*Table structure for table `operator` */

DROP TABLE IF EXISTS `operator`;

CREATE TABLE `operator` (
  `idPegawai` varchar(25) NOT NULL,
  `passwordpegawai` varchar(25) DEFAULT NULL,
  `kode_operator` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`idPegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `operator` */

insert  into `operator`(`idPegawai`,`passwordpegawai`,`kode_operator`) values ('1234','1234','P');

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
  `id_SuratNIPBaru` varchar(40) DEFAULT NULL,
  `id_Suratkk` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`nip_baru`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pns` */

insert  into `pns`(`nip_baru`,`nip_lama`,`nama_pns`,`id_SuratCPNS`,`id_SuratPangkatTerakhir`,`id_SuratSPTKGTerakhir`,`id_SuratKarpeg`,`id_SuratNikah`,`id_SuratNIPBaru`,`id_Suratkk`) values ('195210231979011003','130701386','Drs. MARIMIN','13125/C/2/796','823.4/72/2002','822.4/773/13','C. 0085821','327/40/1981','1531','0012999222');

/*Table structure for table `s_nikah` */

DROP TABLE IF EXISTS `s_nikah`;

CREATE TABLE `s_nikah` (
  `id_SuratNikah` varchar(40) NOT NULL,
  `tanggal_nikah` date DEFAULT NULL,
  `nama_suami` varchar(100) DEFAULT NULL,
  `nama_istri` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_SuratNikah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `s_nikah` */

insert  into `s_nikah`(`id_SuratNikah`,`tanggal_nikah`,`nama_suami`,`nama_istri`) values ('327/40/1981','1981-12-26','Marimin,BA','Widayati');

/*Table structure for table `sk_cpns` */

DROP TABLE IF EXISTS `sk_cpns`;

CREATE TABLE `sk_cpns` (
  `id_SuratCPNS` varchar(40) NOT NULL,
  `tempat_surat` varchar(20) DEFAULT NULL,
  `tanggal_surat` date DEFAULT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(20) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `partikelir` varchar(30) DEFAULT NULL,
  `tmt_partikelir` date DEFAULT NULL,
  `Profesi` varchar(30) DEFAULT NULL,
  `Sekolah` varchar(100) DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_SuratCPNS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_cpns` */

insert  into `sk_cpns`(`id_SuratCPNS`,`tempat_surat`,`tanggal_surat`,`nama_pemilik`,`tempat_lahir`,`tanggal_lahir`,`partikelir`,`tmt_partikelir`,`Profesi`,`Sekolah`,`nip_lama`,`nip_baru`) values ('13125/C/2/796','Jakarta','1979-02-13','MARIMIN','Klaten','1952-10-23','Jatinom','1979-01-01','Guru SLTA','SMA negeri Jatinom','130701386','-');

/*Table structure for table `sk_karpeg` */

DROP TABLE IF EXISTS `sk_karpeg`;

CREATE TABLE `sk_karpeg` (
  `id_SuratKarpeg` varchar(40) NOT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `tmt_cpns` date DEFAULT NULL,
  PRIMARY KEY (`id_SuratKarpeg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_karpeg` */

insert  into `sk_karpeg`(`id_SuratKarpeg`,`nip_lama`,`nip_baru`,`nama_pemilik`,`tanggal_lahir`,`tmt_cpns`) values ('C. 0085821','130701386','-','MARIMIN,BA','1952-10-23','1979-01-01');

/*Table structure for table `sk_nipbaru` */

DROP TABLE IF EXISTS `sk_nipbaru`;

CREATE TABLE `sk_nipbaru` (
  `id_SuratNIPBaru` varchar(40) NOT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `tmt_cpns` date DEFAULT NULL,
  `jenis_kelamin` varchar(1) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `unit_Kerja` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_SuratNIPBaru`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_nipbaru` */

insert  into `sk_nipbaru`(`id_SuratNIPBaru`,`nama_pemilik`,`nip_lama`,`tanggal_lahir`,`tmt_cpns`,`jenis_kelamin`,`nip_baru`,`unit_Kerja`) values ('1531','MARIMIN','130701386','1952-10-23','1979-01-01','P','195210231979011003','Pemerintah Kabupaten Klaten');

/*Table structure for table `sk_pangkatterakhir` */

DROP TABLE IF EXISTS `sk_pangkatterakhir`;

CREATE TABLE `sk_pangkatterakhir` (
  `id_SuratPangkatTerakhir` varchar(40) NOT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `pendidikan` varchar(15) DEFAULT NULL,
  `pangkat_lama` varchar(20) DEFAULT NULL,
  `golongan_lama` varchar(5) DEFAULT NULL,
  `tmt_lama` date DEFAULT NULL,
  `pangkat_baru` varchar(20) DEFAULT NULL,
  `golongan_baru` varchar(5) DEFAULT NULL,
  `tmt_baru` date DEFAULT NULL,
  `masa_kerja_golongan` varchar(50) DEFAULT NULL,
  `gaji_pokok` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_SuratPangkatTerakhir`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_pangkatterakhir` */

insert  into `sk_pangkatterakhir`(`id_SuratPangkatTerakhir`,`nama_pemilik`,`tanggal_lahir`,`nip_lama`,`nip_baru`,`pendidikan`,`pangkat_lama`,`golongan_lama`,`tmt_lama`,`pangkat_baru`,`golongan_baru`,`tmt_baru`,`masa_kerja_golongan`,`gaji_pokok`) values ('823.4/72/2002','Drs. MARIMIN','1952-10-23','130701388','-','S1/D4','penata Tk 1','III /','2002-10-01','Pembina','IV /a','2002-10-01','31','1122400');

/*Table structure for table `sptkg_terakhir` */

DROP TABLE IF EXISTS `sptkg_terakhir`;

CREATE TABLE `sptkg_terakhir` (
  `id_SuratSPTKGTerakhir` varchar(40) DEFAULT NULL,
  `tempat_surat` varchar(10) DEFAULT NULL,
  `tanggal_surat` date DEFAULT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `pangkat_baru` varchar(20) DEFAULT NULL,
  `golongan_ruang_baru` varchar(5) DEFAULT NULL,
  `Sekolah` varchar(100) DEFAULT NULL,
  `gajipokok_lama` varchar(30) DEFAULT NULL,
  `gajipokok_baru` mediumint(9) DEFAULT NULL,
  `tmt_baru` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sptkg_terakhir` */

insert  into `sptkg_terakhir`(`id_SuratSPTKGTerakhir`,`tempat_surat`,`tanggal_surat`,`nama_pemilik`,`nip_baru`,`pangkat_baru`,`golongan_ruang_baru`,`Sekolah`,`gajipokok_lama`,`gajipokok_baru`,`tmt_baru`) values ('822.4/773/13','Klaten','2010-12-17','Drs. MARIMIN','195210231979011003','Pembina','IV/a','SMAN 1 Karanganom','2353700',2960600,'2011-03-01');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
