/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author GRS
 */
public class ControlaConexao {
        
        public static EntityManagerFactory emf;
        
        static {
            emf= Persistence.createEntityManagerFactory("VendasPU");
        }
        
        public static EntityManager getEntityManagerFactory(){
              return  emf.createEntityManager();
        }
}
