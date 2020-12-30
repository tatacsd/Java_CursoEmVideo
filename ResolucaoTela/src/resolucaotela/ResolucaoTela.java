
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        // TODO code application logic here
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tamanhoTela.getWidth();
        int altura = (int) tamanhoTela.getHeight();
        System.out.println("Sua tela tem resolução " + largura + " x " + altura);
    }
    
}
