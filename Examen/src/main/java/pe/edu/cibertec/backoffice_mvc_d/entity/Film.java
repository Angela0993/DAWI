package pe.edu.cibertec.backoffice_mvc_d.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer filmId;
    public String title;
    public String description;
    public Integer releaseYear;

    public Integer originalLanguage_id;
    public Integer rentalDuration;
    public Double rentalRate;
    public Integer length;
    public Double replacementCost;
    public String rating;
    public String specialFeatures;
    public Date lastUpdate;


    @ManyToOne

    @JoinColumn(name ="language_id")
    public Language language;

    @OneToMany(mappedBy = "film")
    private List<FilmActor> filmActors;

    @OneToMany(mappedBy = "film")
    private List<FilmCategory> filmCategories;

    @OneToMany(mappedBy="film")
    private List<Inventory> inventories;


}
