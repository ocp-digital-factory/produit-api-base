/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.domain.model.dao;

import fst.tps.produitApi.domain.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author YOUNES
 */
@Repository
public interface ProduitDao extends JpaRepository<Produit, Long>{
    public Produit findByReference(String reference);

    public List<Produit> findAllByReferenceIn(List<String> references);
}
