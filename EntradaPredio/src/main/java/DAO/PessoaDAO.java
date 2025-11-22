/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import Model.Pessoa;

public class PessoaDAO {
    private static List<Pessoa> lista = new ArrayList<>();
    private static int contador = 1;

    public void inserir(Pessoa p) {
        p.setCodigo(contador++);
        lista.add(p);
    }

    public List<Pessoa> listar() {
        return lista;
    }
}
