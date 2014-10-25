-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 25-Out-2014 às 23:44
-- Versão do servidor: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `produtos`
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=50 ;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`id`, `nome`, `tipo`, `validade`, `quantidade`, `preco`) VALUES
(16, 'Pão', 'Alimentos', '20/12/2014', 100, '3.75'),
(17, 'Pão', 'Alimentos', '31/10/2014', 20, '3.75'),
(18, 'Pão', 'Alimentos', '21/11/2014', 50, '3.75'),
(20, 'Água', 'Bebidas', '21/01/2015', 50, '1.75'),
(21, 'Água', 'Bebidas', '29/10/2014', 25, '1.75'),
(22, 'Água', 'Bebidas', '14/11/2014', 30, '1.75'),
(23, 'Pão de Queijo', 'Alimentos', '04/02/2015', 50, '1.50'),
(24, 'Pão de Queijo', 'Alimentos', '28/10/2014', 100, '1.50'),
(25, 'Pão de Queijo', 'Alimentos', '18/11/2014', 20, '1.50'),
(26, 'Snickers', 'Alimentos', '06/11/2014', 50, '1.25'),
(27, 'Snickers', 'Alimentos', '30/10/2014', 100, '1.25'),
(28, 'Snickers', 'Alimentos', '07/01/2015', 100, '1.25'),
(29, 'Café', 'Bebidas', '17/11/2014', 200, '3.50'),
(30, 'Café', 'Bebidas', '13/10/2014', 100, '3.50'),
(31, 'Leite', 'Bebidas', '05/10/2014', 100, '2.75'),
(32, 'Leite', 'Bebidas', '15/11/2014', 100, '2.75'),
(33, 'Leite', 'Bebidas', '29/10/2014', 25, '2.75'),
(34, 'Snickers', 'Alimentos', '24/10/2014', 10, '1.25'),
(35, 'Café', 'Bebidas', '24/10/2014', 25, '3.50'),
(36, 'Bala', 'Alimentos', '29/10/2014', 40, '0.25'),
(37, 'Bala', 'Alimentos', '19/11/2014', 125, '0.25'),
(38, 'Açúcar', 'Alimentos', '12/10/2014', 48, '3.00'),
(39, 'Açúcar', 'Alimentos', '07/11/2014', 69, '3.00'),
(40, 'Prensado', 'Alimentos', '29/10/2014', 50, '3.00'),
(41, 'Prensado', 'Alimentos', '12/10/2014', 50, '3.00'),
(42, 'Suco', 'Bebidas', '28/10/2014', 30, '2.75'),
(43, 'Suco', 'Bebidas', '13/10/2014', 50, '2.75'),
(44, 'Suco', 'Bebidas', '15/10/2014', 10, '2.75'),
(45, 'Suco', 'Bebidas', '25/12/2014', 50, '2.75'),
(46, 'Suco', 'Bebidas', '25/12/2014', 50, '2.75'),
(47, 'Suco', 'Bebidas', '05/02/2015', 15, '2.75'),
(48, 'Refrigerante', 'Bebidas', '15/10/2014', 45, '3.00'),
(49, 'Refrigerante', 'Bebidas', '21/10/2014', 23, '3.00');

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
MODIFY `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=50;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
