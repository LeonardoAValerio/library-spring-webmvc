package br.com.bpkedu.library_spring_webmvc.service;

import br.com.bpkedu.library_spring_webmvc.domain.Emprestimo;
import br.com.bpkedu.library_spring_webmvc.domain.Livro;
import br.com.bpkedu.library_spring_webmvc.domain.Usuario;
import br.com.bpkedu.library_spring_webmvc.dto.PostEmprestimoDTO;
import br.com.bpkedu.library_spring_webmvc.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;
    private final LivroService livroService;
    private final UsuarioService usuarioService;

    public EmprestimoService(EmprestimoRepository emprestimoRepository, LivroService livroService, UsuarioService usuarioService) {
        this.emprestimoRepository = emprestimoRepository;
        this.livroService = livroService;
        this.usuarioService = usuarioService;
    }

    public List<Emprestimo> findAll() {
        return emprestimoRepository.findAll();
    }

    public void save(PostEmprestimoDTO dto) {
        List<Livro> livros = dto.getLivrosId().stream().map(livroService::buscarPorId).toList();
        Usuario usuario = usuarioService.buscarPorId(dto.getUsuarioId());

        emprestimoRepository.save(new Emprestimo(dto.getDataEmprestimo(), dto.getDataDevolucao(), usuario, livros));
    }
}
