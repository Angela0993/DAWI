package pe.edu.cibertec.backoffice_mvc_d.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategoryPK {

    private Integer filmId;
    private Integer categoryId;
}
