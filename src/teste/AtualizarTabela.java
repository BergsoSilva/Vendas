/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.persistence.EntityManager;
import JpaUtil.ControlaConexao;

/**
 *
 * @author GRS
 */
public class AtualizarTabela {
        public static void main(String[] args) {
             EntityManager em = ControlaConexao.getEntityManagerFactory();
        }
}
