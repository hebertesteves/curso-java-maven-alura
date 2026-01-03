package hebertesteves;

import hebertesteves.model.Anuncio;
import hebertesteves.model.Produto;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var produto = new Produto(1, "TV", "4K", new BigDecimal(2000), "Eletrodoméstico");
        var anuncio = new Anuncio(produto, new BigDecimal(4000), 20);

        System.out.println(anuncio);
    }
}