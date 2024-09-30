/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FADHILA
 */
public class Main {

    public static void main(String[] args) {
        Kelengkeng fr = new Kelengkeng();

        fr.setnama_buah("Kelengkeng");
        fr.setWarna("kuning");
        fr.setbentuk("bulat");
        fr.setrasa("manis");
        fr.setukuran("kecil");

        System.out.println("\n\t\t\tKelengkeng");
        System.out.println("Nama              : " + fr.getnama_buah());
        System.out.println("Warna             : " + fr.getWarna());
        System.out.println("Bentuk            : " + fr.getbentuk());
        System.out.println("Rasa              : " + fr.getrasa());
        System.out.println("Ukuran            : " + fr.getukuran());

        Apel ap = new Apel();

        ap.setnama_buah("Apel");
        ap.setWarna("merah");
        ap.setbentuk("bulat, sedikit pipih");
        ap.setrasa("manis");
        ap.setukuran("kira-kira sebesar genggaman tangan");

        System.out.println("\n\t\t\tApel");
        System.out.println("Nama              : " + ap.getnama_buah());
        System.out.println("Warna             : " + ap.getWarna());
        System.out.println("Bentuk            : " + ap.getbentuk());
        System.out.println("Rasa              : " + ap.getrasa());
        System.out.println("Ukuran            : " + ap.getukuran());

        BuahNaga bn = new BuahNaga();

        bn.setnama_buah("BuahNaga");
        bn.setWarna("merah muda");
        bn.setbentuk("oval dengan tonjolan kulit");
        bn.setrasa("manis");
        bn.setukuran("besar");

        System.out.println("\n\t\t\tBuahNaga");
        System.out.println("Nama              : " + bn.getnama_buah());
        System.out.println("Warna             : " + bn.getWarna());
        System.out.println("Bentuk            : " + bn.getbentuk());
        System.out.println("Rasa              : " + bn.getrasa());
        System.out.println("Ukuran            : " + bn.getukuran());

        JambuGelas jm = new JambuGelas();

        jm.setnama_buah("JambuGelas");
        jm.setWarna("merah");
        jm.setbentuk("lonjong");
        jm.setrasa("segar, berair");
        jm.setukuran("sekitar 5-8 cm");

        System.out.println("\n\t\t\tJambuGelas");
        System.out.println("Nama              : " + jm.getnama_buah());
        System.out.println("Warna             : " + jm.getWarna());
        System.out.println("Bentuk            : " + jm.getbentuk());
        System.out.println("Rasa              : " + jm.getrasa());
        System.out.println("Ukuran            : " + jm.getukuran());

        Melon ml = new Melon();

        ml.setnama_buah("Melon");
        ml.setWarna("hijau kekuningan");
        ml.setbentuk("bulat");
        ml.setrasa("manis, segar");
        ml.setukuran("besar");

        System.out.println("\n\t\t\tMelon");
        System.out.println("Nama              : " + ml.getnama_buah());
        System.out.println("Warna             : " + ml.getWarna());
        System.out.println("Bentuk            : " + ml.getbentuk());
        System.out.println("Rasa              : " + ml.getrasa());
        System.out.println("Ukuran            : " + ml.getukuran());

        pisang1 ps = new pisang1();

        ps.setnama_buah("pisang1");
        ps.setWarna("kuning");
        ps.setbentuk("melengkung");
        ps.setrasa("manis");
        ps.setukuran("bervariasi, sekitar 10-20 cm");

        System.out.println("\n\t\t\tpisang");
        System.out.println("Nama              : " + ps.getnama_buah());
        System.out.println("Warna             : " + ps.getWarna());
        System.out.println("Bentuk            : " + ps.getbentuk());
        System.out.println("Rasa              : " + ps.getrasa());
        System.out.println("Ukuran            : " + ps.getukuran());

        semangka sk = new semangka();

        sk.setnama_buah("semangka");
        sk.setWarna("hijau");
        sk.setbentuk("bulat");
        sk.setrasa("manis");
        sk.setukuran("besar");

        System.out.println("\n\t\t\tsemangka");
        System.out.println("Nama              : " + sk.getnama_buah());
        System.out.println("Warna             : " + sk.getWarna());
        System.out.println("Bentuk            : " + sk.getbentuk());
        System.out.println("Rasa              : " + sk.getrasa());
        System.out.println("Ukuran            : " + sk.getukuran());
        
        kedondong kd = new kedondong();

        kd.setnama_buah("kedondong");
        kd.setWarna("hijau");
        kd.setbentuk("bulat");
        kd.setrasa("manis - manis asem");
        kd.setukuran("sedang");

        System.out.println("\n\t\t\tsemangka");
        System.out.println("Nama              : " + kd.getnama_buah());
        System.out.println("Warna             : " + kd.getWarna());
        System.out.println("Bentuk            : " + kd.getbentuk());
        System.out.println("Rasa              : " + kd.getrasa());
        System.out.println("Ukuran            : " + kd.getukuran());
    }

}
