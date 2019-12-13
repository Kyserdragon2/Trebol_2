/*
SQLyog Professional v13.1.1 (64 bit)
MySQL - 5.6.42 : Database - trebol_2
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
  `id_usuario` int(4) NOT NULL,
  `id_area` int(4) NOT NULL,
  `aprobado` tinyint(1) NOT NULL DEFAULT '0',
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_usuario`,`id_factura`,`id_area`),
  KEY `id_factura` (`id_factura`),
  KEY `id_area` (`id_area`),
  CONSTRAINT `trebol_aprobaciones_ibfk_1` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_aprobaciones_ibfk_2` FOREIGN KEY (`id_area`) REFERENCES `trebol_areas` (`id`),
  CONSTRAINT `trebol_aprobaciones_ibfk_3` FOREIGN KEY (`id_usuario`) REFERENCES `trebol_usuario` (`id`)
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_convenios` */

/*Table structure for table `trebol_correos` */

DROP TABLE IF EXISTS `trebol_correos`;

CREATE TABLE `trebol_correos` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `id_factura` int(4) NOT NULL,
  `enviado` tinyint(4) NOT NULL DEFAULT '1',
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
  `id_tipo_doc` int(4) NOT NULL,
  `id_factura` int(4) NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_estados` */

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
  `fecha_venc` date NOT NULL,
  `no_radicado` varchar(15) COLLATE utf8_spanish_ci DEFAULT NULL,
  `aprobada` tinyint(2) NOT NULL DEFAULT '0',
  `revisada` tinyint(2) NOT NULL DEFAULT '0',
  `id_tipo_factura` int(4) NOT NULL,
  `id_gestion` int(4) NOT NULL,
  `id_area` int(4) NOT NULL,
  `id_empresa` int(4) NOT NULL,
  `id_estado` int(4) NOT NULL,
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
  `id_usuario` int(4) DEFAULT NULL,
  `id_factura` int(4) DEFAULT NULL,
  `id_comentario` int(4) DEFAULT NULL,
  `id_estado` int(4) DEFAULT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `id_usuario` (`id_usuario`),
  KEY `id_factura` (`id_factura`),
  KEY `id_comentario` (`id_comentario`),
  KEY `id_estado` (`id_estado`),
  CONSTRAINT `trebol_logs_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `trebol_usuario` (`id`),
  CONSTRAINT `trebol_logs_ibfk_2` FOREIGN KEY (`id_factura`) REFERENCES `trebol_facturas` (`id`),
  CONSTRAINT `trebol_logs_ibfk_3` FOREIGN KEY (`id_comentario`) REFERENCES `trebol_comentarios` (`id`),
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
  `correo` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `id_tipo_factura` int(4) NOT NULL,
  `id_area` int(4) NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `id_area` (`id_area`),
  KEY `id_tipo_factura` (`id_tipo_factura`),
  CONSTRAINT `trebol_proveedor_ibfk_1` FOREIGN KEY (`id_area`) REFERENCES `trebol_areas` (`id`),
  CONSTRAINT `trebol_proveedor_ibfk_2` FOREIGN KEY (`id_tipo_factura`) REFERENCES `trebol_tipo_factura` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_proveedor` */

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_tipo_documento` */

/*Table structure for table `trebol_tipo_factura` */

DROP TABLE IF EXISTS `trebol_tipo_factura`;

CREATE TABLE `trebol_tipo_factura` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `tipo_factura` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

/*Data for the table `trebol_tipo_factura` */

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
  `aprueba` tinyint(4) NOT NULL DEFAULT '1',
  `sesiones` int(2) NOT NULL DEFAULT '0',
  `sesiones_activas` int(2) NOT NULL DEFAULT '0',
  `retirado` tinyint(2) NOT NULL DEFAULT '1',
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
(1,'Administrador','Admin','DB','N/A','1234',10,1,0,1,0,1,'2019-11-28 14:12:05','2019-11-28 14:12:05'),
(3,'dcapera','Daniela','Capera','dcapera@aviomar.com.co','1234',4,1,0,2,0,1,'2019-11-29 15:18:04','2019-11-29 15:18:04'),
(4,'cjaime','Carlos German','Jaime Vargas','cjaime@aviomar.com.co','12345',8,1,0,1,0,1,'2019-11-29 17:05:41','2019-11-29 17:05:41'),
(5,'amontano','Andersson','Montaño','amontano@aviomar.com.co','1234',8,1,1,1,0,1,'2019-11-29 17:06:44','2019-11-29 17:06:44'),
(6,'kalfonso','Karen','Alfonso','kalfonso@aviomar.com.co','1234',4,1,0,2,0,1,'2019-11-29 17:31:31','2019-11-29 17:31:31');

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
