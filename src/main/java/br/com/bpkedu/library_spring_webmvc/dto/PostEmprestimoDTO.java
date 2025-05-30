package br.com.bpkedu.library_spring_webmvc.dto;

import java.time.LocalDate;
import java.util.List;

public class PostEmprestimoDTO {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Long usuarioId;
    private List<Long> livrosId;

    public PostEmprestimoDTO(LocalDate dataEmprestimo, LocalDate dataDevolucao, Long usuarioId, List<Long> livrosId) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.usuarioId = usuarioId;
        this.livrosId = livrosId;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public List<Long> getLivrosId() {
        return livrosId;
    }

    public void setLivrosId(List<Long> livrosId) {
        this.livrosId = livrosId;
    }
}
