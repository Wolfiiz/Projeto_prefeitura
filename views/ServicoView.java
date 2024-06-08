package views;

import Controllers.ServicoController;
import java.util.List;
import models.Servico;

public class ServicoView {
    private ServicoController controller;

    public ServicoView(ServicoController controller) {
        this.controller = controller;
    }

    public void exibirServicos(List<Servico> servicos) {
        for (Servico servico : servicos) {
            System.out.println("ID: " + servico.getId() + ", Tipo: " + servico.getTipo() + ", Descrição: " + servico.getDescricao() + ", Status: " + servico.getStatus() + ", Data de Agendamento: " + servico.getDataAgendamento());
        }
    }
}
