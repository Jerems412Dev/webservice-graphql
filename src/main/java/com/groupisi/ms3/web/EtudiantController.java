package com.groupisi.ms3.web;

import com.groupisi.ms3.dao.IEtudiantRepository;
import com.groupisi.ms3.dto.Etudiant;
import com.groupisi.ms3.mapping.EtudiantMapper;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import java.util.List;
import java.util.stream.StreamSupport;

@Controller
public class EtudiantController {
    private final IEtudiantRepository ietudiantRepository;
    private final EtudiantMapper etudiantMapper;

    public EtudiantController(IEtudiantRepository ietudiantRepository, EtudiantMapper etudiantMapper) {
        this.ietudiantRepository = ietudiantRepository;
        this.etudiantMapper = etudiantMapper;
    }

    @QueryMapping
    public List<Etudiant> findAllEtudiants(){
        return StreamSupport.stream(ietudiantRepository.findAll().spliterator(), false)
            .map(etudiantMapper::toEtudiant)
            .toList();
    }

    @QueryMapping
    public long countEtudiant(){
        return ietudiantRepository.count();
    }

    @MutationMapping
    public Etudiant createEtudiant(@Argument Etudiant etudiant){
        return etudiantMapper.toEtudiant(ietudiantRepository.save(etudiantMapper.fromEtudiant(etudiant)));
    }
}
