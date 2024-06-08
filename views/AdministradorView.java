package views;

import Controllers.AdministradorController;
import java.util.List;
import models.Administrador;

public class AdministradorView {
    private AdministradorController controller;

    public AdministradorView(AdministradorController controller) {
        this.controller = controller;
    }

    public void exibirAdministradores(List<Administrador> administradores) {
        for (Administrador administrador : administradores) {
            System.out.println("ID: " + administrador.getId() + ", Nome: " + administrador.getNome() + ", Email: " + administrador.getEmail());
        }
    }
}
