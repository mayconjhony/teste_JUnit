import compra.Compra;
import compra.Item;
import modelos.RegistradoraModelo;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class RegistradoraTeste {
    @Test
    public void deveRegistrarAVendaNoBancoDeDados() {

        var pastelDeCarne = Item.builder().nome("pastel de Carne").valor(new BigDecimal("07.00")).build();
        var pastelDeFrango = Item.builder().nome("pastel de Frando").valor(new BigDecimal("06.00")).build();

        List<Item> listaDeItens = Arrays.asList(pastelDeCarne, pastelDeFrango);

        var compra = Compra.builder().itens(listaDeItens).build();

        var registradora = RegistradoraModelo.construirCenario()
                .compra(compra)
                .valorRecebido(new BigDecimal("13.30"))
                .build();

    }
}
