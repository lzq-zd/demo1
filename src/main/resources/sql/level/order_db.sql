/*
Navicat MySQL Data Transfer

Source Server         : 本地MySQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : order_db

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-08-01 15:44:19
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
INSERT INTO `t_order_1` VALUES ('628369459580502016', '2.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459626639360', '4.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459672776704', '6.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459718914048', '8.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459773440000', '10.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459815383040', '12.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459857326080', '14.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459907657728', '16.00', '1', 'success');
INSERT INTO `t_order_1` VALUES ('628369459953795072', '18.00', '1', 'success');

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
INSERT INTO `t_order_2` VALUES ('628365293265092609', '11.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628368506596884481', '11.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628368899208904705', '11.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369069942243329', '11.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459047825409', '1.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459601473537', '3.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459651805185', '5.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459693748225', '7.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459739885569', '9.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459794411521', '11.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459836354561', '13.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459882491905', '15.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459932823553', '17.00', '1', 'success');
INSERT INTO `t_order_2` VALUES ('628369459974766593', '19.00', '1', 'success');
SET FOREIGN_KEY_CHECKS=1;
