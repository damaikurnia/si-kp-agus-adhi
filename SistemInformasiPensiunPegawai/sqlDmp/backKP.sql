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
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `anggotakeluarga` */

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

/*Table structure for table `sk_pangkatterakhir` */

DROP TABLE IF EXISTS `sk_pangkatterakhir`;

CREATE TABLE `sk_pangkatterakhir` (
  `id_SuratPangkatTerakhir` varchar(40) NOT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(20) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `pendidikan` varchar(15) DEFAULT NULL,
  `pangkat_lama` varchar(20) DEFAULT NULL,
  `golongan_lama` varchar(5) DEFAULT NULL,
  `ruang_lama` varchar(2) DEFAULT NULL,
  `tmt_lama` date DEFAULT NULL,
  `pangkat_baru` varchar(20) DEFAULT NULL,
  `golongan_baru` varchar(5) DEFAULT NULL,
  `ruang_baru` varchar(2) DEFAULT NULL,
  `tmt_baru` date DEFAULT NULL,
  `masa_kerja_golongan` varchar(50) DEFAULT NULL,
  `gaji_pokok` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_SuratPangkatTerakhir`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sk_pangkatterakhir` */

/*Table structure for table `sptkg_terakhir` */

DROP TABLE IF EXISTS `sptkg_terakhir`;

CREATE TABLE `sptkg_terakhir` (
  `id_SuratSPTKGTerakhir` varchar(40) DEFAULT NULL,
  `tempat_surat` varchar(10) DEFAULT NULL,
  `tanggal_surat` date DEFAULT NULL,
  `nama_pemilik` varchar(100) DEFAULT NULL,
  `nip_lama` varchar(10) DEFAULT NULL,
  `nip_baru` varchar(25) DEFAULT NULL,
  `pangkat_baru` varchar(20) DEFAULT NULL,
  `golongan_baru` varchar(5) DEFAULT NULL,
  `ruang_baru` varchar(2) DEFAULT NULL,
  `Sekolah` varchar(100) DEFAULT NULL,
  `gajipokok_lama` varchar(30) DEFAULT NULL,
  `gajipokok_baru` varchar(30) DEFAULT NULL,
  `tmt_baru` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sptkg_terakhir` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
