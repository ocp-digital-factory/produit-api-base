/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.domain.model.service.impl;

import fst.tps.produitApi.domain.bean.CategorieProduit;
import fst.tps.produitApi.domain.bean.Produit;
import fst.tps.produitApi.domain.model.dao.CategorieProduitDao;
import fst.tps.produitApi.domain.model.dao.ProduitDao;
import fst.tps.produitApi.domain.model.service.CategorieProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author YOUNES
 */
@Service
public class CategorieProduitServiceImpl implements CategorieProduitService{
    @Autowired
    private CategorieProduitDao categorieProduitDao;

    @Override
    public CategorieProduit findByReference(String reference) {
        return categorieProduitDao.findByReference(reference);
    }
    
    @Override
    public CategorieProduit save(CategorieProduit categorieProduit){
        return categorieProduitDao.save(categorieProduit);
    }
    
    @Override
    public CategorieProduit find(Long id){
        return categorieProduitDao.getOne(id);
    }
    
    @Override
    public List<CategorieProduit> findAll(){
        return categorieProduitDao.findAll();
    }

    public CategorieProduitDao getCategorieProduitDao() {
        return categorieProduitDao;
    }

    public void setCategorieProduitDao(CategorieProduitDao categorieProduitDao) {
        this.categorieProduitDao = categorieProduitDao;
    }
    
    
    

  
    
}
