package Controllers;

import java.util.ArrayList;
import java.util.List;
import models.Funcionario;

public class FuncionarioController {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }
}
