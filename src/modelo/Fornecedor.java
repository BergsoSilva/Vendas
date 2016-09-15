/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pc
 */
@Entity
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(name ="forcpf" , length = 14)
    private String cpf;
    @Column(name = "forcnpj" ,length = 15)
    private String cnpj;
    private String razaoSocial;
    private String nomeFantazia;
    private String isncricoEstadual;
    private String isncricaoMunicipal;
    private Calendar dataCadastro;
    private String email;
    private Logradouro Logradouro;
    private String telefoneFixo;
    private String telefoneCelular;
    

   
   
    
}
