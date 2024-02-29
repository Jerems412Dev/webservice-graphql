package com.groupisi.ms3.mapping;

import com.groupisi.ms3.entities.EtudiantEntity;
import com.groupisi.ms3.dto.Etudiant;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface EtudiantMapper {
    Etudiant toEtudiant(EtudiantEntity etudiantEntity);
    EtudiantEntity fromEtudiant(Etudiant etudiant);
}
