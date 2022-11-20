package agroupworkshop;

import java.util.Scanner;

public class TicketPreis {


    public static void main(String[] args) {


        int km;
        int yas;
        int yon;

        Scanner input=new Scanner(System.in);
        System.out.println("Gideceginiz yerin mesafesini girin");
        km=input.nextInt();
        System.out.println("Yasinizi giriniz");
        yas =input.nextInt();
        System.out.println("Yon durumunu belirtin");
        yon=input.nextInt();


        double fiyat;
        double yasIndirimi;
        double ciftYonluIndirim;

        if (km>0&&yas>0&&(yon==1||yon==2)){
            fiyat=km*0.10;
            if (yas<12){
                yasIndirimi=fiyat*0.50;
                fiyat=fiyat-yasIndirimi;
            } else if (yas>=12&&yas<24) {
                yasIndirimi=fiyat*0.10;
                fiyat=fiyat-yasIndirimi;

            } else if (yas>=65) {
                yasIndirimi=fiyat*0.30;
                fiyat=fiyat-yasIndirimi;

            }else yasIndirimi=0;

            if(yon==2){
                ciftYonluIndirim=fiyat*0.20;
                fiyat=fiyat-ciftYonluIndirim;

            }
            System.out.println("Biletin toplam fiyati: "+fiyat +"$");


        }else System.out.println("Girdiginiz degerler yanlistir");

    }


}




