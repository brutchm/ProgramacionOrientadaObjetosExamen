CREATE DATABASE  IF NOT EXISTS `VETMOKA` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `VETMOKA`;
-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: VETMOKA
-- ------------------------------------------------------
-- Server version	5.7.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ASISTENTE`
--

DROP TABLE IF EXISTS `ASISTENTE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ASISTENTE` (
  `NOMBRE` varchar(45) NOT NULL,
  `AP1` varchar(45) NOT NULL,
  `AP2` varchar(45) NOT NULL,
  `CEDULA` varchar(45) NOT NULL,
  `TELEFONO` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `ESTADO` varchar(45) NOT NULL,
  `FECNAC` varchar(45) NOT NULL,
  `ROL` varchar(45) NOT NULL,
  `USERNAME` varchar(45) NOT NULL,
  `CONTRASENNA` varchar(45) NOT NULL,
  `ESTUDIA` varchar(45) NOT NULL,
  PRIMARY KEY (`CEDULA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ASISTENTE`
--

LOCK TABLES `ASISTENTE` WRITE;
/*!40000 ALTER TABLE `ASISTENTE` DISABLE KEYS */;
/*!40000 ALTER TABLE `ASISTENTE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CITA`
--

DROP TABLE IF EXISTS `CITA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CITA` (
  `NOMBRE` varchar(45) NOT NULL,
  `FECHA` date NOT NULL,
  `OBSERVACIONES` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CITA`
--

LOCK TABLES `CITA` WRITE;
/*!40000 ALTER TABLE `CITA` DISABLE KEYS */;
/*!40000 ALTER TABLE `CITA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HABITACION`
--

DROP TABLE IF EXISTS `HABITACION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HABITACION` (
  `NUMERO` int(11) NOT NULL,
  `ESTADO` varchar(45) NOT NULL,
  PRIMARY KEY (`NUMERO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HABITACION`
--

LOCK TABLES `HABITACION` WRITE;
/*!40000 ALTER TABLE `HABITACION` DISABLE KEYS */;
/*!40000 ALTER TABLE `HABITACION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HOTEL`
--

DROP TABLE IF EXISTS `HOTEL`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HOTEL` (
  `NOMBRE` varchar(45) NOT NULL,
  `FECHAINICIO` date NOT NULL,
  `FECHASALIDA` date NOT NULL,
  PRIMARY KEY (`NOMBRE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HOTEL`
--

LOCK TABLES `HOTEL` WRITE;
/*!40000 ALTER TABLE `HOTEL` DISABLE KEYS */;
/*!40000 ALTER TABLE `HOTEL` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MASCOTA`
--

DROP TABLE IF EXISTS `MASCOTA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MASCOTA` (
  `NOMBREDUENNO` varchar(45) NOT NULL,
  `NOMBREMASCOTA` varchar(45) NOT NULL,
  `TIPO` varchar(45) NOT NULL,
  `RAZA` varchar(45) NOT NULL,
  `EDAD` int(11) NOT NULL,
  `GENERO` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MASCOTA`
--

LOCK TABLES `MASCOTA` WRITE;
/*!40000 ALTER TABLE `MASCOTA` DISABLE KEYS */;
/*!40000 ALTER TABLE `MASCOTA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `MEDICO`
--

DROP TABLE IF EXISTS `MEDICO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MEDICO` (
  `NOMBRE` varchar(45) NOT NULL,
  `AP1` varchar(45) NOT NULL,
  `AP2` varchar(45) NOT NULL,
  `CEDULA` varchar(45) NOT NULL,
  `TELEFONO` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `DIRECCION` varchar(45) NOT NULL,
  `ESTADO` varchar(45) NOT NULL,
  `FECNAC` date NOT NULL,
  `ROL` varchar(45) NOT NULL,
  `USERNAME` varchar(45) NOT NULL,
  `CONTRASENNA` varchar(45) NOT NULL,
  `UNIVERSIDAD` varchar(45) NOT NULL,
  `FECGRADUACION` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CEDULA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MEDICO`
--

LOCK TABLES `MEDICO` WRITE;
/*!40000 ALTER TABLE `MEDICO` DISABLE KEYS */;
/*!40000 ALTER TABLE `MEDICO` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-25 19:44:01
