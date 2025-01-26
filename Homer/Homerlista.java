import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Homerlista {
    private LinkedList<Pessoa> pessoas;

    public Homerlista() {
        pessoas = new LinkedList<>();
    }

    public void adicionarPessoa(String nome) {
        Pessoa pessoa = new Pessoa(nome);
        pessoas.add(pessoa);
        JOptionPane.showMessageDialog(null, "Simpson adicionado: " + nome);
    }

    public void adicionarPessoaNaPosicao(int posicao, String nome) {
        Pessoa pessoa = new Pessoa(nome);
        pessoas.add(posicao, pessoa);
        JOptionPane.showMessageDialog(null, "Simpson adicionada na posição " + posicao + ": " + nome);
    }

    public void removerPessoaPorNome(String nome) {
        boolean removido = pessoas.removeIf(p -> p.nome.equals(nome));
        if (removido) {
            JOptionPane.showMessageDialog(null, "Simpson removida: " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "Simpson nao encontrada: " + nome);
        }
    }

    public void esvaziarLista() {
        pessoas.clear();
        JOptionPane.showMessageDialog(null, "Lista esvaziada.");
    }

    public void listarPessoas() {
        StringBuilder lista = new StringBuilder("Lista de Simpsons:\n");
        for (Pessoa pessoa : pessoas) {
            lista.append(pessoa.nome).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    public static void main(String[] args) {
        Homerlista lista = new Homerlista();

        while (true) {
            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção:\n1. Adicionar Simpson\n2. Remover Simpson\n3. Listar Simpsons\n4. Esvaziar Lista\n5. Sair");
            if (opcao == null || opcao.equals("5")) {
                break;
            }
            switch (opcao) {
                case "1":
                    String nomeAdicionar = JOptionPane.showInputDialog("Digite o nome do Simpson:");
                    lista.adicionarPessoa(nomeAdicionar);
                    break;
                case "2":
                    String nomeRemover = JOptionPane.showInputDialog("Digite o nome do Simpson a ser removido eh:");
                    lista.removerPessoaPorNome(nomeRemover);
                    break;
                case "3":
                    lista.listarPessoas();
                    break;
                case "4":
                    lista.esvaziarLista();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    break;
}
}
}
}
