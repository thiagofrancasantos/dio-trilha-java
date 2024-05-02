public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23766064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //simulando um CEP formatado
            return "23.765-064";
    }
}