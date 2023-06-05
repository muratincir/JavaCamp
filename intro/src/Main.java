public class Main {
    public static void main(String[] args) {
        // camelCase
        // Don't repeat yourself ( KENDİNİ TEKRAR ETME )

        String internetSubeButonu = "İnternet Şubesi";
        System.out.println(internetSubeButonu);

        int vade = 36;
        System.out.println(vade);

        double dolarDun = 8.15;
        double dolarBugun = 8.18;
        boolean dustuMu = true;               // aşağı yukarı oklar

        if (dolarBugun < dolarDun)
            System.out.println("Dolar düştü image");
        else if (dolarBugun == dolarDun)
            System.out.println("Dolar aynı image");
        else
            System.out.println("Dolar yükseldi image");

        // <img src = "yolunu yaz" >

        String[] krediler = {"Hızlı kredi", "Mutlu emekli kredisi", "Konut kredisi", "Çiftçi Kredisi", "Msb kredisi", "Meb kredisi"};

        // foreach döngüsü

        for (String kredi : krediler) {
            System.out.println(kredi);
        }

        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        /*
        İlkel veri tipleri:
                boolean
                TAM SAYI
                byte
                short
                int
                long
                ONDALIKLI SAYI
                float
                double

         Referans veri tipleri:
                Array
                Interface
                Class
                String
         */
        

    }
}