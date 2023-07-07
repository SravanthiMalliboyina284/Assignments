import java.util.*;
class BillAmount  
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p = sc.nextInt();
        char cat = sc.next().charAt(0);
        int u = c - p;
        System.out.println("Billable Units are: " + u);

        switch (cat) {
            case 'D':
                if (u>=1 && u<=100)
                {
                    int A = u * 1;
                    System.out.println("Billable units is: " + A);
                }
                else if (u>=101 && u<=200)
                {
                    int B = u * 2;
                    System.out.println("Billable units is: " + B);
                }
                else
                {
                    int C = u * 3;
                    System.out.println("Billable units is: " + C);
                }
                break;
            case 'C':
                if (u>=1 && u<=100)
                {
                    int D = u * 2;
                    System.out.println("Billable units is: " + D);
                }
                else if (u>=101 && u<=200)
                {
                    int E = u * 4;
                    System.out.println("Billable units is: " + E);
                }
                else
                {
                    int F = u * 6;
                    System.out.println("Billable units is: " + F);
                }
                break;
            case 'I':
                if (u>=1 && u<=100)
                {
                    int G = u * 3;
                    System.out.println("Billable units is: " + G);
                }
                else if (u>=101 && u<=200)
                {
                    int H = u * 6;
                    System.out.println("Billable units is: " + H);
                }
                else
                {
                    int I = u * 9;
                    System.out.println("The Cost of the Billable units is: " + I);
                }
                break;
            default:
                System.out.println("not belongs to any of the Category");
                break;
        }
    }
}
