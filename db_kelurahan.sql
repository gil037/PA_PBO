-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2022 at 10:07 AM
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
  MODIFY `Id_Pegawai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_datapenduduk`
--
ALTER TABLE `tb_datapenduduk`
  MODIFY `Id_Penduduk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2009106121;
COMMIT;
