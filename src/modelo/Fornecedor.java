/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @Column(name ="forcpf" , length = 14)
    private String cpf;
    @Column(name = "forcnpj" ,length = 15)
    private String cnpj;
    @Column (name="forrazaosocial")
    private String razaoSocial;
    @Column (name="fornomefantasia")
    private String nomeFantazia;
    @Column (name="forinsc_estadual")
    private String isncricoEstadual;
    @Column (name="forinsc_municipal")
    private String isncricaoMunicipal;
    @Column (name="fordatacadastro")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    @Column (name="foremail")
    private String email;
  //  @Column(name = "forlogcodigo")
    @ManyToOne
    private Logradouro Logradouro;
    @Column(name = "fortelefone")
    private String telefoneFixo;
    @Column(name = "forcelular")
    private String telefoneCelular;

    public Fornecedor() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantazia() {
        return nomeFantazia;
    }

    public void setNomeFantazia(String nomeFantazia) {
        this.nomeFantazia = nomeFantazia;
    }

    public String getIsncricoEstadual() {
        return isncricoEstadual;
    }

    public void setIsncricoEstadual(String isncricoEstadual) {
        this.isncricoEstadual = isncricoEstadual;
    }

    public String getIsncricaoMunicipal() {
        return isncricaoMunicipal;
    }

    public void setIsncricaoMunicipal(String isncricaoMunicipal) {
        this.isncricaoMunicipal = isncricaoMunicipal;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Logradouro getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(Logradouro Logradouro) {
        this.Logradouro = Logradouro;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    
    
    

   
   
    
}
