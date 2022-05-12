import java.util.Random;

public class Produto {
    private String id;
    private String nome;
    private String fabricante;

    Produto(String nome, String fabricante){
        this.id = idGen(100);
        this.nome = nome;
        this.fabricante = fabricante;
    }   

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    private String idGen(int range){
        Random gerador = new Random();
        Integer num = gerador.nextInt(range);
        return num.toString();
    }

    @Override
    public String toString() {
        return "ID: "+this.id+"\nNome: "+this.nome+"\nFabricante: "+
                        this.fabricante;
    }
}
