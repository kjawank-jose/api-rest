package pe.api.kjawank.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.api.kjawank.api_rest.models.Autos;

import java.util.List;

@Repository
public interface IAutosRepository extends JpaRepository<Autos, Long> {
    List<Autos> findByBrand(String brand);
    List<Autos> findByColor(String color);
    List<Autos> findByModel(String model);
    List<Autos> findByYear(Long year);
}
