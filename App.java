package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {

        //Nama  : Ramadhani Safitri
        //NIM   : 2211522009
        //Kelas : PBO A

        MemberReguler reguler = new MemberReguler();
        MemberSilver silver = new MemberSilver();
        MemberGold gold = new MemberGold();
        MemberPlatinum platinum = new MemberPlatinum();

        //meskipun memakai method yang sama dengan input yang sama pula, outputnya berbeda
        //itu karena object dibuat dari kelas yang berbeda, namun nama methodnya sama
        //dengan kata lain, antar kelas memiliki method yang sama namun perilakunya berbeda

        System.out.println();
        System.out.println("total bayar member reguler = " + reguler.hitungTotalBayar(800000));
        System.out.println("total bayar member silver = " + silver.hitungTotalBayar(800000));
        System.out.println("total bayar member gold = " + gold.hitungTotalBayar(800000));
        System.out.println("total bayar member platinum = " + platinum.hitungTotalBayar(800000));

        System.out.println();
        System.out.println("ongkir member silver = " + silver.hitungOngkir(15.0));
        System.out.println("ongkir member gold = " + gold.hitungOngkir(15.0));
        System.out.println("ongkir member platinum = " + platinum.hitungOngkir(15.0));
        
    }
    
}
