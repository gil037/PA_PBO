-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2022 at 10:28 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `db_kelurahan`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_datapegawai`
--

CREATE TABLE `tb_datapegawai` (
  `Id_Pegawai` int(11) NOT NULL,
  `Id` varchar(20) NOT NULL,
  `Jabatan` varchar(50) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(300) NOT NULL,
  `Jenis_Kelamin` varchar(20) NOT NULL,
  `Tempat_Lahir` varchar(50) NOT NULL,
  `Tanggal_Lahir` varchar(50) NOT NULL,
  `Agama` varchar(30) NOT NULL,
  `Status` varchar(30) NOT NULL,
  `Kewarganegaraan` varchar(40) NOT NULL,
  `Nip` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_datapegawai`
--

INSERT INTO `tb_datapegawai` (`Id_Pegawai`, `Id`, `Jabatan`, `Nama`, `Alamat`, `Jenis_Kelamin`, `Tempat_Lahir`, `Tanggal_Lahir`, `Agama`, `Status`, `Kewarganegaraan`, `Nip`) VALUES
(1, '#KCD349843\n', '1', '1', '1', '1', '1', '1', '1', '1', '1', 1),
(2, '#ULV171521\n', '2', '2', '2', '2', '2', '2', '2', '2', '2', 2),
(3, '#EZA268286\n', '3', '3', '3', '3', '3', '3', '3', '3', '3', 3),
(4, '#XFD707276\n', '4', '4', '4', '4', '4', '4', '4', '4', '4', 4),
(5, '#FTD039091\n', '5', '5', '5', '5', '5', '5', '5', '5', '5', 5),
(6, '#ERD350823\n', '6', '6', '6', '6', '6', '6', '6', '6', '6', 6),
(7, '#GTL308040\n', '7', '7', '7', '7', '7', '7', '7', '7', '7', 7),
(8, '#YON745368\n', '8', '8', '8', '8', '8', '8', '8', '8', '8', 8),
(9, '#GHA128523\n', '9', '9', '9', '9', '9', '9', '9', '9', '9', 9),
(10, '#IOA629201\n', '10', '10', '10', '10', '10', '10', '10', '10', '10', 10);

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
(1, '#ZNW479669\n', '1', '1', '1', '1', '1', '1', '1', '1', '1', 1),
(2, '#PAJ779280\n', '2', '2', '2', '2', '2', '2', '2', '2', '2', 2),
(3, '#HHO357743\n', '3', '3', '3', '3', '3', '3', '3', '3', '3', 3),
(4, '#WAD495391\n', '4', '4', '4', '4', '4', '4', '4', '4', '4', 4),
(5, '#EJM877648\n', '5', '5', '5', '5', '5', '5', '5', '5', '5', 5),
(6, '#DYY915914\n', '6', '6', '6', '6', '6', '6', '6', '6', '6', 6),
(7, '#AKR256182\n', '7', '7', '7', '7', '7', '7', '7', '7', '7', 7),
(8, '#SKZ782684\n', '7', '7', '7', '7', '8', '8', '8', '8', '8', 8),
(9, '#VOC910037\n', '9', '9', '9', '9', '9', '9', '9', '9', '9', 9),
(10, '#PCD165902\n', '10', '10', '10', '10', '10', '10', '10', '10', '10', 10),
(11, '#RBN305702\n', '1', '1', '1', '11', '11', '11', '11', '11', '11', 11),
(12, '#FRH914936\n', '12', '12', '12', '12', '12', '12', '12', '12', '12', 12),
(13, '#QHI142234\n', '13', '13', '13', '13', '13', '13', '13', '13', '13', 13),
(14, '#LDT105644\n', '14', '14', '14', '14', '14', '14', '14', '14', '14', 14),
(15, '#HEH929663\n', '15', '15', '15', '15', '15', '15', '15', '15', '15', 15);

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
