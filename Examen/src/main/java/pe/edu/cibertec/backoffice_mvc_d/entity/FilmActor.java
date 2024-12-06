package pe.edu.cibertec.backoffice_mvc_d.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActor {

    @EmbeddedId
    private FilmActorPK filmActorPK;
    private Date lastUpdate;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name="film-id")
    private Film film;
}
