package conexaobd;

import Models.ProdutoModel;
import Controllers.ProdutoController;

public class ConexaoBD {
    public static void main(String[] args) throws ClassNotFoundException {
       ProdutoModel produto = new ProdutoModel(6, "Pneu de corrida", 118.88f, 3303, "Relampago marquinho pneus"); 
       ProdutoController produto_Controller = new ProdutoController();
       
       produto_Controller.Index();
    }
}
