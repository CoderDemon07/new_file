import java.util.*;
public class functions_methods {
    public static void calculate(int n,int m){
        System.out.println("sum is " + (n+m));
    }
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
        //return statement does not directly print the product
        //it will only print the product if it is stored inside another parameter.
    }
    public static int factorial(int n){
        int f = 1;
        for (int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b,int c){
        return a + b + c;
    }
    
    //checking prime in normal method.
    public static boolean Prime(int n){
        boolean isPrime = true;
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //checking prime in optimised method(by underroot method.)
    public static boolean isPrime(int n){
        for(int i =2; i<Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeRange(int g){
        for(int i=2; i<=g;i++){
            if(Prime(i)){//for true case
                System.out.print(i + " ");
            }
        }
        System.out.println();
        }


//conversion of binary to decimal integer.
public static void BinToDec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while(binNum>0){
        int lastDigit = binNum%10;
        //The last digit of a number can be obtained by taking remainder of number when divided by 10.
        decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
        pow++;
        binNum = binNum/10;
    }

    System.out.println("decimal of " + myNum + " = " + decNum);   
}


//conversion of deciaml to binary integer.
public static void DecToBin(int M){
    int myNum = M;
    int BinNum = 0;
    int o = 0;
    while(M>0){
        int rem = M % 2;
        BinNum = BinNum + (rem * (int)Math.pow(10,o));
        o++;
        M=M/2;
    }
    System.out.println("binary form of " + myNum + " = " + BinNum);
}

       public static void main(String[] args) {
        // System.out.println("enter first number : ");
        // Scanner sc = new Scanner(System.in);
        //  int a = sc.nextInt();
        // System.out.println("enter second number : ");
        // int b = sc.nextInt();
        // calculate(a,b);
        // int k = multiply(a, b);
        // System.out.println("multiplication is : " + k);
        // System.out.println("factorial is : " + factorial(a));
        // System.out.println(isPrime(16)); 
        // PrimeRange(20);
        // BinToDec(1010);
        DecToBin(15);


    }
}
