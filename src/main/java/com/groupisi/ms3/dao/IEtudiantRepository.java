package com.groupisi.ms3.dao;

import com.groupisi.ms3.entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtudiantRepository extends JpaRepository<EtudiantEntity, Integer> {
}
