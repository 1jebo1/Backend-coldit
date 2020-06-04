/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appejm;


/**
 *
 * @author jebo
 */
import java.util.List;
import org.springframework.data.repository.Repository;
//metodos que entiende spring
public interface ProductoRepositorio extends Repository<Producto, Integer>{
    List<Producto>findAll();
    Producto findOne(int id);
    Producto save(Producto p);
    void delete(Producto p);
}
