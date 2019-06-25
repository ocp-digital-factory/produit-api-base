/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.domain.model.service;

import fst.tps.produitApi.domain.bean.Produit;
import java.util.List;

/**
 *
 * @author YOUNES
 */
public interface ProduitService {

    public Produit save(Produit produit);

    public Produit findByReference(String reference);

    public Produit find(Long id);

    public List<Produit> findAll();
}
