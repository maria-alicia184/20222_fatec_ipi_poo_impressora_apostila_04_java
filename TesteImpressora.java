//2 Classe de Teste
public class TesteImpressora {
    public static void main (String [] args){
        Impressora i = new Impressora();

        i.exibir(1.1f);
        i.exibir(1.2f, 1.2f);
        i.exibir(1.3f, "1");
        i.exibir("1", 1.4f);
        i.exibir("1", "1", "1");
        i.exibir(1, 1, "1");
    }
}
