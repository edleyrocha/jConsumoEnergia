
CREATE TABLE IF NOT EXISTS `ambiente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ambiente` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `ambiente` (`id`, `ambiente`) VALUES
	(1, 'Cozinha'),
	(2, 'Quarto'),
	(3, 'Sala de jantar'),
	(4, 'Sala de estar'),
	(5, 'Banheiro');

CREATE TABLE IF NOT EXISTS `aparelho` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aparelho` varchar(255) NOT NULL,
  `potencia` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

INSERT INTO `aparelho` (`id`, `aparelho`, `potencia`) VALUES
	(1, 'Ar condicionado', 1000),
	(2, 'Geladeira', 130),
	(3, 'Lampada', 9);

CREATE TABLE IF NOT EXISTS `imovel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome_imovel` varchar(255) NOT NULL,
  `localidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

INSERT INTO `imovel` (`id`, `nome_imovel`, `localidade`) VALUES
	(1, 'Casa Leonardo', 4),
	(2, 'Casa Mae', 2),
	(3, 'Casa Irmao', 3);

CREATE TABLE IF NOT EXISTS `movimentacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_imovel` int(11) NOT NULL,
  `id_ambiente` int(11) NOT NULL,
  `id_aparelho` int(11) NOT NULL,
  `mes` int(11) NOT NULL,
  `ano` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL DEFAULT '0',
  `horas_mes` int(11) NOT NULL DEFAULT '0',
  `valor` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_imovel` (`id_imovel`),
  KEY `fk_ambiente` (`id_ambiente`),
  KEY `fk_aparelho` (`id_aparelho`),
  CONSTRAINT `fk_ambiente` FOREIGN KEY (`id_ambiente`) REFERENCES `ambiente` (`id`),
  CONSTRAINT `fk_aparelho` FOREIGN KEY (`id_aparelho`) REFERENCES `aparelho` (`id`),
  CONSTRAINT `fk_imovel` FOREIGN KEY (`id_imovel`) REFERENCES `imovel` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

INSERT INTO `movimentacao` (`id`, `id_imovel`, `id_ambiente`, `id_aparelho`, `mes`, `ano`, `quantidade`, `horas_mes`, `valor`) VALUES
	(8, 1, 2, 1, 11, 2016, 1, 480, 243.67);
