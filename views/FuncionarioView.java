package views;

import Controllers.FuncionarioController;
import java.util.List;
import models.Funcionario;

public class FuncionarioView {
    private FuncionarioController controller;

    public FuncionarioView(FuncionarioController controller) {
        this.controller = controller;
    }

    public void exibirFuncionarios(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", Email: " + funcionario.getEmail() + ", Cargo: " + funcionario.getCargo() + ", Status: " + funcionario.getStatus());
        }
    }
}
