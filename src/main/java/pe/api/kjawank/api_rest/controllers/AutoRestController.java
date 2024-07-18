package pe.api.kjawank.api_rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.api.kjawank.api_rest.models.Autos;
import pe.api.kjawank.api_rest.service.AutoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars/")
public class AutoRestController {

    private AutoService autoService;

    @Autowired
    public AutoRestController(AutoService autoService) {
        this.autoService = autoService;
    }
    @PostMapping(value = "create", headers = "Accept=application/json")
    public void crearAuto(@RequestBody List<Autos> autosList) {
        for (Autos autos : autosList) {
            autoService.createAuto(autos);
        }
    }

    @GetMapping(value = "list", headers = "Accept=application/json")
    public List<Autos> listarAutos(){
        return autoService.listarAutos();
    }

    @GetMapping(value = "listById/{id}", headers = "Accept=application/json")
    public Optional<Autos> buscarPorId(@PathVariable Long id){
        return autoService.buscarPorId(id);
    }
    @PutMapping(value = "update", headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Autos autos){
        autoService.actualizarAuto(autos);
    }

    @DeleteMapping(value = "delete/{id}", headers = "Accept=application/json")
    public void eliminarAuto(@PathVariable Long id){
        autoService.eliminarAutoPorId(id);
    }
    @GetMapping(value = "listByBrand/{brand}", headers = "Accept=application/json")
    public List<Autos> listarPorBrand(@PathVariable String brand){
        return autoService.buscarPorBrand(brand);
    }
    @GetMapping(value = "listByModel/{model}", headers = "Accept=application/json")
    public List<Autos> listarPorModel(@PathVariable String model){
        return autoService.buscarPorModel(model);
    }

    @GetMapping(value = "listByColor/{color}", headers = "Accept=application/json")
    public List<Autos> listarPorColor(@PathVariable String color){
        return autoService.buscarPorColor(color);
    }

    @GetMapping(value = "listByYear/{year}", headers = "Accept=application/json")
    public List<Autos> listarPorYear(@PathVariable Long year){
        return autoService.buscarPorYear(year);
    }

}
