-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2023 at 09:41 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_uas`
--

-- --------------------------------------------------------

--
-- Table structure for table `master_barang`
--

CREATE TABLE `master_barang` (
  `kode_barang` varchar(10) CHARACTER SET latin1 NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `kategori_barang` varchar(20) NOT NULL,
  `merek` varchar(50) DEFAULT NULL,
  `ukuran` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `master_barang`
--

INSERT INTO `master_barang` (`kode_barang`, `nama_barang`, `kategori_barang`, `merek`, `ukuran`) VALUES
('1', 'Laptop', 'Elektronik', 'Asus', '15'),
('2', 'Handphone', 'Elektronik', 'Samsung', '1');

-- --------------------------------------------------------

--
-- Table structure for table `master_lokasi`
--

CREATE TABLE `master_lokasi` (
  `kode_lokasi` varchar(10) NOT NULL,
  `nama_lokasi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `master_lokasi`
--

INSERT INTO `master_lokasi` (`kode_lokasi`, `nama_lokasi`) VALUES
('1', 'Banjarmasin'),
('2', 'Banjarbaru'),
('3', 'Banjarnegara');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_inventaris_keluar`
--

CREATE TABLE `transaksi_inventaris_keluar` (
  `kode_inventaris_keluar` char(20) NOT NULL,
  `kode_inventaris_masuk` char(20) NOT NULL,
  `tanggal_keluar` date DEFAULT NULL,
  `jumlah` double NOT NULL,
  `keterangan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi_inventaris_keluar`
--

INSERT INTO `transaksi_inventaris_keluar` (`kode_inventaris_keluar`, `kode_inventaris_masuk`, `tanggal_keluar`, `jumlah`, `keterangan`) VALUES
('KELUAR0001', 'MASUK0001', '2023-12-28', 9, 'gaada'),
('KELUAR0002', 'MASUK0004', '2009-12-20', 1, 'ada');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_inventaris_masuk`
--

CREATE TABLE `transaksi_inventaris_masuk` (
  `kode_inventaris_masuk` char(20) NOT NULL,
  `kode_barang` varchar(15) NOT NULL,
  `tanggal_masuk` date DEFAULT NULL,
  `jumlah` float NOT NULL,
  `nilai_barang` float NOT NULL,
  `kode_lokasi` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi_inventaris_masuk`
--

INSERT INTO `transaksi_inventaris_masuk` (`kode_inventaris_masuk`, `kode_barang`, `tanggal_masuk`, `jumlah`, `nilai_barang`, `kode_lokasi`) VALUES
('MASUK0001', '1', '2023-12-28', 5, 1, '3'),
('MASUK0002', '1', '2023-12-28', 2, 3, '2'),
('MASUK0003', '1', '2023-12-28', 5, 5, '3'),
('MASUK0004', '2', '2023-12-29', 2, 2, '3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `master_barang`
--
ALTER TABLE `master_barang`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `master_lokasi`
--
ALTER TABLE `master_lokasi`
  ADD PRIMARY KEY (`kode_lokasi`);

--
-- Indexes for table `transaksi_inventaris_keluar`
--
ALTER TABLE `transaksi_inventaris_keluar`
  ADD PRIMARY KEY (`kode_inventaris_keluar`);

--
-- Indexes for table `transaksi_inventaris_masuk`
--
ALTER TABLE `transaksi_inventaris_masuk`
  ADD PRIMARY KEY (`kode_inventaris_masuk`,`kode_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
