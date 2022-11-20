package assignments.mycodes.salarycalcualtion;
public class MainCalculations implements Tax, PlusFactors {
    @Override
    public double annualIncrement(int yearNumbers) {
        if (yearNumbers>=10) {
            System.out.println("Annual extra income = " + yearNumbers * 100);
            return yearNumbers * 100;
        }else {
            return yearNumbers*50;
        }
    }
    @Override
    public double monthlyIncrement(int extraWorkingHours) {
        if(extraWorkingHours-160>0) {
            System.out.println(("Monthly extra income = "+ (extraWorkingHours - 160) * 10));
            return (extraWorkingHours - 160) * 10;
        }else {
            return 0;
        }
    }
    @Override
    public double taxAnnual(double bruttoSalary, int yearNumbers) {
        if(yearNumbers>=10) {
            System.out.println("Your Annual Tax = "+ bruttoSalary * 30/100 );
            return bruttoSalary * 30/100;
        }else {
            return bruttoSalary* 20/100;
        }
    }
    public double netSalary (double bruttoSalary, int yearNumbers, int extraWorkingHours){
        return bruttoSalary+annualIncrement(yearNumbers)+monthlyIncrement(extraWorkingHours)-taxAnnual(bruttoSalary,yearNumbers);
    }
}
