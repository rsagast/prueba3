package com.example.prueba3.controller;

import com.example.prueba3.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ClienteController {

    @GetMapping("clientes")
    public ResponseEntity<List<Cliente>> getClientes() {
        Cliente c1 = new Cliente(1,"Cliente 1","Apellido 1","111","cliente1@uno.com");
        Cliente c2 = new Cliente(2,"Cliente 2","Apellido 2","222","cliente2@dos.com");
        Cliente c3 = new Cliente(3,"Cliente 3","Apellido 3","333","cliente3@tres.com");

        return new ResponseEntity<>(List.of(c1,c2,c3), HttpStatus.OK);
    }

}
