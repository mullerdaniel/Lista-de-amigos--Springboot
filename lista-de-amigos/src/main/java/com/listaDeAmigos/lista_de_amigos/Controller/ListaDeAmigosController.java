package com.listaDeAmigos.lista_de_amigos.Controller;

import com.listaDeAmigos.lista_de_amigos.Model.Amigo;
import com.listaDeAmigos.lista_de_amigos.Repository.AmigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@RequestMapping("/lista-de-amigos")
@RestController
public class ListaDeAmigosController {

    @Autowired
    AmigoRepository amigoRepository;

    @GetMapping
    public List<Amigo> buscarAmigo() {
        try {
            return amigoRepository.listarTodosAmigos();

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
