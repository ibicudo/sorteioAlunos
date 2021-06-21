package com.example.sorteioAlunos.sorteioAlunos.repository;

import com.example.sorteioAlunos.sorteioAlunos.dto.AlunoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoDTO, Integer> {
}
