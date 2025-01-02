package com.larissaoliveira.ReadNest.repository;

import com.larissaoliveira.ReadNest.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
