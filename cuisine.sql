-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- 主機： 127.0.0.1
-- 產生時間： 2021 年 01 月 02 日 07:22
-- 伺服器版本： 8.0.21
-- PHP 版本： 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `cuisine`
--

-- --------------------------------------------------------

--
-- 資料表結構 `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 傾印資料表的資料 `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(69);

-- --------------------------------------------------------

--
-- 資料表結構 `owner`
--

CREATE TABLE `owner` (
  `id` int UNSIGNED NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `gender` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 傾印資料表的資料 `owner`
--

INSERT INTO `owner` (`id`, `name`, `gender`, `phone`) VALUES
(45, 'manager Huang', 'male', '0961351686'),
(47, 'manager Huang', 'male', '0961351686'),
(58, '台科一餐管理員', 'male', '0961351686'),
(60, 'manager Chao', 'male', '0961351686');

-- --------------------------------------------------------

--
-- 資料表結構 `restaurant`
--

CREATE TABLE `restaurant` (
  `id` int UNSIGNED NOT NULL,
  `owner_id` int UNSIGNED NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `start_time` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `end_time` varchar(16) NOT NULL,
  `website` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `introduction` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `promotion` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 傾印資料表的資料 `restaurant`
--

INSERT INTO `restaurant` (`id`, `owner_id`, `name`, `location`, `start_time`, `end_time`, `website`, `phone`, `image`, `introduction`, `promotion`, `created_at`, `modified_at`) VALUES
(50, 47, 'manager Chao', '新北市中和區泰和街1號12樓之三', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-20 06:15:24', '2020-12-20 06:15:24'),
(52, 45, 'manager Wei', '新北市中和區泰和街1號12樓之三', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-20 06:16:48', '2020-12-20 06:16:48'),
(55, 45, 'manager Chou', '新北市中和區泰和街1號12樓之三', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-20 06:19:59', '2020-12-20 06:19:59'),
(56, 45, 'manager Wang', '新北市中和區泰和街1號12樓之三', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-20 06:42:33', '2020-12-20 06:42:33'),
(57, 47, 'sfianchao', '新北市中和區泰和街1號12樓之三', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-20 07:35:31', '2020-12-20 07:35:31'),
(61, 47, 'mimi restaurant', '新北市中和區泰和街1號12樓之三', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-20 20:31:20', '2020-12-20 20:31:20'),
(66, 58, '雞同鴨講', '台科三餐', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-21 01:37:15', '2020-12-21 01:37:15'),
(68, 60, 'manager wei', '新北市中和區泰和街1號12樓之三', '10:30', '18:50', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'http://localhost:8082/storage/restaurantImages', 'manager wei\'s restaurant', '20% off', '2020-12-25 21:46:20', '2020-12-25 21:46:20');

-- --------------------------------------------------------

--
-- 資料表結構 `user_account`
--

CREATE TABLE `user_account` (
  `id` int UNSIGNED NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `age` int NOT NULL,
  `gender` varchar(16) NOT NULL,
  `facebook` varchar(255) NOT NULL,
  `phone` varchar(16) NOT NULL,
  `eating_habit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- 傾印資料表的資料 `user_account`
--

INSERT INTO `user_account` (`id`, `name`, `age`, `gender`, `facebook`, `phone`, `eating_habit`) VALUES
(48, 'manager Huang', 60, 'male', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'vegetarian'),
(49, 'manager Wei', 60, 'male', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'vegetarian'),
(59, '一餐管理員', 60, 'male', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'meat'),
(62, '三餐管理員', 60, 'male', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'meat'),
(63, 'sfianchao', 60, 'male', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'meat'),
(64, 'hmnicholaschao', 60, 'male', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'meat'),
(65, 'Devon', 24, 'male', 'https://www.facebook.com/hmnicholaschao', '0961351686', 'meat');

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `owner`
--
ALTER TABLE `owner`
  ADD PRIMARY KEY (`id`);

--
-- 資料表索引 `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`id`),
  ADD KEY `restaurant_fk_owner_id` (`owner_id`);

--
-- 資料表索引 `user_account`
--
ALTER TABLE `user_account`
  ADD PRIMARY KEY (`id`);

--
-- 已傾印資料表的限制式
--

--
-- 資料表的限制式 `restaurant`
--
ALTER TABLE `restaurant`
  ADD CONSTRAINT `restaurant_fk_owner_id` FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
