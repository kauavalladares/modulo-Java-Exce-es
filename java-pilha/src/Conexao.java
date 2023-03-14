public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("abrindo conexão");

    }

    public void ledados()  {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    public void close(){
        System.out.println("fechando conexão");
    }

}
