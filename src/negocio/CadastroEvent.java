/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.EventObject;

/**
 *
 * @author Julio
 */
public class CadastroEvent extends EventObject{
    private Pessoa pessoa;
    
    public CadastroEvent(Object source, Pessoa p) {
        super(source);
        pessoa = p;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }
}
