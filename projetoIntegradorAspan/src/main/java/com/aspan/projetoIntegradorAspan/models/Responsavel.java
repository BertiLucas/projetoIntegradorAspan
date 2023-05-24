package com.aspan.projetoIntegradorAspan.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Responsavel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String rg;

    private String cpf;

    private String email;

    private String endereco;

    private String telefone1;

    private String telefone2;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

}