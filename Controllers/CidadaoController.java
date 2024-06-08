package Controllers;

import java.util.ArrayList;
import java.util.List;
import models.Cidadao;

public class CidadaoController {
    private List<Cidadao> cidadaos = new ArrayList<>();

    public void adicionarCidadao(Cidadao cidadao) {
        cidadaos.add(cidadao);
    }

    public List<Cidadao> listarCidadaos() {
        return cidadaos;
    }
}
