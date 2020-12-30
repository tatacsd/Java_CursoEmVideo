
package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        // TODO code application logic here
        Locale localizacao = Locale.getDefault();
        System.out.println("Seu sistema esta em " + localizacao.getDisplayLanguage());
        
    }
    
}
