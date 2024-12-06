package pe.edu.cibertec.backoffice_mvc_d.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmActorPK {

    private Integer actorId;
    private Integer filmId;
}
