-- Create Table --

CREATE TABLE filme (
	codigo INT NOT NULL,
	nome VARCHAR(45) NOT NULL,
	genero VARCHAR(45) NOT NULL,
	valor DOUBLE NOT NULL,
	disponivel BOOLEAN NOT NULL,
	promocao BOOLEAN NOT NULL,
	valor_promocao DOUBLE NOT NULL
);

