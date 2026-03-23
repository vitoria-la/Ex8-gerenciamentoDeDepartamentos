package com.exercicios.gerenciamentoDeDepartamentos.Controllers;

import com.exercicios.gerenciamentoDeDepartamentos.Models.DepartamentoModel;
import com.exercicios.gerenciamentoDeDepartamentos.Services.DepartamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/departamentos")
public class DepartamentoControllers {

    @Autowired
    DepartamentoServices departamentoServices;

    @PostMapping
    public ResponseEntity<DepartamentoModel> criarDepartamento(@RequestBody DepartamentoModel departamentoModel) {
        DepartamentoModel request = departamentoServices.criarDepartamento(departamentoModel);
        return ResponseEntity.status(201).body(request);
    }

    @GetMapping
    public ResponseEntity<List<DepartamentoModel>> listarDepartamentos() {
        List<DepartamentoModel> request = departamentoServices.listarDepartamentos();
        return ResponseEntity.status(200).body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DepartamentoModel>> buscarDepartamento(@PathVariable Long id) {
        Optional<DepartamentoModel> request = departamentoServices.buscarDepartamento(id);
        return ResponseEntity.status(200).body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarDepartamento(@PathVariable Long id) {
        departamentoServices.deletarDepartamento(id);
        return ResponseEntity.status(204).build();
    }

}
