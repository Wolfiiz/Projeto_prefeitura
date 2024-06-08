package views;

import Controllers.UsuarioController;
import java.util.List;
import models.Usuario;

public class UsuarioView {
    private UsuarioController controller;

    public UsuarioView(UsuarioController controller) {
        this.controller = controller;
    }

    public void exibirUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail());
        }
    }
}
