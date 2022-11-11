package practiceAdvanced.practice07;

public class BMI {
    private double kilo;
    private double boy;

    public BMI(double kilo, double boy) {
        this.kilo = kilo;
        this.boy = boy;
    }

    public BMI() {
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void BMIHesapla(){
        double bmi = kilo/(boy*boy);
        System.out.println("BMI: "+bmi);
        if(bmi>0 && bmi<18.5){
            System.out.println("Zayif");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("Normal");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("Kilolu");
        } else if (bmi>=30) {
            System.out.println("Obez");
        }else {
            System.out.println("Gecersiz Deger");
        }

    }





    @Override
    public String toString() {
        return "BMI{" +
                "kilo=" + kilo +
                ", boy=" + boy +
                '}';
    }
}