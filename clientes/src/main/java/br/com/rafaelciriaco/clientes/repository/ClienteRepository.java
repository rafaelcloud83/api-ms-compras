package br.com.rafaelciriaco.clientes.repository;

import br.com.rafaelciriaco.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
