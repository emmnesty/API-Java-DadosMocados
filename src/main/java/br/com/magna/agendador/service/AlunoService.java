package br.com.magna.agendador.service;

import br.com.magna.agendador.entity.AlunoEntity;
import br.com.magna.agendador.repository.AlunoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

        @Autowired
        AlunoRepository alunoRepository;

        Logger logger = LoggerFactory.getLogger(AlunoService.class);

        public List<AlunoEntity> listarAlunos (AlunoEntity entity) {
            logger.info("INICIANDO METODO DE LISTAGEM");
            List<AlunoEntity> alunoEntity = alunoRepository.listar(entity);
            logger.info("FINALIZANDO METODO DE LISTAGEM");
            return alunoEntity;
        }

        public AlunoEntity salvarAluno(AlunoEntity entity) {
            logger.debug("INICIANDO METODO DE SALVAR");
            AlunoEntity alunoEntity = alunoRepository.salvar(entity);
            logger.info("FINALIZANDO METODO DE SALVAR");
            return alunoEntity;
        }


        public void deletar(int index) {
            logger.info("INICIANDO METODO DELETAR");
            logger.info("DELETANDO PESSOA NA POSIÇÃO {} ", index);
            alunoRepository.deletar(index);
            logger.info("PESSOA DELETADA");
            logger.info("TERMINANDO METODO DELETAR");
        }

}
