package pe.api.kjawank.api_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.api.kjawank.api_rest.models.Autos;
import pe.api.kjawank.api_rest.repository.IAutosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {
    private IAutosRepository autoRepo;

    @Autowired

    public AutoService(IAutosRepository autoRepo) {
        this.autoRepo = autoRepo;
    }

    //Metodo para crear autos
    public void createAuto(Autos autos){
        autoRepo.save(autos);
    }

    //Metodo para listar todos los autos en nuestra BD
    public List<Autos> listarAutos(){
        return autoRepo.findAll();
    }

    //Metodo para buscar un auto por Id especifico
    public Optional<Autos> buscarPorId(Long id){
        return autoRepo.findById(id);
    }

    //Metodo para actualizar Auto

    public void actualizarAuto(Autos auto){
        autoRepo.save(auto);
    }

    //Metodo para eliminar un auto
    public void eliminarAutoPorId(Long id){
        autoRepo.deleteById(id);
    }

    // Metodo para buscar segun atributo propio de la clase
    public List<Autos> buscarPorBrand(String brand){
        return autoRepo.findByBrand(brand);
    }

    public List<Autos> buscarPorModel(String model){
        return autoRepo.findByModel(model);
    }

    public List<Autos> buscarPorColor(String color){
        return autoRepo.findByColor(color);
    }

    public List<Autos> buscarPorYear(Long year){
        return autoRepo.findByYear(year);
    }
}
