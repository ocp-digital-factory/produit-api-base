/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.rest;

import fst.tps.produitApi.rest.vo.CategorieProduitVo;
import fst.tps.produitApi.rest.converter.CategorieProduitVoConverter;
import fst.tps.produitApi.domain.model.service.CategorieProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author YOUNES
 */
@RestController
@RequestMapping(value={"/produit_api/categorie_produit"})
public class CategorieProduitRest {

    @Autowired
    private CategorieProduitService categorieProduitService;

    @GetMapping("/ference/{reference}")
    public CategorieProduitVo findByReference(@PathVariable String reference) {
        return new CategorieProduitVoConverter().toVo(categorieProduitService.findByReference(reference));
    }

//    @PostMapping("/")
//    public CategorieProduitVo save(@RequestBody CategorieProduit categorieProduit) {
//        return new CategorieProduitVoConverter().toVo(categorieProduitService.save(categorieProduit));
//    }

    @GetMapping("/id/{id}")
    public CategorieProduitVo find(@PathVariable Long id) {
        return new CategorieProduitVoConverter().toVo(categorieProduitService.find(id));
    }
    @GetMapping("/")
    public List<CategorieProduitVo> findAll() {
        return new CategorieProduitVoConverter().toVo(categorieProduitService.findAll());
    }

    public CategorieProduitService getCategorieProduitService() {
        return categorieProduitService;
    }

    public void setCategorieProduitService(CategorieProduitService categorieProduitService) {
        this.categorieProduitService = categorieProduitService;
    }

}
