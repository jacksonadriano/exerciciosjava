package tipos;

import java.math.BigDecimal;

public class ExemplosTipos {

    public static void main(String[] args) {
        //Ano Atual
        short anoAtual = 2020;

        //Quantidade de vendas de um dia de um a pequena empresa(1023)
        int quantidadeVendasDia = 1023;

        //Situação de um boleto (pago / não pago)
        boolean boletoPago = true;
        //NAO USEM OS TRES ESTADOS DO Boolean...
        Boolean f = false;
        Boolean tr = true;
        Boolean n = null;

        //Tipos de pagamento (Credito / Debito)
        char tipoPagamento = 'C';
        //char tipoPagamento = 'D';

        //Dados binários, por exemplo, um documento pdf - (mapear um array do menor tipo inteiro que temos)
        byte[] documento = new byte[]{};

        //CNPJ
        String cnpj = "05.203.011/0001-20";

        //Valor de um produto, considerando itens de uma farmácia
        float valorProdutoFarmacia = 167.67F;
        BigDecimal valorProdutoBIG = BigDecimal.valueOf(167.67);

        //Código de barras de um Produto
        String codigoBarrasProduto = "904238948329042903483902843290";
    }
}
