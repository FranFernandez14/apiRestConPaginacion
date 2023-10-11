package utn.apirest.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio extends Base{
    @NotNull
    private String calle;
    @NotNull
    private int numero;

    @NotNull
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn (name = "id_localidad")
    private Localidad localidad;


}
