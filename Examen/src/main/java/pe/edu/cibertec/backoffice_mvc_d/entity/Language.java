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
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer languageId;
    public String  name;
    public Date lastUpdate;


    @OneToMany(mappedBy = "language")
    private List<Film> films;
}
