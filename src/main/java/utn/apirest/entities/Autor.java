package utn.apirest.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor extends Base{

    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private String biografia;
}
