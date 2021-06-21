package com.example.sorteioAlunos.sorteioAlunos.service;

import com.example.sorteioAlunos.sorteioAlunos.dto.AlunoDTO;

import java.util.List;

public interface AlunoService {
    AlunoDTO createAluno (AlunoDTO alunoDTO);
    List<AlunoDTO> getTenStudents (List<AlunoDTO> alunoDTOList);
}
