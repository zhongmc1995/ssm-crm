-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.15-1-log - (Debian)
-- 服务器操作系统:                      Linux
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 ssm_crm 的数据库结构
CREATE DATABASE IF NOT EXISTS `ssm_crm` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `ssm_crm`;

-- 导出  表 ssm_crm.role_user 结构
CREATE TABLE IF NOT EXISTS `role_user` (
  `roleid` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  PRIMARY KEY (`roleid`,`userid`),
  KEY `fk_t_role_has_t_user_t_user1_idx` (`userid`),
  KEY `fk_t_role_has_t_user_t_role_idx` (`roleid`),
  CONSTRAINT `fk_t_role_has_t_user_t_role` FOREIGN KEY (`roleid`) REFERENCES `t_role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_role_has_t_user_t_user1` FOREIGN KEY (`userid`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  ssm_crm.role_user 的数据：~10 rows (大约)
/*!40000 ALTER TABLE `role_user` DISABLE KEYS */;
INSERT INTO `role_user` (`roleid`, `userid`) VALUES
	(1, 1);
/*!40000 ALTER TABLE `role_user` ENABLE KEYS */;

-- 导出  表 ssm_crm.t_role 结构
CREATE TABLE IF NOT EXISTS `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(45) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 正在导出表  ssm_crm.t_role 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `t_role` DISABLE KEYS */;
INSERT INTO `t_role` (`id`, `rolename`) VALUES
	(1, '管理员'),
	(2, '经理'),
	(3, '员工');
/*!40000 ALTER TABLE `t_role` ENABLE KEYS */;

-- 导出  表 ssm_crm.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL COMMENT '员工姓名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `tel` varchar(45) DEFAULT NULL COMMENT '手机号码',
  `createtime` varchar(45) DEFAULT NULL COMMENT '创建时间',
  `state` varchar(45) DEFAULT NULL COMMENT '员工状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- 正在导出表  ssm_crm.t_user 的数据：~13 rows (大约)
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`id`, `username`, `password`, `tel`, `createtime`, `state`) VALUES
	(1, 'admin', '4d49cc60a4dfbda3ea0aa59994cbc78c', '13800800800', '2017-01-01 00:00', '正常'),
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
