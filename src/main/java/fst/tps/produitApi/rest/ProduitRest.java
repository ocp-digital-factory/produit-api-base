/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fst.tps.produitApi.rest;

import fst.tps.produitApi.domain.bean.Produit;
import fst.tps.produitApi.rest.vo.ProduitVo;
import fst.tps.produitApi.rest.converter.ProduitVoConverter;
import fst.tps.produitApi.domain.model.service.ProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author YOUNES
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value={"/produit_api/produit"})
public class ProduitRest {

    @Autowired
    private ProduitService produitService;

    @PostMapping("/")
    public ProduitVo save(@RequestBody Produit produit) {
        return new ProduitVoConverter().toVo(produitService.save(produit));
    }

    @GetMapping("/reference/{reference}")
    public ProduitVo findByReference(@PathVariable("reference") String reference) {
        return new ProduitVoConverter().toVo(produitService.findByReference(reference));
    }

    @GetMapping("/{id}")
    public ProduitVo find(@PathVariable Long id) {
        return new ProduitVoConverter().toVo(produitService.find(id));
    }

    @GetMapping("/")
    public List<ProduitVo> findAll() {
        return new ProduitVoConverter().toVo(produitService.findAll());
    }

    public ProduitService getProduitService() {
        return produitService;
    }

    public void setProduitService(ProduitService produitService) {
        this.produitService = produitService;
    }

}
