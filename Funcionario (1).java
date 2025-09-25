import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private int id;
    private String cargo;
    private String cpf;
    private List<Produto> produtos = new ArrayList<>();

    private static List<Funcionario> funcionarios = new ArrayList<>(); 

    public Funcionario(int id, String nome, String cpf, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public static void cadastrarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public static List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }


    public void cadastrarProduto(Produto p) {
        produtos.add(p);
    }

    public Produto consultarProduto(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) return p;
        }
        return null;
    }

 
    public Venda gerarVenda(int idVenda) {
        return new Venda(idVenda, this.nome);
    }

  
    public String getNome() { return nome; }
    public int getId() { return id; }
}

