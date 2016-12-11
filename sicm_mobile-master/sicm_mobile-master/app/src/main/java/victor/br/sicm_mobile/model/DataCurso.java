package victor.br.sicm_mobile.model;

import java.util.ArrayList;

/**
 * Created by Victor Andrade on 09/10/2016.
 */

public class DataCurso {

    public ArrayList<String> geraListaCurso(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Sistemas de Informação");
        lista.add("Arquitetura e Urbanismo");
        lista.add("Ciências da computação");
        lista.add("Publicidade e Propaganda");
        lista.add("Adm de Empresa");
        lista.add("Moda");
        lista.add("Analise e Desenvolvimento");
        lista.add("Ciências Contábeis");
        lista.add("Engenharia Civil");
        lista.add("Engenharia Mecânica");

        return lista;
    }

}
