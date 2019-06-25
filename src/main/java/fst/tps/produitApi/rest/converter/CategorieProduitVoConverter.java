/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.rest.converter;

import fst.tps.produitApi.domain.bean.CategorieProduit;
import fst.tps.produitApi.rest.vo.CategorieProduitVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YOUNES
 */
public class CategorieProduitVoConverter {

    public CategorieProduit toItem(CategorieProduitVo categorieProduitVo) {
        CategorieProduit categorieProduit = new CategorieProduit();
        if (categorieProduitVo != null) {
            if (categorieProduitVo.getLibelle() != null) {
                categorieProduit.setLibelle(categorieProduitVo.getLibelle());
            }
            if (categorieProduitVo.getReference() != null) {
                categorieProduit.setReference(categorieProduitVo.getReference());
            }
        }
        return categorieProduit;
    }

    public CategorieProduitVo toVo(CategorieProduit categorieProduit) {
        CategorieProduitVo categorieProduitVo = new CategorieProduitVo();
        if (categorieProduit != null) {
            if (categorieProduit.getLibelle() != null) {
                categorieProduitVo.setLibelle(categorieProduit.getLibelle());
            }
            if (categorieProduit.getReference() != null) {
                categorieProduitVo.setReference(categorieProduit.getReference());
            }
        }
        return categorieProduitVo;
    }

    public List<CategorieProduitVo> toVo(List<CategorieProduit> categorieProduits) {
        List<CategorieProduitVo> categorieProduitVos = new ArrayList();
        if (categorieProduits != null && !categorieProduits.isEmpty()) {
            for (CategorieProduit categorieProduit : categorieProduits) {
                categorieProduitVos.add(toVo(categorieProduit));
            }
        }
        return categorieProduitVos;
    }

}
