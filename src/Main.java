public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println(("Filme: Top Gun: Maverick"));

        int anoDeLancamentoFilme = 2022;

        System.out.println("Ano de Lançamento: " +anoDeLancamentoFilme);

        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                2022
                """;
        System.out.println(sinopse);

        int classficacao;
        // classficacao = media / 2; // vai precisar de uma conversão
//        int classficacao = (int) media / 2;
        classficacao = (int) media / 2;

        System.out.println(classficacao);
    }
}