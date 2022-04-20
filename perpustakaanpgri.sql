/*
 Navicat Premium Data Transfer

 Source Server         : Database
 Source Server Type    : MySQL
 Source Server Version : 100138
 Source Host           : localhost:3306
 Source Schema         : perpustakaanpgri

 Target Server Type    : MySQL
 Target Server Version : 100138
 File Encoding         : 65001

 Date: 20/04/2022 14:44:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for anggota
-- ----------------------------
DROP TABLE IF EXISTS `anggota`;
CREATE TABLE `anggota`  (
  `Nis` int(11) NOT NULL,
  `Nama` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `IdKelas` int(11) NOT NULL,
  `Email` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Alamat` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `NoHp` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `TTL` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Expired` date NULL DEFAULT NULL,
  PRIMARY KEY (`Nis`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of anggota
-- ----------------------------
INSERT INTO `anggota` VALUES (99281, 'Dera', 1, 'masterblad213@gmail.com', 'Jakarta', '0821295332112', 'Sukabumi, 12 Oktober 1999', '2023-04-19');
INSERT INTO `anggota` VALUES (99282, 'Radika', 2, 'radika@gmail.com', 'Jakarta', '0821223221', 'Jakarta, 20 April 2022', '2023-04-20');
INSERT INTO `anggota` VALUES (99283, 'Yos', 3, 'yos@gmail.com', 'Jakarta', '08212231122', 'Jakarta, 20 April 2022', '2022-04-21');

-- ----------------------------
-- Table structure for biblio
-- ----------------------------
DROP TABLE IF EXISTS `biblio`;
CREATE TABLE `biblio`  (
  `biblio_id` int(11) NOT NULL AUTO_INCREMENT,
  `gmd_id` int(3) NULL DEFAULT NULL,
  `title` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sor` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `edition` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `isbn_issn` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `publisher_id` int(11) NULL DEFAULT NULL,
  `publish_year` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `collation` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `series_title` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `call_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `language_id` char(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT 'en',
  `source` varchar(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `publish_place_id` int(11) NULL DEFAULT NULL,
  `classification` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `notes` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `image` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `file_att` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `opac_hide` smallint(1) NULL DEFAULT 0,
  `promoted` smallint(1) NULL DEFAULT 0,
  `labels` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `frequency_id` int(11) NOT NULL DEFAULT 0,
  `spec_detail_info` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `content_type_id` int(11) NULL DEFAULT NULL,
  `media_type_id` int(11) NULL DEFAULT NULL,
  `carrier_type_id` int(11) NULL DEFAULT NULL,
  `input_date` datetime(0) NULL DEFAULT NULL,
  `last_update` datetime(0) NULL DEFAULT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`biblio_id`) USING BTREE,
  INDEX `references_idx`(`gmd_id`, `publisher_id`, `language_id`, `publish_place_id`) USING BTREE,
  INDEX `classification`(`classification`) USING BTREE,
  INDEX `biblio_flag_idx`(`opac_hide`, `promoted`) USING BTREE,
  INDEX `rda_idx`(`content_type_id`, `media_type_id`, `carrier_type_id`) USING BTREE,
  INDEX `uid`(`uid`) USING BTREE,
  FULLTEXT INDEX `title_ft_idx`(`title`, `series_title`),
  FULLTEXT INDEX `notes_ft_idx`(`notes`),
  FULLTEXT INDEX `labels`(`labels`)
) ENGINE = MyISAM AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of biblio
-- ----------------------------
INSERT INTO `biblio` VALUES (1, 1, 'PHP 5 for dummies', NULL, NULL, '0764541668', 1, '2004', 'xiv, 392 p. : ill. ; 24 cm.', 'For dummies', '005.13/3-22 Jan p', 'en', NULL, 1, '005.13/3 22', NULL, 'php5_dummies.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:36:50', '2007-11-29 16:26:59', NULL);
INSERT INTO `biblio` VALUES (2, 1, 'Linux In a Nutshell', NULL, 'Fifth Edition', '9780596009304', 2, '2005', 'xiv, 925 p. : ill. ; 23 cm.', 'In a Nutshell', '005.4/32-22 Ell l', 'en', NULL, 2, '005.4/32 22', NULL, 'linux_in_a_nutshell.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:53:35', '2007-11-29 16:26:10', NULL);
INSERT INTO `biblio` VALUES (3, 1, 'The Definitive Guide to MySQL 5', NULL, NULL, '9781590595350', 3, '2005', '784p.', 'Definitive Guide Series', '005.75/85-22 Kof d', 'en', NULL, NULL, '005.75/85 22', NULL, 'mysql_def_guide.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:01:08', '2007-11-29 16:26:33', NULL);
INSERT INTO `biblio` VALUES (4, 1, 'Cathedral and the Bazaar: Musings on Linux and Open Source by an Accidental Revolutionary', NULL, NULL, '0-596-00108-8', 2, '2001', '208p.', NULL, '005.4/3222 Ray c', 'en', NULL, 2, '005.4/32 22', 'The Cathedral & the Bazaar is a must for anyone who cares about the future of the computer industry or the dynamics of the information economy. This revised and expanded paperback edition includes new material on open source developments in 1999 and 2000. Raymond\'s clear and effective writing style accurately describing the benefits of open source software has been key to its success. (Source: http://safari.oreilly.com/0596001088)', 'cathedral_bazaar.jpg', 'cathedral-bazaar.pdf', 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:14:44', '2007-11-29 16:25:43', NULL);
INSERT INTO `biblio` VALUES (5, 1, 'Producing open source software : how to run a successful free software project', NULL, '1st ed.', '9780596007591', 2, '2005', 'xx, 279 p. ; 24 cm.', NULL, '005.1-22 Fog p', 'en', NULL, 2, '005.1 22', 'Includes index.', 'producing_oss.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:20:45', '2007-11-29 16:31:21', NULL);
INSERT INTO `biblio` VALUES (6, 1, 'PostgreSQL : a comprehensive guide to building, programming, and administering PostgreSQL databases', NULL, '1st ed.', '0735712573', 4, '2003', 'xvii, 790 p. : ill. ; 23cm.', 'DeveloperÃ¢â‚¬â„¢s library', '005.75/85-22 Kor p', 'en', NULL, 3, '005.75/85 22', 'PostgreSQL is the world\'s most advanced open-source database. PostgreSQL is the most comprehensive, in-depth, and easy-to-read guide to this award-winning database. This book starts with a thorough overview of SQL, a description of all PostgreSQL data types, and a complete explanation of PostgreSQL commands.', 'postgresql.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:29:33', '2022-04-05 09:54:17', NULL);
INSERT INTO `biblio` VALUES (7, 1, 'Web application architecture : principles, protocols, and practices', NULL, NULL, '0471486566', 5, '2003', 'xi, 357 p. : ill. ; 23 cm.', NULL, '005.7/2-21 Leo w', 'en', NULL, 1, '005.7/2 21', 'An in-depth examination of the core concepts and general principles of Web application development.\r\nThis book uses examples from specific technologies (e.g., servlet API or XSL), without promoting or endorsing particular platforms or APIs. Such knowledge is critical when designing and debugging complex systems. This conceptual understanding makes it easier to learn new APIs that arise in the rapidly changing Internet environment.', 'webapp_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:41:57', '2007-11-29 16:32:46', NULL);
INSERT INTO `biblio` VALUES (8, 1, 'Ajax : creating Web pages with asynchronous JavaScript and XML', NULL, NULL, '9780132272674', 6, '2007', 'xxii, 384 p. : ill. ; 24 cm.', 'Bruce PerensÃ¢â‚¬â„¢ Open Source series', '006.7/86-22 Woy a', 'en', NULL, 4, '006.7/86 22', 'Using Ajax, you can build Web applications with the sophistication and usability of traditional desktop applications and you can do it using standards and open source software. Now, for the first time, there\'s an easy, example-driven guide to Ajax for every Web and open source developer, regardless of experience.', 'ajax.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:47:20', '2022-04-05 09:54:17', NULL);
INSERT INTO `biblio` VALUES (9, 1, 'The organization of information', NULL, '2nd ed.', '1563089769', 7, '2004', 'xxvii, 417 p. : ill. ; 27 cm.', 'Library and information science text series', '025-22 Tay o', 'en', NULL, 5, '025 22', 'A basic textbook for students of library and information studies, and a guide for practicing school library media specialists. Describes the impact of global forces and the school district on the development and operation of a media center, the technical and human side of management, programmatic activities, supportive services to students, and the quality and quantity of resources available to support programs.', 'organization_information.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:54:12', '2007-11-29 16:27:20', NULL);
INSERT INTO `biblio` VALUES (10, 1, 'Library and Information Center Management', NULL, '7th ed.', '9781591584063', 7, '2007', 'xxviii, 492 p. : ill. ; 27 cm.', 'Library and information science text series', '025.1-22 Stu l', 'en', NULL, 5, '025.1 22', NULL, 'library_info_center.JPG', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:58:51', '2007-11-29 16:27:40', NULL);
INSERT INTO `biblio` VALUES (11, 1, 'Information Architecture for the World Wide Web: Designing Large-Scale Web Sites', NULL, '2nd ed.', '9780596000356', 2, '2002', '500p.', NULL, '006.7-22 Mor i', 'en', NULL, 6, '006.7 22', 'Information Architecture for the World Wide Web is about applying the principles of architecture and library science to web site design. Each website is like a public building, available for tourists and regulars alike to breeze through at their leisure. The job of the architect is to set up the framework for the site to make it comfortable and inviting for people to visit, relax in, and perhaps even return to someday.', 'information_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:26:14', '2007-11-29 16:32:25', NULL);
INSERT INTO `biblio` VALUES (12, 1, 'Corruption and development', NULL, NULL, '9780714649023', 8, '1998', '166 p. : ill. ; 22 cm.', NULL, '364.1 Rob c', 'en', NULL, 7, '364.1/322/091724 21', 'The articles assembled in this volume offer a fresh approach to analysing the problem of corruption in developing countries and the k means to tackle the phenomenon.', 'corruption_development.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:45:30', '2007-11-29 16:20:53', NULL);
INSERT INTO `biblio` VALUES (13, 1, 'Corruption and development : the anti-corruption campaigns', NULL, NULL, '0230525504', 9, '2007', '310p.', NULL, '364.1 Bra c', 'en', NULL, 8, '364.1/323091724 22', 'This book provides a multidisciplinary interrogation of the global anti-corruption campaigns of the last ten years, arguing that while some positive change is observable, the period is also replete with perverse consequences and unintended outcomes', 'corruption_development_anti_campaign.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:49:49', '2007-11-29 16:19:48', NULL);
INSERT INTO `biblio` VALUES (14, 1, 'Pigs at the trough : how corporate greed and political corruption are undermining America', NULL, NULL, '1400047714', 10, '2003', '275 p. ; 22 cm.', NULL, '364.1323 Huf p', 'en', NULL, 8, '364.1323', NULL, 'pigs_at_trough.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:56:00', '2007-11-29 16:18:33', NULL);
INSERT INTO `biblio` VALUES (15, 1, 'Lords of poverty : the power, prestige, and corruption of the international aid business', NULL, NULL, '9780871134691', 11, '1994', 'xvi, 234 p. ; 22 cm.', NULL, '338.9 Han l', 'en', NULL, 8, '338.9/1/091724 20', 'Lords of Poverty is a case study in betrayals of a public trust. The shortcomings of aid are numerous, and serious enough to raise questions about the viability of the practice at its most fundamental levels. Hancocks report is thorough, deeply shocking, and certain to cause critical reevaluation of the governments motives in giving foreign aid, and of the true needs of our intended beneficiaries.', 'lords_of_poverty.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 18:08:13', '2007-11-29 16:13:11', NULL);

-- ----------------------------
-- Table structure for bukuhilang/rusak
-- ----------------------------
DROP TABLE IF EXISTS `bukuhilang/rusak`;
CREATE TABLE `bukuhilang/rusak`  (
  `IdRusak` int(11) NOT NULL,
  `IdEx` int(11) NOT NULL,
  `IdDenda` int(11) NOT NULL,
  PRIMARY KEY (`IdRusak`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for denda
-- ----------------------------
DROP TABLE IF EXISTS `denda`;
CREATE TABLE `denda`  (
  `IdDenda` int(11) NOT NULL,
  `IdTransakasi` int(11) NOT NULL,
  `Nominal` float NOT NULL,
  `Status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`IdDenda`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `biblio_id` int(11) NULL DEFAULT NULL,
  `call_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `coll_type_id` int(3) NULL DEFAULT NULL,
  `item_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `inventory_code` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `received_date` date NULL DEFAULT NULL,
  `supplier_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `order_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `location_id` varchar(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `order_date` date NULL DEFAULT NULL,
  `item_status_id` char(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `site` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `source` int(1) NOT NULL DEFAULT 0,
  `invoice` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `price` int(11) NULL DEFAULT NULL,
  `price_currency` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `invoice_date` date NULL DEFAULT NULL,
  `input_date` datetime(0) NOT NULL,
  `last_update` datetime(0) NULL DEFAULT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`item_id`) USING BTREE,
  UNIQUE INDEX `item_code`(`item_code`) USING BTREE,
  INDEX `uid`(`uid`) USING BTREE,
  INDEX `item_references_idx`(`coll_type_id`, `location_id`, `item_status_id`) USING BTREE,
  INDEX `biblio_id_idx`(`biblio_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES (1, 8, NULL, 1, 'B00001', 'INV/B00001', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 500000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:10', '2008-12-26 22:14:13', NULL);
INSERT INTO `item` VALUES (2, 6, NULL, 1, 'B00002', 'INV/B00002', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 700000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:45', '2008-12-26 22:13:45', NULL);
INSERT INTO `item` VALUES (3, 15, NULL, 1, 'B00003', 'INV/B00003', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 300000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:09', '2008-12-26 22:15:09', NULL);
INSERT INTO `item` VALUES (4, 14, NULL, 1, 'B00004', 'INV/B00004', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 250000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:49', '2008-12-26 22:15:49', NULL);
INSERT INTO `item` VALUES (5, 13, NULL, 1, 'B00005', 'INV/B00005', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:17:04', '2008-12-26 22:17:04', NULL);
INSERT INTO `item` VALUES (6, 12, NULL, 1, 'B00006', 'INV/B00006', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 350000, 'Rupiah', '0000-00-00', '2008-12-26 22:17:52', '2008-12-26 22:17:52', NULL);
INSERT INTO `item` VALUES (7, 4, NULL, 1, 'B00007', 'INV/B00007', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 450000, 'Rupiah', '0000-00-00', '2008-12-26 22:18:29', '2008-12-26 22:18:29', NULL);
INSERT INTO `item` VALUES (8, 4, NULL, 1, 'B00008', 'INV/B00008', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:18:51', '2008-12-26 22:18:51', NULL);
INSERT INTO `item` VALUES (9, 2, NULL, 1, 'B00009', 'INV/B00009', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:28', '2008-12-26 22:19:28', NULL);
INSERT INTO `item` VALUES (10, 2, NULL, 1, 'B00010', 'INV/B00010', '0000-00-00', '0', '', 'SL', '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:57', '2008-12-26 22:19:57', NULL);

-- ----------------------------
-- Table structure for jurusan
-- ----------------------------
DROP TABLE IF EXISTS `jurusan`;
CREATE TABLE `jurusan`  (
  `IdJurusan` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Jurusan` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`IdJurusan`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of jurusan
-- ----------------------------
INSERT INTO `jurusan` VALUES ('MM', 'Multimedia');

-- ----------------------------
-- Table structure for kelas
-- ----------------------------
DROP TABLE IF EXISTS `kelas`;
CREATE TABLE `kelas`  (
  `IdKelas` int(11) NOT NULL,
  `TingkatKelas` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `IdJurusan` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Kelas` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`IdKelas`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of kelas
-- ----------------------------
INSERT INTO `kelas` VALUES (1, 'X', 'MM', '1');
INSERT INTO `kelas` VALUES (2, 'X', 'MM', '2');
INSERT INTO `kelas` VALUES (3, 'XII', 'MM', '3');

-- ----------------------------
-- Table structure for mst_gmd
-- ----------------------------
DROP TABLE IF EXISTS `mst_gmd`;
CREATE TABLE `mst_gmd`  (
  `gmd_id` int(11) NOT NULL AUTO_INCREMENT,
  `gmd_code` varchar(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `gmd_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `icon_image` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `input_date` date NOT NULL,
  `last_update` date NULL DEFAULT NULL,
  PRIMARY KEY (`gmd_id`) USING BTREE,
  UNIQUE INDEX `gmd_name`(`gmd_name`) USING BTREE,
  UNIQUE INDEX `gmd_code`(`gmd_code`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 32 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mst_gmd
-- ----------------------------
INSERT INTO `mst_gmd` VALUES (1, 'TE', 'Text', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (2, 'AR', 'Art Original', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (3, 'CH', 'Chart', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (4, 'CO', 'Computer Software', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (5, 'DI', 'Diorama', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (6, 'FI', 'Filmstrip', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (7, 'FL', 'Flash Card', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (8, 'GA', 'Game', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (9, 'GL', 'Globe', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (10, 'KI', 'Kit', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (11, 'MA', 'Map', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (12, 'MI', 'Microform', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (13, 'MN', 'Manuscript', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (14, 'MO', 'Model', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (15, 'MP', 'Motion Picture', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (16, 'MS', 'Microscope Slide', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (17, 'MU', 'Music', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (18, 'PI', 'Picture', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (19, 'RE', 'Realia', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (20, 'SL', 'Slide', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (21, 'SO', 'Sound Recording', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (22, 'TD', 'Technical Drawing', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (23, 'TR', 'Transparency', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (24, 'VI', 'Video Recording', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (25, 'EQ', 'Equipment', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (26, 'CF', 'Computer File', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (27, 'CA', 'Cartographic Material', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (28, 'CD', 'CD-ROM', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (29, 'MV', 'Multimedia', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (30, 'ER', 'Electronic Resource', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `mst_gmd` VALUES (31, 'DVD', 'Digital Versatile Disc', NULL, '2022-04-05', '2022-04-05');

-- ----------------------------
-- Table structure for mst_publisher
-- ----------------------------
DROP TABLE IF EXISTS `mst_publisher`;
CREATE TABLE `mst_publisher`  (
  `publisher_id` int(11) NOT NULL AUTO_INCREMENT,
  `publisher_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date NULL DEFAULT NULL,
  `last_update` date NULL DEFAULT NULL,
  PRIMARY KEY (`publisher_id`) USING BTREE,
  UNIQUE INDEX `publisher_name`(`publisher_name`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mst_publisher
-- ----------------------------
INSERT INTO `mst_publisher` VALUES (1, 'Wiley', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (2, 'OReilly', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (3, 'Apress', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (4, 'Sams', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (5, 'John Wiley', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (6, 'Prentice Hall', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (7, 'Libraries Unlimited', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (8, 'Taylor & Francis Inc.', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (9, 'Palgrave Macmillan', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (10, 'Crown publishers', '2007-11-29', '2007-11-29');
INSERT INTO `mst_publisher` VALUES (11, 'Atlantic Monthly Press', '2007-11-29', '2007-11-29');

-- ----------------------------
-- Table structure for pengunjung
-- ----------------------------
DROP TABLE IF EXISTS `pengunjung`;
CREATE TABLE `pengunjung`  (
  `IdPengunjung` int(11) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Email` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Instansi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `TanggalKunjungan` datetime(0) NOT NULL,
  PRIMARY KEY (`IdPengunjung`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of pengunjung
-- ----------------------------
INSERT INTO `pengunjung` VALUES (1, 'Atthoriq', 'thoriqaziz.muhammad@gmail.com', 'unindrag', '2022-04-20 13:35:00');
INSERT INTO `pengunjung` VALUES (2, 'Yos', 'yos@gmail.com', 'Siswa', '2022-04-20 13:35:31');
INSERT INTO `pengunjung` VALUES (3, 'Dera', 'masterblad213@gmail.com', 'Siswa', '2022-04-20 14:43:32');

-- ----------------------------
-- Table structure for petugas
-- ----------------------------
DROP TABLE IF EXISTS `petugas`;
CREATE TABLE `petugas`  (
  `Nik` int(11) NOT NULL,
  `Nama` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Email` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Alamat` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `NoHp` int(14) NOT NULL,
  PRIMARY KEY (`Nik`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for transaksi
-- ----------------------------
DROP TABLE IF EXISTS `transaksi`;
CREATE TABLE `transaksi`  (
  `IdTransaksi` int(11) NOT NULL,
  `IdEx` int(11) NOT NULL,
  `Nis` int(11) NOT NULL,
  `TanggalPinjam` date NOT NULL,
  `Tenggat` date NOT NULL,
  `TanggalKembali` date NOT NULL,
  `Status` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Keterangan` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`IdTransaksi`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Nis` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Nis/K` int(11) NOT NULL DEFAULT 3,
  PRIMARY KEY (`Nis`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 99284 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Admin', 'Admin', 1);
INSERT INTO `user` VALUES (2, 'Petugas', 'Petugas', 2);
INSERT INTO `user` VALUES (99281, 'dera', 'getamped', 3);
INSERT INTO `user` VALUES (99282, 'radika', 'radika', 3);
INSERT INTO `user` VALUES (99283, 'yos', 'yos', 3);

SET FOREIGN_KEY_CHECKS = 1;