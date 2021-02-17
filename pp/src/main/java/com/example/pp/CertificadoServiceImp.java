/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CertificadoServiceImp implements CertificadoService{
    @Autowired
    private CertificadoRepositorio repositorio;
    
    @Override
    public List<Certificado> listar() {
        
    return repositorio.findAll();
    }

    @Override
    public Certificado listarId(int id_certificado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
