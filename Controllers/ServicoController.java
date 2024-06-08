package Controllers;

import java.util.ArrayList;
import java.util.List;
import models.Servico;

public class ServicoController {
    private List<Servico> servicos = new ArrayList<>();

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public List<Servico> listarServicos() {
        return servicos;
    }
}
