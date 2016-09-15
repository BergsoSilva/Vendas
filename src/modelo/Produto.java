/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author GRS
 */
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "procodigo", nullable = false ,unique = true )
    private Long codigo; 
    @Column(name="prodescricao")
    private String descricaoProdudo;
    @Column(name = "procompra" , precision = 3 , scale = 2)
    private Double precoCompra;
    @Column(name = "prounimedida" , length = 10)
    private String unidadeMedida;
    @Column(name = "provenda" , precision = 3, scale = 2)
    private Double precoVenda;
    @Column(name = "proestoqueMinimo" )
    private Integer estoqueMinimo;
   @Column(name = "proquantidade" )
    private Integer qntdade;
   @Column(name = "procodigoNCM" , length = 10)
    private String codigoNCM;
   @Column(name = "procodigoEAN" , length = 13)
    private String codidoEAN;
   @Column(name = "procodigoCEST" )
    private String codigoCEST;
   @Column(name = "proCST")
    private Double proCST;
    

    public Produto() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoProdudo() {
        return descricaoProdudo;
    }

    public void setDescricaoProdudo(String descricaoProdudo) {
        this.descricaoProdudo = descricaoProdudo;
    }

   

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Integer estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Integer getQntdade() {
        return qntdade;
    }

    public void setQntdade(Integer qntdade) {
        this.qntdade = qntdade;
    }

    public String getCodigoNCM() {
        return codigoNCM;
    }

    public void setCodigoNCM(String codigoNCM) {
        this.codigoNCM = codigoNCM;
    }

    public String getCodidoEAN() {
        return codidoEAN;
    }

    public void setCodidoEAN(String codidoEAN) {
        this.codidoEAN = codidoEAN;
    }

    public String getCodigoCEST() {
        return codigoCEST;
    }

    public void setCodigoCEST(String codigoCEST) {
        this.codigoCEST = codigoCEST;
    }

    public void setProCST(Double proCST) {
        this.proCST = proCST;
    }

    public Double getProCST() {
        return proCST;
    }
   
}
