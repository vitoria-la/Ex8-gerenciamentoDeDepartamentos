package com.exercicios.gerenciamentoDeDepartamentos.Services;

import com.exercicios.gerenciamentoDeDepartamentos.Models.DepartamentoModel;
import com.exercicios.gerenciamentoDeDepartamentos.Repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServices {

    @Autowired
    DepartamentoRepository departamentosRepository;

    public DepartamentoModel criarDepartamento(DepartamentoModel departamentoModel) {
        return departamentosRepository.save(departamentoModel);
    }

    public List<DepartamentoModel> listarDepartamentos() {
        return departamentosRepository.findAll();
    }

    public Optional<DepartamentoModel> buscarDepartamento(Long id) {
        return departamentosRepository.findById(id);
    }

    public void deletarDepartamento(Long id) {
        departamentosRepository.deleteById(id);
    }
}
