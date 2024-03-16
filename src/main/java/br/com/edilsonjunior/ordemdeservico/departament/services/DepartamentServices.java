package br.com.edilsonjunior.ordemdeservico.departament.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.edilsonjunior.ordemdeservico.departament.domain.Departament;
import br.com.edilsonjunior.ordemdeservico.departament.repositories.DepartamentRepository;

@Service
public class DepartamentServices {
    
    @Autowired
    private DepartamentRepository departamentoRepository;

    public Departament createDepartament(Departament departament){
        return departamentoRepository.save(departament);
    };

    public List<Departament> findAllDepartaments(){
        return departamentoRepository.findAll();
    }

    public Optional<Departament> findDepartament(Long idDepartament){
        return departamentoRepository.findById(idDepartament);
    }

    public void deleteDepartament(Long idDepartament){
        departamentoRepository.deleteById(idDepartament);
    }
}
