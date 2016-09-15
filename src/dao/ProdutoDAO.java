/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import modelo.Produto;
import JpaUtil.ControlaConexao;

/**
 *
 * @author GRS
 */
public class ProdutoDAO {
    
    public void persist( Produto produto){
        
        EntityManager manager = ControlaConexao.getEntityManagerFactory();
        
        manager.getTransaction().begin();
        
        try {
                   manager.persist(produto);
                   manager.getTransaction().commit();
                   JOptionPane.showMessageDialog(null,"Produto gravado com sucesso...");
     
        }catch(Exception e ){
            e.getLocalizedMessage();
            manager.getTransaction().rollback();
        }finally{
            manager.close();
        }
        
    }
    
    public void update (Produto produto){
            EntityManager manager = ControlaConexao.getEntityManagerFactory();
            manager.getTransaction().begin();
            Produto modproduto;
             try {
                    modproduto= manager.find(Produto.class,produto.getCodigo());
                    
                    modproduto.setDescricaoProdudo(produto.getDescricaoProdudo());
                    modproduto.setPrecoCompra(produto.getPrecoCompra());
                    modproduto.setUnidadeMedida(produto.getUnidadeMedida());
                    modproduto.setPrecoVenda(produto.getPrecoVenda());
                    modproduto.setEstoqueMinimo(produto.getEstoqueMinimo());
                    modproduto.setQntdade(produto.getQntdade());
                    modproduto.setCodigoNCM(produto.getCodigoNCM());
                    modproduto.setCodidoEAN(produto.getCodidoEAN());
                    modproduto.setCodigoCEST(produto.getCodigoCEST());
                    modproduto.setProCST(produto.getProCST());
                        
                    manager.getTransaction().commit();
                    JOptionPane.showMessageDialog(null,"Produto alterado com sucesso...");
           }catch(Exception e ){
                  e.getLocalizedMessage();
                  manager.getTransaction().rollback();         
        }finally {
                 manager.close();
         }
        
        
    }
    
    
    public void delete (Produto produto){
        EntityManager manager = ControlaConexao.getEntityManagerFactory();
        int confirmation;
        Produto prodel;
        manager.getTransaction().begin();
        
        try{
            confirmation = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro ?", null,JOptionPane.YES_NO_OPTION);
            if (confirmation==JOptionPane.YES_OPTION){
                  prodel= manager.find(Produto.class, produto.getCodigo());
                  manager.remove(prodel);
                  manager.getTransaction().commit();
                  JOptionPane.showMessageDialog(null,"Produto excluido ccm sucesso ....");
            }else {
                 JOptionPane.showMessageDialog(null,"Operaçõa cancelada...");
                manager.getTransaction().rollback();
            }
            
        }catch(Exception e){
            e.getLocalizedMessage();
            manager.getTransaction().rollback();
        }finally{
            manager.close();
        }
        
        
        
    }
    
    
    
    
    
}
