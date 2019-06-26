/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.domain.model.service.impl;

import fst.tps.produitApi.domain.bean.Produit;
import fst.tps.produitApi.domain.model.dao.ProduitDao;
import fst.tps.produitApi.domain.model.service.ProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author YOUNES
 */
@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    private ProduitDao produitDao;
    
    public Produit save(Produit produit){
        return produitDao.save(produit);
    }
    
    public Produit findByReference(String reference){
        return produitDao.findByReference(reference);
    }

    public Integer findByReferences(List<String> references){
        return produitDao.findAllByReferenceIn(references).size();
    }
    
    public Produit find(Long id){
        return produitDao.getOne(id);
    }
    public List<Produit> findAll(){
        return produitDao.findAll();
    }
    
    
    

    public ProduitDao getProduitDao() {
        return produitDao;
    }

    public void setProduitDao(ProduitDao produitDao) {
        this.produitDao = produitDao;
    }
    
}
