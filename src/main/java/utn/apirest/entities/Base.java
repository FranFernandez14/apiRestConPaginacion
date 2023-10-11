package utn.apirest.entities;

import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import java.io.Serializable;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
