import java.util.LinkedList;
import java.util.Random;

public class Lote {
    private String id;
    private Produto produto;
    private int quantidade;
    private LinkedList<Produto> lista;

    Lote(Produto p, int qtd){
        this.id = idGen(100);
        this.produto = p;
        this.quantidade = qtd; 
        this.lista = criaLista(this.produto, this.quantidade);
    }

    private LinkedList<Produto> criaLista(Produto p, int qtd){
        LinkedList<Produto> stub = new LinkedList<Produto>();
        for (int i = 0; i < qtd; i++) {
            stub.add(new Produto(p.getNome(), p.getFabricante()));
        }
        return stub;
    }

    public String getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LinkedList<Produto> getLista() {
        return (LinkedList<Produto>)lista.clone();
    }

    private String idGen(int range){
        Random gerador = new Random();
        Integer num = gerador.nextInt(range);
        return num.toString();
    }

    @Override
    public String toString() {
        return "Produto: "+this.produto.getNome()+"\nQuantidade: "+
                        this.quantidade;
    }
}
