/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import negocio.CadastroEvent;
import negocio.CadastroListener;

/**
 *
 * @author Julio
 */
public class ListaPessoasModel extends AbstractListModel<String> implements CadastroListener{
    private List<String> texto = new ArrayList<String>();
    
    public ListaPessoasModel(){
        super();
    }
    
    public ListaPessoasModel(List<String> dados){
        texto.addAll(dados);
    }
    
    @Override
    public int getSize() {
        return texto.size();
    }

    @Override
    public String getElementAt(int index) {
        return texto.get(index);
    }
    
    public void add(String s) {
        texto.add(s);
        fireIntervalAdded(this, texto.size(), texto.size());
    }

    @Override
    public void elementoAdicionado(CadastroEvent evt) {
        add(evt.getPessoa().toString());
    }
}
