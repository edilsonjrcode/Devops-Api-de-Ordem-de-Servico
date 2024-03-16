package br.com.edilsonjunior.ordemdeservico.departament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.edilsonjunior.ordemdeservico.departament.domain.Departament;

@Repository
public interface DepartamentRepository extends JpaRepository<Departament, Long>{
    
}
