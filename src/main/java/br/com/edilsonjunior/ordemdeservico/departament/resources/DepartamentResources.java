package br.com.edilsonjunior.ordemdeservico.departament.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edilsonjunior.ordemdeservico.departament.domain.Departament;
import br.com.edilsonjunior.ordemdeservico.departament.services.DepartamentServices;

@RestController
@RequestMapping(value = "/departaments")
public class DepartamentResources {
    
    @Autowired
    private DepartamentServices departamentoServices;

    @GetMapping
    public ResponseEntity<List<Departament>> listDepartament(){
        var departaments = departamentoServices.findAllDepartaments();
        return new ResponseEntity<>(departaments, HttpStatus.OK);
    }

    @DeleteMapping("/{idDepartament}")
    public ResponseEntity<Void> deleteDepartament(@PathVariable Long idDepartament){
        departamentoServices.deleteDepartament(idDepartament);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
