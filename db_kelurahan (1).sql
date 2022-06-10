-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2022 at 02:40 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kelurahan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_datapegawai`
--

CREATE TABLE `tb_datapegawai` (
  `Id_Pegawai` int(11) NOT NULL,
  `Id` varchar(30) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(300) NOT NULL,
  `Jenis_Kelamin` varchar(20) NOT NULL,
  `Tempat_Lahir` varchar(50) NOT NULL,
  `Tanggal_Lahir` varchar(50) NOT NULL,
  `Agama` varchar(30) NOT NULL,
  `Status` varchar(30) NOT NULL,
  `Kewarganegaraan` varchar(40) NOT NULL,
  `Nip` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_datapegawai`
--

INSERT INTO `tb_datapegawai` (`Id_Pegawai`, `Id`, `Jabatan`, `Nama`, `Alamat`, `Jenis_Kelamin`, `Tempat_Lahir`, `Tanggal_Lahir`, `Agama`, `Status`, `Kewarganegaraan`, `Nip`) VALUES
(1, '#KCD349843\n', 'Kepala Kelurah', 'Dimas Kamaswara', 'Jalan Usaha Tani', 'Laki-Laki', 'Banjarmasin', '12/12/1980', 'Islam', 'Kawin', 'WNI', 2147483647),
(2, '#ULV171521\n', 'Sekretaris', 'Tri Yola Devi', 'Jalan Batu Besaung', 'Perempuan', 'Medan', '28/03/1970', 'Islam', 'Kawin', 'WNI', 1900119002),
(3, '#EZA268286\n', 'Bendahara', 'Dwi Asriani', 'Jalan Batu Besaung', 'Perempuan', 'Berau', '19/08/1970', 'Islam', 'Kawin', 'WNI', 2009800105),
(4, '#XFD707276\n', 'Staff', 'Nur Kamilah', 'Jalan H. Maksum', 'Perempuan', 'Bontang', '20/09/1977', 'Islam', 'Kawin', 'WNI', 2007900109),
(5, '#FTD039091\n', 'Staff', 'Abdul M. Rachim', 'Jalan Saliki', 'Laki-Laki', 'Samarinda', '21/11/1990', 'Islam', 'Kawin', 'WNI', 1920000206),
(6, '#ERD350823\n', 'Staff', 'Efan', 'Jalan Saliki', 'Laki-Laki', 'Samarinda', '06/07/1998', 'Hindu', 'Belum Kawin', 'WNI', 1950320203),
(7, '#GTL308040\n', 'Staff', 'Sahabuddin', 'Jalan Pinang Seribu', 'Laki-Laki', 'Bontang', '19/10/1990', 'Islam', 'Belum Kawin', 'WNI', 2001070102),
(8, '#YON745368\n', 'Staff', 'Ketut', 'Jalan Wanyi', 'Laki-Laki', 'Samarinda', '19/11/1980', 'Hindu', 'Kawin', 'WNI', 2147483647),
(9, '#GHA128523\n', 'Staff', 'Adrian', 'Jalan Pinang Seribu', 'Laki-Laki', 'Samarinda', '09/03/1988', 'Islam', 'Kawin', 'WNI', 1900900204),
(10, '#IOA629201\n', 'Staff', 'Rasni Risya', 'Jalan Durian', 'Perempuan', 'Berau', '14/07/1989', 'Islam', 'Kawin', 'WNI', 1900207005);

-- --------------------------------------------------------

--
-- Table structure for table `tb_datapenduduk`
--

CREATE TABLE `tb_datapenduduk` (
  `Id_Penduduk` int(11) NOT NULL,
  `Id` varchar(20) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(300) NOT NULL,
  `Jenis_Kelamin` varchar(20) NOT NULL,
  `Tempat_Lahir` varchar(50) NOT NULL,
  `Tanggal_Lahir` varchar(50) NOT NULL,
  `Agama` varchar(30) NOT NULL,
  `Pekerjaan` varchar(50) NOT NULL,
  `Status` varchar(30) NOT NULL,
  `Kewarganegaraan` varchar(40) NOT NULL,
  `Nik` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_datapenduduk`
--

INSERT INTO `tb_datapenduduk` (`Id_Penduduk`, `Id`, `Nama`, `Alamat`, `Jenis_Kelamin`, `Tempat_Lahir`, `Tanggal_Lahir`, `Agama`, `Pekerjaan`, `Status`, `Kewarganegaraan`, `Nik`) VALUES
(1, '#ZNW479669\n', 'Yola', 'Jalan Batu Cermin', 'Perempuan', 'Medan', '11/03/2003', 'Islam', 'Mahasiswa', 'Belum Kawin', 'WNI', 1617168890),
(2, '#PAJ779280\n', 'Arimbi', 'Jalan Batu Besaung', 'Perempuan', 'Samarinda', '28/12/2002', 'Islam', 'Mahasiswa', 'Belum Kawin', 'WNI', 1617168891),
(3, '#HHO357743\n', 'Ihsan', 'Jalan Batu Besaung', 'Laki-Laki', 'Panajam', '15/07/2000', 'Islam', 'Mahasiswa', 'Belum Kawin', 'WNI', 1617168892),
(4, '#WAD495391\n', 'Gilang', 'Jalan Durian', 'Laki-Laki', 'Samarinda', '30/04/1998', 'Islam', 'Mahasiswa', 'Belum Kawin', 'WNI', 1617168893),
(5, '#EJM877648\n', 'Riana', 'Jalan Usaha Tani', 'Perempuan', 'Palu', '05/06/1978', 'Protestan', 'Ibu Rumah Tangga', 'Kawin', 'WNI', 1617168894),
(6, '#DYY915914\n', 'Regita', 'Jalan Wanyi', 'Perempuan', 'Muara Wahau', '13/09/1984', 'Islam', 'Karyawan Swasta', 'Kawin', 'WNI', 1617168895),
(7, '#AKR256182\n', 'Lidya', 'Jalan Wanyi', 'Perempuan', 'Medan', '21/12/1967', 'Protestan', 'Ibu Rumah Tangga', 'Kawin', 'WNI', 1617168896),
(8, '#SKZ782684\n', 'Rizky', 'Jalan H. Mansyur', 'Laki-Laki', 'Samarinda', '08/05/1995', 'Hindu', 'Wiraswasta', 'Belum Kawin', 'WNI', 1617168897),
(9, '#VOC910037\n', 'Ivan', 'Jalan H. Mansyur', 'Laki-Laki', 'Samarinda', '20/08/1977', 'Buddha', 'Wiraswasta', 'Kawin', 'WNI', 1617168898),
(10, '#PCD165902\n', 'Devi', 'Jalan Usaha Tani', 'Perempuan', 'Samarinda', '31/10/1964', 'Islam', 'Wirausaha', 'Kawin', 'WNI', 1617168899),
(11, '#RBN305702\n', 'Tiara', 'Jalan H. Mastuang', 'Perempuan', 'Balikpapan', '07/11/2000', 'Buddha', 'Wiraswasta', 'Kawin', 'WNI', 1617168801),
(12, '#FRH914936\n', 'Alea', 'Jalan Usaha Tani', 'Perempuan', 'Bontang', '15/12/1999', 'Hindu', 'Pegawai Swasta', 'Belum Kawin', 'WNI', 1617168802),
(13, '#QHI142234\n', 'Andriyani', 'Jalan Pinang Seribu', 'Perempuan', 'Kediri', '13/11/1995', 'Islam', 'Pegawai Swasta', 'Belum Kawin', 'WNI', 1617168803),
(14, '#LDT105644\n', 'Fanny', 'Jalan Pinang Seribu', 'Perempuan', 'Sangatta', '23/07/2001', 'Islam', 'Karyawan Swasta', 'Belum Kawin', 'WNI', 1617168804),
(15, '#HEH929663\n', 'Yuda', 'Jalan Pinang Seribu', 'Laki-Laki', 'Kota Bangun', '27/12/2001', 'Islam', 'Karyawan Swasta', 'Belum Kawin', 'WNI', 1617168805);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_datapegawai`
--
ALTER TABLE `tb_datapegawai`
  ADD PRIMARY KEY (`Id_Pegawai`);

--
-- Indexes for table `tb_datapenduduk`
--
ALTER TABLE `tb_datapenduduk`
  ADD PRIMARY KEY (`Id_Penduduk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_datapegawai`
--
ALTER TABLE `tb_datapegawai`
  MODIFY `Id_Pegawai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_datapenduduk`
--
ALTER TABLE `tb_datapenduduk`
  MODIFY `Id_Penduduk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
