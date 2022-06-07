public class Impressora{  
    //tipo de retorno: void
    //nome: exibir
    //lista de parâmetros: float
    //corpo: {...}
    void exibir(float f){
        System.out.println(f);

    }

    void exibir(float f1, float f2){
        System.out.printf("%.2f, %.2f\n", f1, f2);
        //System.out.printf(String.format("%.2f, %.2f\n", f1, f2));
        //System.out.println(f1 + ", " + f2);
    }
    void exibir(float f1, String s){
        System.out.println(f1 + " , " + s);
    }
    void exibir(String s, float f1){
        System.out.println(s + " , " + f1);
    }
    void exibir(String s1, String s2, String s3){
        System.out.println( s1 + " , " + s2 + " , " + s3);
    }
    void exibir(int a, int b, String s){
        System.out.println(a+ " , " + b + " , " + s);
    }
}