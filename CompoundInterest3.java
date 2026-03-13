public class CompoundInterest3 {
    public static void calculateBalance(double amount,int year,int totalYear){
        if(year>totalYear){
            return;
        }
        amount=amount*1.1;
        System.out.printf("Year %d:%.2f%n",year,amount);
        calculateBalance(amount,year+1,totalYear);
    }
    public static void main(String[] args){
        double principal=1000;
        int years=3;
        System.out.printf("Initial amount:%.2f%n",principal);
        calculateBalance(principal,1,years);
    }
}
