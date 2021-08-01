/*
Navicat MySQL Data Transfer

Source Server         : 本地MySQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : order_db2

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-08-01 16:24:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_order_1
-- ----------------------------
DROP TABLE IF EXISTS `t_order_1`;
CREATE TABLE `t_order_1` (
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `price` decimal(10,2) NOT NULL COMMENT '订单价格',
  `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
  `status` varchar(50) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_1
-- ----------------------------
INSERT INTO `t_order_1` VALUES ('628625124131602432', '2.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124186128384', '4.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124240654336', '6.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124286791680', '8.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124337123328', '10.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124383260672', '12.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124425203712', '14.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124467146752', '16.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628625124513284096', '18.00', '1', 'success');

-- ----------------------------
-- Table structure for t_order_2
-- ----------------------------
DROP TABLE IF EXISTS `t_order_2`;
CREATE TABLE `t_order_2` (
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `price` decimal(10,2) NOT NULL COMMENT '订单价格',
  `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
  `status` varchar(50) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_2
-- ----------------------------
INSERT INTO `t_order_2` VALUES ('628625123523428353', '1.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124165156865', '3.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124219682817', '5.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124265820161', '7.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124311957505', '9.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124362289153', '11.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124404232193', '13.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124446175233', '15.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124492312577', '17.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628625124538449921', '19.00', '1', 'success');
SET FOREIGN_KEY_CHECKS=1;
