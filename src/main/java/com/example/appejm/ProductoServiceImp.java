/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.appejm;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jebo
 */
@Service
public class ProductoServiceImp implements ProductoService {
    @Autowired
    private ProductoRepositorio repositorio;
    
    @Override
    public List<Producto> listar() {
        return repositorio.findAll();
    }

    @Override
    public Producto listarId(int id) {
       return repositorio.findOne(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto add(Producto p) {
        //float m =Float.parseFloat(p.getPrecio());
        return repositorio.save(p) ;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto edit(Producto p) {
        return repositorio.save(p) ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto delete(int id) {
        Producto p=repositorio.findOne(id);
        if (p!=null){
          repositorio.delete(p); //To change body of generated methods, choose Tools | Templates.
        }
        return p;
    }
    
}
