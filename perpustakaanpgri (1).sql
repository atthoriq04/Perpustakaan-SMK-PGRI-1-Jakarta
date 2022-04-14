-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2022 at 07:29 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

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
  `NoHp` int(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `biblio`
--

CREATE TABLE `biblio` (
  `biblio_id` int(11) NOT NULL,
  `gmd_id` int(3) DEFAULT NULL,
  `title` text COLLATE utf8_unicode_ci NOT NULL,
  `sor` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
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
  `notes` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `image` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_att` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `opac_hide` smallint(1) DEFAULT 0,
  `promoted` smallint(1) DEFAULT 0,
  `labels` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `frequency_id` int(11) NOT NULL DEFAULT 0,
  `spec_detail_info` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `content_type_id` int(11) DEFAULT NULL,
  `media_type_id` int(11) DEFAULT NULL,
  `carrier_type_id` int(11) DEFAULT NULL,
  `input_date` datetime DEFAULT NULL,
  `last_update` datetime DEFAULT NULL,
  `uid` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `biblio`
--

INSERT INTO `biblio` (`biblio_id`, `gmd_id`, `title`, `sor`, `edition`, `isbn_issn`, `publisher_id`, `publish_year`, `collation`, `series_title`, `call_number`, `language_id`, `source`, `publish_place_id`, `classification`, `notes`, `image`, `file_att`, `opac_hide`, `promoted`, `labels`, `frequency_id`, `spec_detail_info`, `content_type_id`, `media_type_id`, `carrier_type_id`, `input_date`, `last_update`, `uid`) VALUES
(1, 1, 'PHP 5 for dummies', NULL, NULL, '0764541668', 1, '2004', 'xiv, 392 p. : ill. ; 24 cm.', 'For dummies', '005.13/3-22 Jan p', 'en', NULL, 1, '005.13/3 22', NULL, 'php5_dummies.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:36:50', '2007-11-29 16:26:59', NULL),
(2, 1, 'Linux In a Nutshell', NULL, 'Fifth Edition', '9780596009304', 2, '2005', 'xiv, 925 p. : ill. ; 23 cm.', 'In a Nutshell', '005.4/32-22 Ell l', 'en', NULL, 2, '005.4/32 22', NULL, 'linux_in_a_nutshell.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:53:35', '2007-11-29 16:26:10', NULL),
(3, 1, 'The Definitive Guide to MySQL 5', NULL, NULL, '9781590595350', 3, '2005', '784p.', 'Definitive Guide Series', '005.75/85-22 Kof d', 'en', NULL, NULL, '005.75/85 22', NULL, 'mysql_def_guide.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:01:08', '2007-11-29 16:26:33', NULL),
(4, 1, 'Cathedral and the Bazaar: Musings on Linux and Open Source by an Accidental Revolutionary', NULL, NULL, '0-596-00108-8', 2, '2001', '208p.', NULL, '005.4/3222 Ray c', 'en', NULL, 2, '005.4/32 22', 'The Cathedral & the Bazaar is a must for anyone who cares about the future of the computer industry or the dynamics of the information economy. This revised and expanded paperback edition includes new material on open source developments in 1999 and 2000. Raymond\'s clear and effective writing style accurately describing the benefits of open source software has been key to its success. (Source: http://safari.oreilly.com/0596001088)', 'cathedral_bazaar.jpg', 'cathedral-bazaar.pdf', 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:14:44', '2007-11-29 16:25:43', NULL),
(5, 1, 'Producing open source software : how to run a successful free software project', NULL, '1st ed.', '9780596007591', 2, '2005', 'xx, 279 p. ; 24 cm.', NULL, '005.1-22 Fog p', 'en', NULL, 2, '005.1 22', 'Includes index.', 'producing_oss.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:20:45', '2007-11-29 16:31:21', NULL),
(6, 1, 'PostgreSQL : a comprehensive guide to building, programming, and administering PostgreSQL databases', NULL, '1st ed.', '0735712573', 4, '2003', 'xvii, 790 p. : ill. ; 23cm.', 'DeveloperÃ¢â‚¬â„¢s library', '005.75/85-22 Kor p', 'en', NULL, 3, '005.75/85 22', 'PostgreSQL is the world\'s most advanced open-source database. PostgreSQL is the most comprehensive, in-depth, and easy-to-read guide to this award-winning database. This book starts with a thorough overview of SQL, a description of all PostgreSQL data types, and a complete explanation of PostgreSQL commands.', 'postgresql.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:29:33', '2022-04-05 09:54:17', NULL),
(7, 1, 'Web application architecture : principles, protocols, and practices', NULL, NULL, '0471486566', 5, '2003', 'xi, 357 p. : ill. ; 23 cm.', NULL, '005.7/2-21 Leo w', 'en', NULL, 1, '005.7/2 21', 'An in-depth examination of the core concepts and general principles of Web application development.\r\nThis book uses examples from specific technologies (e.g., servlet API or XSL), without promoting or endorsing particular platforms or APIs. Such knowledge is critical when designing and debugging complex systems. This conceptual understanding makes it easier to learn new APIs that arise in the rapidly changing Internet environment.', 'webapp_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:41:57', '2007-11-29 16:32:46', NULL),
(8, 1, 'Ajax : creating Web pages with asynchronous JavaScript and XML', NULL, NULL, '9780132272674', 6, '2007', 'xxii, 384 p. : ill. ; 24 cm.', 'Bruce PerensÃ¢â‚¬â„¢ Open Source series', '006.7/86-22 Woy a', 'en', NULL, 4, '006.7/86 22', 'Using Ajax, you can build Web applications with the sophistication and usability of traditional desktop applications and you can do it using standards and open source software. Now, for the first time, there\'s an easy, example-driven guide to Ajax for every Web and open source developer, regardless of experience.', 'ajax.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:47:20', '2022-04-05 09:54:17', NULL),
(9, 1, 'The organization of information', NULL, '2nd ed.', '1563089769', 7, '2004', 'xxvii, 417 p. : ill. ; 27 cm.', 'Library and information science text series', '025-22 Tay o', 'en', NULL, 5, '025 22', 'A basic textbook for students of library and information studies, and a guide for practicing school library media specialists. Describes the impact of global forces and the school district on the development and operation of a media center, the technical and human side of management, programmatic activities, supportive services to students, and the quality and quantity of resources available to support programs.', 'organization_information.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:54:12', '2007-11-29 16:27:20', NULL),
(10, 1, 'Library and Information Center Management', NULL, '7th ed.', '9781591584063', 7, '2007', 'xxviii, 492 p. : ill. ; 27 cm.', 'Library and information science text series', '025.1-22 Stu l', 'en', NULL, 5, '025.1 22', NULL, 'library_info_center.JPG', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:58:51', '2007-11-29 16:27:40', NULL),
(11, 1, 'Information Architecture for the World Wide Web: Designing Large-Scale Web Sites', NULL, '2nd ed.', '9780596000356', 2, '2002', '500p.', NULL, '006.7-22 Mor i', 'en', NULL, 6, '006.7 22', 'Information Architecture for the World Wide Web is about applying the principles of architecture and library science to web site design. Each website is like a public building, available for tourists and regulars alike to breeze through at their leisure. The job of the architect is to set up the framework for the site to make it comfortable and inviting for people to visit, relax in, and perhaps even return to someday.', 'information_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:26:14', '2007-11-29 16:32:25', NULL),
(12, 1, 'Corruption and development', NULL, NULL, '9780714649023', 8, '1998', '166 p. : ill. ; 22 cm.', NULL, '364.1 Rob c', 'en', NULL, 7, '364.1/322/091724 21', 'The articles assembled in this volume offer a fresh approach to analysing the problem of corruption in developing countries and the k means to tackle the phenomenon.', 'corruption_development.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:45:30', '2007-11-29 16:20:53', NULL),
(13, 1, 'Corruption and development : the anti-corruption campaigns', NULL, NULL, '0230525504', 9, '2007', '310p.', NULL, '364.1 Bra c', 'en', NULL, 8, '364.1/323091724 22', 'This book provides a multidisciplinary interrogation of the global anti-corruption campaigns of the last ten years, arguing that while some positive change is observable, the period is also replete with perverse consequences and unintended outcomes', 'corruption_development_anti_campaign.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:49:49', '2007-11-29 16:19:48', NULL),
(14, 1, 'Pigs at the trough : how corporate greed and political corruption are undermining America', NULL, NULL, '1400047714', 10, '2003', '275 p. ; 22 cm.', NULL, '364.1323 Huf p', 'en', NULL, 8, '364.1323', NULL, 'pigs_at_trough.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:56:00', '2007-11-29 16:18:33', NULL),
(15, 1, 'Lords of poverty : the power, prestige, and corruption of the international aid business', NULL, NULL, '9780871134691', 11, '1994', 'xvi, 234 p. ; 22 cm.', NULL, '338.9 Han l', 'en', NULL, 8, '338.9/1/091724 20', 'Lords of Poverty is a case study in betrayals of a public trust. The shortcomings of aid are numerous, and serious enough to raise questions about the viability of the practice at its most fundamental levels. Hancocks report is thorough, deeply shocking, and certain to cause critical reevaluation of the governments motives in giving foreign aid, and of the true needs of our intended beneficiaries.', 'lords_of_poverty.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 18:08:13', '2007-11-29 16:13:11', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `NoPanggil` varchar(11) NOT NULL,
  `Judul` varchar(100) NOT NULL,
  `Penulis` varchar(50) NOT NULL,
  `Penerbit` varchar(60) NOT NULL,
  `Tahun` varchar(10) NOT NULL,
  `Deskripsi` varchar(100) NOT NULL,
  `Kategori` int(50) NOT NULL,
  `Rak` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `bukuhilang/rusak`
--

CREATE TABLE `bukuhilang/rusak` (
  `IdRusak` int(11) NOT NULL,
  `IdEx` int(11) NOT NULL,
  `IdDenda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `denda`
--

CREATE TABLE `denda` (
  `IdDenda` int(11) NOT NULL,
  `IdTransakasi` int(11) NOT NULL,
  `Nominal` float NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `exemplar`
--

CREATE TABLE `exemplar` (
  `IdEx` int(11) NOT NULL,
  `NoPanggil` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `item_id` int(11) NOT NULL,
  `biblio_id` int(11) DEFAULT NULL,
  `call_number` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `coll_type_id` int(3) DEFAULT NULL,
  `item_code` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `inventory_code` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `received_date` date DEFAULT NULL,
  `supplier_id` varchar(6) COLLATE utf8_unicode_ci DEFAULT NULL,
  `order_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location_id` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `item_status_id` char(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `site` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `source` int(1) NOT NULL DEFAULT 0,
  `invoice` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `price_currency` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `invoice_date` date DEFAULT NULL,
  `input_date` datetime NOT NULL,
  `last_update` datetime DEFAULT NULL,
  `uid` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item_id`, `biblio_id`, `call_number`, `coll_type_id`, `item_code`, `inventory_code`, `received_date`, `supplier_id`, `order_no`, `location_id`, `order_date`, `item_status_id`, `site`, `source`, `invoice`, `price`, `price_currency`, `invoice_date`, `input_date`, `last_update`, `uid`) VALUES
(1, 8, NULL, 1, 'B00001', 'INV/B00001', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 500000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:10', '2008-12-26 22:14:13', NULL),
(2, 6, NULL, 1, 'B00002', 'INV/B00002', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 700000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:45', '2008-12-26 22:13:45', NULL),
(3, 15, NULL, 1, 'B00003', 'INV/B00003', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 300000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:09', '2008-12-26 22:15:09', NULL),
(4, 14, NULL, 1, 'B00004', 'INV/B00004', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 250000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:49', '2008-12-26 22:15:49', NULL),
(5, 13, NULL, 1, 'B00005', 'INV/B00005', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:17:04', '2008-12-26 22:17:04', NULL),
(6, 12, NULL, 1, 'B00006', 'INV/B00006', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 350000, 'Rupiah', '0000-00-00', '2008-12-26 22:17:52', '2008-12-26 22:17:52', NULL),
(7, 4, NULL, 1, 'B00007', 'INV/B00007', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 450000, 'Rupiah', '0000-00-00', '2008-12-26 22:18:29', '2008-12-26 22:18:29', NULL),
(8, 4, NULL, 1, 'B00008', 'INV/B00008', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:18:51', '2008-12-26 22:18:51', NULL),
(9, 2, NULL, 1, 'B00009', 'INV/B00009', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:28', '2008-12-26 22:19:28', NULL),
(10, 2, NULL, 1, 'B00010', 'INV/B00010', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:57', '2008-12-26 22:19:57', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `jurusan`
--

CREATE TABLE `jurusan` (
  `IdJurusan` varchar(10) NOT NULL,
  `Jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `IdKelas` int(11) NOT NULL,
  `Kelas` varchar(10) NOT NULL,
  `IdJurusan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mst_gmd`
--

CREATE TABLE `mst_gmd` (
  `gmd_id` int(11) NOT NULL,
  `gmd_code` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gmd_name` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `icon_image` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `input_date` date NOT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `mst_gmd`
--

INSERT INTO `mst_gmd` (`gmd_id`, `gmd_code`, `gmd_name`, `icon_image`, `input_date`, `last_update`) VALUES
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
-- Table structure for table `mst_publisher`
--

CREATE TABLE `mst_publisher` (
  `publisher_id` int(11) NOT NULL,
  `publisher_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date DEFAULT NULL,
  `last_update` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
(11, 'Atlantic Monthly Press', '2007-11-29', '2007-11-29');

-- --------------------------------------------------------

--
-- Table structure for table `pengunjung`
--

CREATE TABLE `pengunjung` (
  `IdPengunjung` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Instansi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `Nik` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Email` varchar(60) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `NoHp` int(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `IdTransaksi` int(11) NOT NULL,
  `IdEx` int(11) NOT NULL,
  `Nis` int(11) NOT NULL,
  `TanggalPinjam` date NOT NULL,
  `Tenggat` date NOT NULL,
  `TanggalKembali` date NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Keterangan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `IdUser` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Nis/K` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`Nis`);

--
-- Indexes for table `biblio`
--
ALTER TABLE `biblio`
  ADD PRIMARY KEY (`biblio_id`),
  ADD KEY `references_idx` (`gmd_id`,`publisher_id`,`language_id`,`publish_place_id`),
  ADD KEY `classification` (`classification`),
  ADD KEY `biblio_flag_idx` (`opac_hide`,`promoted`),
  ADD KEY `rda_idx` (`content_type_id`,`media_type_id`,`carrier_type_id`),
  ADD KEY `uid` (`uid`);
ALTER TABLE `biblio` ADD FULLTEXT KEY `title_ft_idx` (`title`,`series_title`);
ALTER TABLE `biblio` ADD FULLTEXT KEY `notes_ft_idx` (`notes`);
ALTER TABLE `biblio` ADD FULLTEXT KEY `labels` (`labels`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`NoPanggil`);

--
-- Indexes for table `bukuhilang/rusak`
--
ALTER TABLE `bukuhilang/rusak`
  ADD PRIMARY KEY (`IdRusak`);

--
-- Indexes for table `denda`
--
ALTER TABLE `denda`
  ADD PRIMARY KEY (`IdDenda`);

--
-- Indexes for table `exemplar`
--
ALTER TABLE `exemplar`
  ADD PRIMARY KEY (`IdEx`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_id`),
  ADD UNIQUE KEY `item_code` (`item_code`),
  ADD KEY `uid` (`uid`),
  ADD KEY `item_references_idx` (`coll_type_id`,`location_id`,`item_status_id`),
  ADD KEY `biblio_id_idx` (`biblio_id`);

--
-- Indexes for table `jurusan`
--
ALTER TABLE `jurusan`
  ADD PRIMARY KEY (`IdJurusan`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`IdKelas`);

--
-- Indexes for table `mst_gmd`
--
ALTER TABLE `mst_gmd`
  ADD PRIMARY KEY (`gmd_id`),
  ADD UNIQUE KEY `gmd_name` (`gmd_name`),
  ADD UNIQUE KEY `gmd_code` (`gmd_code`);

--
-- Indexes for table `mst_publisher`
--
ALTER TABLE `mst_publisher`
  ADD PRIMARY KEY (`publisher_id`),
  ADD UNIQUE KEY `publisher_name` (`publisher_name`);

--
-- Indexes for table `pengunjung`
--
ALTER TABLE `pengunjung`
  ADD PRIMARY KEY (`IdPengunjung`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`Nik`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`IdTransaksi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`IdUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biblio`
--
ALTER TABLE `biblio`
  MODIFY `biblio_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `mst_gmd`
--
ALTER TABLE `mst_gmd`
  MODIFY `gmd_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `mst_publisher`
--
ALTER TABLE `mst_publisher`
  MODIFY `publisher_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
