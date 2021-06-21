package com.example.sorteioAlunos.sorteioAlunos.controller;

import com.example.sorteioAlunos.sorteioAlunos.dto.AlunoDTO;
import com.example.sorteioAlunos.sorteioAlunos.service.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoServiceImpl;

    @PostMapping("/create")
    public AlunoDTO createAluno(@RequestBody AlunoDTO alunoDTO){
        return alunoServiceImpl.createAluno(alunoDTO);
    }

    @PostMapping("/saveAlunos")  //recebe lista com 30 alunos
    public List<AlunoDTO> getTenStudents (@RequestBody List<AlunoDTO> alunoDTOList){
        return alunoServiceImpl.getTenStudents(alunoDTOList);
    }
}
