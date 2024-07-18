package pe.api.kjawank.api_rest.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Autos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auto")
    private Long idAuto;
    private String brand;
    private String model;
    private String color;
    private Long year;

}
