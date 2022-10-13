package br.com.magna.agendador.repository;

import br.com.magna.agendador.entity.AlunoEntity;
import br.com.magna.agendador.service.AlunoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoRepository {

    Logger logger = LoggerFactory.getLogger(AlunoRepository.class);
        List<AlunoEntity> alunoEntityList = new ArrayList<>();

        public List<AlunoEntity> listar(AlunoEntity entity) {
            logger.info("PASSANDO PLEO REPOSITORY");


            AlunoEntity alunoEntity = new AlunoEntity(1,"Rodrigo", "32132131", "34324");
            AlunoEntity alunoEntity2 = new AlunoEntity(2,"Marinho", "32132131", "34324");
            AlunoEntity alunoEntity3 = new AlunoEntity(3,"Neymar", "32132131", "34324");
            AlunoEntity alunoEntity4 = new AlunoEntity(4,"Lebrom James", "32132131", "34324");
            AlunoEntity alunoEntity5 = new AlunoEntity(5,"Emma stone", "32132131", "34324");
            AlunoEntity alunoEntity6 = new AlunoEntity(6,"Anna hateaSlaOsobrenomeDela", "32132131", "34324");

            alunoEntityList.add(alunoEntity);
            alunoEntityList.add(alunoEntity2);
            alunoEntityList.add(alunoEntity3);
            alunoEntityList.add(alunoEntity4);
            alunoEntityList.add(alunoEntity5);
            alunoEntityList.add(alunoEntity6);

            return alunoEntityList;
        }

        public AlunoEntity salvar(AlunoEntity entity) {

            AlunoEntity pessoaEntity = new AlunoEntity();

            pessoaEntity.setNome(entity.getNome());
            pessoaEntity.setCpf(entity.getCpf());
            pessoaEntity.setSenha(entity.getSenha());

            alunoEntityList.add(pessoaEntity);

            return pessoaEntity;
        }

        public void deletar(int index) {
            alunoEntityList.remove(index);
        }
    }
