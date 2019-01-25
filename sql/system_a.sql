/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : system_a

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2019-01-24 09:00:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test1
-- ----------------------------
DROP TABLE IF EXISTS `test1`;
CREATE TABLE `test1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `age` int(5) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(5) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test1
-- ----------------------------

-- ----------------------------
-- Table structure for test2
-- ----------------------------
DROP TABLE IF EXISTS `test2`;
CREATE TABLE `test2` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `subid` varchar(50) DEFAULT NULL,
  `meid` varchar(50) DEFAULT NULL,
  `acid` varchar(50) DEFAULT NULL,
  `acname` varchar(50) DEFAULT NULL,
  `number` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test2
-- ----------------------------

-- ----------------------------
-- Table structure for test3
-- ----------------------------
DROP TABLE IF EXISTS `test3`;
CREATE TABLE `test3` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `telephone` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test3
-- ----------------------------
