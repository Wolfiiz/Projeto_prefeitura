package views;

import Controllers.CidadaoController;
import java.util.List;
import models.Cidadao;

public class CidadaoView {
    private CidadaoController controller;

    public CidadaoView(CidadaoController controller) {
        this.controller = controller;
    }

    public void exibirCidadaos(List<Cidadao> cidadaos) {
        for (Cidadao cidadao : cidadaos) {
            System.out.println("ID: " + cidadao.getId() + ", Nome: " + cidadao.getNome() + ", Email: " + cidadao.getEmail());
        }
    }
}
