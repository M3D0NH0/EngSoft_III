-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17-Out-2014 às 00:13
-- Versão do servidor: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cantinaditalia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE IF NOT EXISTS `produtos` (
`id` bigint(20) unsigned NOT NULL,
  `nome` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `tipo` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `validade` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `quantidade` int(11) NOT NULL,
  `preco` decimal(10,2) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=16 ;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`id`, `nome`, `tipo`, `validade`, `quantidade`, `preco`) VALUES
(1, 'Pastel', 'Alimentos', '09/10/2014', 30, '3.50'),
(2, 'Folhado de Frango', 'Alimentos', '12/10/2014', 50, '3.50'),
(3, 'Pão de Queijo', 'Alimentos', '30/11/2014', 60, '3.50'),
(4, 'Chocolate', 'Alimentos', '08/10/2014', 70, '3.50'),
(5, 'Pastel Frito', 'Alimentos', '01/12/2014', 30, '3.50'),
(6, 'Folhado de Carne', 'Alimentos', '30/11/2014', 50, '3.50'),
(7, 'Mini Pizza', 'Alimentos', '08/10/2014', 70, '3.50'),
(8, 'Coca-Cola', 'Bebidas', '18/10/2014', 40, '3.50'),
(9, 'Água', 'Bebidas', '20/06/2014', 300, '2.50'),
(10, 'Sprite', 'Bebidas', '20/12/2014', 40, '3.50'),
(11, 'Chá Gelado', 'Bebidas', '30/10/2014', 50, '3.50'),
(12, 'Café', 'Bebidas', '02/10/2014', 200, '1.75'),
(14, 'Leite', 'Bebidas', '30/12/2014', 35, '2.50');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
MODIFY `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
