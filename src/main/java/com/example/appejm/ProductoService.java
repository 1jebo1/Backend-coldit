
package com.example.appejm;

/**
 *
 * @author jebo
 */
import java.util.List;
//usa metodos que extiende de repositorio que entiende y le entrega los datos del angular que son llamados de la clase implementacion de servicio 
public interface ProductoService {
    List<Producto>listar();
    Producto listarId(int id);
    Producto add(Producto p);
    Producto edit(Producto p);
    Producto delete(int id);
}