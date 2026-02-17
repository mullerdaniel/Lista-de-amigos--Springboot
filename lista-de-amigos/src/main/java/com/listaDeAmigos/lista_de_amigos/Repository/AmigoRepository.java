package com.listaDeAmigos.lista_de_amigos.Repository;

import com.listaDeAmigos.lista_de_amigos.Conexao.Conexao;
import com.listaDeAmigos.lista_de_amigos.Model.Amigo;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AmigoRepository {


    // METODO PARA LISTAR TODOS OS AMIGOS
    public List<Amigo> listarTodosAmigos() throws SQLException {
        List<Amigo> amigosLista = new ArrayList<>();

        String query = "SELECT nome, idade FROM amigo";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {


           ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Amigo amigo = new Amigo();

                    amigo.setNome(rs.getString("nome"));
                    amigo.setIdade(rs.getInt("idade"));

                    amigosLista.add(amigo);

                }
        }

        return amigosLista;
    }

}
