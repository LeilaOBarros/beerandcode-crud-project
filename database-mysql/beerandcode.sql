-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19-Nov-2021 às 16:58
-- Versão do servidor: 10.4.21-MariaDB
-- versão do PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `beerandcode`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cervejas`
--

CREATE TABLE `cervejas` (
  `IdCerveja` int(11) NOT NULL,
  `NomeCerveja` varchar(100) DEFAULT NULL,
  `PrecoCerveja` double(15,2) DEFAULT NULL,
  `QtdCerveja` int(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cervejas`
--

INSERT INTO `cervejas` (`IdCerveja`, `NomeCerveja`, `PrecoCerveja`, `QtdCerveja`) VALUES
(1, 'Saison à Trois', 16.99, 1),
(2, 'Bierland Vienna', 15.99, 1),
(3, 'Bamberg Rauchbier', 15.99, 1),
(4, 'Schornstein Imperial Stout ', 18.99, 1),
(5, 'Wäls Quadruppel', 18.99, 1),
(6, 'Jean Le Blanc ', 18.99, 1),
(7, 'Hop Arábica', 13.99, 1),
(8, 'Eisenbahn 5 anos', 19.99, 1),
(9, 'Gordelícia ', 17.99, 1),
(10, 'Perigosa', 17.99, 1),
(13, 'divd-29', 15.99, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cervejas`
--
ALTER TABLE `cervejas`
  ADD PRIMARY KEY (`IdCerveja`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cervejas`
--
ALTER TABLE `cervejas`
  MODIFY `IdCerveja` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
