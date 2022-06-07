public class TesteImpressora {
    public static void main(String[] args) {
        var ssora = new Impressora();

        int a = 2, b = 3;
        float f1 = 1.2f, f2 =  5.5f, f= 2.3f;
        String s = "1";
        String s1= "2";
        String s2= "3";
        String s3= "4";

        ssora.exibir(f);

        ssora.exibir(f1, f2);

        ssora.exibir(f1, s);

        ssora.exibir(s, f1);

        ssora.exibir(s1, s2, s3);

        ssora.exibir(a, b, s);
    }
}
