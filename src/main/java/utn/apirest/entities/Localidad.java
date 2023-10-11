package utn.apirest.entities;


import jakarta.persistence.Entity;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Localidad extends Base{

    @NotNull
    private String denominacion;
}
