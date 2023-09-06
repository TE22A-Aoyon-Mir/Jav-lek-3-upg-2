public class App {
    public static void main(String[] args) throws Exception {
       
        System.out.println("Uppgift a");
        int tal1 = 23;
        int tal2 = 45;
        int summa;
        int summa_sub;
        summa = tal1+tal2;
        summa_sub = tal1-tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);
        System.out.println(tal1+"-"+tal2+"="+summa_sub);

        System.out.println("Uppgift b");
        int tal3 = 234232;
        int tal4 = 3424;
        int produkt = tal2*tal3*tal4;
        System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt);

        System.out.println("Uppgift c");
        int tal5 = 10;
        int tal6 = 3;
        double kvot = tal6/tal3;
        System.out.println(tal6+"/"+tal5+"="+kvot);

        System.out.println("Uppgift d");
        int tal7 = 12;
        int tal8 = 4;
        int modulo = tal5%tal6;
        int modulo_2 = tal7%tal8;
        System.out.println(tal5+"%"+tal6+"="+modulo);
        System.out.println(tal7+"%"+tal8+"="+modulo_2);

    }
}
