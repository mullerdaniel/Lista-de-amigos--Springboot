package com.listaDeAmigos.lista_de_amigos.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static String URL = "jdbc:mysql://localhost:3306/listadeamigos?useSSL=false&serverTimezone=UTC";
    private static String user = "root";
    private static String senha = "";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, user, senha);
    }
}
