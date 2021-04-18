-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2021 at 03:21 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kereta_api`
--

-- --------------------------------------------------------

--
-- Table structure for table `pesan_tiket`
--

CREATE TABLE `pesan_tiket` (
  `id` varchar(11) NOT NULL,
  `nomor_kursi` varchar(50) NOT NULL,
  `nama_penumpang` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `jumlah` varchar(5) NOT NULL,
  `total` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesan_tiket`
--

INSERT INTO `pesan_tiket` (`id`, `nomor_kursi`, `nama_penumpang`, `tujuan`, `kelas`, `jumlah`, `total`) VALUES
(' LKT01', 'B01', 'Tiur', 'Jogja', 'Vip', '1', '99000'),
(' LKT01', 'C12', 'Ananda', 'Jember', 'Vip', '2', '170000'),
(' LKT02', 'Z02', 'Richard', 'Jakarta', 'Vip', '2', '142000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pesan_tiket`
--
ALTER TABLE `pesan_tiket`
  ADD PRIMARY KEY (`nomor_kursi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
