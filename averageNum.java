public class averageNum {

    public static void main(String[] args) {
        double FirstNum= Double.parseDouble(args[0]);
        double SecondNum= Double.parseDouble(args[1]);
        double ThirdNum= Double.parseDouble(args[2]);
        double AverageNum= (FirstNum+SecondNum+ThirdNum)/3;
        System.out.println("Average: "+ AverageNum);


    }
}