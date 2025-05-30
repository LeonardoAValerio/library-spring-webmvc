package br.com.bpkedu.library_spring_webmvc.controller.api;

import br.com.bpkedu.library_spring_webmvc.domain.Emprestimo;
import br.com.bpkedu.library_spring_webmvc.dto.PostEmprestimoDTO;
import br.com.bpkedu.library_spring_webmvc.service.EmprestimoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/emprestimos")
public class EmprestimoRestController {

    private final EmprestimoService emprestimoService;

    public EmprestimoRestController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @GetMapping
    public List<Emprestimo> getAll() {
        return emprestimoService.findAll();
    }

    @PostMapping
    public ResponseEntity post(@RequestBody PostEmprestimoDTO dto) {
        System.out.println(dto.getDataEmprestimo());
        System.out.println(dto.getDataDevolucao());
        System.out.println(dto.getUsuarioId());
        System.out.println(dto.getLivrosId());
        emprestimoService.save(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
}
