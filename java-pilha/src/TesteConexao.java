
public class TesteConexao {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.ledados();

        } catch (IllegalStateException ex) {
        System.out.println("deu errado na conexao");
        }

        //--------------------------------------------
   /*     Conexao con = null;
        try {
            con = new Conexao();
            con.ledados();
        } catch (IllegalStateException ex){
            System.out.println("deu erro na conexão");
        } finally {
            System.out.println("Finaly");
            if (con != null)
            con.close();
        }
    }*/

    }
}
