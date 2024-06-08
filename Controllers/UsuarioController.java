package Controllers;

import java.util.ArrayList;
import java.util.List;
import models.Usuario;

public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
