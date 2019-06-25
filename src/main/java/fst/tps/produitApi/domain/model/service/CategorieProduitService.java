/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.domain.model.service;

import fst.tps.produitApi.domain.bean.CategorieProduit;
import java.util.List;

/**
 *
 * @author YOUNES
 */
public interface CategorieProduitService {

    public CategorieProduit save(CategorieProduit produit);

    public CategorieProduit find(Long id);

    public List<CategorieProduit> findAll();

    public CategorieProduit findByReference(String reference);

}
