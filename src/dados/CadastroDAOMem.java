/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import negocio.CadastroDAO;
import java.util.ArrayList;
import java.util.List;
import negocio.Pessoa;

/**
 *
 * @author Julio
 */
public class CadastroDAOMem implements CadastroDAO {
    private List<Pessoa> pessoas;

    public CadastroDAOMem() {
        pessoas = new ArrayList<Pessoa>();
    }

    @Override
    public boolean adicionar(Pessoa p) {
        return pessoas.add(p);
    }

    @Override
    public List<Pessoa> getHomens() {
        List<Pessoa> tmp = new ArrayList<Pessoa>();
        for (Pessoa p : pessoas) {
            if (p.getSexo() == 'M') {
                tmp.add(p);
            }
        }
        return tmp;
    }

    @Override
    public List<Pessoa> getMulheres() {
        List<Pessoa> tmp = new ArrayList<Pessoa>();
        for (Pessoa p : pessoas) {
            if (p.getSexo() == 'F') {
                tmp.add(p);
            }
        }
        return tmp;
    }

    @Override
    public List<Pessoa> getTodos() {
        return pessoas;
    }

    @Override
    public Pessoa getPessoaPorNome(String n) {
        for(Pessoa p : pessoas) {
            if(p.getNome().equalsIgnoreCase(n))
                return p;
        }
        return null;
    }
}
