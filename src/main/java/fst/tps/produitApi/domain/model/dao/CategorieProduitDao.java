/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.domain.model.dao;

import fst.tps.produitApi.domain.bean.CategorieProduit;
import fst.tps.produitApi.domain.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author YOUNES
 */
@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProduit, Long>{
    public CategorieProduit findByReference(String reference);
}
