package ifpr.pgua.eic.tvs.mocks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CarteiraTest {
    

    @Test
    public void verificaTamanhoCarteira(){
        //cenario
        Acao acao = AcaoBuilder.nova().comQuantidade(10).agora();
        Acao acao2 = AcaoBuilder.nova().comQuantidade(12).agora();

        List<Acao> acaos = new ArrayList<>();
        acaos.add(acao);
        acaos.add(acao2);

        Carteira carteira = new Carteira(null);

        carteira.setCarteira(acaos);

        //ação

        int tamanhoObtido = carteira.tamanhoCarteira();

        //verificação
        assertNotNull(carteira.getCarteira());
        assertEquals(22, tamanhoObtido);
    }
}
