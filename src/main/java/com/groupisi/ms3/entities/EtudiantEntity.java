package com.groupisi.ms3.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200)
    private String nom;
    @Column(length = 200)
    private String prenom;
    @Column(length = 200)
    private String adresse;
    @Column
    private String telephone;
}
