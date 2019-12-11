/*
SQLyog Professional v13.1.1 (64 bit)
MySQL - 5.7.24 : Database - trebol_2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`trebol_2` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `trebol_2`;

/*Table structure for table `trebol_anticipos` */

DROP TABLE IF EXISTS `trebol_anticipos`;

CREATE TABLE `trebol_anticipos` (
  `id_factura` int(4) DEFAULT NULL,
  `id_tipo_factura` int(4) DEFAULT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `id_factura` (`id_factura`),
  KEY `id_tipo_factura` (`id_tipo_factura`),
  CONSTRAINT `trebol_anticipos_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_anticipos_ibfk_2` FOREIGN KEY (`id_tipo_factura`) REFERENCES `trebol_tipo_factura` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_anticipos` */

/*Table structure for table `trebol_aprobaciones` */

DROP TABLE IF EXISTS `trebol_aprobaciones`;

CREATE TABLE `trebol_aprobaciones` (
  `id_factura` int(4) NOT NULL,
  `id_area` int(4) NOT NULL,
  `id_usuario` int(4) DEFAULT NULL,
  `aprobado` tinyint(1) NOT NULL DEFAULT '0',
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_factura`,`id_area`),
  KEY `id_factura` (`id_factura`),
  KEY `id_area` (`id_area`),
  CONSTRAINT `trebol_aprobaciones_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_aprobaciones_ibfk_2` FOREIGN KEY (`id_area`) REFERENCES `trebol_areas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_aprobaciones` */

/*Table structure for table `trebol_areas` */

DROP TABLE IF EXISTS `trebol_areas`;

CREATE TABLE `trebol_areas` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `nombre_area` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_areas` */

insert  into `trebol_areas`(`id`,`nombre_area`,`creacion`,`modificacion`) values 
(1,'Administrativo','2019-11-28 10:43:22','2019-11-28 10:43:22'),
(2,'Capital Humano','2019-11-28 10:43:31','2019-11-28 10:43:31'),
(3,'Compras','2019-11-28 10:43:34','2019-11-28 10:43:34'),
(4,'Contabilidad','2019-11-28 10:43:36','2019-11-28 10:43:36'),
(5,'Contabilidad_Rev','2019-11-28 10:44:08','2019-11-28 10:44:08'),
(6,'Correspondencia','2019-11-28 10:44:14','2019-11-28 10:44:14'),
(7,'Recepción','2019-11-28 10:44:19','2019-11-28 10:44:19'),
(8,'Tecnología','2019-11-28 10:44:25','2019-11-28 10:44:25'),
(9,'Tesoreria','2019-11-28 10:44:30','2019-11-28 10:44:30'),
(10,'AdminTrebol','2019-11-28 10:44:35','2019-11-28 10:44:35'),
(11,'Sin Grupo','2019-11-28 10:44:45','2019-11-28 10:44:45');

/*Table structure for table `trebol_bancos` */

DROP TABLE IF EXISTS `trebol_bancos`;

CREATE TABLE `trebol_bancos` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `nomb_banco` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_bancos` */

/*Table structure for table `trebol_comentarios` */

DROP TABLE IF EXISTS `trebol_comentarios`;

CREATE TABLE `trebol_comentarios` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `id_usuario` int(4) DEFAULT NULL,
  `id_factura` int(4) DEFAULT NULL,
  `id_estado` int(4) DEFAULT NULL,
  `detalle` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_factura` (`id_factura`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `trebol_comentarios_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `trebol_usuario` (`id`),
  CONSTRAINT `trebol_comentarios_ibfk_2` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_comentarios_ibfk_3` FOREIGN KEY (`id_estado`) REFERENCES `trebol_estados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_comentarios` */

/*Table structure for table `trebol_convenios` */

DROP TABLE IF EXISTS `trebol_convenios`;

CREATE TABLE `trebol_convenios` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `no_cuenta` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `cantidad_mes` int(2) NOT NULL,
  `id_proveedor` int(4) NOT NULL,
  `id_empresa` int(4) NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_proveedor` (`id_proveedor`),
  KEY `id_empresa` (`id_empresa`),
  CONSTRAINT `trebol_convenios_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `trebol_proveedor` (`id`),
  CONSTRAINT `trebol_convenios_ibfk_2` FOREIGN KEY (`id_empresa`) REFERENCES `trebol_empresa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_convenios` */

insert  into `trebol_convenios`(`id`,`no_cuenta`,`cantidad_mes`,`id_proveedor`,`id_empresa`,`creacion`,`modificacion`) values 
(1,'100575',1,2,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(2,'100576',1,2,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(3,'100577',1,2,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(4,'100579',1,2,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(5,'100580',1,2,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(6,'100620',1,2,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(7,'100578',1,2,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(8,'3274192-3',1,14,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(9,'3261578-6',1,14,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(10,'3274186-4',1,14,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(11,'3274188-8',1,14,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(12,'3274189-0',1,14,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(13,'3274190-9',1,14,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(14,'3274191-1',1,14,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(15,'30976944',1,15,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(16,'11221236',2,18,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(17,'12053207520',1,34,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(18,'16445975',1,37,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(19,'16486393',1,37,3,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(20,'30686868',1,15,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(21,'6120',1,65,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(22,'H416788',1,41,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(23,'4537937-9',1,14,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(24,'4537938-1',1,14,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(25,'2403174',1,33,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(26,'2403175',1,33,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(27,'13201540',1,37,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(28,'16538526',1,37,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(29,'16528521',1,37,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(30,'120531181586',1,34,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(31,'7561682',1,30,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(32,'2861852',1,35,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(33,'212891',1,1,2,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(34,'5134911-8',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(35,'813875-0',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(36,'414830-5',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(37,'414840-2 ',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(38,'414838-1',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(39,'414839-3',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(40,'941763-8',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(41,'941989-6',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(42,'941988-4',1,14,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(43,'63257850',1,26,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(44,'129122',1,36,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(45,'10730266',1,32,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(46,'10730297',1,32,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(47,'10330074',1,32,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(48,'10330089',1,32,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(49,'10301619',1,32,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(50,'10330093',1,32,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(51,'12053181590',1,34,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(52,'2727707',1,34,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(53,'7767730',1,34,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(54,'675865441',1,34,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(55,'12051289201',1,34,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(56,'23730636',1,15,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(57,'14750394',1,15,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(58,'16723651',1,37,1,'2019-12-04 08:41:50','2019-12-04 08:41:50'),
(59,'16696662',1,37,1,'2019-12-04 08:41:50','2019-12-04 08:41:50');

/*Table structure for table `trebol_correos` */

DROP TABLE IF EXISTS `trebol_correos`;

CREATE TABLE `trebol_correos` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `id_factura` int(4) NOT NULL,
  `enviado` tinyint(4) NOT NULL DEFAULT '0',
  `fecha_enviado` datetime DEFAULT NULL,
  `destinatario` longtext COLLATE utf8_spanish_ci NOT NULL,
  `asunto` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `mensaje` text COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_factura` (`id_factura`),
  CONSTRAINT `trebol_correos_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_correos` */

/*Table structure for table `trebol_documentos` */

DROP TABLE IF EXISTS `trebol_documentos`;

CREATE TABLE `trebol_documentos` (
  `id_factura` int(4) NOT NULL,
  `id_tipo_doc` int(4) NOT NULL,
  `consecutivo` varchar(6) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ubicacion` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_tipo_doc`,`id_factura`),
  KEY `id_factura` (`id_factura`),
  CONSTRAINT `trebol_documentos_ibfk_1` FOREIGN KEY (`id_tipo_doc`) REFERENCES `trebol_tipo_documento` (`id`),
  CONSTRAINT `trebol_documentos_ibfk_2` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_documentos` */

/*Table structure for table `trebol_empresa` */

DROP TABLE IF EXISTS `trebol_empresa`;

CREATE TABLE `trebol_empresa` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `nom_empresa` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_empresa` */

insert  into `trebol_empresa`(`id`,`nom_empresa`,`creacion`,`modificacion`) values 
(1,'Aviomar','2019-11-28 10:45:50','2019-11-28 10:45:50'),
(2,'Colvan','2019-11-28 10:45:53','2019-11-28 10:45:53'),
(3,'Snider','2019-11-28 10:45:54','2019-11-28 10:45:54');

/*Table structure for table `trebol_estados` */

DROP TABLE IF EXISTS `trebol_estados`;

CREATE TABLE `trebol_estados` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `nom_estado` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_estados` */

insert  into `trebol_estados`(`id`,`nom_estado`,`creacion`,`modificacion`) values 
(1,'Anulada','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(2,'Aprobación','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(3,'Aprobación Area','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(4,'Contabilizar','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(5,'Corrección','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(6,'Creación','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(7,'Finalizada','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(8,'Gestión','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(9,'Por Pagar','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(10,'Programada','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(11,'Rechazada','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(12,'Retirada','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(13,'Revisión','2019-12-04 11:43:16','2019-12-04 11:43:16'),
(14,'Sin Asignar','2019-12-04 11:43:16','2019-12-04 11:43:16');

/*Table structure for table `trebol_factura_convenio` */

DROP TABLE IF EXISTS `trebol_factura_convenio`;

CREATE TABLE `trebol_factura_convenio` (
  `id_factura` int(4) DEFAULT NULL,
  `id_convenio` int(4) DEFAULT NULL,
  `activo` tinyint(2) NOT NULL DEFAULT '1',
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `id_factura` (`id_factura`),
  KEY `id_convenio` (`id_convenio`),
  CONSTRAINT `trebol_factura_convenio_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_factura_convenio_ibfk_2` FOREIGN KEY (`id_convenio`) REFERENCES `trebol_convenios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_factura_convenio` */

/*Table structure for table `trebol_facturas` */

DROP TABLE IF EXISTS `trebol_facturas`;

CREATE TABLE `trebol_facturas` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `no_factura` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `valor` double(20,2) NOT NULL,
  `moneda` varchar(3) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_generada` date NOT NULL,
  `fecha_venc` date DEFAULT NULL,
  `no_radicado` varchar(15) COLLATE utf8_spanish_ci DEFAULT NULL,
  `aprobada` tinyint(2) NOT NULL DEFAULT '0',
  `revisada` tinyint(2) NOT NULL DEFAULT '0',
  `id_proveedor` int(4) NOT NULL,
  `id_tipo_factura` int(4) NOT NULL,
  `id_gestion` int(4) NOT NULL,
  `id_area` int(4) NOT NULL,
  `id_empresa` int(4) NOT NULL,
  `id_estado` int(4) NOT NULL DEFAULT '8',
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_tipo_factura` (`id_tipo_factura`),
  KEY `id_gestion` (`id_gestion`),
  KEY `id_area` (`id_area`),
  KEY `id_empresa` (`id_empresa`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `trebol_facturas_ibfk_1` FOREIGN KEY (`id_tipo_factura`) REFERENCES `trebol_tipo_factura` (`id`),
  CONSTRAINT `trebol_facturas_ibfk_2` FOREIGN KEY (`id_gestion`) REFERENCES `trebol_areas` (`id`),
  CONSTRAINT `trebol_facturas_ibfk_3` FOREIGN KEY (`id_area`) REFERENCES `trebol_areas` (`id`),
  CONSTRAINT `trebol_facturas_ibfk_4` FOREIGN KEY (`id_empresa`) REFERENCES `trebol_empresa` (`id`),
  CONSTRAINT `trebol_facturas_ibfk_5` FOREIGN KEY (`id_estado`) REFERENCES `trebol_estados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_facturas` */

/*Table structure for table `trebol_logs` */

DROP TABLE IF EXISTS `trebol_logs`;

CREATE TABLE `trebol_logs` (
  `id_usuario` int(4) NOT NULL,
  `id_factura` int(4) NOT NULL,
  `id_comentario` int(4) DEFAULT NULL,
  `id_estado` int(4) NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `id_usuario` (`id_usuario`),
  KEY `id_factura` (`id_factura`),
  KEY `id_comentario` (`id_comentario`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `trebol_logs_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `trebol_usuario` (`id`),
  CONSTRAINT `trebol_logs_ibfk_2` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_logs_ibfk_4` FOREIGN KEY (`id_estado`) REFERENCES `trebol_estados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_logs` */

/*Table structure for table `trebol_lote_facturas` */

DROP TABLE IF EXISTS `trebol_lote_facturas`;

CREATE TABLE `trebol_lote_facturas` (
  `id_factura` int(4) DEFAULT NULL,
  `id_lote` int(4) DEFAULT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `id_factura` (`id_factura`),
  KEY `id_lote` (`id_lote`),
  CONSTRAINT `trebol_lote_facturas_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_lote_facturas_ibfk_2` FOREIGN KEY (`id_lote`) REFERENCES `trebol_lotes_pago` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_lote_facturas` */

/*Table structure for table `trebol_lotes_pago` */

DROP TABLE IF EXISTS `trebol_lotes_pago`;

CREATE TABLE `trebol_lotes_pago` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `nombre_lote` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `valor` double(20,2) NOT NULL,
  `fecha` date NOT NULL,
  `id_banco` int(4) NOT NULL,
  `id_empresa` int(4) NOT NULL,
  `id_estado` int(4) NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_banco` (`id_banco`),
  KEY `id_empresa` (`id_empresa`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `trebol_lotes_pago_ibfk_1` FOREIGN KEY (`id_banco`) REFERENCES `trebol_bancos` (`id`),
  CONSTRAINT `trebol_lotes_pago_ibfk_2` FOREIGN KEY (`id_empresa`) REFERENCES `trebol_empresa` (`id`),
  CONSTRAINT `trebol_lotes_pago_ibfk_3` FOREIGN KEY (`id_estado`) REFERENCES `trebol_estados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_lotes_pago` */

/*Table structure for table `trebol_motivos_rechazo` */

DROP TABLE IF EXISTS `trebol_motivos_rechazo`;

CREATE TABLE `trebol_motivos_rechazo` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `motivo` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `id_proceso` int(4) NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_proceso` (`id_proceso`),
  CONSTRAINT `trebol_motivos_rechazo_ibfk_1` FOREIGN KEY (`id_proceso`) REFERENCES `trebol_procesos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_motivos_rechazo` */

/*Table structure for table `trebol_procesos` */

DROP TABLE IF EXISTS `trebol_procesos`;

CREATE TABLE `trebol_procesos` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `proceso` varchar(150) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_procesos` */

/*Table structure for table `trebol_programaciones` */

DROP TABLE IF EXISTS `trebol_programaciones`;

CREATE TABLE `trebol_programaciones` (
  `id_factura` int(4) NOT NULL,
  `id_usuario` int(4) NOT NULL,
  `fecha_prog` date NOT NULL,
  `activo` tinyint(4) NOT NULL DEFAULT '1',
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_usuario`,`id_factura`),
  KEY `id_factura` (`id_factura`),
  CONSTRAINT `trebol_programaciones_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_programaciones_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `trebol_usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_programaciones` */

/*Table structure for table `trebol_proveedor` */

DROP TABLE IF EXISTS `trebol_proveedor`;

CREATE TABLE `trebol_proveedor` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `nit` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `razon_social` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `correo` varchar(60) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `telefono` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `id_tipo_factura` int(4) NOT NULL,
  `id_area` int(4) NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_area` (`id_area`),
  KEY `id_tipo_factura` (`id_tipo_factura`),
  CONSTRAINT `trebol_proveedor_ibfk_1` FOREIGN KEY (`id_area`) REFERENCES `trebol_areas` (`id`),
  CONSTRAINT `trebol_proveedor_ibfk_2` FOREIGN KEY (`id_tipo_factura`) REFERENCES `trebol_tipo_factura` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_proveedor` */

insert  into `trebol_proveedor`(`id`,`nit`,`razon_social`,`correo`,`direccion`,`telefono`,`id_tipo_factura`,`id_area`,`creacion`,`modificacion`) values 
(1,'800252396','AGUAS DE CARTAGENA SA ESP','www.acuacar.com','CR 13B 26  78 EDF CHAMBACU','6504100',28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(2,'900021737','AGUAS DE LA SABANA DE BOGOTA SA',NULL,'GLORIETA SIBERIA KM 5 AUTOPISTA MEDELLIN',NULL,28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(3,'830112759','ALIANZA EMPRESARIAL PARA UN COMERCIO SEGURO BASC','BASCBOGOTA@WBASCO.ORG','CR 7 32 29  P5','7560814',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(4,'900437879','ALIANZA FIDUCIARIA S A',NULL,'AV 15 100 43 P 3','6447700',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(5,'860531315','ALIANZA FIDUCIARIA SA','wbecerra@alianza.com.co','AV 15 100 43 P4','6447700',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(6,'900581589','AP CONSULTORES Y AUDITORES S A S',NULL,'CALLE 126 7 C 45 INT 301','8113411',21,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(7,'860023129','ASOCIACION COLOMBIANA DE REUMATOLOGIA','asoreuma@gmail.com','CL 94  15  32 OF 603','6350840',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(8,'860051356','ATLANTA CIA DE VIGILANCIA PRIVADA LTDA','COMERCIAL@ATLANTAVIGILANCIA.COM','CL 74 22 69','2120907',30,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(9,'830097265','AUDI CONSULTORES',NULL,NULL,NULL,21,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(10,'900252600','CAMARA DE COMERCIO E INDUSTRIA COLOMBO CHILENA',NULL,'AV 19 120 71 OF 214B','4806051',4,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(11,'900293637','CENTRAL COMERCIALIZADORA DE INTERNET S A S','info@centralcomercializadora.com','CL 93 B 11 A 84 LC 409','6355154',25,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(12,'364444','CENTRAL COOPERATIVA DE SERVICIOS FUNERARIOS',NULL,'CRA 15 97 60','6460000',11,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(13,'900085118','CHOCOBRAND PRODUCTOS ALIMENTICIOS SAS',NULL,'TV 22 A 61 C 23 BRR SAN LUIS','3466673',11,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(14,'830037248','CODENSA S A',NULL,'CR 13 A 93 66','6016060',28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(15,'830122566','COLOMBIA TELECOMUNICACIONES S A ESP','infopagos.ct@telefonica.com','TV 60 114 A 55','7050000 ex76728',28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(16,'900165105','COLOMBIAHOSTING SAS',NULL,'CL 64 N 5 B OF 305 G CENTRO EMPRESA','4854089',25,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(17,'830513729','COMBUSTIBLES DE COLOMBIA SA','FERNANDO.CHAVEZ@COMBUSCOL.COM','CL 9 46 96 OF 303','5518659',13,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(18,'800153993','COMCEL SA',NULL,'CL 90 14 37','6181818',28,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(19,'900308794','COMPLEJO LOGISTICO E INDUSTRIAL SIBERIA',NULL,'VDA VUELTA GRANDE MCP DE COTA','3112853379',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(20,'51766975','CONGOTE SANCLEMENTE MARIA VICTORIA',NULL,'CL 141 7B 86 APTO 707','6276169',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(21,'830063376','CONSORCIO EXEQUIAL  S A S',NULL,'CR 11 69 11','3450188',11,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(22,'860520547','COOPERATIVA MULTIACTIVA DE LA AVIACION CIVIL COLOM','jpuerto@coopedac.com','AV CL 26 100 45 OF 202','4139887',5,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(23,'800136505','DATECSA SA','DATECSABOGOTA@DATECSA.COM','CR 40 12 A 79 ACOPI','6661346',26,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(24,'901103485','DIGITAL PLOT SAS','digitalplot.impresion@gmail.com','CR 5 22 66','2868218',15,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(25,'5206','DIGITAL RIVER IRELAND LTD',NULL,'UNIT 153 SHANNON FREE ZONE',NULL,24,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(26,'805006014','DIRECTV COLOMBIA LTDA',NULL,'CL 93 16 25','6516000',28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(27,'900338878','E&M DESARROLLO CORPORATIVO LTDA',NULL,NULL,NULL,17,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(28,'900749884','EASYMAIL S A S','GMATEUS@EASYMAIL.COM.CO','CL 74 22 20','4593522',27,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(29,'800135107','EDIFICIO CENTRO EJECUTIVO',NULL,'CR 10 96 25','6101005',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(30,'802007670','ELECTRICARIBE SA ESP',NULL,'TR 52 21A 53',NULL,28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(31,'800126785','EMERMEDICA S A SERVICIOS DE AMBULANCIA PREPAGADOS','ADMINISTRACION@EMERMEDICA','CR 19 B 168 35','3077098',11,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(32,'899999094','EMPRESA DE ACUEDUCTO Y ALCANTARILLADO DE BOGOTA',NULL,'CL 24 37 15',NULL,28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(33,'800135729','EMPRESA DE RECURSOS TECNOLOGICOS S A EPS',NULL,'CTRO COMERCIAL PACIFIC TRAVE CENTER','2400000',23,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(34,'899999115','EMPRESA DE TELECOMUNICACIONES DE BOGOTA SA ESP','asuntos.contenciosos@etb.com.co','CR 8 20 56 P9','2422720',28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(35,'800249860','EMPRESAS DE ENERGIA DEL PACIFICO SA ESP','www.epsa.com.co','CL 15 29B 30 AUTOPISTA CALI YUMBO',NULL,28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(36,'890399003','EMPRESAS MUNICIPALES DE CALI EIC ESP',NULL,'AV 2 N 10 65 CAM TO EMCALI P 3','8856060',28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(37,'900092385','EPM TELECOMUNICACIONES SA EPS',NULL,'CR 16 11A SUR 100',NULL,28,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(38,'860502844','FEDERACION COLOMBIANA DE AGENTES LOGISTICOS EN COM','INFO@FITAC.NET','CR 103 25 F 50 OF 106','4135082',4,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(39,'800215227','G4S TECHNOLOGY COLOMBIA S A','JUAN.OSPINA@CO.G4S.COM','AV CL 26 69 A 51 TO A IN 9 3','7054040',16,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(40,'17182808','GUZMAN MOSQUERA FERNANDO','FERNANDO.GUZMAN@KIEHNE-N','VDA LOURDES FCA SAN JOSE CA 1','4227670',20,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(41,'835001396','HIDROPACIFICIO SA EPS','www.hidropacifico.com','DIAG 3 CRA 4','2405002',28,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(42,'802007384','HVR S A S','achtbq@hotmail.com','VIA 40 73 290 OF 715','3537299',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(43,'900064320','INMOBILIARIA CHABA S EN C','flacha90@yahoo.com','CR 7 A 123 24 OF 501','6297585',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(44,'900260048','ITSEC SAS','GERENCIA@ITSECLTDA.NET','AV JIMENEZ 4 03 OF 1302','7510713',14,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(45,'830002115','JUAN BAUTISTA SALUD OCUPACIONAL S A S','gerencia@ocupacionaljb.com','AV CR 30 46 86 90','7444003',17,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(46,'860039988','LIBERTY SEGUROS S A',NULL,'CL 72 10 07 P 1','3103300',19,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(47,'860509245','M.F BORRERO OSPINA & CIA',NULL,NULL,NULL,7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(48,'830079015','MELTEC COMUNICACIONES SA','info@meltec.com.co','CL 130 A 58 A 29','1444899',6,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(49,'900632226','MENSAJEROS URBANOS','cartera@mensajerosurbanos.com',NULL,'3297445',27,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(50,'900648071','MOVIL INC INTEGRADORES DE SOLUCIONES MOVILES',NULL,'CALLE 103 69B 42','8003621',6,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(51,'900672953','NIMBUTECH SAS','comercial@nimbutech.com','CR 12 90 20 OF 302','6228320',14,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(52,'364905079','NODRIZA US LLC','jc@nodriza.io','2330 PONCE DE LEON BLVD','7862240456',24,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(53,'860001449','OPTICA COLOMBIANA SA','contab@opticacolombiana.com','CL 72 13 49 P 3','3264500',5,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(54,'900905197','OPTIMIZAR LOGISTICA S A S','gerencia@optimizarlog.com.co','CR 46 22 B 20 ED SALITRE OFFICE','3007485839',21,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(55,'805012921','PATRIMONIOS AUTONOMOS ACCION FIDUCIARIA',NULL,'AV 4 NORTE 4 N 30','6601382',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(56,'830123806','PINT PHARMA COLOMBIA S A S','info@vitalchemlab.com','CR  13 85 39 OF 306','6918688',18,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(57,'900139882','POLIGRAFIA CONSULTORIAS E INVESTIGACIONES','pedrolo@hotmail.com','CL 162 54 95 CON BRISAS DE SOTAVENTO','6785441',17,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(58,'16475800','POSSO ZUNIGA EDGAR',NULL,'CL 2 5 B 65 SEC LA BAVARIA','2417393',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(59,'900850609','PROYECTO OPTIMUS COMPLEJO EMPRESARIAL Y HOTELERO P','admonoptimusph@gmail.com','CL 26 96 J 90','3223065350',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(60,'91438506','RENDON RUEDA RICARDO','RRR0512@GMAIL.COM','AC 145 85 80 CA 169','8047703',12,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(61,'860500324','RICO LARA ASESORIAS S A S','JORICO@COLOMSAT.NET.CO','CL 94 A 13 91 OF 201 ED C 14','2559027',10,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(62,'900777038','RUIZ Y ALVAREZ ASOCIADOS SAS','ruizalvarezasociados@gmail.com','CLL 93B 17 25 OF 209','3099082',9,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(63,'800130907','SALUD TOTAL EPS',NULL,NULL,NULL,11,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(64,'800250741','SEGURTRONIC LTDA','GERENCIAGENERAL@SEGURTRONIC.COM','CL 47 D 79 39','4441926',29,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(65,'900401393','SERVICIOS EN COMUNICACIONES Y REDES SAS','jrebelo@sercomred.net','CR 3 2 37 SEC CENTRO','2402276',23,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(66,'890319193','SISTEMAS DE INFORMACION EMPRESARIAL SA','JCR@SIESA.COM','AV 3 A N 26 N 83','4865888',31,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(67,'900230287','SMART LOGISTIC DE COLOMBIA LTDA','smartdecolombia@otlook.com','CR 91 71A 52','4383786',12,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(68,'900557095','SUMA ARQIETCTONICA S.A.S','CONTABILIDAD@SUMAARQUITECTONICA.COM','CL 87 15 23 OF 603','6362329',7,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(69,'830027602','SUPER CON SPC SAS',NULL,'CALLE 128 B # 58B-47','3003764',22,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(70,'900098537','SYG SOLUCIONES Y GESTION SAS','edna.sanchez@sygsolucionesygestion.com','CL 103 C 63 39','6024616',8,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(71,'830043232','SYSTEMS Y COMPUTERS TECHNOLOGY DE COLOMBIA S A S',NULL,'AV CL 24 95 A 80 OF 611','7024609',24,8,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(72,'830033294','TRANS INTERNATIONAL COURIER S A S','OLGARODRIGUEZ@TRANSINTCO.COM','CRA 59 A 44 B 39','2212153',27,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(73,'860075558','UNIVERSIDAD DE LA SABANA','cartera.financiacion@unisabana.edu.co','km 7 Autopista Norte, Bogotá','8615555',12,2,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(74,'900663216','VERA TOVAR Y PULIDO ABOGADOS','info@veratypabogados.com','Carrera 47 A # 95-56 of 501','8051341',10,1,'2019-12-04 08:41:23','2019-12-04 08:41:23'),
(75,'800209088','VIPERS SEGURIDAD',NULL,'CALLE 29 No. 18-81','7867813',17,2,'2019-12-04 08:41:23','2019-12-04 08:41:23');

/*Table structure for table `trebol_revisiones` */

DROP TABLE IF EXISTS `trebol_revisiones`;

CREATE TABLE `trebol_revisiones` (
  `id_factura` int(4) NOT NULL,
  `id_usuario` int(4) NOT NULL,
  `aprobado` tinyint(1) NOT NULL DEFAULT '0',
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_usuario`,`id_factura`),
  KEY `id_factura` (`id_factura`),
  CONSTRAINT `trebol_revisiones_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_revisiones_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `trebol_usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_revisiones` */

/*Table structure for table `trebol_sistema_uno` */

DROP TABLE IF EXISTS `trebol_sistema_uno`;

CREATE TABLE `trebol_sistema_uno` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `nit` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `no_factura` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `valor` double(20,2) DEFAULT NULL,
  `consecutivo` varchar(6) COLLATE utf8_spanish_ci NOT NULL,
  `id_empresa` int(4) NOT NULL,
  `id_tipo_doc` int(4) NOT NULL,
  `ubicacion` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_empresa` (`id_empresa`),
  KEY `id_tipo_doc` (`id_tipo_doc`),
  CONSTRAINT `trebol_sistema_uno_ibfk_1` FOREIGN KEY (`id_empresa`) REFERENCES `trebol_empresa` (`id`),
  CONSTRAINT `trebol_sistema_uno_ibfk_2` FOREIGN KEY (`id_tipo_doc`) REFERENCES `trebol_tipo_documento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_sistema_uno` */

/*Table structure for table `trebol_tiempos` */

DROP TABLE IF EXISTS `trebol_tiempos`;

CREATE TABLE `trebol_tiempos` (
  `id_usuario` int(4) DEFAULT NULL,
  `id_factura` int(4) DEFAULT NULL,
  `id_estado_prev` int(4) DEFAULT NULL,
  `id_estado_post` int(4) DEFAULT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `id_usuario` (`id_usuario`),
  KEY `id_factura` (`id_factura`),
  KEY `id_estado_prev` (`id_estado_prev`),
  KEY `id_estado_post` (`id_estado_post`),
  CONSTRAINT `trebol_tiempos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `trebol_usuario` (`id`),
  CONSTRAINT `trebol_tiempos_ibfk_2` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_tiempos_ibfk_3` FOREIGN KEY (`id_estado_prev`) REFERENCES `trebol_estados` (`id`),
  CONSTRAINT `trebol_tiempos_ibfk_4` FOREIGN KEY (`id_estado_post`) REFERENCES `trebol_estados` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_tiempos` */

/*Table structure for table `trebol_tipo_documento` */

DROP TABLE IF EXISTS `trebol_tipo_documento`;

CREATE TABLE `trebol_tipo_documento` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `tipo_doc` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_tipo_documento` */

insert  into `trebol_tipo_documento`(`id`,`tipo_doc`,`nombre`,`creacion`,`modificacion`) values 
(1,'FR','Factura','2019-12-04 15:47:57','2019-12-04 15:47:57'),
(2,'AN','Anexo Recibido con la Factura','2019-12-06 10:42:07','2019-12-06 10:42:07'),
(3,'SC','Soporte de Causacion','2019-12-09 09:37:50','2019-12-09 09:37:50'),
(4,'DQ','Documento Equivalente Virtual','2019-12-09 09:38:19','2019-12-09 09:38:19'),
(5,'TV','Transferencia Virtual','2019-12-09 09:38:28','2019-12-09 09:38:28'),
(6,'NI','Nota Interna','2019-12-09 09:38:41','2019-12-09 09:38:41'),
(7,'NP','Nota a Proveedor','2019-12-09 09:38:49','2019-12-09 09:38:49'),
(8,'CE','Comprobante de Egreso','2019-12-09 09:39:07','2019-12-09 09:39:07'),
(9,'TB','Transferencia Bancaria','2019-12-09 09:39:16','2019-12-09 09:39:16'),
(10,'SU','Causacion en Dolares','2019-12-09 09:39:28','2019-12-09 09:39:28'),
(11,'OC','Orden de Compra','2019-12-09 09:39:48','2019-12-09 09:39:48'),
(12,'OS','Orden de Servicio','2019-12-09 09:39:53','2019-12-09 09:39:53'),
(13,'ES','Recepción de Servicios','2019-12-09 09:40:02','2019-12-09 09:40:02'),
(14,'EA','Recepción por Compras','2019-12-09 09:40:08','2019-12-09 09:40:08'),
(15,'NC','Nota Credito','2019-12-09 15:28:17','2019-12-09 15:28:17');

/*Table structure for table `trebol_tipo_factura` */

DROP TABLE IF EXISTS `trebol_tipo_factura`;

CREATE TABLE `trebol_tipo_factura` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `tipo_factura` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_tipo_factura` */

insert  into `trebol_tipo_factura`(`id`,`tipo_factura`,`creacion`,`modificacion`) values 
(1,'Anticipo','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(2,'Anticipo Menor Valor','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(3,'Anticipo Mayor Valor','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(4,'Afiliacion','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(5,'Alianza','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(6,'Alquiler RadioFrecuencias','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(7,'Arriendo','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(8,'Asesoria','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(9,'Asesoria Intercambiaria','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(10,'Asesoria Legal','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(11,'BIenestar','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(12,'Capacitación','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(13,'Combustibles','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(14,'Licenciamiento','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(15,'Mantenimiento','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(16,'Monitoreo','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(17,'Proceso Selección','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(18,'Reposición','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(19,'Seguros','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(20,'Serv. Asesoria','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(21,'Serv. Consultoria','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(22,'Serv. de Aseo','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(23,'Serv. de Comunicaciones','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(24,'Serv. de Software','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(25,'Serv. Hosting','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(26,'Serv. Impresión','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(27,'Serv. Mensajeria','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(28,'Serv. Publico','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(29,'Serv. Seguridad','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(30,'Serv. Vigilancia','2019-12-04 08:40:23','2019-12-04 08:40:23'),
(31,'Soporte','2019-12-04 08:40:23','2019-12-04 08:40:23');

/*Table structure for table `trebol_usuario` */

DROP TABLE IF EXISTS `trebol_usuario`;

CREATE TABLE `trebol_usuario` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `nombres` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `correo` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `contraseña` varchar(120) COLLATE utf8_spanish_ci NOT NULL,
  `id_area` int(4) NOT NULL,
  `id_empresa` int(4) NOT NULL,
  `aprueba` tinyint(4) NOT NULL DEFAULT '0',
  `sesiones` int(2) NOT NULL DEFAULT '0',
  `sesiones_activas` int(2) NOT NULL DEFAULT '0',
  `retirado` tinyint(2) NOT NULL DEFAULT '0',
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `usuario` (`usuario`),
  KEY `id_area` (`id_area`),
  KEY `id_empresa` (`id_empresa`),
  CONSTRAINT `trebol_usuario_ibfk_1` FOREIGN KEY (`id_area`) REFERENCES `trebol_areas` (`id`),
  CONSTRAINT `trebol_usuario_ibfk_2` FOREIGN KEY (`id_empresa`) REFERENCES `trebol_empresa` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_usuario` */

insert  into `trebol_usuario`(`id`,`usuario`,`nombres`,`apellidos`,`correo`,`contraseña`,`id_area`,`id_empresa`,`aprueba`,`sesiones`,`sesiones_activas`,`retirado`,`creacion`,`modificacion`) values 
(1,'Administrador','Admin','DB','N/A','1234',10,1,0,1,0,0,'2019-11-28 14:12:05','2019-11-28 14:12:05'),
(3,'dcapera','Daniela','Capera','dcapera@aviomar.com.co','1234',4,1,0,2,0,0,'2019-11-29 15:18:04','2019-11-29 15:18:04'),
(4,'cjaime','Carlos German','Jaime Vargas','cjaime@aviomar.com.co','12345',8,1,0,1,0,0,'2019-11-29 17:05:41','2019-11-29 17:05:41'),
(5,'amontano','Andersson','Montaño','amontano@aviomar.com.co','1234',8,1,1,1,0,0,'2019-11-29 17:06:44','2019-11-29 17:06:44'),
(6,'kalfonso','Karen','Alfonso','kalfonso@aviomar.com.co','1234',1,1,0,2,0,0,'2019-11-29 17:31:31','2019-11-29 17:31:31');

/* Trigger structure for table `trebol_anticipos` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `anticipos_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `anticipos_creacion` BEFORE INSERT ON `trebol_anticipos` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_aprobaciones` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `aprobaciones_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `aprobaciones_creacion` BEFORE INSERT ON `trebol_aprobaciones` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_areas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `areas_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `areas_creacion` BEFORE INSERT ON `trebol_areas` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_bancos` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `bancos_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `bancos_creacion` BEFORE INSERT ON `trebol_bancos` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_comentarios` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `comentarios_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `comentarios_creacion` BEFORE INSERT ON `trebol_comentarios` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_convenios` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `convenios_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `convenios_creacion` BEFORE INSERT ON `trebol_convenios` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_correos` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `correos_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `correos_creacion` BEFORE INSERT ON `trebol_correos` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_documentos` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `documentos_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `documentos_creacion` BEFORE INSERT ON `trebol_documentos` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_empresa` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `empresa_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `empresa_creacion` BEFORE INSERT ON `trebol_empresa` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_estados` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `estados_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `estados_creacion` BEFORE INSERT ON `trebol_estados` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_factura_convenio` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `factura_convenio_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `factura_convenio_creacion` BEFORE INSERT ON `trebol_factura_convenio` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_facturas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `facturas_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `facturas_creacion` BEFORE INSERT ON `trebol_facturas` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_logs` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `logs_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `logs_creacion` BEFORE INSERT ON `trebol_logs` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/* Trigger structure for table `trebol_lote_facturas` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `lote_facturas_creacion` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `lote_facturas_creacion` BEFORE INSERT ON `trebol_lote_facturas` FOR EACH ROW 
BEGIN
    IF (NEW.creacion IS NULL) THEN -- change the isnull check for the default used
        SET NEW.creacion = NOW();
        SET NEW.modificacion = NOW();
    END IF;
END */$$


DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
