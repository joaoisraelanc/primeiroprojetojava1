public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLançamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLançamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media =(9.8 + 8.0 + 7.4)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de ação com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLançamento;
        System.out.println(sinopse);

        int classificao;
        classificao = (int) (media/2);
        System.out.println(classificao);


    }
}

