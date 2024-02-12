package Teme.Challenge3;
public class Teme3 {
    public static void main(String args[]){
        int a=12, b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //challenge2

        int c=11;
        ++c;
        System.out.println("adunare"+c);
        --c;
        System.out.println("scadere"+c);

        //challenge3

        int numar=-5;
        if (numar <0){
            System.out.println("negativ");
        }else{
            System.out.println("pozitiv");
        }

        //challenge4

        System.out.println("crescator");
        for(int z=1; z<=10; z++){
            System.out.println(z);
        }
        System.out.println("descrescator");
        for(int z=10; z>=1; z--){
            System.out.println(z);
        }

        //challenge5

        int d=13;
        d +=2;
        System.out.println(d);
        d -=2;
        System.out.println(d);
        d *=2;
        System.out.println(d);
        d /=2;
        System.out.println(d);
        d %=2;
        System.out.println(d);
        d &=2;
        System.out.println(d);

        //challenge6

        int e=33;
        int f=20;
        System.out.println(e>f);
        System.out.println(e<f);
        System.out.println(e>=f);

        //challenge7

        int g=10;
        double h=6.5;
        System.out.println(g+h);
        System.out.println(g-h);
        System.out.println(g/h);


        //challenge8

        byte j=25;
        byte k=30;
        System.out.println((byte)(j+k));

        //challenge9

        int Le=12;
        int Br=3;
        int Aria=Le*Br;
        System.out.println("Suprafata:"+Aria);

        //challenge10







        //challenge11
        boolean M=true;
        M =!M;
        System.out.println(M);
        boolean N=false;
        N =!N;
        System.out.println(N);


        //challenge12

        int suma=14;
        System.out.println(suma);
        System.out.println(suma--);
        System.out.println(--suma);
        System.out.println(++suma);

        //challenge13






        //challenge14
        int Total=50;
        if (Total<100) {
            System.out.println("True");
        }else if (Total<0){
            System.out.println("False");
        }else {
            System.out.println("False");
        }





    }

}
