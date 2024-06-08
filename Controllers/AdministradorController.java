package Controllers;

import java.util.ArrayList;
import java.util.List;
import models.Administrador;

public class AdministradorController {
    private List<Administrador> administradores = new ArrayList<>();

    public void adicionarAdministrador(Administrador administrador) {
        administradores.add(administrador);
    }

    public List<Administrador> listarAdministradores() {
        return administradores;
    }
}
