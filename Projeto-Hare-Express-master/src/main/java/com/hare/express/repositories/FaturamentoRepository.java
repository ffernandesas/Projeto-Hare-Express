package com.hare.express.repositories;

import com.hare.express.domain.models.Faturamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturamentoRepository extends JpaRepository<Faturamento, Long> {
}
