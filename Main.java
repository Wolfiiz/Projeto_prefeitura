import Controllers.*;
import java.time.LocalDate;
import models.Administrador;
import models.Cidadao;
import models.Funcionario;
import models.Servico;
import models.Usuario;
import views.*;

public class Main {
    public static void main(String[] args) {
        AdministradorController administradorController = new AdministradorController();
        CidadaoController cidadaoController = new CidadaoController();
        FuncionarioController funcionarioController = new FuncionarioController();
        ServicoController servicoController = new ServicoController();
        UsuarioController usuarioController = new UsuarioController();

        AdministradorView administradorView = new AdministradorView(administradorController);
        CidadaoView cidadaoView = new CidadaoView(cidadaoController);
        FuncionarioView funcionarioView = new FuncionarioView(funcionarioController);
        ServicoView servicoView = new ServicoView(servicoController);
        UsuarioView usuarioView = new UsuarioView(usuarioController);

        Administrador administrador = new Administrador(1, "Admin1", "admin1@example.com", "password1");
        administradorController.adicionarAdministrador(administrador);
        administradorView.exibirAdministradores(administradorController.listarAdministradores());

        Cidadao cidadao = new Cidadao(1, "Cidadao1", "cidadao1@example.com", "password1");
        cidadaoController.adicionarCidadao(cidadao);
        cidadaoView.exibirCidadaos(cidadaoController.listarCidadaos());

        Funcionario funcionario = new Funcionario(1, "Funcionario1", "funcionario1@example.com", "password1", "Atendente", "Ativo");
        funcionarioController.adicionarFuncionario(funcionario);
        funcionarioView.exibirFuncionarios(funcionarioController.listarFuncionarios());

        Servico servico = new Servico(1, "Coleta de Lixo", "Coleta de lixo residencial", "Agendado", LocalDate.now());
        servicoController.adicionarServico(servico);
        servicoView.exibirServicos(servicoController.listarServicos());

        Usuario usuario = new Usuario(1, "Usuario1", "usuario1@example.com", "password1");
        usuarioController.adicionarUsuario(usuario);
        usuarioView.exibirUsuarios(usuarioController.listarUsuarios());
    }
}
