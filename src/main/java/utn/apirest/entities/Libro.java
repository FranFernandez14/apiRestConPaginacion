package utn.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.*;

import java.sql.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Libro extends Base{

    @NotNull
    private String titulo;
    @NotNull
    private Date fecha;
    @NotNull
    private String genero;
    @NotNull
    private int paginas;
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "id_libro"),
            inverseJoinColumns = @JoinColumn(name = "id_autor")
    )
    private List<Autor> autores = new ArrayList<>();



}
