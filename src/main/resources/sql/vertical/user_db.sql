/*
Navicat MySQL Data Transfer

Source Server         : 本地MySQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : user_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-08-01 17:01:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `fullname` varchar(255) NOT NULL COMMENT '用户姓名',
  `user_type` char(1) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2', 'lzq2', null);
INSERT INTO `t_user` VALUES ('3', 'lzq3', null);
INSERT INTO `t_user` VALUES ('4', 'lzq4', null);
INSERT INTO `t_user` VALUES ('5', 'lzq5', null);
INSERT INTO `t_user` VALUES ('6', 'lzq6', null);
INSERT INTO `t_user` VALUES ('7', 'lzq7', null);
INSERT INTO `t_user` VALUES ('8', 'lzq8', null);
INSERT INTO `t_user` VALUES ('9', 'lzq9', null);
INSERT INTO `t_user` VALUES ('10', 'lzq10', null);
INSERT INTO `t_user` VALUES ('11', 'lzq11', null);
INSERT INTO `t_user` VALUES ('12', 'lzq12', null);
INSERT INTO `t_user` VALUES ('13', 'lzq13', null);
INSERT INTO `t_user` VALUES ('14', 'lzq14', null);
INSERT INTO `t_user` VALUES ('15', 'lzq15', null);
INSERT INTO `t_user` VALUES ('16', 'lzq16', null);
INSERT INTO `t_user` VALUES ('17', 'lzq17', null);
INSERT INTO `t_user` VALUES ('18', 'lzq18', null);
INSERT INTO `t_user` VALUES ('19', 'lzq19', null);
INSERT INTO `t_user` VALUES ('20', 'lzq20', null);
SET FOREIGN_KEY_CHECKS=1;
