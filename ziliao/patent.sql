/*
SQLyog Ultimate v8.32 
MySQL - 5.5.36 : Database - patent-manage
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`patent-manage` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `patent-manage`;

/*Table structure for table `document` */

DROP TABLE IF EXISTS `document`;

CREATE TABLE `document` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `documentType` int(11) DEFAULT NULL COMMENT '0：交底书。。。。。。',
  `curDate` date DEFAULT NULL COMMENT '当前时间',
  `documentPath` varchar(255) DEFAULT NULL COMMENT '文档地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `document` */

/*Table structure for table `history` */

DROP TABLE IF EXISTS `history`;

CREATE TABLE `history` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `curDate` date DEFAULT NULL COMMENT '当前时间',
  `term` varchar(255) DEFAULT NULL COMMENT '修改项',
  `person` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `history` */

/*Table structure for table `patent` */

DROP TABLE IF EXISTS `patent`;

CREATE TABLE `patent` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '专利名称',
  `proposerName` varchar(255) DEFAULT NULL COMMENT '申请人中文名称（撰写人）',
  `caseNumber` varchar(255) DEFAULT NULL COMMENT '案件文号',
  `inventorName` varchar(255) DEFAULT NULL COMMENT '发明人中文名称',
  `applyNumber` varchar(255) DEFAULT NULL COMMENT '申请号',
  `technicalPerson` varchar(255) DEFAULT NULL COMMENT '技术联系人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `applyDate` date DEFAULT NULL COMMENT '申请日期',
  `lawStatus` varchar(255) DEFAULT NULL COMMENT '法律状态(直接写汉字就行)',
  `patentType` varchar(255) DEFAULT NULL COMMENT '专利类型(直接写汉字就行)',
  `status` int(11) DEFAULT NULL COMMENT '0:待审核1：审核未通过2：审核通过，未认领3：已被认领 4：交底书撰写5：',
  `batch` varchar(255) DEFAULT NULL COMMENT '批次',
  `userId` int(11) DEFAULT NULL COMMENT '用户id'
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `patent` */

/*Table structure for table `target` */

DROP TABLE IF EXISTS `target`;

CREATE TABLE `target` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '指标名称',
  `patentId` int(11) DEFAULT NULL COMMENT '所属专利',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `target` */

insert  into `target`(`id`,`name`,`patentId`) values (1,'少于10条bug',1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `status` int(11) DEFAULT NULL COMMENT '标志位0：管理员1：用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`,`status`) values (1,'admin','123456',0),(2,'张三','123456',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
