package models;

public class Funcionario extends Usuario {
    private String cargo;
    private String status;

    public Funcionario(int id, String nome, String email, String senha, String cargo, String status) {
        super(id, nome, email, senha);
        this.cargo = cargo;
        this.status = status;
    }

    public String getCargo() {
        return cargo;
    }

    public String getStatus() {
        return status;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
