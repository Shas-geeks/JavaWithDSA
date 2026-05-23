import java.sql.SQLOutput;
import java.util.Scanner;

public class TransportApplication {
    public static void main(String[] args) {
        int TransportCost=GetTransportCost();
        System.out.println("Your Transport Expense is "+TransportCost);
    }
    static int GetTransportCost()
    {
        /*
             User enters travel mode (A = Air, T = Train, B = Bus) and class type. Calculate fare based on distance (km).
            Air → Business(B) = ₹8/km, Economy(E) = ₹5/km
            Train → First(F) = ₹3/km, Sleeper(S) = ₹1/km
            Bus → AC(A) = ₹2/km, Non-AC(N) = ₹1/km
         */
        System.out.println("Please Enter The Transport Medium : 'A' , 'T' 'B' ");
        Scanner input= new Scanner(System.in);
        char ch=input.next().charAt(0);
        System.out.println("Enter The Base Fair ");
        int distance=input.nextInt();
        int CalculateTotalFair=distance;

        switch (ch)
        {
            case 'A':
                System.out.print("Enter The Transportation Class of Flight Buisness for (B) and Economy for  (E)");
                char SeatingPrefreceOfFlight=input.next().charAt(0);
                switch (SeatingPrefreceOfFlight)
                {
                    case 'B':
                        CalculateTotalFair*=8;
                        break;
                    case 'E':
                        CalculateTotalFair*=5;
                        break;
                }

                break;

            case 'T':
                System.out.println("Enter The Transportation Class of Train First class for (F) and Sleeper (S)");
                char SeatingPrefreceofTrain=input.next().charAt(0);
                switch (SeatingPrefreceofTrain)
                {
                    case 'F':
                        CalculateTotalFair*=3;
                        break;
                    case 'S':
                        CalculateTotalFair*=1;
                }
                break;

            case 'B':
                System.out.println("Enter The Transportation Class of Train for AC for (A) and NA (N) ");
                char SeatingPrefreceofBus=input.next().charAt(0);
                switch(SeatingPrefreceofBus)
                {
                    case 'A':
                        CalculateTotalFair*=2;
                        break;


                    case 'N':
                        CalculateTotalFair*=1;
                }

        }
        return CalculateTotalFair;
    }
}
