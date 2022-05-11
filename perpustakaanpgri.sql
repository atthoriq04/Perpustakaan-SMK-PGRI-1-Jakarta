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

 Date: 11/05/2022 15:16:11
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
INSERT INTO `anggota` VALUES (99282, 'Radika', 1, 'radika@gmail.com', 'Jakarta', '0821223221', 'Jakarta, 20 April 2022', '2023-04-20');
INSERT INTO `anggota` VALUES (99283, 'Yos', 3, 'yos@gmail.com', 'Jakarta', '08212231122', 'Jakarta, 20 April 2022', '2022-04-21');
INSERT INTO `anggota` VALUES (993212, 'Dera Abdul Gani', 0, 'Alamat@email.Siswa', 'Bekasi		', '000088889999', '12 Oktober 1999', '2023-05-11');

-- ----------------------------
-- Table structure for biblio
-- ----------------------------
DROP TABLE IF EXISTS `biblio`;
CREATE TABLE `biblio`  (
  `biblio_id` int(11) NOT NULL AUTO_INCREMENT,
  `gmd_id` int(11) NULL DEFAULT NULL,
  `title` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
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
  `opac_hide` smallint(6) NULL DEFAULT 0,
  `promoted` smallint(6) NULL DEFAULT 0,
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
INSERT INTO `biblio` VALUES (1, 1, 'PHP 5 for dummies', NULL, '0764541668', 1, '2004', 'xiv, 392 p. : ill. ; 24 cm.', 'For dummies', '005.13/3-22 Jan p', 'en', NULL, 1, '005.13/3 22', NULL, 'php5_dummies.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:36:50', '2007-11-29 16:26:59', NULL);
INSERT INTO `biblio` VALUES (2, 1, 'Linux In a Nutshell', 'Fifth Edition', '9780596009304', 2, '2005', 'xiv, 925 p. : ill. ; 23 cm.', 'In a Nutshell', '005.4/32-22 Ell l', 'en', NULL, 2, '005.4/32 22', NULL, 'linux_in_a_nutshell.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 15:53:35', '2007-11-29 16:26:10', NULL);
INSERT INTO `biblio` VALUES (3, 1, 'The Definitive Guide to MySQL 5', NULL, '9781590595350', 3, '2005', '784p.', 'Definitive Guide Series', '005.75/85-22 Kof d', 'en', NULL, NULL, '005.75/85 22', NULL, 'mysql_def_guide.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:01:08', '2007-11-29 16:26:33', NULL);
INSERT INTO `biblio` VALUES (4, 1, 'Cathedral and the Bazaar: Musings on Linux and Open Source by an Accidental Revolutionary', NULL, '0-596-00108-8', 2, '2001', '208p.', NULL, '005.4/3222 Ray c', 'en', NULL, 2, '005.4/32 22', 'The Cathedral & the Bazaar is a must for anyone who cares about the future of the computer industry or the dynamics of the information economy. This revised and expanded paperback edition includes new material on open source developments in 1999 and 2000. Raymond\'s clear and effective writing style accurately describing the benefits of open source software has been key to its success. (Source: http://safari.oreilly.com/0596001088)', 'cathedral_bazaar.jpg', 'cathedral-bazaar.pdf', 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:14:44', '2007-11-29 16:25:43', NULL);
INSERT INTO `biblio` VALUES (5, 1, 'Producing open source software : how to run a successful free software project', '1st ed.', '9780596007591', 2, '2005', 'xx, 279 p. ; 24 cm.', NULL, '005.1-22 Fog p', 'en', NULL, 2, '005.1 22', 'Includes index.', 'producing_oss.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:20:45', '2007-11-29 16:31:21', NULL);
INSERT INTO `biblio` VALUES (6, 1, 'PostgreSQL : a comprehensive guide to building, programming, and administering PostgreSQL databases', '1st ed.', '0735712573', 4, '2003', 'xvii, 790 p. : ill. ; 23cm.', 'DeveloperÃ¢â‚¬â„¢s library', '005.75/85-22 Kor p', 'en', NULL, 3, '005.75/85 22', 'PostgreSQL is the world\'s most advanced open-source database. PostgreSQL is the most comprehensive, in-depth, and easy-to-read guide to this award-winning database. This book starts with a thorough overview of SQL, a description of all PostgreSQL data types, and a complete explanation of PostgreSQL commands.', 'postgresql.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:29:33', '2022-04-05 09:54:17', NULL);
INSERT INTO `biblio` VALUES (7, 1, 'Web application architecture : principles, protocols, and practices', NULL, '0471486566', 5, '2003', 'xi, 357 p. : ill. ; 23 cm.', NULL, '005.7/2-21 Leo w', 'en', NULL, 1, '005.7/2 21', 'An in-depth examination of the core concepts and general principles of Web application development.\r\nThis book uses examples from specific technologies (e.g., servlet API or XSL), without promoting or endorsing particular platforms or APIs. Such knowledge is critical when designing and debugging complex systems. This conceptual understanding makes it easier to learn new APIs that arise in the rapidly changing Internet environment.', 'webapp_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:41:57', '2007-11-29 16:32:46', NULL);
INSERT INTO `biblio` VALUES (8, 1, 'Ajax : creating Web pages with asynchronous JavaScript and XML', NULL, '9780132272674', 6, '2007', 'xxii, 384 p. : ill. ; 24 cm.', 'Bruce PerensÃ¢â‚¬â„¢ Open Source series', '006.7/86-22 Woy a', 'en', NULL, 4, '006.7/86 22', 'Using Ajax, you can build Web applications with the sophistication and usability of traditional desktop applications and you can do it using standards and open source software. Now, for the first time, there\'s an easy, example-driven guide to Ajax for every Web and open source developer, regardless of experience.', 'ajax.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:47:20', '2022-04-05 09:54:17', NULL);
INSERT INTO `biblio` VALUES (9, 1, 'The organization of information', '2nd ed.', '1563089769', 7, '2004', 'xxvii, 417 p. : ill. ; 27 cm.', 'Library and information science text series', '025-22 Tay o', 'en', NULL, 5, '025 22', 'A basic textbook for students of library and information studies, and a guide for practicing school library media specialists. Describes the impact of global forces and the school district on the development and operation of a media center, the technical and human side of management, programmatic activities, supportive services to students, and the quality and quantity of resources available to support programs.', 'organization_information.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:54:12', '2007-11-29 16:27:20', NULL);
INSERT INTO `biblio` VALUES (10, 1, 'Library and Information Center Management', '7th ed.', '9781591584063', 7, '2007', 'xxviii, 492 p. : ill. ; 27 cm.', 'Library and information science text series', '025.1-22 Stu l', 'en', NULL, 5, '025.1 22', NULL, 'library_info_center.JPG', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 16:58:51', '2007-11-29 16:27:40', NULL);
INSERT INTO `biblio` VALUES (11, 1, 'Information Architecture for the World Wide Web: Designing Large-Scale Web Sites', '2nd ed.', '9780596000356', 2, '2002', '500p.', NULL, '006.7-22 Mor i', 'en', NULL, 6, '006.7 22', 'Information Architecture for the World Wide Web is about applying the principles of architecture and library science to web site design. Each website is like a public building, available for tourists and regulars alike to breeze through at their leisure. The job of the architect is to set up the framework for the site to make it comfortable and inviting for people to visit, relax in, and perhaps even return to someday.', 'information_arch.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:26:14', '2007-11-29 16:32:25', NULL);
INSERT INTO `biblio` VALUES (12, 1, 'Corruption and development', NULL, '9780714649023', 8, '1998', '166 p. : ill. ; 22 cm.', NULL, '364.1 Rob c', 'en', NULL, 7, '364.1/322/091724 21', 'The articles assembled in this volume offer a fresh approach to analysing the problem of corruption in developing countries and the k means to tackle the phenomenon.', 'corruption_development.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:45:30', '2007-11-29 16:20:53', NULL);
INSERT INTO `biblio` VALUES (13, 1, 'Corruption and development : the anti-corruption campaigns', NULL, '0230525504', 9, '2007', '310p.', NULL, '364.1 Bra c', 'en', NULL, 8, '364.1/323091724 22', 'This book provides a multidisciplinary interrogation of the global anti-corruption campaigns of the last ten years, arguing that while some positive change is observable, the period is also replete with perverse consequences and unintended outcomes', 'corruption_development_anti_campaign.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:49:49', '2007-11-29 16:19:48', NULL);
INSERT INTO `biblio` VALUES (14, 1, 'Pigs at the trough : how corporate greed and political corruption are undermining America', NULL, '1400047714', 10, '2003', '275 p. ; 22 cm.', NULL, '364.1323 Huf p', 'en', NULL, 8, '364.1323', NULL, 'pigs_at_trough.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 17:56:00', '2007-11-29 16:18:33', NULL);
INSERT INTO `biblio` VALUES (15, 1, 'Lords of poverty : the power, prestige, and corruption of the international aid business', NULL, '9780871134691', 11, '1994', 'xvi, 234 p. ; 22 cm.', NULL, '338.9 Han l', 'en', NULL, 8, '338.9/1/091724 20', 'Lords of Poverty is a case study in betrayals of a public trust. The shortcomings of aid are numerous, and serious enough to raise questions about the viability of the practice at its most fundamental levels. Hancocks report is thorough, deeply shocking, and certain to cause critical reevaluation of the governments motives in giving foreign aid, and of the true needs of our intended beneficiaries.', 'lords_of_poverty.jpg', NULL, 0, 0, NULL, 0, NULL, NULL, NULL, NULL, '2007-11-29 18:08:13', '2007-11-29 16:13:11', NULL);

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
-- Table structure for gmd
-- ----------------------------
DROP TABLE IF EXISTS `gmd`;
CREATE TABLE `gmd`  (
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
-- Records of gmd
-- ----------------------------
INSERT INTO `gmd` VALUES (1, 'TE', 'Text', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (2, 'AR', 'Art Original', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (3, 'CH', 'Chart', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (4, 'CO', 'Computer Software', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (5, 'DI', 'Diorama', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (6, 'FI', 'Filmstrip', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (7, 'FL', 'Flash Card', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (8, 'GA', 'Game', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (9, 'GL', 'Globe', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (10, 'KI', 'Kit', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (11, 'MA', 'Map', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (12, 'MI', 'Microform', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (13, 'MN', 'Manuscript', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (14, 'MO', 'Model', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (15, 'MP', 'Motion Picture', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (16, 'MS', 'Microscope Slide', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (17, 'MU', 'Music', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (18, 'PI', 'Picture', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (19, 'RE', 'Realia', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (20, 'SL', 'Slide', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (21, 'SO', 'Sound Recording', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (22, 'TD', 'Technical Drawing', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (23, 'TR', 'Transparency', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (24, 'VI', 'Video Recording', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (25, 'EQ', 'Equipment', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (26, 'CF', 'Computer File', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (27, 'CA', 'Cartographic Material', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (28, 'CD', 'CD-ROM', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (29, 'MV', 'Multimedia', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (30, 'ER', 'Electronic Resource', NULL, '2022-04-05', '2022-04-05');
INSERT INTO `gmd` VALUES (31, 'DVD', 'Digital Versatile Disc', NULL, '2022-04-05', '2022-04-05');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `biblio_id` int(11) NULL DEFAULT NULL,
  `call_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `coll_type_id` int(11) NULL DEFAULT NULL,
  `item_code` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `inventory_code` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `received_date` date NULL DEFAULT NULL,
  `supplier_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `order_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `location_id` int(3) NULL DEFAULT NULL,
  `order_date` date NULL DEFAULT NULL,
  `item_status_id` char(3) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `site` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `source` int(11) NOT NULL DEFAULT 0,
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
) ENGINE = MyISAM AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES (1, 8, NULL, 1, 'B00001', 'INV/B00001', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 500000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:10', '2008-12-26 22:14:13', NULL);
INSERT INTO `item` VALUES (2, 6, NULL, 1, 'B00002', 'INV/B00002', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 700000, 'Rupiah', '0000-00-00', '2008-12-26 22:11:45', '2008-12-26 22:13:45', NULL);
INSERT INTO `item` VALUES (3, 15, NULL, 1, 'B00003', 'INV/B00003', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 300000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:09', '2008-12-26 22:15:09', NULL);
INSERT INTO `item` VALUES (4, 14, NULL, 1, 'B00004', 'INV/B00004', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 250000, 'Rupiah', '0000-00-00', '2008-12-26 22:15:49', '2008-12-26 22:15:49', NULL);
INSERT INTO `item` VALUES (5, 13, NULL, 1, 'B00005', 'INV/B00005', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:17:04', '2008-12-26 22:17:04', NULL);
INSERT INTO `item` VALUES (6, 12, NULL, 1, 'B00006', 'INV/B00006', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 350000, 'Rupiah', '0000-00-00', '2008-12-26 22:17:52', '2008-12-26 22:17:52', NULL);
INSERT INTO `item` VALUES (7, 4, NULL, 1, 'B00007', 'INV/B00007', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 450000, 'Rupiah', '0000-00-00', '2008-12-26 22:18:29', '2008-12-26 22:18:29', NULL);
INSERT INTO `item` VALUES (8, 4, NULL, 1, 'B00008', 'INV/B00008', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 2, '', 0, NULL, '0000-00-00', '2008-12-26 22:18:51', '2008-12-26 22:18:51', NULL);
INSERT INTO `item` VALUES (9, 2, NULL, 1, 'B00009', 'INV/B00009', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:28', '2008-12-26 22:19:28', NULL);
INSERT INTO `item` VALUES (10, 2, NULL, 1, 'B00010', 'INV/B00010', '0000-00-00', '0', '', 1, '0000-00-00', '0', '', 1, '', 630000, 'Rupiah', '0000-00-00', '2008-12-26 22:19:57', '2008-12-26 22:19:57', NULL);
INSERT INTO `item` VALUES (11, 0, '1', 2, 'aasd', 'asdasda', '2022-05-12', NULL, NULL, 1, '2022-05-11', NULL, NULL, 0, '1as', 0, NULL, NULL, '2022-05-02 15:57:51', '2022-05-02 15:57:51', NULL);
INSERT INTO `item` VALUES (12, 0, '1', 2, '1ba3', '1aa44', '2022-05-08', NULL, NULL, 1, '2022-05-10', NULL, NULL, 0, 'aas', 0, NULL, NULL, '2022-05-02 19:25:16', '2022-05-02 19:25:16', NULL);
INSERT INTO `item` VALUES (13, 0, '1', 2, 'aaa', '1123', '2022-05-13', NULL, NULL, 1, '2022-05-18', NULL, NULL, 1, 'aasd', 25000, NULL, NULL, '2022-05-02 19:40:38', '2022-05-02 19:40:38', NULL);
INSERT INTO `item` VALUES (14, 0, '1', 2, 'aaab', '1123', '2022-05-13', NULL, NULL, 1, '2022-05-18', NULL, NULL, 2, 'aasd', 0, NULL, NULL, '2022-05-02 19:41:16', '2022-05-02 19:41:16', NULL);
INSERT INTO `item` VALUES (15, 0, 'aaa', 2, 'aaabccs', '1123', '2022-05-13', NULL, NULL, 1, '2022-05-18', NULL, NULL, 2, 'aasd', 0, NULL, NULL, '2022-05-02 19:46:15', '2022-05-02 19:46:15', NULL);
INSERT INTO `item` VALUES (16, 0, 'dda', 2, 'adas', 'asda', '2022-05-03', NULL, NULL, 1, '2022-05-04', NULL, NULL, 1, 'aasd', 2444, NULL, NULL, '2022-05-02 20:01:39', '2022-05-02 20:01:39', NULL);
INSERT INTO `item` VALUES (17, 0, 's', 2, 'afsc', 'adas', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'ajasd', 2500, NULL, NULL, '2022-05-02 20:03:06', '2022-05-02 20:03:06', NULL);
INSERT INTO `item` VALUES (18, 25, 's', 1, 'ada', 'asda', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'aasd', 2500, NULL, NULL, '2022-05-02 20:07:23', '2022-05-02 20:07:23', NULL);
INSERT INTO `item` VALUES (19, 25, 's', 1, 'ggasda', 'asda', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'aasd', 25009, NULL, NULL, '2022-05-02 20:08:21', '2022-05-02 20:08:21', NULL);
INSERT INTO `item` VALUES (20, 25, 's', 1, 'dsaq', 'asda', '2022-05-02', NULL, NULL, 1, '2022-05-03', NULL, NULL, 1, 'aasd', 25009, NULL, NULL, '2022-05-02 20:10:02', '2022-05-02 20:10:02', NULL);
INSERT INTO `item` VALUES (21, 36, '502-330', 2, 'B00018', 'INV/B00017', '2022-05-05', NULL, NULL, 2, '2022-05-05', NULL, NULL, 2, 'INV-B00018', 0, NULL, NULL, '2022-05-03 11:14:25', '2022-05-03 11:14:25', NULL);
INSERT INTO `item` VALUES (24, 36, '502-330', 2, 'B00023', 'INV/B00023', '2022-05-02', NULL, NULL, 1, '2022-05-13', NULL, NULL, 2, 'INV/B00023', 0, NULL, NULL, '2022-05-04 17:24:04', '2022-05-04 17:24:04', NULL);
INSERT INTO `item` VALUES (26, 39, '303-221', 3, '3321002', 'INV-99321', '2022-05-04', NULL, NULL, 1, '2022-05-12', NULL, NULL, 1, 'INVOICE-300213', 50000, NULL, NULL, '2022-05-11 15:06:45', '2022-05-11 15:06:45', NULL);

-- ----------------------------
-- Table structure for judulnotifikasi
-- ----------------------------
DROP TABLE IF EXISTS `judulnotifikasi`;
CREATE TABLE `judulnotifikasi`  (
  `IdJudul` int(11) NOT NULL AUTO_INCREMENT,
  `Judul Notifikasi` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Warna` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`IdJudul`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
INSERT INTO `jurusan` VALUES ('AKL', 'AKL');
INSERT INTO `jurusan` VALUES ('BDP', 'BDP');
INSERT INTO `jurusan` VALUES ('MM', 'Multimedia');
INSERT INTO `jurusan` VALUES ('OTP', 'OTP');

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
INSERT INTO `kelas` VALUES (3, 'X', 'BDP', '');
INSERT INTO `kelas` VALUES (4, 'X', 'AKL', '1');
INSERT INTO `kelas` VALUES (5, 'X', 'AKL', '2');
INSERT INTO `kelas` VALUES (6, 'X', 'OTP', '1');
INSERT INTO `kelas` VALUES (7, 'X', 'OTP', '2');
INSERT INTO `kelas` VALUES (8, 'X', 'OTP', '3');
INSERT INTO `kelas` VALUES (9, 'XI', 'MM', '1');
INSERT INTO `kelas` VALUES (10, 'XI', 'MM', '2');
INSERT INTO `kelas` VALUES (11, 'XI', 'BDP', '');
INSERT INTO `kelas` VALUES (12, 'XI', 'AKL', '1');
INSERT INTO `kelas` VALUES (13, 'XI', 'AKL', '2');
INSERT INTO `kelas` VALUES (14, 'XI', 'AKL', '3');
INSERT INTO `kelas` VALUES (15, 'XI', 'OTP', '1');
INSERT INTO `kelas` VALUES (16, 'XI', 'OTP', '2');
INSERT INTO `kelas` VALUES (17, 'XI', 'OTP', '3');
INSERT INTO `kelas` VALUES (18, 'XII', 'MM', '1');
INSERT INTO `kelas` VALUES (19, 'XII', 'MM', '2');
INSERT INTO `kelas` VALUES (20, 'XII', 'BDP', '');
INSERT INTO `kelas` VALUES (21, 'XII', 'AKL', '1');
INSERT INTO `kelas` VALUES (22, 'XII', 'AKL', '2');
INSERT INTO `kelas` VALUES (23, 'XII', 'AKL', '3');
INSERT INTO `kelas` VALUES (24, 'XII', 'OTP', '1');
INSERT INTO `kelas` VALUES (25, 'XII', 'OTP', '2');
INSERT INTO `kelas` VALUES (26, 'XII', 'OTP', '3');

-- ----------------------------
-- Table structure for mst_author
-- ----------------------------
DROP TABLE IF EXISTS `mst_author`;
CREATE TABLE `mst_author`  (
  `author_id` int(11) NOT NULL AUTO_INCREMENT,
  `author_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date NOT NULL,
  `last_update` date NULL DEFAULT NULL,
  PRIMARY KEY (`author_id`) USING BTREE,
  UNIQUE INDEX `author_name`(`author_name`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mst_author
-- ----------------------------
INSERT INTO `mst_author` VALUES (1, 'Valade, Janet', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (2, 'Siever, Ellen', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (3, 'Love, Robert', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (4, 'Robbins, Arnold', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (5, 'Figgins, Stephen', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (6, 'Weber, Aaron', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (7, 'Kofler, Michael', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (8, 'Kramer, David', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (9, 'Raymond, Eric', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (10, 'Fogel, Karl', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (11, 'Douglas, Korry', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (12, 'Douglas, Susan', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (13, 'Shklar, Leon', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (14, 'Rosen, Richard', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (15, 'Woychowsky, Edmond', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (16, 'Taylor, Arlene G.', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (17, 'Stueart, Robert D.', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (18, 'Moran, Barbara B.', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (19, 'Morville, Peter', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (20, 'Rosenfeld, Louis', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (21, 'Robinson, Mark', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (22, 'Bracking, Sarah', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (23, 'Huffington, Arianna Stassinopoulos', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (24, 'Hancock, Graham', '2007-11-29', '2007-11-29');
INSERT INTO `mst_author` VALUES (25, 'zzxc', '2022-04-28', '2022-04-28');
INSERT INTO `mst_author` VALUES (26, 'hhhhh', '2022-04-28', '2022-04-28');
INSERT INTO `mst_author` VALUES (27, 'vvvvvzzzz', '2022-04-28', '2022-04-28');
INSERT INTO `mst_author` VALUES (28, 'zxccc', '2022-04-28', '2022-04-28');
INSERT INTO `mst_author` VALUES (29, 'ssd', '2022-05-02', '2022-05-02');
INSERT INTO `mst_author` VALUES (30, 'dda', '2022-05-02', '2022-05-02');

-- ----------------------------
-- Table structure for mst_coll_type
-- ----------------------------
DROP TABLE IF EXISTS `mst_coll_type`;
CREATE TABLE `mst_coll_type`  (
  `coll_type_id` int(3) NOT NULL AUTO_INCREMENT,
  `coll_type_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date NULL DEFAULT NULL,
  `last_update` date NULL DEFAULT NULL,
  PRIMARY KEY (`coll_type_id`) USING BTREE,
  UNIQUE INDEX `coll_type_name`(`coll_type_name`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mst_coll_type
-- ----------------------------
INSERT INTO `mst_coll_type` VALUES (1, 'Reference', '2007-11-29', '2007-11-29');
INSERT INTO `mst_coll_type` VALUES (2, 'Textbook', '2007-11-29', '2007-11-29');
INSERT INTO `mst_coll_type` VALUES (3, 'Fiction', '2007-11-29', '2007-11-29');

-- ----------------------------
-- Table structure for mst_language
-- ----------------------------
DROP TABLE IF EXISTS `mst_language`;
CREATE TABLE `mst_language`  (
  `language_id` int(11) NOT NULL AUTO_INCREMENT,
  `language_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date NULL DEFAULT NULL,
  `last_update` date NULL DEFAULT NULL,
  PRIMARY KEY (`language_id`) USING BTREE,
  UNIQUE INDEX `language_name`(`language_name`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mst_language
-- ----------------------------
INSERT INTO `mst_language` VALUES (1, 'Indonesia', '2022-04-05', '2022-04-05');
INSERT INTO `mst_language` VALUES (2, 'English', '2022-04-05', '2022-04-05');
INSERT INTO `mst_language` VALUES (3, 'Indo-China', '2022-04-05', '2022-04-05');
INSERT INTO `mst_language` VALUES (4, 'Chindo', '2022-04-27', '2022-04-27');
INSERT INTO `mst_language` VALUES (5, 'asdd', '2022-04-28', '2022-04-28');
INSERT INTO `mst_language` VALUES (6, 'zxx', '2022-04-28', '2022-04-28');
INSERT INTO `mst_language` VALUES (7, 'aad', '2022-04-28', '2022-04-28');
INSERT INTO `mst_language` VALUES (8, 'asdasd', '2022-04-28', '2022-04-28');

-- ----------------------------
-- Table structure for mst_location
-- ----------------------------
DROP TABLE IF EXISTS `mst_location`;
CREATE TABLE `mst_location`  (
  `location_id` int(3) NOT NULL AUTO_INCREMENT,
  `location_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `input_date` date NOT NULL,
  `last_update` date NOT NULL,
  PRIMARY KEY (`location_id`) USING BTREE,
  UNIQUE INDEX `location_name`(`location_name`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mst_location
-- ----------------------------
INSERT INTO `mst_location` VALUES (1, 'My Library', '2022-05-01', '2022-05-01');
INSERT INTO `mst_location` VALUES (2, 'Perpustakaan PGRI', '2022-05-02', '2022-05-02');

-- ----------------------------
-- Table structure for mst_place
-- ----------------------------
DROP TABLE IF EXISTS `mst_place`;
CREATE TABLE `mst_place`  (
  `place_id` int(11) NOT NULL AUTO_INCREMENT,
  `place_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `input_date` date NULL DEFAULT NULL,
  `last_update` date NULL DEFAULT NULL,
  PRIMARY KEY (`place_id`) USING BTREE,
  UNIQUE INDEX `place_name`(`place_name`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mst_place
-- ----------------------------
INSERT INTO `mst_place` VALUES (1, 'Hoboken, NJ', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (2, 'Sebastopol, CA', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (3, 'Indianapolis', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (4, 'Upper Saddle River, NJ', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (5, 'Westport, Conn.', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (6, 'Cambridge, Mass', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (7, 'London', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (8, 'New York', '2007-11-29', '2007-11-29');
INSERT INTO `mst_place` VALUES (9, 'hhhh', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (10, 'jkkkk', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (11, 'ggasdf', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (12, '', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (13, 'jghj', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (14, 'uiii', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (15, 'gg', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (16, 'gggaxzvxz', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (17, 'sdd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (18, 'ghghjghjkyyu', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (19, 'dfjj', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (20, 'jn', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (21, 'asd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (22, '2331', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (23, 'ssd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (24, 'zxcs', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (25, 'ddas', '2022-04-26', '2022-04-26');
INSERT INTO `mst_place` VALUES (26, 'asda', '2022-04-27', '2022-04-27');
INSERT INTO `mst_place` VALUES (27, 'asdd', '2022-04-27', '2022-04-27');
INSERT INTO `mst_place` VALUES (28, 'sadasd', '2022-04-27', '2022-04-27');
INSERT INTO `mst_place` VALUES (29, 'bb', '2022-04-28', '2022-04-28');
INSERT INTO `mst_place` VALUES (30, 'zxcc', '2022-04-28', '2022-04-28');
INSERT INTO `mst_place` VALUES (31, 'zz', '2022-04-28', '2022-04-28');
INSERT INTO `mst_place` VALUES (32, 'zzxc', '2022-04-28', '2022-04-28');

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
) ENGINE = MyISAM AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

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
INSERT INTO `mst_publisher` VALUES (12, 'dddd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (13, 'fff', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (14, 'hh', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (15, 'ddd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (16, 'ass', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (17, 'ffffd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (18, 'sggds', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (19, 'gggjj', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (20, 'gghhh', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (21, 'sss', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (22, 'ghhhh', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (23, '', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (24, 'jkjkhjkhjk', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (25, 'lmn ', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (26, 'qqq', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (27, 'gggghhqwe', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (28, 'sdd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (29, 'bbbbbb', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (30, 'vvhhchc', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (31, 'ssdasd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (32, 'gzxvbzx', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (33, 'dda', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (34, 'bf', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (35, 'bsa', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (36, 'aasd', '2022-04-26', '2022-04-26');
INSERT INTO `mst_publisher` VALUES (37, 'fasd', '2022-04-27', '2022-04-27');
INSERT INTO `mst_publisher` VALUES (38, 'sdda', '2022-04-27', '2022-04-27');
INSERT INTO `mst_publisher` VALUES (39, 'asdasd', '2022-04-27', '2022-04-27');
INSERT INTO `mst_publisher` VALUES (40, 'dff', '2022-04-27', '2022-04-27');
INSERT INTO `mst_publisher` VALUES (41, 'wwea', '2022-04-28', '2022-04-28');
INSERT INTO `mst_publisher` VALUES (42, 'zxasd', '2022-04-28', '2022-04-28');
INSERT INTO `mst_publisher` VALUES (43, 'sda', '2022-04-28', '2022-04-28');
INSERT INTO `mst_publisher` VALUES (44, 'ssa', '2022-04-28', '2022-04-28');
INSERT INTO `mst_publisher` VALUES (45, 'aaaa', '2022-04-28', '2022-04-28');
INSERT INTO `mst_publisher` VALUES (46, 'ccd', '2022-04-28', '2022-04-28');
INSERT INTO `mst_publisher` VALUES (47, 'ssd', '2022-05-02', '2022-05-02');
INSERT INTO `mst_publisher` VALUES (48, 'da', '2022-05-02', '2022-05-02');

-- ----------------------------
-- Table structure for new_bliblio
-- ----------------------------
DROP TABLE IF EXISTS `new_bliblio`;
CREATE TABLE `new_bliblio`  (
  `IdBliblio` int(11) NOT NULL AUTO_INCREMENT,
  `IdGMD` int(11) NULL DEFAULT NULL,
  `Judul` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `author_id` int(11) NULL DEFAULT NULL,
  `Edisi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `isbn_issn` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `IdPublisher` int(11) NULL DEFAULT NULL,
  `PublisherYear` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `Notes` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `SeriesTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `call_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `IdLanguage` int(11) NULL DEFAULT NULL,
  `TempatTerbit` int(11) NULL DEFAULT NULL,
  `Klasifikasi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `input_date` datetime(0) NULL DEFAULT NULL,
  `last_update` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`IdBliblio`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of new_bliblio
-- ----------------------------
INSERT INTO `new_bliblio` VALUES (1, 0, '1', NULL, 'das', '21132', 1, '2004', '32213', 'assdd', '1', 2, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (2, 1, 'ASD', NULL, 'DDAS', 'Dasd', 1, 'sdasd', 'asddd', 'dssaa', 'sddd', 1, 4, 'ddsad', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (3, 4, 'ddd', NULL, 'ddsa', 'ddd', 1, 'dds', 'sssa', 'aas', 'fff', 1, 4, 'dddds', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (4, 2, 'sdda', NULL, 'dsda', 'ggsd', 0, 'ssa', 'ddsa', 'ssd', 'ffs', 1, 0, 'ddds', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (5, 1, 'asd', NULL, 'sddas', 'ddsa', 0, 'ffasd', 'sdd', 'assd', 'ddd', 1, 0, 'ssd', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (6, 1, 'asda', NULL, 'sdd', 'asdd', 0, 'aas', 'dds', 'ass', 'dd', 1, 0, 'aasdddd', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (7, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (8, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (9, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (10, 1, 'asdd', NULL, 'ddas', 'sssd', 0, 'sss', 'aas', 'ssd', 'dda', 1, 0, 'aass', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (11, 1, 'asd', NULL, 'dsd', 'aasd', 0, 'ffd', 'ss', 'aa', 'ff', 1, 0, 'aasd', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (12, 1, 'dasd', NULL, 'asd', 'aas', 0, 'ffsd', 'ddas', 'asd', 'assd', 1, 0, 'aaasd', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (13, 1, 'dds', NULL, 'aasdd', 'ggg', 0, 'ddd', 'ASDD', 'AS', 'DDDA', 1, 0, 'FFFS', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (14, 1, 'asdd', NULL, 'dds', 'assd', 0, 'sss', 'aaasd', 'sdd', 'dds', 1, 0, 'ddds', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (15, 1, 'ddsa', NULL, 'gggf', 'fjjj', 19, 'aasd', 'add', 'sss', 'aaa', 1, 0, 'hhhh', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (16, 1, 'ggd', NULL, 'dass', 'dds', 20, 'jjjd', 'asdd', 'ss', 'ggg', 1, 0, 'jjjj', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (17, 1, 'ddg', NULL, 'ggd', 'aaa', 21, 'ggg', 'ddd', 'ggg', 'hhh', 1, 10, 'asdasd', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (18, 1, 'ddg', NULL, 'ggd', 'aaa', 21, 'ggg', 'ddd', 'ggg', 'hhh', 1, 10, 'asdasd', NULL, NULL, NULL);
INSERT INTO `new_bliblio` VALUES (19, 1, 'gasd', NULL, 'gg', 'ddd', 22, 'nbvbn', 'cvcvbncvbn', 'vsdfsdf', 'hxcvb', 1, 11, 'dfff', 'D:\\Dera\\Matlab\\img.jpg', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (20, 1, 'dasd', NULL, 'ggg', 'dfdsd', 24, 'vbnvbn', 'vncc', 'bn', 'vcn', 1, 13, 'dfghdgh', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (21, 1, 'fghfgh', NULL, 'khjgh', 'dfgdf', 25, 'hjghj', 'ccc', 'vb', 'hfgu', 2, 14, 'ggh', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (22, 1, 'gg', NULL, 'sdasd', 'gasd', 26, 'ww', 'sddas', 'ggdf', 'asddd', 1, 15, 'zzz', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (23, 1, 'sdasd', NULL, 'fasdas', 'zzxc', 28, 'ddasd', 'xczxc', 'dasd', 'xxvczx', 1, 17, 'zzz', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (24, 1, 'gga', NULL, 'zzz', 'xxxx', 29, 'hhha', 'sse', 'ttqwe', 'daa', 1, 18, 'rtrt', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (25, 1, 'fasdd', NULL, 'gadf', 'zchhz', 30, 'd', 'a', 'xg', 's', 1, 20, 'asdd', 'D:\\Dera\\IMG_20220401_144105.jpg', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (26, 1, 'sada', NULL, 'gggasd', 'sdd', 31, 'ggasd', 'zzxcv', 'gggasd', 'dddwe', 1, 21, 'bbbbb', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonIconlibliograf.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (27, 1, 'fgasd', NULL, 'gzzxv', 'bbxzzcdfd', 32, 'dds', 'asr1', 'asd123123', 'fasd', 1, 22, 'asdasdasd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (28, 1, 'asdas', NULL, 'ggasd', 'zzx', 35, '2331', 'asdx', 'zxcz', 'asda', 1, 24, 'dasddd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (29, 1, 'asdd', NULL, 'sdd', 'ggasd', 36, 'dsds', 'aasd', 'ggasd', 'xx', 1, 25, 'dgasdasd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (30, 1, 'sdasd', NULL, 'dasd', 'ss', 37, 'zzxc', 'asd', 'asdd', 'sdd', 0, 0, 'zxccc', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (31, 1, 'asdas', NULL, 'ddas', 'ds', 38, 'ggg', 'asdd', 'asdasd', '', 2, 26, 'asddads', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (32, 1, 'asdasd', NULL, 'asdasd', 'asdasd', 39, 'fffas', 'szxczxc', 'sada', 'zzxc', 1, 27, 'zxvvzxcxz', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (33, 1, 'asd', NULL, 'ggd', 'fd', 40, 'aaas', 'ddd', 'assd', 'ggas', 4, 28, 'dasdasd', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (34, 1, 'dddza', 28, 'zxxbbb', 'bbb', 46, 'ss', 'zzxc', 'ddw', 'qaqwe', 8, 32, 'vvvv', 'D:DeraKuliahPerpustakaan-SMK-PGRI-1-Jakartasrcperpustakaansmkpgripkg1jakartaButtonCover.png', NULL, NULL);
INSERT INTO `new_bliblio` VALUES (35, 1, 'dfaas', 1, 'ss', 'fass', 2, 'asd', 'sdas', 'daaa', 'ssd', 2, 1, 'aaaa', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\Images\\1.jpg', '2022-05-02 14:58:41', '2022-05-02 14:58:41');
INSERT INTO `new_bliblio` VALUES (36, 1, 'How To Be Genius', 1, 'Be Genius', '33125523', 1, '2011', 'Good', 'Series 1', '502-330', 1, 1, '502', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Cover.png', '2022-05-03 11:11:37', '2022-05-03 11:11:37');
INSERT INTO `new_bliblio` VALUES (37, 2, 'Network Cyber', 2, 'Kedua', '2231142', 2, '2011', 'Very Very GOOD', 'Series 2', '503-221', 1, 1, '503', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Cover.png', '2022-05-05 11:36:14', '2022-05-05 11:36:14');
INSERT INTO `new_bliblio` VALUES (38, 3, 'gaas', 1, 'Kedua', '33201223', 2, '2003', 'Very Bad', 'Series 4', '503-220', 1, 2, '503', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Icon\\blibliograf.png', '2022-05-05 11:39:33', '2022-05-05 11:39:33');
INSERT INTO `new_bliblio` VALUES (39, 3, 'Bersama kuli membangun Negri', 3, 'Soepoeo', '99219932', 2, '2011', 'Very Good Good', 'Membangun Negri', '303-221', 1, 2, '303', 'D:\\Collage\\Smester 8\\Project\\Perpustakaan-SMK-PGRI-1-Jakarta\\src\\perpustakaan\\smk\\pgri\\pkg1\\jakarta\\Button\\Cover.png', '2022-05-11 15:04:02', '2022-05-11 15:04:02');

-- ----------------------------
-- Table structure for notifikasi
-- ----------------------------
DROP TABLE IF EXISTS `notifikasi`;
CREATE TABLE `notifikasi`  (
  `idNotifikasi` int(11) NOT NULL AUTO_INCREMENT,
  `idJudul` int(10) NOT NULL,
  `Nis` int(10) NOT NULL,
  `Isi Notifikasi` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Tanggal` date NOT NULL,
  `Status` int(11) NOT NULL DEFAULT 1,
  PRIMARY KEY (`idNotifikasi`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of pengunjung
-- ----------------------------
INSERT INTO `pengunjung` VALUES (1, 'Atthoriq', 'thoriqaziz.muhammad@gmail.com', 'unindrag', '2022-04-20 13:35:00');
INSERT INTO `pengunjung` VALUES (2, 'Yos', 'yos@gmail.com', 'Siswa', '2022-04-20 13:35:31');
INSERT INTO `pengunjung` VALUES (3, 'Dera', 'masterblad213@gmail.com', 'Siswa', '2022-04-20 14:43:32');
INSERT INTO `pengunjung` VALUES (4, 'Yos', 'yos@gmail.com', 'Siswa', '2022-05-11 11:14:42');
INSERT INTO `pengunjung` VALUES (5, 'Dera Abdul Gani', 'Alamat@email.Siswa', 'Siswa', '2022-05-11 14:09:59');

-- ----------------------------
-- Table structure for petugas
-- ----------------------------
DROP TABLE IF EXISTS `petugas`;
CREATE TABLE `petugas`  (
  `Nik` int(11) NOT NULL,
  `Nama` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Email` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Alamat` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `NoHp` int(11) NOT NULL,
  PRIMARY KEY (`Nik`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of petugas
-- ----------------------------
INSERT INTO `petugas` VALUES (92991, 'Dera', 'deraabdulgani', 'Jakarta		', 821993212);

-- ----------------------------
-- Table structure for reqbebaspustaka
-- ----------------------------
DROP TABLE IF EXISTS `reqbebaspustaka`;
CREATE TABLE `reqbebaspustaka`  (
  `IdReq` int(11) NOT NULL AUTO_INCREMENT,
  `TglPermintaan` date NOT NULL,
  `Nis` int(11) NOT NULL,
  PRIMARY KEY (`IdReq`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of reqbebaspustaka
-- ----------------------------
INSERT INTO `reqbebaspustaka` VALUES (1, '2022-05-05', 99283);
INSERT INTO `reqbebaspustaka` VALUES (2, '2022-05-05', 99282);
INSERT INTO `reqbebaspustaka` VALUES (3, '2022-05-08', 99281);

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
  `Nis` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `Role` int(11) NOT NULL DEFAULT 3,
  PRIMARY KEY (`Nis`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 993213 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Admin', 'Admin', 1);
INSERT INTO `user` VALUES (2, 'Petugas', 'Petugas', 2);
INSERT INTO `user` VALUES (92991, '92991', '92991', 2);
INSERT INTO `user` VALUES (99281, 'dera', 'getamped', 3);
INSERT INTO `user` VALUES (99282, 'radika', 'radika', 3);
INSERT INTO `user` VALUES (99283, 'yos', 'yos', 3);
INSERT INTO `user` VALUES (993212, '993212', '993212', 3);

-- ----------------------------
-- Table structure for usulanbuku
-- ----------------------------
DROP TABLE IF EXISTS `usulanbuku`;
CREATE TABLE `usulanbuku`  (
  `IdUsulan` int(11) NOT NULL AUTO_INCREMENT,
  `Nis` int(11) NOT NULL,
  `Judul` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'Tidak Disebutkan',
  `Penulis` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Tidak Disebutkan',
  `Penerbit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Tidak Disebutkan',
  `TahunTerbit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'Tidak Disebutkan',
  `Status` int(11) NOT NULL,
  PRIMARY KEY (`IdUsulan`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
