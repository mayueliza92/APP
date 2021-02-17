/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pp;

import java.util.List;


public interface CertificadoService {
    List<Certificado>listar();
    Certificado listarId(int id_certificado);
    
    
}
