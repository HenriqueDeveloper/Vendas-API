package br.com.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vendas.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);
}
