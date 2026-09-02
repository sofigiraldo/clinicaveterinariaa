package com.example.veterinaria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "veterinario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String tarjetaProfesional;

    private String especialidad;

    @NotBlank
    @Email
    private String correo;

    @ManyToMany(mappedBy = "veterinarios")
    private List<Mascota> mascotas;
}
