-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2020 at 07:02 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medic`
--

-- --------------------------------------------------------

--
-- Table structure for table `activity_log`
--

CREATE TABLE `activity_log` (
  `id` bigint(20) NOT NULL,
  `message` varchar(255) DEFAULT NULL,
  `timestamp` datetime(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `activity_log`
--

INSERT INTO `activity_log` (`id`, `message`, `timestamp`) VALUES
(3, 'New User Created', '2019-08-16 13:47:50.000000'),
(4, '2348168898016 Logged in', '2019-08-16 13:49:28.000000'),
(7, 'New Patient Diagonized', '2019-08-16 15:28:29.000000'),
(8, '2348168898016 Logged in', '2019-08-17 18:00:35.000000'),
(9, '2348168898016 Logged in', '2019-08-18 18:33:07.000000'),
(11, '2348168898016 Logged in', '2019-08-18 21:54:30.000000'),
(12, '2348168898016 Logged in', '2019-08-23 13:08:25.000000'),
(13, '2348168898016 Logged in', '2019-08-23 13:08:25.000000'),
(14, '2348168898016 Logged in', '2019-08-23 13:08:43.000000'),
(15, '2348168898016 Logged in', '2019-08-23 22:19:55.000000'),
(16, '2348168898016 Logged in', '2019-08-24 07:11:38.000000'),
(17, '2348168898016 Logged in', '2019-08-25 01:54:21.000000'),
(18, '2348168898016 Logged in', '2019-08-25 08:05:44.000000'),
(19, '2348168898016 Logged in', '2019-08-26 22:31:29.000000'),
(20, '2348168898016 Logged in', '2019-08-27 09:46:42.000000'),
(21, '2348168898016 Logged in', '2019-08-28 09:03:21.000000'),
(22, '2348168898016 Logged in', '2019-08-28 09:26:34.000000'),
(23, '2348168898016 Logged in', '2019-08-28 20:54:41.000000'),
(26, 'New User Created', '2019-08-28 21:03:49.000000'),
(29, 'New User Created', '2019-08-28 21:23:16.000000'),
(30, '2348168898016 Logged in', '2019-09-05 09:03:46.000000'),
(31, '2348168898016 Logged in', '2019-09-05 19:15:11.000000'),
(32, '2348168898016 Logged in', '2019-09-09 16:13:02.000000'),
(33, '2348168898016 Logged in', '2019-09-24 08:46:36.000000'),
(34, '2348168898016 Logged in', '2019-11-10 21:13:30.000000'),
(35, '2348168898016 Logged in', '2019-11-27 15:24:02.000000'),
(37, '2348168898016 Logged in', '2019-12-09 14:54:14.000000'),
(39, 'New User Created', '2019-12-09 15:10:15.000000'),
(40, '2348168898016 Logged in', '2019-12-09 21:39:42.000000'),
(46, '2348168898016 Logged in', '2019-12-10 06:28:52.000000'),
(49, 'New Patient Diagonized', '2019-12-10 06:50:44.000000'),
(52, 'New Patient Diagonized', '2019-12-10 08:49:00.000000'),
(54, 'New Patient Diagonized', '2019-12-10 08:59:02.000000'),
(56, 'New Patient Diagonized', '2019-12-10 09:07:21.000000'),
(57, '2348168898016 Logged in', '2019-12-26 16:20:52.000000'),
(59, 'New Patient Diagonized', '2019-12-26 17:50:27.000000'),
(61, 'New Patient Diagonized', '2019-12-26 17:52:35.000000'),
(63, 'New Patient Diagonized', '2019-12-26 17:59:51.000000'),
(64, '2348168898016 Logged in', '2020-01-07 06:45:04.000000'),
(65, '2348168898016 Logged in', '2020-01-08 02:53:06.000000'),
(66, '2348168898016 Logged in', '2020-01-08 08:20:04.000000'),
(67, '2348168898016 Logged in', '2020-01-08 10:50:43.000000'),
(69, 'New Patient Diagonized', '2020-01-08 11:15:09.000000'),
(71, 'New Patient Diagonized', '2020-01-08 11:22:18.000000'),
(73, 'New Patient Diagonized', '2020-01-08 11:36:22.000000'),
(75, 'New Patient Diagonized', '2020-01-08 11:37:01.000000'),
(77, 'New Patient Diagonized', '2020-01-08 11:37:33.000000'),
(79, 'New Patient Diagonized', '2020-01-08 12:07:23.000000'),
(81, 'New Patient Diagonized', '2020-01-08 12:11:17.000000'),
(83, 'New Patient Diagonized', '2020-01-08 12:12:46.000000'),
(85, 'New Patient Diagonized', '2020-01-08 12:18:21.000000'),
(87, 'New Patient Diagonized', '2020-01-08 14:48:31.000000'),
(89, 'New Patient Diagonized', '2020-01-08 14:48:38.000000'),
(91, 'New Patient Diagonized', '2020-01-08 14:49:20.000000'),
(93, 'New Patient Diagonized', '2020-01-08 14:49:49.000000'),
(95, 'New Patient Diagonized', '2020-01-08 14:50:20.000000'),
(97, 'New Patient Diagonized', '2020-01-08 14:51:50.000000'),
(99, 'New Patient Diagonized', '2020-01-08 14:52:14.000000'),
(101, 'New Patient Diagonized', '2020-01-08 14:59:44.000000'),
(102, '2348168898016 Logged in', '2020-01-08 15:00:43.000000'),
(104, 'New Patient Diagonized', '2020-01-08 15:01:54.000000'),
(106, 'New Patient Diagonized', '2020-01-08 15:02:22.000000'),
(108, 'New Patient Diagonized', '2020-01-08 15:02:38.000000'),
(110, 'New Patient Diagonized', '2020-01-08 15:02:49.000000'),
(112, 'New Patient Diagonized', '2020-01-08 15:03:30.000000'),
(114, 'New Patient Diagonized', '2020-01-08 15:04:06.000000'),
(116, 'New Patient Diagonized', '2020-01-08 15:04:22.000000'),
(118, 'New Patient Diagonized', '2020-01-08 15:05:54.000000'),
(120, 'New Patient Diagonized', '2020-01-08 15:06:08.000000'),
(122, 'New Patient Diagonized', '2020-01-08 15:06:45.000000'),
(124, 'New Patient Diagonized', '2020-01-08 15:07:25.000000'),
(126, 'New Patient Diagonized', '2020-01-08 15:07:41.000000'),
(128, 'New Patient Diagonized', '2020-01-08 15:08:02.000000'),
(130, 'New Patient Diagonized', '2020-01-08 15:08:56.000000'),
(132, 'New Patient Diagonized', '2020-01-08 15:12:57.000000'),
(134, 'New Patient Diagonized', '2020-01-08 15:13:49.000000'),
(136, 'New Patient Diagonized', '2020-01-08 15:14:56.000000'),
(138, 'New Patient Diagonized', '2020-01-08 15:15:19.000000'),
(140, 'New Patient Diagonized', '2020-01-08 15:17:11.000000'),
(142, 'New Patient Diagonized', '2020-01-08 15:17:32.000000'),
(144, 'New Patient Diagonized', '2020-01-08 15:18:00.000000'),
(146, 'New Patient Diagonized', '2020-01-08 15:23:27.000000'),
(148, 'New Patient Diagonized', '2020-01-08 15:26:07.000000'),
(150, 'New Patient Diagonized', '2020-01-08 15:26:22.000000'),
(152, 'New Patient Diagonized', '2020-01-08 15:27:00.000000'),
(154, 'New Patient Diagonized', '2020-01-08 15:27:44.000000'),
(156, 'New Patient Diagonized', '2020-01-08 15:34:19.000000'),
(157, '2348168898016 Logged in', '2020-01-08 19:35:39.000000'),
(158, '2348168898016 Logged in', '2020-01-09 06:25:18.000000'),
(159, '2348168898016 Logged in', '2020-01-09 18:23:03.000000'),
(161, 'New Patient Diagonized', '2020-01-09 18:29:56.000000'),
(163, 'New Patient Diagonized', '2020-01-09 19:42:56.000000'),
(165, 'New Patient Diagonized', '2020-01-09 19:50:18.000000'),
(166, '2348168898016 Logged in', '2020-01-09 22:31:28.000000'),
(167, '2348168898016 Logged in', '2020-01-10 06:05:13.000000'),
(168, '2348168898016 Logged in', '2020-01-10 09:33:10.000000'),
(169, '2348168898016 Logged in', '2020-01-10 11:40:09.000000'),
(170, '2348168898016 Logged in', '2020-01-10 19:49:57.000000'),
(171, '2348168898016 Logged in', '2020-01-10 23:43:13.000000'),
(172, '2348168898016 Logged in', '2020-01-11 10:20:39.000000'),
(175, 'New User Created', '2020-01-11 10:22:41.000000'),
(177, 'New Patient Diagonized', '2020-01-11 14:19:20.000000'),
(179, 'New Patient Diagonized', '2020-01-11 14:41:10.000000'),
(180, '2348168898016 Logged in', '2020-01-11 19:02:22.000000'),
(183, 'New Patient Diagonized', '2020-01-11 20:26:17.000000'),
(185, '2348168898016 Logged in', '2020-01-12 06:29:23.000000'),
(187, 'New Patient Diagonized', '2020-01-12 07:02:11.000000'),
(188, 'New Patient Diagonized', '2020-01-12 07:22:44.000000'),
(191, 'New Patient Diagonized', '2020-01-12 07:24:50.000000'),
(192, 'New Patient Diagonized', '2020-01-12 07:25:21.000000'),
(193, '2348168898016 Logged in', '2020-01-12 13:58:10.000000'),
(197, 'New User Created', '2020-01-12 17:10:19.000000'),
(200, 'New User Created', '2020-01-12 17:14:48.000000'),
(203, 'New User Created', '2020-01-12 17:17:10.000000'),
(206, 'New Patient Diagonized', '2020-01-12 17:37:41.000000');

-- --------------------------------------------------------

--
-- Table structure for table `dashboard`
--

CREATE TABLE `dashboard` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dashboard`
--

INSERT INTO `dashboard` (`id`, `name`, `link`) VALUES
(209, 'Emergency Registration', 'emergencyAccount/new'),
(210, 'Register Patient', 'patient/new'),
(211, 'Existing Patient', 'patient/list'),
(212, 'All Staff', 'user/list');

-- --------------------------------------------------------

--
-- Table structure for table `diagnosis`
--

CREATE TABLE `diagnosis` (
  `id` bigint(20) NOT NULL,
  `ache_duration` varchar(255) DEFAULT NULL,
  `appetite_loss` varchar(255) DEFAULT NULL,
  `bitter_tongue` varchar(255) DEFAULT NULL,
  `chest_pain` varchar(255) DEFAULT NULL,
  `cold` varchar(255) DEFAULT NULL,
  `cough` varchar(255) DEFAULT NULL,
  `date_created` datetime(6) DEFAULT NULL,
  `date_modified` datetime(6) DEFAULT NULL,
  `dehydration` varchar(255) DEFAULT NULL,
  `fever` varchar(255) DEFAULT NULL,
  `head_ache` varchar(255) DEFAULT NULL,
  `muscle_pain` varchar(255) DEFAULT NULL,
  `nausea` varchar(255) DEFAULT NULL,
  `others` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `rash` varchar(255) DEFAULT NULL,
  `red_eye` varchar(255) DEFAULT NULL,
  `stomach_pain` varchar(255) DEFAULT NULL,
  `stooling` varchar(255) DEFAULT NULL,
  `stress` varchar(255) DEFAULT NULL,
  `sweating` varchar(255) DEFAULT NULL,
  `tiredness` varchar(255) DEFAULT NULL,
  `ulcer_pat` varchar(255) DEFAULT NULL,
  `vomitting` varchar(255) DEFAULT NULL,
  `wieght_loss` varchar(255) DEFAULT NULL,
  `doc_prescription` varchar(255) DEFAULT NULL,
  `file_no` varchar(255) DEFAULT NULL,
  `abdominal_pain` varchar(255) DEFAULT NULL,
  `diarrhea` varchar(255) DEFAULT NULL,
  `extremely_swollen_abdomen` varchar(255) DEFAULT NULL,
  `fatigue` varchar(255) DEFAULT NULL,
  `weakness` varchar(255) DEFAULT NULL,
  `dry_cough` varchar(255) DEFAULT NULL,
  `test_reslt` varchar(255) DEFAULT NULL,
  `diagnosis_rslt` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `diagnosis`
--

INSERT INTO `diagnosis` (`id`, `ache_duration`, `appetite_loss`, `bitter_tongue`, `chest_pain`, `cold`, `cough`, `date_created`, `date_modified`, `dehydration`, `fever`, `head_ache`, `muscle_pain`, `nausea`, `others`, `phone_number`, `rash`, `red_eye`, `stomach_pain`, `stooling`, `stress`, `sweating`, `tiredness`, `ulcer_pat`, `vomitting`, `wieght_loss`, `doc_prescription`, `file_no`, `abdominal_pain`, `diarrhea`, `extremely_swollen_abdomen`, `fatigue`, `weakness`, `dry_cough`, `test_reslt`, `diagnosis_rslt`) VALUES
(186, '122 Month', 'Yes', 'Yes', 'Yes', 'No', 'Yes', '2020-01-12 07:02:11.000000', '2020-01-12 07:02:11.000000', 'Yes', 'No', 'Yes', 'Yes', 'Yes', 'Cool', NULL, 'Yes', 'Not Sure', 'Yes', 'Yes', 'Yes', 'Yes', 'Tiredness?', 'Yes', 'Yes', 'Yes', NULL, 'HOS_31322', 'Yes', 'Yes', 'Yes', 'Yes', 'No', 'Yes', NULL, 'Niether Malaria nor Typhoid has been detected'),
(190, '22 Month', 'Yes', 'No', 'Yes', 'No', 'Not Sure', '2020-01-12 07:24:50.000000', '2020-01-12 07:24:50.000000', 'Yes', 'Yes', 'Yes', 'No', 'No', 'Back Pain', NULL, 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', NULL, 'HOS_17484', 'Yes', 'No', 'No', 'No', 'Yes', 'Yes', NULL, 'Niether Malaria nor Typhoid has been detected'),
(205, '2 Month', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', '2020-01-12 17:37:41.000000', '2020-01-12 17:37:41.000000', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Cool', NULL, 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', NULL, 'HOS_97598', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', NULL, 'Treat for TYPHOID & MALARIA, If there is a danger sign, Hospitalize Patient.. Also consider Confirmatoory Test.');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(213),
(213),
(213),
(213),
(213);

-- --------------------------------------------------------

--
-- Table structure for table `icon`
--

CREATE TABLE `icon` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `file_no` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `guardian_address` varchar(255) DEFAULT NULL,
  `guardian_name` varchar(255) DEFAULT NULL,
  `guardian_ph_no` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `state_of_origin` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL,
  `body_shape` varchar(255) DEFAULT NULL,
  `complexion` varchar(255) DEFAULT NULL,
  `date_admitted` varchar(255) DEFAULT NULL,
  `height` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `address`, `age`, `dob`, `file_no`, `first_name`, `gender`, `guardian_address`, `guardian_name`, `guardian_ph_no`, `last_name`, `nationality`, `phone_no`, `state_of_origin`, `weight`, `body_shape`, `complexion`, `date_admitted`, `height`) VALUES
(184, 'Block 20 N. A. Cant.', '23', '2019-12-31', 'HOS_31322', 'Haymouz', 'Guy', '22 Oguniyi strt  lagos', 'Abiola Yusuf', '0903873787', 'Solutions', 'Canada', '8168898015', 'Niger State', '34', NULL, NULL, NULL, NULL),
(189, 'Plot 242 Kofo Abayomi', '23', '2019-12-31', 'HOS_17484', 'Okomayin', 'Male', '22 Oguniyi strt  lagos', '34', '081637893', 'Onimisi', 'Nigerian', '2348168898015', 'Adamawa State', '69', NULL, NULL, NULL, NULL),
(194, NULL, '30', NULL, 'HOS_25790', 'Okomayin', 'Guy', NULL, NULL, NULL, 'Olle', NULL, NULL, NULL, NULL, 'Curve', 'Black', '2020-12-31', '56'),
(204, NULL, '30 - 35', NULL, 'HOS_97598', 'Pale', 'Male', NULL, NULL, NULL, 'Gove', NULL, NULL, NULL, NULL, 'Fat', 'Fair', '2020-12-31', '1.6');

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `allegies` varchar(255) DEFAULT NULL,
  `blood_grp` varchar(255) DEFAULT NULL,
  `date_created` datetime(6) DEFAULT NULL,
  `date_modified` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `genotype` varchar(255) DEFAULT NULL,
  `guardian` varchar(255) DEFAULT NULL,
  `guardian_address` varchar(255) DEFAULT NULL,
  `guardian_ph_no` varchar(255) DEFAULT NULL,
  `land_mark` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `res_address` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `state_of_residence` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `file_no` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `guardian_name` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `state_of_origin` varchar(255) DEFAULT NULL,
  `weight` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `address`, `age`, `allegies`, `blood_grp`, `date_created`, `date_modified`, `email`, `first_name`, `genotype`, `guardian`, `guardian_address`, `guardian_ph_no`, `land_mark`, `last_name`, `phone_number`, `res_address`, `sex`, `state_of_residence`, `user_id`, `dob`, `file_no`, `gender`, `guardian_name`, `nationality`, `phone_no`, `state_of_origin`, `weight`) VALUES
(1, NULL, NULL, NULL, NULL, '2019-08-16 13:47:50.000000', '2019-08-16 13:47:50.000000', NULL, 'Okomayin', NULL, NULL, NULL, NULL, NULL, 'haymouz', NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(38, NULL, NULL, 'Non-beef', '0+', '2019-12-09 15:10:15.000000', '2019-12-09 15:10:15.000000', NULL, 'Agboola', 'KCNM', 'Okomayin Amos', '22 Oguniyi strt  lagos', '12345', 'Nigeria', 'Joseph', '1234', 'Block 20 N. A. Cant.', 'Male', 'Lagos State', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(41, '22 Way John Bull way', '23', NULL, NULL, NULL, NULL, NULL, 'Crappy', NULL, NULL, '3, Agbaye way GRA', '1234', NULL, 'Sat', NULL, NULL, NULL, NULL, NULL, '1992-06-12', 'HOS_2019-12-09T23:11:20.813', 'Male', 'Abiola Yusuf', 'Nigerian', NULL, NULL, '34'),
(42, '22 Way John Bull way', '23', NULL, NULL, NULL, NULL, NULL, 'Crappy', NULL, NULL, '3, Agbaye way GRA', '1234', NULL, 'Sat', NULL, NULL, NULL, NULL, NULL, '1992-06-12', 'HOS_2019-12-09T23:22:43.724', 'Male', 'Abiola Yusuf', 'Nigerian', NULL, NULL, '34'),
(173, NULL, NULL, NULL, NULL, '2020-01-11 10:22:41.000000', '2020-01-11 10:22:41.000000', NULL, 'Amos', NULL, NULL, NULL, NULL, NULL, 'Okomayin', NULL, NULL, NULL, NULL, 174, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(195, NULL, NULL, NULL, NULL, '2020-01-12 17:10:19.000000', '2020-01-12 17:10:19.000000', NULL, 'Jusde', NULL, NULL, NULL, NULL, NULL, 'haymouz', NULL, NULL, NULL, NULL, 196, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(198, NULL, NULL, NULL, NULL, '2020-01-12 17:14:48.000000', '2020-01-12 17:14:48.000000', NULL, 'Okomayun', NULL, NULL, NULL, NULL, NULL, 'haymouz', NULL, NULL, NULL, NULL, 199, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(201, NULL, NULL, NULL, NULL, '2020-01-12 17:17:10.000000', '2020-01-12 17:17:10.000000', NULL, 'James', NULL, NULL, NULL, NULL, NULL, 'Bond', NULL, NULL, NULL, NULL, 202, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `spring_session`
--

CREATE TABLE `spring_session` (
  `PRIMARY_ID` char(36) NOT NULL,
  `SESSION_ID` char(36) NOT NULL,
  `CREATION_TIME` bigint(20) NOT NULL,
  `LAST_ACCESS_TIME` bigint(20) NOT NULL,
  `MAX_INACTIVE_INTERVAL` int(11) NOT NULL,
  `EXPIRY_TIME` bigint(20) NOT NULL,
  `PRINCIPAL_NAME` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `spring_session`
--

INSERT INTO `spring_session` (`PRIMARY_ID`, `SESSION_ID`, `CREATION_TIME`, `LAST_ACCESS_TIME`, `MAX_INACTIVE_INTERVAL`, `EXPIRY_TIME`, `PRINCIPAL_NAME`) VALUES
('d87020f5-8b45-4c5c-abf8-aba58152b8ea', '410e81e5-3b80-4021-b419-5a974a894de1', 1578837484825, 1578851979117, 9000, 1578860979117, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `spring_session_attributes`
--

CREATE TABLE `spring_session_attributes` (
  `SESSION_PRIMARY_ID` char(36) NOT NULL,
  `ATTRIBUTE_NAME` varchar(200) NOT NULL,
  `ATTRIBUTE_BYTES` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC;

--
-- Dumping data for table `spring_session_attributes`
--

INSERT INTO `spring_session_attributes` (`SESSION_PRIMARY_ID`, `ATTRIBUTE_NAME`, `ATTRIBUTE_BYTES`) VALUES
('d87020f5-8b45-4c5c-abf8-aba58152b8ea', 'MY_SESSION_MESSAGES', 0xaced0005737200136a6176612e7574696c2e41727261794c6973747881d21d99c7619d03000149000473697a6578700000000177040000000174000d3233343831363838393830313678);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `date_created` datetime(6) DEFAULT NULL,
  `date_modified` datetime(6) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `date_created`, `date_modified`, `password`, `phone_number`, `first_name`, `last_name`) VALUES
(2, '2019-08-16 13:47:50.000000', '2019-08-16 13:47:50.000000', '{bcrypt}$2a$10$TUPVtwBVelj0ZMgG/miiV.2y.LgZmaE26yS46bXGQ1braBADvQ936', '2348168898016', NULL, NULL),
(174, '2020-01-11 10:22:41.000000', '2020-01-11 10:22:41.000000', '{bcrypt}$2a$10$B9t6pTzwK8v8vKF4LkUZd.rV8VauLzILFU.5lu8rCNFKw6i39BLze', '1234', NULL, NULL),
(196, '2020-01-12 17:10:19.000000', '2020-01-12 17:10:19.000000', '{bcrypt}$2a$10$Gqk5Flg6PaiauLkH6IBs..LgE80AtkiJi9gjkcddEqnHF5imOT.Aq', '080', NULL, NULL),
(199, '2020-01-12 17:14:48.000000', '2020-01-12 17:14:48.000000', '{bcrypt}$2a$10$pCf7yienFv6CB9.Zi.72MuEQVVqVsB6s28xsV9mZCYFuo330DKJ6y', '08068898016', NULL, NULL),
(202, '2020-01-12 17:17:10.000000', '2020-01-12 17:17:10.000000', '{bcrypt}$2a$10$Q99YdA//ETAidvFwy50aWewPohIVRnGJkSCVpWCjrEpS2Rt5/mHHW', '0702289938', 'James', 'Bond');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `activity_log`
--
ALTER TABLE `activity_log`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dashboard`
--
ALTER TABLE `dashboard`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `diagnosis`
--
ALTER TABLE `diagnosis`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `icon`
--
ALTER TABLE `icon`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_77e12pjkm9v423j9hd3u10bk1` (`user_id`);

--
-- Indexes for table `spring_session`
--
ALTER TABLE `spring_session`
  ADD PRIMARY KEY (`PRIMARY_ID`),
  ADD UNIQUE KEY `SPRING_SESSION_IX1` (`SESSION_ID`),
  ADD KEY `SPRING_SESSION_IX2` (`EXPIRY_TIME`),
  ADD KEY `SPRING_SESSION_IX3` (`PRINCIPAL_NAME`);

--
-- Indexes for table `spring_session_attributes`
--
ALTER TABLE `spring_session_attributes`
  ADD PRIMARY KEY (`SESSION_PRIMARY_ID`,`ATTRIBUTE_NAME`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_4bgmpi98dylab6qdvf9xyaxu4` (`phone_number`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `person`
--
ALTER TABLE `person`
  ADD CONSTRAINT `FK2is3ph79mqcwtkd724syhtjbi` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Constraints for table `spring_session_attributes`
--
ALTER TABLE `spring_session_attributes`
  ADD CONSTRAINT `SPRING_SESSION_ATTRIBUTES_FK` FOREIGN KEY (`SESSION_PRIMARY_ID`) REFERENCES `spring_session` (`PRIMARY_ID`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
