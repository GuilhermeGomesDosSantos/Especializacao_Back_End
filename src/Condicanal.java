public class Condicanal {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean includeNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a peja assistir!");
        }

//        if (includeNoPlano == true || tipoPlano.equals("plus")) {
        if (includeNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
