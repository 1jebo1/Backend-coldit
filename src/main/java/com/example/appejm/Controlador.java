
package com.example.appejm;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jebo
 */
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/producto"})
public class Controlador {
   @Autowired
    ProductoService service;
    
    @GetMapping //anotacion traer toda la tabla y hacerla lista 
    public List<Producto>listar(){
        return service.listar();
    }
    @PostMapping //anotacion agregar producto 
    public Producto agregar(@RequestBody Producto p){
        return service.add(p);
    }
    @GetMapping(path = {"/{id}"}) //anotacion para la busqueda de un un producto segun el id
    public Producto listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"}) //anotacion para hacer un update a [artir de un id
    public Producto editar(@RequestBody Producto p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"}) //anotacion para la eliminacion producto segun el  id 
    public Producto delete(@PathVariable("id") int  id){
        return service.delete(id);
    } 
}
