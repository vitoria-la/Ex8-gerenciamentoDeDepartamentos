package com.exercicios.gerenciamentoDeDepartamentos.Repositories;

import com.exercicios.gerenciamentoDeDepartamentos.Models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}
