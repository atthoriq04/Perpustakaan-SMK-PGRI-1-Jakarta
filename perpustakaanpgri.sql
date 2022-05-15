-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 15, 2022 at 07:18 PM
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
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `Nis` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `IdKelas` int(11) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `NoHp` varchar(15) NOT NULL,
  `TTL` varchar(255) NOT NULL,
  `Expired` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`Nis`, `Nama`, `IdKelas`, `Email`, `Alamat`, `NoHp`, `TTL`, `Expired`) VALUES
(99281, 'Dera', 10, 'masterblad213@gmail.com', 'Jakarta', '0821295332112', 'Sukabumi, 12 Oktober 1999', '2023-04-19'),
(99282, 'Radika', 10, 'radika@gmail.com', 'Jakarta', '0821223221', 'Jakarta, 20 April 2022', '2023-04-20'),
(99283, 'Yos', 10, 'yos@gmail.com', 'Jakarta', '08212231122', 'Jakarta, 20 April 2022', '2022-04-21'),
(99801, 'Budiman ', 6, 'Alamat@email.Siswa', 'Alamat', '000088889999', 'Jakarta, 25 Mei 2004', '2023-05-15'),
(99802, 'Juan', 6, 'Alamat@email.Siswa', 'Alamat', '000088889999', 'Jakarta, 22 Januari 2005', '2023-05-15'),
(99816, 'Muhlisan', 5, 'Alamat@email.Siswa', 'Jl.Muhlis', '000088889999', 'Jakarta, 10 juli 2004', '2023-05-13'),
(99817, 'Muhlisin', 5, 'Alamat@email.Siswa', 'Jl.Muhlis', '000088889999', 'Jakarta, 10 juli 2004', '2023-05-13'),
(99818, 'Hidayatunjan', 5, 'Alamat@email.Siswa', 'Jl.HjHjaHj', '000088889999', 'Jakarta, 10 mei 2004', '2023-05-13');

-- --------------------------------------------------------

--
-- Table structure for table `biblio`
--

CREATE TABLE `biblio` (
  `biblio_id` int(11) NOT NULL,
  `gmd_id` int(11) DEFAULT NULL,
  `title` text COLLATE utf8_unicode_ci NOT NULL,
  `edition` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `isbn_issn` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `publisher_id` int(11) DEFAULT NULL,
  `publish_year` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `collation` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `series_title` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `call_number` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `language_id` char(5) COLLATE utf8_unicode_ci DEFAULT 'en',
  `source` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `publish_place_id` int(11) DEFAULT NULL,
  `classification` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `notes` text COLLATE utf8_unicode_ci,
  `image` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_att` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `opac_hide` smallint(6) DEFAULT '0',
  `promoted` smallint(6) DEFAULT '0',
  `labels` text COLLATE utf8_unicode_ci,
  `frequency_id` int(11) NOT NULL DEFAULT '0',
  `spec_detail_info` text COLLATE utf8_unicode_ci,
  `content_type_id` int(11) DEFAULT NULL,
  `media_type_id` int(11) DEFAULT NULL,
  `carrier_type_id` int(11) DEFAULT NULL,
  `input_date` datetime DEFAULT NULL,
  `last_update` datetime DEFAULT NULL,
  `uid` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `biblio`
--

INSERT INTO `biblio` (`biblio_id`, `gmd_id`, `title`, `edition`, `isbn_issn`, `publisher_id`, `publish_year`, `collation`, `series_title`, `call_number`, `language_id`, `source`, `publish_place_id`, `classification`, `notes`, `image`, `file_att`, `opac_hide`, `promoted`, `labels`, `frequency_id`, `spec_detail_info`, `content_type_id`, `media_type_id`, `carrier_type_id`, `input_date`, `last_update`, `uid`) VALUES
(1, 1, 'PHP 5 for dummies', NULL, '0764541668', 1, '2004', 'xiv, 392 p. : ill. ; 24 cm.', 'For dummies', '005.13/3-22 Jan p', 'en', NULL, 1, '005.13/3 22', NULL, 'php5_dummies.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:36:50', '2007-11-29 16:26:59', NULL),
(2, 1, 'Linux In a Nutshell', 'Fifth Edition', '9780596009304', 2, '2005', 'xiv, 925 p. : ill. ; 23 cm.', 'In a Nutshell', '005.4/32-22 Ell l', 'en', NULL, 2, '005.4/32 22', NULL, 'linux_in_a_nutshell.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:53:35', '2007-11-29 16:26:10', NULL),
(3, 1, 'The Definitive Guide to MySQL 5', NULL, '9781590595350', 3, '2005', '784p.', 'Definitive Guide Series', '005.75/85-22 Kof d', 'en', NULL, NULL, '005.75/85 22', NULL, 'mysql_def_guide.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:01:08', '2007-11-29 16:26:33', NULL),
(4, 1, 'Cathedral and the Bazaar: Musings on Linux and Open Source by an Accidental Revolutionary', NULL, '0-596-00108-8', 2, '2001', '208p.', NULL, '005.4/3222 Ray c', 'en', NULL, 2, '005.4/32 22', 'The Cathedral & the Bazaar is a must for anyone who cares about the future of the computer industry or the dynamics of the information economy. This revised and expanded paperback edition includes new material on open source developments in 1999 and 2000. Raymond\'s clear and effective writing style accurately describing the benefits of open source software has been key to its success. (Source: http://safari.oreilly.com/0596001088)', 'cathedral_bazaar.jpg', 'cathedral-bazaar.pdf', 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:14:44', '2007-11-29 16:25:43', NULL),
(5, 1, 'Producing open source software : how to run a successful free software project', '1st ed.', '9780596007591', 2, '2005', 'xx, 279 p. ; 24 cm.', NULL, '005.1-22 Fog p', 'en', NULL, 2, '005.1 22', 'Includes index.', 'producing_oss.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:20:45', '2007-11-29 16:31:21', NULL),
(6, 1, 'PostgreSQL : a comprehensive guide to building, programming, and administering PostgreSQL databases', '1st ed.', '0735712573', 4, '2003', 'xvii, 790 p. : ill. ; 23cm.', 'DeveloperÃ¢â‚¬â„¢s library', '005.75/85-22 Kor p', 'en', NULL, 3, '005.75/85 22', 'PostgreSQL is the world\'s most advanced open-source database. PostgreSQL is the most comprehensive, in-depth, and easy-to-read guide to this award-winning database. This book starts with a thorough overview of SQL, a description of all PostgreSQL data types, and a complete explanation of PostgreSQL commands.', 'postgresql.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:29:33', '2022-04-05 09:54:17', NULL),
(7, 1, 'Web application architecture : principles, protocols, and practices', NULL, '0471486566', 5, '2003', 'xi, 357 p. : ill. ; 23 cm.', NULL, '005.7/2-21 Leo w', 'en', NULL, 1, '005.7/2 21', 'An in-depth examination of the core concepts and general principles of Web application development.\r\nThis book uses examples from specific technologies (e.g., servlet API or XSL), without promoting or endorsing particular platforms or APIs. Such knowledge is critical when designing and debugging complex systems. This conceptual understanding makes it easier to learn new APIs that arise in the rapidly changing Internet environment.', 'webapp_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:41:57', '2007-11-29 16:32:46', NULL),
(8, 1, 'Ajax : creating Web pages with asynchronous JavaScript and XML', NULL, '9780132272674', 6, '2007', 'xxii, 384 p. : ill. ; 24 cm.', 'Bruce PerensÃ¢â‚¬â„¢ Open Source series', '006.7/86-22 Woy a', 'en', NULL, 4, '006.7/86 22', 'Using Ajax, you can build Web applications with the sophistication and usability of traditional desktop applications and you can do it using standards and open source software. Now, for the first time, there\'s an easy, example-driven guide to Ajax for every Web and open source developer, regardless of experience.', 'ajax.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:47:20', '2022-04-05 09:54:17', NULL),
(9, 1, 'The organization of information', '2nd ed.', '1563089769', 7, '2004', 'xxvii, 417 p. : ill. ; 27 cm.', 'Library and information science text series', '025-22 Tay o', 'en', NULL, 5, '025 22', 'A basic textbook for students of library and information studies, and a guide for practicing school library media specialists. Describes the impact of global forces and the school district on the development and operation of a media center, the technical and human side of management, programmatic activities, supportive services to students, and the quality and quantity of resources available to support programs.', 'organization_information.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:54:12', '2007-11-29 16:27:20', NULL),
(10, 1, 'Library and Information Center Management', '7th ed.', '9781591584063', 7, '2007', 'xxviii, 492 p. : ill. ; 27 cm.', 'Library and information science text series', '025.1-22 Stu l', 'en', NULL, 5, '025.1 22', NULL, 'library_info_center.JPG', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:58:51', '2007-11-29 16:27:40', NULL),
(11, 1, 'Information Architecture for the World Wide Web: Designing Large-Scale Web Sites', '2nd ed.', '9780596000356', 2, '2002', '500p.', NULL, '006.7-22 Mor i', 'en', NULL, 6, '006.7 22', 'Information Architecture for the World Wide Web is about applying the principles of architecture and library science to web site design. Each website is like a public building, available for tourists and regulars alike to breeze through at their leisure. The job of the architect is to set up the framework for the site to make it comfortable and inviting for people to visit, relax in, and perhaps even return to someday.', 'information_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:26:14', '2007-11-29 16:32:25', NULL),
(12, 1, 'Corruption and development', NULL, '9780714649023', 8, '1998', '166 p. : ill. ; 22 cm.', NULL, '364.1 Rob c', 'en', NULL, 7, '364.1/322/091724 21', 'The articles assembled in this volume offer a fresh approach to analysing the problem of corruption in developing countries and the k means to tackle the phenomenon.', 'corruption_development.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:45:30', '2007-11-29 16:20:53', NULL),
(13, 1, 'Corruption and development : the anti-corruption campaigns', NULL, '0230525504', 9, '2007', '310p.', NULL, '364.1 Bra c', 'en', NULL, 8, '364.1/323091724 22', 'This book provides a multidisciplinary interrogation of the global anti-corruption campaigns of the last ten years, arguing that while some positive change is observable, the period is also replete with perverse consequences and unintended outcomes', 'corruption_development_anti_campaign.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:49:49', '2007-11-29 16:19:48', NULL),
(14, 1, 'Pigs at the trough : how corporate greed and political corruption are undermining America', NULL, '1400047714', 10, '2003', '275 p. ; 22 cm.', NULL, '364.1323 Huf p', 'en', NULL, 8, '364.1323', NULL, 'pigs_at_trough.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:56:00', '2007-11-29 16:18:33', NULL),
(15, 1, 'Lords of poverty : the power, prestige, and corruption of the international aid business', NULL, '9780871134691', 11, '1994', 'xvi, 234 p. ; 22 cm.', NULL, '338.9 Han l', 'en', NULL, 8, '338.9/1/091724 20', 'Lords of Poverty is a case study in betrayals of a public trust. The shortcomings of aid are numerous, and serious enough to raise questions about the viability of the practice at its most fundamental levels. Hancocks report is thorough, deeply shocking, and certain to cause critical reevaluation of the governments motives in giving foreign aid, and of the true needs of our intended beneficiaries.', 'lords_of_poverty.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 18:08:13', '2007-11-29 16:13:11', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `bukutidaktersedia`
--

CREATE TABLE `bukutidaktersedia` (
  `IdRusak` int(11) NOT NULL,
  `Barcode` varchar(20) NOT NULL,
  `IdDenda` int(11) NOT NULL,
  `Tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `bukutidaktersedia`
--

INSERT INTO `bukutidaktersedia` (`IdRusak`, `Barcode`, `IdDenda`, `Tanggal`) VALUES
(1, '777123451', 1, '2022-05-14'),
(3, '7721318191', 4, '2022-05-14'),
(4, 'B00018', 5, '2022-05-15');

-- --------------------------------------------------------

--
-- Table structure for table `denda`
--

CREATE TABLE `denda` (
  `IdDenda` int(11) NOT NULL,
  `IdTransaksi` int(11) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `Barang` varchar(50) NOT NULL,
  `Nominal` float NOT NULL,
  `Status` varchar(20) NOT NULL,
  `Ket` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `denda`
--

INSERT INTO `denda` (`IdDenda`, `IdTransaksi`, `jenis`, `Barang`, `Nominal`, `Status`, `Ket`) VALUES
(1, 2, 'NonTunai', 'Vas Bunga', 0, '3', 'Menghilangkan Buku'),
(2, 5, 'Tunai', '-', 3500, '1', 'Keterlambatan Pengembalian'),
(3, 4, 'Tunai', '-', 3500, '3', 'Keterlambatan Pengembalian'),
(4, 6, 'Tunai', '-', 50000, '3', 'Menghilangkan Buku'),
(5, 9, 'NonTunai', 'Vas Bunga', 0, '3', 'Menghilangkan Buku');

-- --------------------------------------------------------

--
-- Table structure for table `gmd`
--

CREATE TABLE `gmd` (
  `gmd_id` int(11) NOT NULL,
  `gmd_code` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gmd_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `icon_image` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `gmd`
--

INSERT INTO `gmd` (`gmd_id`, `gmd_code`, `gmd_name`, `icon_image`, `input_date`, `last_update`) VALUES
(1, 'TE', 'Text', NULL, '2022-04-05', '2022-04-05'),
(2, 'AR', 'Art Original', NULL, '2022-04-05', '2022-04-05'),
(3, 'CH', 'Chart', NULL, '2022-04-05', '2022-04-05'),
(4, 'CO', 'Computer Software', NULL, '2022-04-05', '2022-04-05'),
(5, 'DI', 'Diorama', NULL, '2022-04-05', '2022-04-05'),
(6, 'FI', 'Filmstrip', NULL, '2022-04-05', '2022-04-05'),
(7, 'FL', 'Flash Card', NULL, '2022-04-05', '2022-04-05'),
(8, 'GA', 'Game', NULL, '2022-04-05', '2022-04-05'),
(9, 'GL', 'Globe', NULL, '2022-04-05', '2022-04-05'),
(10, 'KI', 'Kit', NULL, '2022-04-05', '2022-04-05'),
(11, 'MA', 'Map', NULL, '2022-04-05', '2022-04-05'),
(12, 'MI', 'Microform', NULL, '2022-04-05', '2022-04-05'),
(13, 'MN', 'Manuscript', NULL, '2022-04-05', '2022-04-05'),
(14, 'MO', 'Model', NULL, '2022-04-05', '2022-04-05'),
(15, 'MP', 'Motion Picture', NULL, '2022-04-05', '2022-04-05'),
(16, 'MS', 'Microscope Slide', NULL, '2022-04-05', '2022-04-05'),
(17, 'MU', 'Music', NULL, '2022-04-05', '2022-04-05'),
(18, 'PI', 'Picture', NULL, '2022-04-05', '2022-04-05'),
(19, 'RE', 'Realia', NULL, '2022-04-05', '2022-04-05'),
(20, 'SL', 'Slide', NULL, '2022-04-05', '2022-04-05'),
(21, 'SO', 'Sound Recording', NULL, '2022-04-05', '2022-04-05'),
(22, 'TD', 'Technical Drawing', NULL, '2022-04-05', '2022-04-05'),
(23, 'TR', 'Transparency', NULL, '2022-04-05', '2022-04-05'),
(24, 'VI', 'Video Recording', NULL, '2022-04-05', '2022-04-05'),
(25, 'EQ', 'Equipment', NULL, '2022-04-05', '2022-04-05'),
(26, 'CF', 'Computer File', NULL, '2022-04-05', '2022-04-05'),
(27, 'CA', 'Cartographic Material', NULL, '2022-04-05', '2022-04-05'),
(28, 'CD', 'CD-ROM', NULL, '2022-04-05', '2022-04-05'),
(29, 'MV', 'Multimedia', NULL, '2022-04-05', '2022-04-05'),
(30, 'ER', 'Electronic Resource', NULL, '2022-04-05', '2022-04-05'),
(31, 'DVD', 'Digital Versatile Disc', NULL, '2022-04-05', '2022-04-05');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `item_id` int(11) NOT NULL,
  `biblio_id` int(11) DEFAULT NULL,
  `call_number` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `coll_type_id` int(11) DEFAULT NULL,
  `item_code` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `inventory_code` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `received_date` date DEFAULT NULL,
  `supplier_id` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `order_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location_id` int(3) DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `item_status_id` char(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `site` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `source` int(11) NOT NULL DEFAULT '0',
  `invoice` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `price_currency` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `invoice_date` date DEFAULT NULL,
  `input_date` datetime NOT NULL,
  `last_update` datetime DEFAULT NULL,
  `uid` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item_id`, `biblio_id`, `call_number`, `coll_type_id`, `item_code`, `inventory_code`, `received_date`, `supplier_id`, `order_no`, `location_id`, `order_date`, `item_status_id`, `site`, `source`, `invoice`, `price`, `price_currency`, `invoice_date`, `input_date`, `last_update`, `uid`) VALUES
(1, 8, NULL, 1, 'B00001', 'INV/B00001', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 500000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:10', '2008-12-26 22:14:13', NULL),
(2, 6, NULL, 1, 'B00002', 'INV/B00002', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 700000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:45', '2008-12-26 22:13:45', NULL),
(3, 15, NULL, 1, 'B00003', 'INV/B00003', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 300000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:09', '2008-12-26 22:15:09', NULL),
(4, 14, NULL, 1, 'B00004', 'INV/B00004', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 250000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:49', '2008-12-26 22:15:49', NULL),
(5, 13, NULL, 1, 'B00005', 'INV/B00005', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:17:04', '2008-12-26 22:17:04', NULL),
(6, 12, NULL, 1, 'B00006', 'INV/B00006', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 350000, 'Rupiah', '0000-00-00', '2008-12-26 22:17:52', '2008-12-26 22:17:52', NULL),
(7, 4, NULL, 1, 'B00007', 'INV/B00007', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 450000, 'Rupiah', '0000-00-00', '2008-12-26 22:18:29', '2008-12-26 22:18:29', NULL),
(8, 4, NULL, 1, 'B00008', 'INV/B00008', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:18:51', '2008-12-26 22:18:51', NULL),
(9, 2, NULL, 1, 'B00009', 'INV/B00009', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:28', '2008-12-26 22:19:28', NULL),
(10, 2, NULL, 1, 'B00010', 'INV/B00010', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:57', '2008-12-26 22:19:57', NULL),
(11, 0, '1', 2, 'aasd', 'asdasda', '2022-05-12', NULL, NULL, 1, '2022-05-11', NULL, NULL, 0, '1as', 0, NULL, NULL, '2022-05-02 15:57:51', '2022-05-02 15:57:51', NULL),
(12, 0, '1', 2, '1ba3', '1aa44', '2022-05-08', NULL, NULL, 1, '2022-05-10', NULL, NULL, 0, 'aas', 0, NULL, NULL, '2022-05-02 19:25:16', '2022-05-02 19:25:16', NULL),
(13, 0, '1', 2, 'aaa', '1123', '2022-05-13', NULL, NULL, 1, '2022-05-18', NULL, NULL, 1, 'aasd', 25000, NULL, NULL, '2022-05-02 19:40:38', '2022-05-02 19:40:38', NULL),
(14, 0, '1', 2, 'aaab', '1123', '2022-05-13', NULL, NULL, 1, '2022-05-18', NULL, NULL, 2, 'aasd', 0, NULL, NULL, '2022-05-02 19:41:16', '2022-05-02 19:41:16', NULL),
(15, 0, 'aaa', 2, 'aaabccs', '1123', '2022-05-13', NULL, NULL, 1, '2022-05-18', NULL, NULL, 2, 'aasd', 0, NULL, NULL, '2022-05-02 19:46:15', '2022-05-02 19:46:15', NULL),
(16, 0, 'dda', 2, 'adas', 'asda', '2022-05-03', NULL, NULL, 1, '2022-05-04', NULL, NULL, 1, 'aasd', 2444, NULL, NULL, '2022-05-02 20:01:39', '2022-05-02 20:01:39', NULL),
(17, 0, 's', 2, 'afsc', 'adas', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'ajasd', 2500, NULL, NULL, '2022-05-02 20:03:06', '2022-05-02 20:03:06', NULL),
(18, 25, 's', 1, 'ada', 'asda', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'aasd', 2500, NULL, NULL, '2022-05-02 20:07:23', '2022-05-02 20:07:23', NULL),
(19, 25, 's', 1, 'ggasda', 'asda', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'aasd', 25009, NULL, NULL, '2022-05-02 20:08:21', '2022-05-02 20:08:21', NULL),
(20, 25, 's', 1, 'dsaq', 'asda', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'aasd', 25009, NULL, NULL, '2022-05-02 20:10:02', '2022-05-02 20:10:02', NULL),
(21, 36, '502-330', 2, 'B00018', 'INV/B00017', '2022-05-05', NULL, NULL, 4, '2022-05-05', NULL, NULL, 2, 'INV-B00018', 0, NULL, NULL, '2022-05-03 11:14:25', '2022-05-03 11:14:25', NULL),
(24, 36, '502-330', 2, 'B00023', 'INV/B00023', '2022-05-02', NULL, NULL, 3, '2022-05-13', NULL, NULL, 2, 'INV/B00023', 0, NULL, NULL, '2022-05-04 17:24:04', '2022-05-04 17:24:04', NULL),
(26, 40, '552.32 GhK P', 2, '777123451', '14561648888', '2022-05-13', NULL, NULL, 4, '2022-05-11', NULL, NULL, 2, '2022-05-12', 0, NULL, NULL, '2022-05-13 11:17:32', '2022-05-13 11:17:32', NULL),
(27, 40, '552.32 GhK P', 2, '777123452', '1451648415', '2022-05-13', NULL, NULL, 2, '2022-05-10', NULL, NULL, 2, '2022-05-11', 0, NULL, NULL, '2022-05-13 11:18:45', '2022-05-13 11:18:45', NULL),
(28, 40, '552.32 GhK P', 2, '7721318191', 'INV-090911010101', '2022-05-01', NULL, NULL, 4, '2022-04-03', NULL, NULL, 1, '2022-04-02', 50000, NULL, NULL, '2022-05-14 22:30:54', '2022-05-14 22:30:54', NULL),
(29, 36, '502-330', 2, 'B00015', 'INV 10101010', '2022-05-02', NULL, NULL, 2, '2022-05-01', NULL, NULL, 2, '2022-05-01', 0, NULL, NULL, '2022-05-14 22:40:25', '2022-05-14 22:40:25', NULL),
(30, 37, '503-221', 1, '666111222', 'INV-666111222', '2022-05-08', NULL, NULL, 3, '2022-05-01', NULL, NULL, 2, '2022-04-29', 0, NULL, NULL, '2022-05-15 20:03:32', '2022-05-15 20:03:32', NULL),
(31, 37, '503-221', 2, '666111223', 'INV-666111223', '2022-05-08', NULL, NULL, 2, '2022-05-01', NULL, NULL, 2, '2022-05-01', 0, NULL, NULL, '2022-05-15 20:04:10', '2022-05-15 20:04:10', NULL),
(32, 41, '558.30 HCG B', 1, 'A00001', 'INV-A00001', '2022-05-15', NULL, NULL, 2, '2022-05-10', NULL, NULL, 1, '2022-05-10', 75000, NULL, NULL, '2022-05-15 22:44:28', '2022-05-15 22:44:28', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `judulnotifikasi`
--

CREATE TABLE `judulnotifikasi` (
  `IdJudul` int(11) NOT NULL,
  `JudulNotifikasi` varchar(50) NOT NULL,
  `Warna` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `judulnotifikasi`
--

INSERT INTO `judulnotifikasi` (`IdJudul`, `JudulNotifikasi`, `Warna`) VALUES
(1, 'Pengembalian Gagal !!', '(217, 83, 79)'),
(2, 'Pengembalian berhasil !!', '(2, 117, 216)'),
(3, 'Pembayaran Denda Berhasil !!', '(2, 117, 216)'),
(4, 'Anda Mendapat Denda !!', '(217, 83, 79)'),
(5, 'Surat Bebas Pustaka Sudah Dicetak !!', '(2, 117, 216)'),
(6, 'Permintaan Surat bebas Pustaka Anda Ditolak !!', '(217, 83, 79)');

-- --------------------------------------------------------

--
-- Table structure for table `jurusan`
--

CREATE TABLE `jurusan` (
  `IdJurusan` varchar(10) NOT NULL,
  `Jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `jurusan`
--

INSERT INTO `jurusan` (`IdJurusan`, `Jurusan`) VALUES
('AKL', 'Akuntansi dan Keuangan Lembaga'),
('BDP', 'Bisnis Daring dan Pemasaran'),
('MM', 'Multimedia'),
('OTP', 'Otomatisasi dan Tata kelola Perkantoran');

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `IdKelas` int(11) NOT NULL,
  `TingkatKelas` varchar(10) NOT NULL,
  `IdJurusan` varchar(10) NOT NULL,
  `Kelas` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`IdKelas`, `TingkatKelas`, `IdJurusan`, `Kelas`) VALUES
(1, 'X', 'MM', '1'),
(2, 'X', 'MM', '2'),
(4, 'X', 'AKL', '1'),
(5, 'X', 'AKL', '2'),
(6, 'X', 'OTP', '1'),
(7, 'X', 'OTP', '2'),
(8, 'X', 'OTP', '3'),
(9, 'XI', 'MM', '1'),
(10, 'XI', 'MM', '2'),
(12, 'XI', 'AKL', '1'),
(13, 'XI', 'AKL', '2'),
(14, 'XI', 'AKL', '3'),
(15, 'XI', 'OTP', '1'),
(16, 'XI', 'OTP', '2'),
(17, 'XI', 'OTP', '3'),
(18, 'XII', 'MM', '1'),
(19, 'XII', 'MM', '2'),
(21, 'XII', 'AKL', '1'),
(22, 'XII', 'AKL', '2'),
(23, 'XII', 'AKL', '3'),
(24, 'XII', 'OTP', '1'),
(25, 'XII', 'OTP', '2'),
(26, 'XII', 'OTP', '3'),
(30, 'XI', 'BDP', '1'),
(32, 'XII', 'BDP', '1'),
(33, 'X', 'BDP', '1');

-- --------------------------------------------------------

--
-- Table structure for table `mst_author`
--

CREATE TABLE `mst_author` (
  `author_id` int(11) NOT NULL,
  `author_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `mst_author`
--

INSERT INTO `mst_author` (`author_id`, `author_name`, `input_date`, `last_update`) VALUES
(1, 'Valade, Janet', '2007-11-29', '2007-11-29'),
(2, 'Siever, Ellen', '2007-11-29', '2007-11-29'),
(3, 'Love, Robert', '2007-11-29', '2007-11-29'),
(4, 'Robbins, Arnold', '2007-11-29', '2007-11-29'),
(5, 'Figgins, Stephen', '2007-11-29', '2007-11-29'),
(6, 'Weber, Aaron', '2007-11-29', '2007-11-29'),
(7, 'Kofler, Michael', '2007-11-29', '2007-11-29'),
(8, 'Kramer, David', '2007-11-29', '2007-11-29'),
(9, 'Raymond, Eric', '2007-11-29', '2007-11-29'),
(10, 'Fogel, Karl', '2007-11-29', '2007-11-29'),
(11, 'Douglas, Korry', '2007-11-29', '2007-11-29'),
(12, 'Douglas, Susan', '2007-11-29', '2007-11-29'),
(13, 'Shklar, Leon', '2007-11-29', '2007-11-29'),
(14, 'Rosen, Richard', '2007-11-29', '2007-11-29'),
(15, 'Woychowsky, Edmond', '2007-11-29', '2007-11-29'),
(16, 'Taylor, Arlene G.', '2007-11-29', '2007-11-29'),
(17, 'Stueart, Robert D.', '2007-11-29', '2007-11-29'),
(18, 'Moran, Barbara B.', '2007-11-29', '2007-11-29'),
(19, 'Morville, Peter', '2007-11-29', '2007-11-29'),
(20, 'Rosenfeld, Louis', '2007-11-29', '2007-11-29'),
(21, 'Robinson, Mark', '2007-11-29', '2007-11-29'),
(22, 'Bracking, Sarah', '2007-11-29', '2007-11-29'),
(23, 'Huffington, Arianna Stassinopoulos', '2007-11-29', '2007-11-29'),
(24, 'Hancock, Graham', '2007-11-29', '2007-11-29'),
(25, 'zzxc', '2022-04-28', '2022-04-28'),
(26, 'hhhhh', '2022-04-28', '2022-04-28'),
(27, 'vvvvvzzzz', '2022-04-28', '2022-04-28'),
(28, 'zxccc', '2022-04-28', '2022-04-28'),
(29, 'ssd', '2022-05-02', '2022-05-02'),
(30, 'dda', '2022-05-02', '2022-05-02'),
(31, 'Diyah', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `mst_coll_type`
--

CREATE TABLE `mst_coll_type` (
  `coll_type_id` int(3) NOT NULL,
  `coll_type_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `mst_coll_type`
--

INSERT INTO `mst_coll_type` (`coll_type_id`, `coll_type_name`, `input_date`, `last_update`) VALUES
(1, 'Reference', '2007-11-29', '2007-11-29'),
(2, 'Textbook', '2007-11-29', '2007-11-29'),
(3, 'Fiction', '2007-11-29', '2007-11-29');

-- --------------------------------------------------------

--
-- Table structure for table `mst_language`
--

CREATE TABLE `mst_language` (
  `language_id` int(11) NOT NULL,
  `language_name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `mst_language`
--

INSERT INTO `mst_language` (`language_id`, `language_name`, `input_date`, `last_update`) VALUES
(1, 'Indonesia', '2022-04-05', '2022-04-05'),
(2, 'English', '2022-04-05', '2022-04-05'),
(3, 'Indo-China', '2022-04-05', '2022-04-05'),
(4, 'Chindo', '2022-04-27', '2022-04-27'),
(5, 'asdd', '2022-04-28', '2022-04-28'),
(6, 'zxx', '2022-04-28', '2022-04-28'),
(7, 'aad', '2022-04-28', '2022-04-28'),
(8, 'asdasd', '2022-04-28', '2022-04-28');

-- --------------------------------------------------------

--
-- Table structure for table `mst_location`
--

CREATE TABLE `mst_location` (
  `location_id` int(3) NOT NULL,
  `location_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `mst_location`
--

INSERT INTO `mst_location` (`location_id`, `location_name`, `input_date`, `last_update`) VALUES
(3, 'Dipinjam', '2022-05-13', '2022-05-13'),
(2, 'Perpustakaan PGRI', '2022-05-02', '2022-05-02'),
(4, 'Tidak Tersedia/Rusak/Hilang', '2022-05-14', '2022-05-14'),
(6, 'Pojok Baca ', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `mst_place`
--

CREATE TABLE `mst_place` (
  `place_id` int(11) NOT NULL,
  `place_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `mst_place`
--

INSERT INTO `mst_place` (`place_id`, `place_name`, `input_date`, `last_update`) VALUES
(1, 'Hoboken, NJ', '2007-11-29', '2007-11-29'),
(2, 'Sebastopol, CA', '2007-11-29', '2007-11-29'),
(3, 'Indianapolis', '2007-11-29', '2007-11-29'),
(4, 'Upper Saddle River, NJ', '2007-11-29', '2007-11-29'),
(5, 'Westport, Conn.', '2007-11-29', '2007-11-29'),
(6, 'Cambridge, Mass', '2007-11-29', '2007-11-29'),
(7, 'London', '2007-11-29', '2007-11-29'),
(8, 'New York', '2007-11-29', '2007-11-29'),
(9, 'hhhh', '2022-04-26', '2022-04-26'),
(10, 'jkkkk', '2022-04-26', '2022-04-26'),
(11, 'ggasdf', '2022-04-26', '2022-04-26'),
(12, '', '2022-04-26', '2022-04-26'),
(13, 'jghj', '2022-04-26', '2022-04-26'),
(14, 'uiii', '2022-04-26', '2022-04-26'),
(15, 'gg', '2022-04-26', '2022-04-26'),
(16, 'gggaxzvxz', '2022-04-26', '2022-04-26'),
(17, 'sdd', '2022-04-26', '2022-04-26'),
(18, 'ghghjghjkyyu', '2022-04-26', '2022-04-26'),
(19, 'dfjj', '2022-04-26', '2022-04-26'),
(20, 'jn', '2022-04-26', '2022-04-26'),
(21, 'asd', '2022-04-26', '2022-04-26'),
(22, '2331', '2022-04-26', '2022-04-26'),
(23, 'ssd', '2022-04-26', '2022-04-26'),
(24, 'zxcs', '2022-04-26', '2022-04-26'),
(25, 'ddas', '2022-04-26', '2022-04-26'),
(26, 'asda', '2022-04-27', '2022-04-27'),
(27, 'asdd', '2022-04-27', '2022-04-27'),
(28, 'sadasd', '2022-04-27', '2022-04-27'),
(29, 'bb', '2022-04-28', '2022-04-28'),
(30, 'zxcc', '2022-04-28', '2022-04-28'),
(31, 'zz', '2022-04-28', '2022-04-28'),
(32, 'zzxc', '2022-04-28', '2022-04-28');

-- --------------------------------------------------------

--
-- Table structure for table `mst_publisher`
--

CREATE TABLE `mst_publisher` (
  `publisher_id` int(11) NOT NULL,
  `publisher_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `mst_publisher`
--

INSERT INTO `mst_publisher` (`publisher_id`, `publisher_name`, `input_date`, `last_update`) VALUES
(1, 'Wiley', '2007-11-29', '2007-11-29'),
(2, 'OReilly', '2007-11-29', '2007-11-29'),
(3, 'Apress', '2007-11-29', '2007-11-29'),
(4, 'Sams', '2007-11-29', '2007-11-29'),
(5, 'John Wiley', '2007-11-29', '2007-11-29'),
(6, 'Prentice Hall', '2007-11-29', '2007-11-29'),
(7, 'Libraries Unlimited', '2007-11-29', '2007-11-29'),
(8, 'Taylor & Francis Inc.', '2007-11-29', '2007-11-29'),
(9, 'Palgrave Macmillan', '2007-11-29', '2007-11-29'),
(10, 'Crown publishers', '2007-11-29', '2007-11-29'),
(11, 'Atlantic Monthly Press', '2007-11-29', '2007-11-29'),
(12, 'dddd', '2022-04-26', '2022-04-26'),
(13, 'fff', '2022-04-26', '2022-04-26'),
(14, 'hh', '2022-04-26', '2022-04-26'),
(15, 'ddd', '2022-04-26', '2022-04-26'),
(16, 'ass', '2022-04-26', '2022-04-26'),
(17, 'ffffd', '2022-04-26', '2022-04-26'),
(18, 'sggds', '2022-04-26', '2022-04-26'),
(19, 'gggjj', '2022-04-26', '2022-04-26'),
(20, 'gghhh', '2022-04-26', '2022-04-26'),
(21, 'sss', '2022-04-26', '2022-04-26'),
(22, 'ghhhh', '2022-04-26', '2022-04-26'),
(23, '', '2022-04-26', '2022-04-26'),
(24, 'jkjkhjkhjk', '2022-04-26', '2022-04-26'),
(25, 'lmn ', '2022-04-26', '2022-04-26'),
(26, 'qqq', '2022-04-26', '2022-04-26'),
(27, 'gggghhqwe', '2022-04-26', '2022-04-26'),
(28, 'sdd', '2022-04-26', '2022-04-26'),
(29, 'bbbbbb', '2022-04-26', '2022-04-26'),
(30, 'vvhhchc', '2022-04-26', '2022-04-26'),
(31, 'ssdasd', '2022-04-26', '2022-04-26'),
(32, 'gzxvbzx', '2022-04-26', '2022-04-26'),
(33, 'dda', '2022-04-26', '2022-04-26'),
(34, 'bf', '2022-04-26', '2022-04-26'),
(35, 'bsa', '2022-04-26', '2022-04-26'),
(36, 'aasd', '2022-04-26', '2022-04-26'),
(37, 'fasd', '2022-04-27', '2022-04-27'),
(38, 'sdda', '2022-04-27', '2022-04-27'),
(39, 'asdasd', '2022-04-27', '2022-04-27'),
(40, 'dff', '2022-04-27', '2022-04-27'),
(41, 'wwea', '2022-04-28', '2022-04-28'),
(42, 'zxasd', '2022-04-28', '2022-04-28'),
(43, 'sda', '2022-04-28', '2022-04-28'),
(44, 'ssa', '2022-04-28', '2022-04-28'),
(45, 'aaaa', '2022-04-28', '2022-04-28'),
(46, 'ccd', '2022-04-28', '2022-04-28'),
(47, 'ssd', '2022-05-02', '2022-05-02'),
(48, 'da', '2022-05-02', '2022-05-02');

-- --------------------------------------------------------

--
-- Table structure for table `new_bliblio`
--

CREATE TABLE `new_bliblio` (
  `IdBliblio` int(11) NOT NULL,
  `IdGMD` int(11) DEFAULT NULL,
  `Judul` varchar(255) DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  `Edisi` varchar(255) DEFAULT NULL,
  `isbn_issn` varchar(255) DEFAULT NULL,
  `IdPublisher` int(11) DEFAULT NULL,
  `PublisherYear` varchar(255) DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  `SeriesTitle` varchar(255) DEFAULT NULL,
  `call_number` varchar(255) DEFAULT NULL,
  `IdLanguage` int(11) DEFAULT NULL,
  `TempatTerbit` int(11) DEFAULT NULL,
  `Klasifikasi` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `input_date` datetime DEFAULT NULL,
  `last_update` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `new_bliblio`
--

INSERT INTO `new_bliblio` (`IdBliblio`, `IdGMD`, `Judul`, `author_id`, `Edisi`, `isbn_issn`, `IdPublisher`, `PublisherYear`, `Notes`, `SeriesTitle`, `call_number`, `IdLanguage`, `TempatTerbit`, `Klasifikasi`, `image`, `input_date`, `last_update`) VALUES
(1, 0, '1', NULL, 'das', '21132', 1, '2004', '32213', 'assdd', '1', 2, NULL, NULL, NULL, NULL, NULL),
(2, 1, 'ASD', NULL, 'DDAS', 'Dasd', 1, 'sdasd', 'asddd', 'dssaa', 'sddd', 1, 4, 'ddsad', NULL, NULL, NULL),
(3, 4, 'ddd', NULL, 'ddsa', 'ddd', 1, 'dds', 'sssa', 'aas', 'fff', 1, 4, 'dddds', NULL, NULL, NULL),
(4, 2, 'sdda', NULL, 'dsda', 'ggsd', 0, 'ssa', 'ddsa', 'ssd', 'ffs', 1, 0, 'ddds', NULL, NULL, NULL),
(5, 1, 'asd', NULL, 'sddas', 'ddsa', 0, 'ffasd', 'sdd', 'assd', 'ddd', 1, 0, 'ssd', NULL, NULL, NULL),
(6, 1, 'asda', NULL, 'sdd', 'asdd', 0, 'aas', 'dds', 'ass', 'dd', 1, 0, 'aasdddd', NULL, NULL, NULL),
(7, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL),
(8, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL),
(9, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL),
(10, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL),
(11, 1, 'asd', NULL, 'dsd', 'aasd', 0, 'ffd', 'ss', 'aa', 'ff', 1, 0, 'aasd', NULL, NULL, NULL),
(12, 1, 'dasd', NULL, 'asd', 'aas', 0, 'ffsd', 'ddas', 'asd', 'assd', 1, 0, 'aaasd', NULL, NULL, NULL),
(13, 1, 'dds', NULL, 'aasdd', 'ggg', 0, 'ddd', 'ASDD', 'AS', 'DDDA', 1, 0, 'FFFS', NULL, NULL, NULL),
(14, 1, 'asdd', NULL, 'dds', 'assd', 0, 'sss', 'aaasd', 'sdd', 'dds', 1, 0, 'ddds', NULL, NULL, NULL),
(15, 1, 'ddsa', NULL, 'gggf', 'fjjj', 19, 'aasd', 'add', 'sss', 'aaa', 1, 0, 'hhhh', NULL, NULL, NULL),
(16, 1, 'ggd', NULL, 'dass', 'dds', 20, 'jjjd', 'asdd', 'ss', 'ggg', 1, 0, 'jjjj', NULL, NULL, NULL),
(17, 1, 'ddg', NULL, 'ggd', 'aaa', 21, 'ggg', 'ddd', 'ggg', 'hhh', 1, 10, 'asdasd', NULL, NULL, NULL),
(18, 1, 'ddg', NULL, 'ggd', 'aaa', 21, 'ggg', 'ddd', 'ggg', 'hhh', 1, 10, 'asdasd', NULL, NULL, NULL),
(19, 1, 'gasd', NULL, 'gg', 'ddd', 22, 'nbvbn', 'cvcvbncvbn', 'vsdfsdf', 'hxcvb', 1, 11, 'dfff', 'D:\\Dera\\Matlab\\img.jpg', NULL, NULL),
(20, 1, 'dasd', NULL, 'ggg', 'dfdsd', 24, 'vbnvbn', 'vncc', 'bn', 'vcn', 1, 13, 'dfghdgh', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL),
(21, 1, 'fghfgh', NULL, 'khjgh', 'dfgdf', 25, 'hjghj', 'ccc', 'vb', 'hfgu', 2, 14, 'ggh', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL),
(22, 1, 'gg', NULL, 'sdasd', 'gasd', 26, 'ww', 'sddas', 'ggdf', 'asddd', 1, 15, 'zzz', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL),
(23, 1, 'sdasd', NULL, 'fasdas', 'zzxc', 28, 'ddasd', 'xczxc', 'dasd', 'xxvczx', 1, 17, 'zzz', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL),
(24, 1, 'gga', NULL, 'zzz', 'xxxx', 29, 'hhha', 'sse', 'ttqwe', 'daa', 1, 18, 'rtrt', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL),
(25, 1, 'fasdd', NULL, 'gadf', 'zchhz', 30, 'd', 'a', 'xg', 's', 1, 20, 'asdd', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL),
(26, 1, 'sada', NULL, 'gggasd', 'sdd', 31, 'ggasd', 'zzxcv', 'gggasd', 'dddwe', 1, 21, 'bbbbb', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonIconlibliograf.png', NULL, NULL),
(27, 1, 'fgasd', NULL, 'gzzxv', 'bbxzzcdfd', 32, 'dds', 'asr1', 'asd123123', 'fasd', 1, 22, 'asdasdasd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(28, 1, 'asdas', NULL, 'ggasd', 'zzx', 35, '2331', 'asdx', 'zxcz', 'asda', 1, 24, 'dasddd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(29, 1, 'asdd', NULL, 'sdd', 'ggasd', 36, 'dsds', 'aasd', 'ggasd', 'xx', 1, 25, 'dgasdasd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(30, 1, 'sdasd', NULL, 'dasd', 'ss', 37, 'zzxc', 'asd', 'asdd', 'sdd', 0, 0, 'zxccc', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(31, 1, 'asdas', NULL, 'ddas', 'ds', 38, 'ggg', 'asdd', 'asdasd', '', 2, 26, 'asddads', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(32, 1, 'asdasd', NULL, 'asdasd', 'asdasd', 39, 'fffas', 'szxczxc', 'sada', 'zzxc', 1, 27, 'zxvvzxcxz', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(33, 1, 'asd', NULL, 'ggd', 'fd', 40, 'aaas', 'ddd', 'assd', 'ggas', 4, 28, 'dasdasd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(34, 1, 'dddza', 28, 'zxxbbb', 'bbb', 46, 'ss', 'zzxc', 'ddw', 'qaqwe', 8, 32, 'vvvv', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL),
(35, 1, 'dfaas', 30, 'ss', 'fass', 48, 'asd', 'sdas', 'daaa', 'ssd', 2, 1, 'aaaa', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', '2022-05-02 14:58:41', '2022-05-02 14:58:41'),
(36, 1, 'How To Be Genius', 1, 'Be Genius', '33125523', 1, '2011', 'Good', 'Series 1', '502-330', 1, 1, '502', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Cover.png', '2022-05-03 11:11:37', '2022-05-03 11:11:37'),
(37, 2, 'Network Cyber', 2, 'Kedua', '2231142', 2, '2011', 'Very Very GOOD', 'Series 2', '503-221', 1, 1, '503', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Cover.png', '2022-05-05 11:36:14', '2022-05-05 11:36:14'),
(38, 3, 'gaas', 1, 'Kedua', '33201223', 2, '2003', 'Very Bad', 'Series 4', '503-220', 1, 2, '503', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Icon\\blibliograf.png', '2022-05-05 11:39:33', '2022-05-05 11:39:33'),
(40, 4, 'Properti', 24, 'Baru', '11445566', 4, '2015', 'Buku Dikembangkan Oleh Pengembang Buku', 'Properti', '552.32 GhK P', 1, 8, '552.32', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Cover.png', '2022-05-10 18:44:46', '2022-05-10 18:44:46'),
(41, 4, 'Bordermand', 24, 'Premium Spesial', '118464511545454', 11, '2015', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur tempor mauris nec elit egestas, a finibus eros interdum. Vivamus pulvinar nisl erat, vel pharetra odio bibendum at.', 'Border', '558.30 HCG B', 2, 3, '558.30', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Cover.png', '2022-05-15 22:42:45', '2022-05-15 22:42:45');

-- --------------------------------------------------------

--
-- Table structure for table `notifikasi`
--

CREATE TABLE `notifikasi` (
  `idNotifikasi` int(11) NOT NULL,
  `idJudul` int(10) NOT NULL,
  `Nis` int(10) NOT NULL,
  `Isi` varchar(100) NOT NULL,
  `Tanggal` date NOT NULL,
  `Status` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `notifikasi`
--

INSERT INTO `notifikasi` (`idNotifikasi`, `idJudul`, `Nis`, `Isi`, `Tanggal`, `Status`) VALUES
(1, 1, 99281, 'Buku Yang Dikembalikan Tidak Sesuai(Kode Transaksi = 2 )', '2022-05-14', 1),
(2, 4, 99281, 'Anda Mendapat Denda Merusak/Menghilangkan Buku(Kode Transaksi = 2 )', '2022-05-14', 1),
(3, 2, 99281, 'Pengembalian Buku Berhasil(Kode Transaksi = 3 )', '2022-05-14', 1),
(5, 4, 99283, 'Anda Mendapat Denda Keterlambatan Pengembalian Buku(Kode Transaksi = 5 )', '2022-05-14', 1),
(6, 4, 99282, 'Anda Mendapat Denda Keterlambatan Pengembalian Buku(Kode Transaksi = 4 )', '2022-05-14', 1),
(7, 4, 99817, 'Anda Mendapat Denda Merusak/Menghilangkan Buku(Kode Transaksi = 6 )', '2022-05-14', 1),
(8, 3, 99281, 'Denda Dengan Kode 1 Berhasil Dibayarkan', '2022-05-14', 1),
(9, 4, 99817, 'Anda Mendapat Denda Merusak/Menghilangkan Buku(Kode Transaksi = 9 )', '2022-05-15', 1),
(11, 3, 99817, 'Denda Dengan Kode  5 Berhasil Dibayarkan ', '2022-05-15', 1),
(12, 3, 99817, 'Denda Dengan Kode  4 Berhasil Dibayarkan ', '2022-05-15', 1),
(13, 3, 99282, 'Denda Dengan Kode  3 Berhasil Dibayarkan ', '2022-05-15', 1),
(14, 6, 99283, 'Silahkan Cek Kembali Status Peminjaman Dan Denda Anda', '2022-05-16', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pengaturan`
--

CREATE TABLE `pengaturan` (
  `idPengaturan` int(11) NOT NULL,
  `LamaPinjam` int(11) NOT NULL,
  `DendaHarian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pengaturan`
--

INSERT INTO `pengaturan` (`idPengaturan`, `LamaPinjam`, `DendaHarian`) VALUES
(500, 1, 500);

-- --------------------------------------------------------

--
-- Table structure for table `pengunjung`
--

CREATE TABLE `pengunjung` (
  `IdPengunjung` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Instansi` varchar(50) NOT NULL,
  `TanggalKunjungan` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `pengunjung`
--

INSERT INTO `pengunjung` (`IdPengunjung`, `Nama`, `Email`, `Instansi`, `TanggalKunjungan`) VALUES
(1, 'Atthoriq', 'thoriqaziz.muhammad@gmail.com', 'unindrag', '2022-04-20 13:35:00'),
(2, 'Yos', 'yos@gmail.com', 'Siswa', '2022-04-20 13:35:31'),
(3, 'Dera', 'masterblad213@gmail.com', 'Siswa', '2022-04-20 14:43:32'),
(4, 'Radika', 'radika@gmail.com', 'Siswa', '2022-05-10 18:33:49'),
(5, 'Dera', 'masterblad213@gmail.com', 'Siswa', '2022-05-14 14:14:12'),
(6, 'Radika', 'radika@gmail.com', 'Siswa', '2022-05-14 21:27:44'),
(7, 'Yos', 'yos@gmail.com', 'Siswa', '2022-05-14 21:35:07'),
(8, 'Muhlisin', 'Alamat@email.Siswa', 'Siswa', '2022-05-14 21:37:18'),
(9, 'Radika', 'radika@gmail.com', 'Siswa', '2022-05-15 11:16:00'),
(10, 'Muhlisin', 'Alamat@email.Siswa', 'Siswa', '2022-05-15 14:40:29'),
(11, 'Yos', 'yos@gmail.com', 'Siswa', '2022-05-15 17:01:52'),
(12, 'Hidayatunjan', 'Alamat@email.Siswa', 'Siswa', '2022-05-15 17:02:31'),
(13, 'Budiman ', 'Alamat@email.Siswa', 'Siswa', '2022-05-15 22:50:21'),
(14, 'Ardian Syaputra', 'Ardian@gmail.com', 'Penyidik KPK', '2022-05-15 22:53:22'),
(15, 'Radika', 'radika@gmail.com', 'Siswa', '2022-05-16 01:01:04'),
(16, 'Yos', 'yos@gmail.com', 'Siswa', '2022-05-16 01:12:24'),
(17, 'Muhlisin', 'Alamat@email.Siswa', 'Siswa', '2022-05-16 01:14:10'),
(18, 'Hidayatunjan', 'Alamat@email.Siswa', 'Siswa', '2022-05-16 01:25:07'),
(19, 'Dera', 'masterblad213@gmail.com', 'Siswa', '2022-05-16 01:50:06');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `Nik` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `NoHp` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`Nik`, `Nama`, `Email`, `Alamat`, `NoHp`) VALUES
(123444, 'Petugas2', 'aa@aa', 'aaa', '11111'),
(123455, 'Petugas', 'pet@ug.as', 'Jakarta', '089944556644'),
(123456, 'Admin', 'admin@min.ad', 'Bekasi', '089644445555');

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
(2, '2022-05-05', 99282),
(3, '2022-05-08', 99281);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `IdTransaksi` int(11) NOT NULL,
  `Barcode` varchar(11) NOT NULL,
  `Nis` int(11) NOT NULL,
  `TanggalPinjam` date NOT NULL,
  `Tenggat` date NOT NULL,
  `TanggalKembali` date DEFAULT NULL,
  `Status` varchar(10) NOT NULL,
  `Keterangan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`IdTransaksi`, `Barcode`, `Nis`, `TanggalPinjam`, `Tenggat`, `TanggalKembali`, `Status`, `Keterangan`) VALUES
(2, '777123451', 99281, '2022-05-13', '2022-05-20', '2022-05-14', '4', 'Buku Hilang'),
(3, 'B00023', 99281, '2022-05-14', '2022-05-21', '2022-05-14', '4', 'Selesai'),
(4, '777123452', 99282, '2022-05-01', '2022-05-07', '2022-05-14', '4', 'Selesai'),
(5, 'B00018', 99283, '2022-05-14', '2022-05-21', '2022-05-14', '4', 'Selesai'),
(6, '7721318191', 99817, '2022-05-14', '2022-05-21', '2022-05-14', '4', 'Buku Hilang'),
(9, 'B00018', 99817, '2022-05-15', '2022-05-22', '2022-05-15', '4', 'Buku Hilang'),
(10, '666111222', 99283, '2022-05-15', '2022-05-15', NULL, '1', 'Dipinjam');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Nis` int(10) UNSIGNED NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Role` int(11) NOT NULL DEFAULT '3'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Nis`, `Username`, `Password`, `Role`) VALUES
(99281, 'dera', 'getamped', 3),
(99282, 'Radz', 'radika', 3),
(99283, 'yos', 'yos', 3),
(99801, 'Budz', 'budiman', 3),
(99802, '99802', '99802', 3),
(99816, '99816', '99816', 3),
(99817, '99817', '99817', 3),
(99818, '99818', '99818', 3),
(123444, 'p2', '123444', 2),
(123455, '123455', '123455', 2),
(123456, 'Admin', 'Admin', 1);

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
-- Dumping data for table `usulanbuku`
--

INSERT INTO `usulanbuku` (`IdUsulan`, `Nis`, `Judul`, `Penulis`, `Penerbit`, `TahunTerbit`, `Status`) VALUES
(7, 99282, 'Judul', 'Penulis', 'Tidak Disebutkan', '2000', 1),
(8, 99801, 'Merlian', 'Tidak Disebutkan', 'Tidak Disebutkan', '2005', 1),
(9, 99801, 'Tidak Disebutkan', 'Diyah', 'Tidak Disebutkan', '', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`Nis`) USING BTREE;

--
-- Indexes for table `biblio`
--
ALTER TABLE `biblio`
  ADD PRIMARY KEY (`biblio_id`) USING BTREE,
  ADD KEY `references_idx` (`gmd_id`,`publisher_id`,`language_id`,`publish_place_id`) USING BTREE,
  ADD KEY `classification` (`classification`) USING BTREE,
  ADD KEY `biblio_flag_idx` (`opac_hide`,`promoted`) USING BTREE,
  ADD KEY `rda_idx` (`content_type_id`,`media_type_id`,`carrier_type_id`) USING BTREE,
  ADD KEY `uid` (`uid`) USING BTREE;
ALTER TABLE `biblio` ADD FULLTEXT KEY `title_ft_idx` (`title`,`series_title`);
ALTER TABLE `biblio` ADD FULLTEXT KEY `notes_ft_idx` (`notes`);
ALTER TABLE `biblio` ADD FULLTEXT KEY `labels` (`labels`);

--
-- Indexes for table `bukutidaktersedia`
--
ALTER TABLE `bukutidaktersedia`
  ADD PRIMARY KEY (`IdRusak`) USING BTREE;

--
-- Indexes for table `denda`
--
ALTER TABLE `denda`
  ADD PRIMARY KEY (`IdDenda`) USING BTREE;

--
-- Indexes for table `gmd`
--
ALTER TABLE `gmd`
  ADD PRIMARY KEY (`gmd_id`) USING BTREE,
  ADD UNIQUE KEY `gmd_name` (`gmd_name`) USING BTREE,
  ADD UNIQUE KEY `gmd_code` (`gmd_code`) USING BTREE;

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_id`) USING BTREE,
  ADD UNIQUE KEY `item_code` (`item_code`) USING BTREE,
  ADD KEY `uid` (`uid`) USING BTREE,
  ADD KEY `item_references_idx` (`coll_type_id`,`location_id`,`item_status_id`) USING BTREE,
  ADD KEY `biblio_id_idx` (`biblio_id`) USING BTREE;

--
-- Indexes for table `judulnotifikasi`
--
ALTER TABLE `judulnotifikasi`
  ADD PRIMARY KEY (`IdJudul`);

--
-- Indexes for table `jurusan`
--
ALTER TABLE `jurusan`
  ADD PRIMARY KEY (`IdJurusan`) USING BTREE;

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`IdKelas`) USING BTREE;

--
-- Indexes for table `mst_author`
--
ALTER TABLE `mst_author`
  ADD PRIMARY KEY (`author_id`) USING BTREE,
  ADD UNIQUE KEY `author_name` (`author_name`) USING BTREE;

--
-- Indexes for table `mst_coll_type`
--
ALTER TABLE `mst_coll_type`
  ADD PRIMARY KEY (`coll_type_id`) USING BTREE,
  ADD UNIQUE KEY `coll_type_name` (`coll_type_name`) USING BTREE;

--
-- Indexes for table `mst_language`
--
ALTER TABLE `mst_language`
  ADD PRIMARY KEY (`language_id`) USING BTREE,
  ADD UNIQUE KEY `language_name` (`language_name`) USING BTREE;

--
-- Indexes for table `mst_location`
--
ALTER TABLE `mst_location`
  ADD PRIMARY KEY (`location_id`) USING BTREE,
  ADD UNIQUE KEY `location_name` (`location_name`) USING BTREE;

--
-- Indexes for table `mst_place`
--
ALTER TABLE `mst_place`
  ADD PRIMARY KEY (`place_id`) USING BTREE,
  ADD UNIQUE KEY `place_name` (`place_name`) USING BTREE;

--
-- Indexes for table `mst_publisher`
--
ALTER TABLE `mst_publisher`
  ADD PRIMARY KEY (`publisher_id`) USING BTREE,
  ADD UNIQUE KEY `publisher_name` (`publisher_name`) USING BTREE;

--
-- Indexes for table `new_bliblio`
--
ALTER TABLE `new_bliblio`
  ADD PRIMARY KEY (`IdBliblio`) USING BTREE;

--
-- Indexes for table `notifikasi`
--
ALTER TABLE `notifikasi`
  ADD PRIMARY KEY (`idNotifikasi`);

--
-- Indexes for table `pengaturan`
--
ALTER TABLE `pengaturan`
  ADD PRIMARY KEY (`idPengaturan`);

--
-- Indexes for table `pengunjung`
--
ALTER TABLE `pengunjung`
  ADD PRIMARY KEY (`IdPengunjung`) USING BTREE;

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`Nik`) USING BTREE;

--
-- Indexes for table `reqbebaspustaka`
--
ALTER TABLE `reqbebaspustaka`
  ADD PRIMARY KEY (`IdReq`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`IdTransaksi`) USING BTREE;

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Nis`) USING BTREE;

--
-- Indexes for table `usulanbuku`
--
ALTER TABLE `usulanbuku`
  ADD PRIMARY KEY (`IdUsulan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biblio`
--
ALTER TABLE `biblio`
  MODIFY `biblio_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `bukutidaktersedia`
--
ALTER TABLE `bukutidaktersedia`
  MODIFY `IdRusak` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `denda`
--
ALTER TABLE `denda`
  MODIFY `IdDenda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `gmd`
--
ALTER TABLE `gmd`
  MODIFY `gmd_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `judulnotifikasi`
--
ALTER TABLE `judulnotifikasi`
  MODIFY `IdJudul` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `kelas`
--
ALTER TABLE `kelas`
  MODIFY `IdKelas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `mst_author`
--
ALTER TABLE `mst_author`
  MODIFY `author_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `mst_coll_type`
--
ALTER TABLE `mst_coll_type`
  MODIFY `coll_type_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `mst_language`
--
ALTER TABLE `mst_language`
  MODIFY `language_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `mst_location`
--
ALTER TABLE `mst_location`
  MODIFY `location_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `mst_place`
--
ALTER TABLE `mst_place`
  MODIFY `place_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `mst_publisher`
--
ALTER TABLE `mst_publisher`
  MODIFY `publisher_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT for table `new_bliblio`
--
ALTER TABLE `new_bliblio`
  MODIFY `IdBliblio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT for table `notifikasi`
--
ALTER TABLE `notifikasi`
  MODIFY `idNotifikasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `pengaturan`
--
ALTER TABLE `pengaturan`
  MODIFY `idPengaturan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pengunjung`
--
ALTER TABLE `pengunjung`
  MODIFY `IdPengunjung` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `reqbebaspustaka`
--
ALTER TABLE `reqbebaspustaka`
  MODIFY `IdReq` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `IdTransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `Nis` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123457;

--
-- AUTO_INCREMENT for table `usulanbuku`
--
ALTER TABLE `usulanbuku`
  MODIFY `IdUsulan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
