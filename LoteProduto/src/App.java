import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Lote lote = new Lote(new Produto("xanex", "Farma Inc"), 10);
        
        System.out.println(lote.toString()+"\n");
                
        LinkedList<Produto> cloneLista = lote.getLista();
        for (Produto produto : cloneLista) {
            System.out.println(produto.toString());
        }
    }
}
