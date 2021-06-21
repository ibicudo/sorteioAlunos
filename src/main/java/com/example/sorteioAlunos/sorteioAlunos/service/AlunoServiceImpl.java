package com.example.sorteioAlunos.sorteioAlunos.service;

import com.example.sorteioAlunos.sorteioAlunos.dto.AlunoDTO;
import com.example.sorteioAlunos.sorteioAlunos.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class AlunoServiceImpl implements AlunoService{

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AlunoDTO createAluno(AlunoDTO alunoDTO) {
        return alunoRepository.save(alunoDTO);
    }



    @Override
    public List<AlunoDTO> getTenStudents(List<AlunoDTO> alunoDTOList) {
        List<AlunoDTO> alunos = saveAll(alunoDTOList);
        Random randomId = new Random();
        AlunoDTO alunoDTO = new AlunoDTO();
        List<AlunoDTO> listAlunos= new ArrayList<>();

        for(int i =0; i < 10; i++){
            int id = randomId.nextInt(29) + 1;
            alunoDTO = getById(id);
            listAlunos.add(alunoDTO);

        }

        return listAlunos;
    }

    private List<AlunoDTO> saveAll (List<AlunoDTO> alunoDTOList){
        return alunoRepository.saveAll(alunoDTOList);
    }

    private AlunoDTO getById (Integer id){
        Optional<AlunoDTO> alunoDTOOptional = alunoRepository.findById(id);

        if(alunoDTOOptional.isPresent()){
            AlunoDTO alunoDTO = alunoDTOOptional.get();
            return alunoDTO;
        }else{
            throw  new RuntimeException("Aluno nao foi encontrado");
        }
    }

}
