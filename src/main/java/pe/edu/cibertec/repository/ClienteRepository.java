package pe.edu.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.cibertec.modelo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
