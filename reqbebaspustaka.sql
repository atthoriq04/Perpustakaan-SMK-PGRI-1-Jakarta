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
-- Table structure for table `reqbebaspustaka`
--

CREATE TABLE `reqbebaspustaka` (
  `IdReq` int(11) NOT NULL,
  `TglPermintaan` date NOT NULL,
  `Nis` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `reqbebaspustaka`
--

INSERT INTO `reqbebaspustaka` (`IdReq`, `TglPermintaan`, `Nis`) VALUES
(1, '2022-05-05', 99283),
(2, '2022-05-05', 99282),
(3, '2022-05-08', 99281);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reqbebaspustaka`
--
ALTER TABLE `reqbebaspustaka`
  ADD PRIMARY KEY (`IdReq`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reqbebaspustaka`
--
ALTER TABLE `reqbebaspustaka`
  MODIFY `IdReq` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
