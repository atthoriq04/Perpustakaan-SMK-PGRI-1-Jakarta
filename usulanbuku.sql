-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 10, 2022 at 09:46 AM
-- Server version: 5.7.24
-- PHP Version: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaanpgri`
--

-- --------------------------------------------------------

--
-- Table structure for table `usulanbuku`
--

CREATE TABLE `usulanbuku` (
  `IdUsulan` int(11) NOT NULL,
  `Nis` int(11) NOT NULL,
  `Judul` varchar(100) NOT NULL DEFAULT 'Tidak Disebutkan',
  `Penulis` varchar(50) DEFAULT 'Tidak Disebutkan',
  `Penerbit` varchar(50) DEFAULT 'Tidak Disebutkan',
  `TahunTerbit` varchar(50) DEFAULT 'Tidak Disebutkan',
  `Status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `usulanbuku`
--
ALTER TABLE `usulanbuku`
  ADD PRIMARY KEY (`IdUsulan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `usulanbuku`
--
ALTER TABLE `usulanbuku`
  MODIFY `IdUsulan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
