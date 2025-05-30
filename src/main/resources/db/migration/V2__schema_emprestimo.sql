CREATE TABLE emprestimo (
                            id BIGSERIAL PRIMARY KEY,
                            data_emprestimo DATE,
                            data_devolucao DATE,
                            usuario_id BIGINT,
                            CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE emprestimo_livros (
                                   emprestimo_id BIGINT,
                                   livros_id BIGINT,
                                   PRIMARY KEY (emprestimo_id, livros_id),
                                   CONSTRAINT fk_emprestimo FOREIGN KEY (emprestimo_id) REFERENCES emprestimo(id) ON DELETE CASCADE,
                                   CONSTRAINT fk_livro FOREIGN KEY (livros_id) REFERENCES livros(id) ON DELETE CASCADE
);