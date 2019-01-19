/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : aaa

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-01-19 15:39:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admins`
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `id` varchar(20) NOT NULL,
  `adminName` varchar(30) NOT NULL,
  `adminstatus` varchar(10) NOT NULL,
  `isDel` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('13', 'ddh', '正常', '1');
INSERT INTO `admins` VALUES ('14', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('15', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a16', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a17', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a18', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a19', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a2', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a20', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a21', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a22', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a23', 'hhh', '正常', '0');
INSERT INTO `admins` VALUES ('a24', 'hhh', '正常', '1');
INSERT INTO `admins` VALUES ('a25', 'hhh', '正常', '1');
INSERT INTO `admins` VALUES ('a26', 'hhh', '正常', '1');
INSERT INTO `admins` VALUES ('a28', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a29', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a30', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a31', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a32', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a33', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a34', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a35', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('a36', 'hhh', '正常', null);
INSERT INTO `admins` VALUES ('aaa', 'chenjian', '冻结', null);
INSERT INTO `admins` VALUES ('bbb', 'zhangsan', '正常', null);
INSERT INTO `admins` VALUES ('ccc', 'wangwu', '正常', null);
