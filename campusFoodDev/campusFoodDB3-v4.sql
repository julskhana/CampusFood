-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 14-07-2017 a las 20:46:12
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `campusFoodDB3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `cedula` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `nombres` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `apellidos` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `correo` varchar(75) COLLATE latin1_spanish_ci NOT NULL,
  `direccion` varchar(75) COLLATE latin1_spanish_ci DEFAULT NULL,
  `telefono` varchar(10) COLLATE latin1_spanish_ci DEFAULT NULL,
  `tipo` char(1) COLLATE latin1_spanish_ci NOT NULL,
  `saldo` float NOT NULL,
  `descuento` float DEFAULT NULL,
  `edad` int(2) DEFAULT NULL,
  `sexo` char(1) COLLATE latin1_spanish_ci DEFAULT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `cedula`, `nombres`, `apellidos`, `correo`, `direccion`, `telefono`, `tipo`, `saldo`, `descuento`, `edad`, `sexo`, `id_usuario`) VALUES
(25, '0911111111', 'Jorge', 'Galarza', 'jgalarza@espol.edu.ec', 'espol prosperina', '01111111', 'E', 0, 0, 27, 'M', 11),
(26, '0922222222', 'Rosa', 'Cabrera', 'rcab@ups.com', 'ups barrio cuba', '02222222', 'E', 2.5, 0, 23, 'M', 11),
(27, '09256', 'a', 'aa', 'aaa', 'aaaa', '8', 'E', 0, 0, 18, 'M', 11),
(28, '234', 'asdas', 'asdasd', 'qweq', 'qwqwe', '999', 'E', 0, 0, 18, 'M', 11);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_orden`
--

CREATE TABLE `detalle_orden` (
  `id` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_unitario` float NOT NULL,
  `precio_total` float NOT NULL,
  `id_producto` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orden`
--

CREATE TABLE `orden` (
  `id` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `descripcion` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `subtotal` float NOT NULL,
  `iva_cero` float NOT NULL,
  `iva` float NOT NULL,
  `total` float NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_detalle_orden` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `descripcion` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `tipo` char(1) COLLATE latin1_spanish_ci NOT NULL,
  `precio` float NOT NULL,
  `calendario` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `id_restaurante` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `restaurante`
--

CREATE TABLE `restaurante` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `ubicacion` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `descripcion` varchar(200) COLLATE latin1_spanish_ci NOT NULL,
  `capacidad` int(4) NOT NULL,
  `horario` varchar(15) COLLATE latin1_spanish_ci NOT NULL,
  `puntuacion` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `restaurante`
--

INSERT INTO `restaurante` (`id`, `nombre`, `ubicacion`, `descripcion`, `capacidad`, `horario`, `puntuacion`) VALUES
(1, 'Mi Cafeteria', 'CELEX', 'Establecimiento con variedad de menu y servicios.', 60, '09:00-14:00', 5),
(2, 'Neo', 'EDCOM', 'Ubicado en la plazoleta de edcom.', 50, '09:00-15:30', 4),
(3, 'Comedor Principal FCSH', 'FCSH', 'aaabbbb', 0, '09:30-14:30', 2),
(4, 'Comedor Piscina', 'Tecnologias', 'bbbbbbb', 25, '09:00-14:00', 3),
(5, 'Comedor Fiec FCSH', 'FIEC', 'HHHHHHHH', 30, '09:00-14:00', 4),
(6, 'aaa', 'fiec', '', 0, '', 0),
(7, 'cocacola', 'fiec', '', 0, '', 0),
(8, 'prueba1', 'celex', 'prueba de ingreso de restaurantes 1', 50, '09:30-15:30', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `cuenta` varchar(45) COLLATE latin1_spanish_ci NOT NULL,
  `clave` varchar(32) COLLATE latin1_spanish_ci NOT NULL,
  `rol` char(1) COLLATE latin1_spanish_ci NOT NULL,
  `estado` char(1) COLLATE latin1_spanish_ci NOT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `cuenta`, `clave`, `rol`, `estado`, `fecha_registro`) VALUES
(11, 'bajana', 'b0baee9d279d34fa1dfd71aadb908c3f', 'A', 'A', '2017-07-06 00:18:58'),
(12, 'vidal', '3d2172418ce305c7d16d4b05597c6a59', 'A', 'A', '2017-07-06 00:17:48'),
(13, 'merino', 'b7bc2a2f5bb6d521e64c8974c143e9a0', 'C', 'A', '2017-07-06 00:18:09'),
(14, 'zambra', '79b7cdcd14db14e9cb498f1793817d69', 'C', 'D', '2017-07-06 00:20:54'),
(15, 'prueba2', '3d2172418ce305c7d16d4b05597c6a59', 'A', 'D', '2015-01-20 19:50:00'),
(16, 'prueba3', 'b7bc2a2f5bb6d521e64c8974c143e9a0', 'A', 'A', '2015-01-20 19:50:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cedula` (`cedula`),
  ADD KEY `cliente_usuario` (`id_usuario`);

--
-- Indices de la tabla `detalle_orden`
--
ALTER TABLE `detalle_orden`
  ADD PRIMARY KEY (`id`),
  ADD KEY `detalle_producto` (`id_producto`);

--
-- Indices de la tabla `orden`
--
ALTER TABLE `orden`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `numero` (`numero`),
  ADD KEY `cliente` (`id_cliente`),
  ADD KEY `detalle_orden` (`id_detalle_orden`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `producto_restaurante` (`id_restaurante`);

--
-- Indices de la tabla `restaurante`
--
ALTER TABLE `restaurante`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cuenta_UNIQUE` (`cuenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT de la tabla `detalle_orden`
--
ALTER TABLE `detalle_orden`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `orden`
--
ALTER TABLE `orden`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `restaurante`
--
ALTER TABLE `restaurante`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `detalle_orden`
--
ALTER TABLE `detalle_orden`
  ADD CONSTRAINT `detalle_producto` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`);

--
-- Filtros para la tabla `orden`
--
ALTER TABLE `orden`
  ADD CONSTRAINT `cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `detalle_orden` FOREIGN KEY (`id_detalle_orden`) REFERENCES `detalle_orden` (`id`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_restaurante` FOREIGN KEY (`id_restaurante`) REFERENCES `restaurante` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
