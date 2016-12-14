/*
SQLyog v10.2 
MySQL - 5.5.28 : Database - student
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`student` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `student`;

/*Table structure for table `stu` */

DROP TABLE IF EXISTS `stu`;

CREATE TABLE `stu` (
  `sno` varchar(20) NOT NULL,
  `sname` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gander` varchar(2) DEFAULT NULL,
  `math` int(11) DEFAULT NULL,
  `chinese` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stu` */

insert  into `stu`(`sno`,`sname`,`age`,`gander`,`math`,`chinese`,`english`) values ('1','刘裕',20,'男',90,90,90),('2','刘裕',20,'男',85,85,99),('201510210000','桓温',32,'男',88,45,14),('201510214823','谢安',26,'男',54,96,64),('3','王导',20,'男',99,90,90);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
