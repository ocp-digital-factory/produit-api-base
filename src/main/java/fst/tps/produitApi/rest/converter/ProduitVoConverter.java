/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.rest.converter;

import fst.tps.produitApi.domain.bean.Produit;
import fst.tps.produitApi.rest.vo.ProduitVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YOUNES
 */
public class ProduitVoConverter {

    public Produit toItem(ProduitVo produitVo) {
        Produit produit = new Produit();
        if (produitVo != null) {

            if (produitVo.getLibelle() != null) {
                produit.setLibelle(produitVo.getLibelle());
            }
            if (produitVo.getReference() != null) {
                produit.setReference(produitVo.getReference());
            }
            if (produitVo.getCategorieProduitVo() != null) {
                produit.setCategorieProduit(new CategorieProduitVoConverter().toItem(produitVo.getCategorieProduitVo()));
            }
        }
        return produit;
    }

    public ProduitVo toVo(Produit produit) {
        ProduitVo produitVo = new ProduitVo();

        if (produit != null) {
            if (produit.getLibelle() != null) {
                produitVo.setLibelle(produit.getLibelle());
            }
            if (produit.getReference() != null) {
                produitVo.setReference(produit.getReference());
            }
            if (produit.getCategorieProduit() != null) {
                produitVo.setCategorieProduitVo(new CategorieProduitVoConverter().toVo(produit.getCategorieProduit()));
            }
        }
        return produitVo;
    }
    
     public List<ProduitVo> toVo(List<Produit> produits) {
        List<ProduitVo> produitVos = new ArrayList();
        if (produits != null && !produits.isEmpty()) {
            for (Produit produit : produits) {
                produitVos.add(toVo(produit));
            }
        }
        return produitVos;
    }

}
