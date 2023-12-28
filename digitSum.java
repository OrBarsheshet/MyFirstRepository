public class digitSum {
    public static void main(String[] args) {
        //System.out.println("enter 4 digit number");
        //int Number= Integer.parseInt(args[0]);
        //int Units= Number % 10; 
        //int Tens= (Number/10) %10;
        //int Hundreds= (Number/100)%10; 
        //int Thousand= (Number/1000)%10; 
        //int Sum= Units+Tens+Hundreds+Thousand; 
        //System.out.println("The Sum is " + Sum);
        int Number = Integer.parseInt(args[0]);
        int Sum = 0; 
        while (Number > 0)
        {
            Sum =  Sum + (Number % 10);
            //added the units 
            Number = Number / 10; 
        }
        System.out.println("the sum is " + Sum);



    
    }
}
