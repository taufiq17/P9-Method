public class RumusMatematika {

    double a, t;//deklarasi variabel
    double l_segitiga;

    public static void main(String[] args){//method static
        RumusMatematika rm = new RumusMatematika();//deklarasi object dg nama rm
        rm.luassegitiga();//pemanggilan method luassegitiga()
    }

    void luassegitiga(){
        a = 7;
        t = 10;
        l_segitiga = 0.5 * a * t;
        System.out.println("Luas Segitiga = " + l_segitiga);
    }


}

/**
*pemanggilan method luassegitiga harus dideklarasikan object classnya terlebih dahulu karena method luassegitiga tergolong method bkn statis
 */