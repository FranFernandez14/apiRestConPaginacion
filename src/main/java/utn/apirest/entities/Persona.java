package utn.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona extends Base{
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_persona")
    private List<Libro> libros = new ArrayList<>();
}
