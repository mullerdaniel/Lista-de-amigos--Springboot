# Lista-de-amigos--Springboot

## Banco de Dados

CREATE DATABASE listadeamigos;<br>
USE listadeamigos;<br><br>

CREATE TABLE amigo (<br>
id INT AUTO_INCREMENT PRIMARY KEY,<br>
nome VARCHAR(64),<br>
idade INT(64)<br>
);<br><br>

INSERT INTO amigo (nome, idade) VALUES ("teste", 10);
