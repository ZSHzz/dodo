/*
Navicat MySQL Data Transfer

Source Server         : dodogame
Source Server Version : 50018
Source Host           : 10.51.163.135:3306
Source Database       : dodo

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2019-01-03 22:42:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for deleteuser
-- ----------------------------
DROP TABLE IF EXISTS `deleteuser`;
CREATE TABLE `deleteuser` (
  ` id` varchar(255) default NULL,
  `reason` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deleteuser
-- ----------------------------
INSERT INTO `deleteuser` VALUES ('222', '不好');

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game` (
  `gname` varchar(255) NOT NULL,
  `gprice` varchar(255) default NULL,
  `gtype` varchar(255) default NULL,
  PRIMARY KEY  (`gname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of game
-- ----------------------------
INSERT INTO `game` VALUES ('刀剑神域', '30元', '冒险');
INSERT INTO `game` VALUES ('守望先锋', '82', '即时');
INSERT INTO `game` VALUES ('极品飞车', '免费', '竞速');
INSERT INTO `game` VALUES ('欧兽世界', '28', ' 冒险');
INSERT INTO `game` VALUES ('炉石传说', '免费', '卡牌');
INSERT INTO `game` VALUES ('穿越火线', '21', '竞赛');
INSERT INTO `game` VALUES ('英雄联盟', '29', '战略');

-- ----------------------------
-- Table structure for gamepaihangbang
-- ----------------------------
DROP TABLE IF EXISTS `gamepaihangbang`;
CREATE TABLE `gamepaihangbang` (
  `paiming` int(255) NOT NULL,
  `gname` varchar(255) default NULL,
  `gprice` varchar(255) default NULL,
  `gdownloadtimes` int(255) NOT NULL,
  PRIMARY KEY  (`gdownloadtimes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gamepaihangbang
-- ----------------------------
INSERT INTO `gamepaihangbang` VALUES ('7', '极品飞车', '3', '30');
INSERT INTO `gamepaihangbang` VALUES ('6', '英雄联盟', '5', '50');
INSERT INTO `gamepaihangbang` VALUES ('3', '穿越火线', '10', '99');
INSERT INTO `gamepaihangbang` VALUES ('2', '炉石传说', '5', '100');
INSERT INTO `gamepaihangbang` VALUES ('1', '魔兽世界', '12', '101');
INSERT INTO `gamepaihangbang` VALUES ('5', '刀剑神域', '52', '150');
INSERT INTO `gamepaihangbang` VALUES ('4', '守望先锋', '3', '200');

-- ----------------------------
-- Table structure for gamepaihangbang1
-- ----------------------------
DROP TABLE IF EXISTS `gamepaihangbang1`;
CREATE TABLE `gamepaihangbang1` (
  `paiming` varchar(11) NOT NULL,
  PRIMARY KEY  (`paiming`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gamepaihangbang1
-- ----------------------------
INSERT INTO `gamepaihangbang1` VALUES ('1');
INSERT INTO `gamepaihangbang1` VALUES ('2');
INSERT INTO `gamepaihangbang1` VALUES ('3');
INSERT INTO `gamepaihangbang1` VALUES ('4');
INSERT INTO `gamepaihangbang1` VALUES ('5');
INSERT INTO `gamepaihangbang1` VALUES ('6');
INSERT INTO `gamepaihangbang1` VALUES ('7');

-- ----------------------------
-- Table structure for gameprice
-- ----------------------------
DROP TABLE IF EXISTS `gameprice`;
CREATE TABLE `gameprice` (
  `gprice` int(11) NOT NULL default '0',
  `gname` varchar(255) default NULL,
  `gdownloadtimes` varchar(255) default NULL,
  PRIMARY KEY  (`gprice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gameprice
-- ----------------------------
INSERT INTO `gameprice` VALUES ('22', '守望先锋', '77');
INSERT INTO `gameprice` VALUES ('32', '炉石传说', '120');
INSERT INTO `gameprice` VALUES ('34', '极品飞车', '741');
INSERT INTO `gameprice` VALUES ('54', '刀剑神域', '555');
INSERT INTO `gameprice` VALUES ('92', '穿越火线', '252');
INSERT INTO `gameprice` VALUES ('1000', '魔兽世界', '5252');
INSERT INTO `gameprice` VALUES ('5000', '英雄联盟', '50');

-- ----------------------------
-- Table structure for gonggao
-- ----------------------------
DROP TABLE IF EXISTS `gonggao`;
CREATE TABLE `gonggao` (
  `status` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `content` varchar(255) NOT NULL,
  `time` varchar(255) default NULL,
  `id` varchar(255) default NULL,
  PRIMARY KEY  (`content`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gonggao
-- ----------------------------
INSERT INTO `gonggao` VALUES ('管理员', '12', '啊哈', 'Thu Jan 03 21:37:24 CST 2019', '/10.51.163.135');

-- ----------------------------
-- Table structure for gpinjia
-- ----------------------------
DROP TABLE IF EXISTS `gpinjia`;
CREATE TABLE `gpinjia` (
  `name` varchar(255) NOT NULL,
  `status` varchar(255) default NULL,
  `pinjia` varchar(255) default NULL,
  `id` int(11) default NULL,
  PRIMARY KEY  (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gpinjia
-- ----------------------------
INSERT INTO `gpinjia` VALUES ('是啊', '用户', '一般 ', '88');

-- ----------------------------
-- Table structure for grenxinxi
-- ----------------------------
DROP TABLE IF EXISTS `grenxinxi`;
CREATE TABLE `grenxinxi` (
  `uname` varchar(255) default NULL,
  `upw` varchar(255) default NULL,
  `ujianjie` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grenxinxi
-- ----------------------------
INSERT INTO `grenxinxi` VALUES ('好啊啊啊', '123', '没啥好说地');

-- ----------------------------
-- Table structure for img
-- ----------------------------
DROP TABLE IF EXISTS `img`;
CREATE TABLE `img` (
  `uname` varchar(50) NOT NULL,
  `img` varchar(255) default NULL,
  PRIMARY KEY  (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of img
-- ----------------------------
INSERT INTO `img` VALUES ('989', '989.jpg');
INSERT INTO `img` VALUES ('okay', 'okay.jpg');

-- ----------------------------
-- Table structure for pinlun
-- ----------------------------
DROP TABLE IF EXISTS `pinlun`;
CREATE TABLE `pinlun` (
  `status` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `content` varchar(255) NOT NULL,
  `time` varchar(255) default NULL,
  `id` varchar(255) default NULL,
  PRIMARY KEY  (`content`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pinlun
-- ----------------------------
INSERT INTO `pinlun` VALUES ('商家', '989', '可以的呢', 'Thu Jan 03 19:25:48 CST 2019', '/10.51.163.135');

-- ----------------------------
-- Table structure for shoucang
-- ----------------------------
DROP TABLE IF EXISTS `shoucang`;
CREATE TABLE `shoucang` (
  `gname` varchar(255) NOT NULL,
  `type` varchar(255) default NULL,
  `id` int(11) default NULL,
  PRIMARY KEY  (`gname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shoucang
-- ----------------------------
INSERT INTO `shoucang` VALUES ('刀剑神域', '战略 ', '6');
INSERT INTO `shoucang` VALUES ('守望先锋', '战斗 ', '1');
INSERT INTO `shoucang` VALUES ('炉石传说', '战略 ', '7');
INSERT INTO `shoucang` VALUES ('穿越火线', '竞赛 ', '2');
INSERT INTO `shoucang` VALUES ('英雄联盟', '即时战略 ', '5');
INSERT INTO `shoucang` VALUES ('魔兽世界', '策略 ', '3');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(255) default NULL,
  `id` varchar(255) NOT NULL,
  `pw` varchar(255) default NULL,
  `status` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('你是谁', '543', '123', '管理员');
INSERT INTO `user` VALUES ('哦', '55', '55', '管理员');
INSERT INTO `user` VALUES ('啊我', '85', '58', '管理员');
INSERT INTO `user` VALUES ('是啊', '88', '881', '用户');
INSERT INTO `user` VALUES ('偶尔', '98', '98', '管理员');
INSERT INTO `user` VALUES ('okay', '989', '999', '商家');
