package com.itb.inf2dm.pizzariad.controller;


import com.itb.inf2dm.pizzariad.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public  class ProdutoController{


    List<Produto> produtos = new ArrayList<Produto>();

    @GetMapping
    public List<Produto>  findALL() {
        Produto p1 = new Produto();
        p1.setNome("Pizza de calabresa");
        p1.setDescricao(" Pizza de calabresa com muita cebola");
        p1.setValorVenda(49.90);

        Produto p2 = new Produto();
        p2.setNome("Pizza de mato");
        p2.setDescricao(" Pizza de mato");
        p2.setValorVenda(89.90);

        produtos.add(p1);
        produtos.add(p2);
        return produtos;
    }
}

