package br.com.magna.agendador.controller;

import br.com.magna.agendador.entity.AlunoEntity;
import br.com.magna.agendador.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<AlunoEntity>> listarPessoas(AlunoEntity entity) {
        return ResponseEntity.status(HttpStatus.OK).build().ok(alunoService.listarAlunos(entity));
    }

    @PostMapping
    public ResponseEntity<AlunoEntity> salvar(@RequestBody AlunoEntity entity) {
        alunoService.salvarAluno(entity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{index}")
    public ResponseEntity<Void> deletar(@PathVariable int index) {
        alunoService.deletar(index);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
