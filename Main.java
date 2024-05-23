public class Main {

// return ün altına yazılan hic bir kod calısmaz. return fonksiyonun son kod blogu olarak geçer,

    public static int deneme ( int a) {

        System.out.println("Çıktı veriliyor...");
        return a*2;
    }
    public static int toplama ( int a , int b , int c) {

        //System.out.println("Toplam: " + (a + b + c));
        return (a+b+c); // fonksiyondan çıktı almamızı sağlar. // return kullanacaksak public static VOİD kullanılmaz. Hangi değer cıkacaksa (int) o yazılır.
    }

    //2. Örnek yapalım

    public static int ikiilecarpma ( int a) {

        return  a*2;
    }
    public static int ikiiletopla ( int a) {
        return a +2;
    }
    public static int dörtilecarp ( int a) {
        return a*4;
    }


    public static void main ( String [] args) {
        System.out.println("Toplam: " + toplama(1,2,3));

        System.out.println("*****************************");


        System.out.println("Sonuç : " + dörtilecarp(ikiiletopla(ikiilecarpma(8))) );


        System.out.println(deneme(4));

    }
}
