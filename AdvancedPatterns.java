public class AdvancedPatterns {

    public static void HollowRectangle(int TotalRows , int TotalCols){
        //Outer Loop
        for(int i =1; i<=TotalRows; i++){
            //inner - coulmns
            for(int j=1; j<=TotalCols; j++){
                //cell -> (i,j)
                if(i==1 || i==TotalRows || j==1 || j==TotalCols){
                    //Boundary Cells 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void InvertedAndRotatedPyramid(int rows){
        for (int i = 1; i<=rows;i++){
            //spaces
        for(int j=1;j<=rows-i;j++){
                System.out.print(" ");//Printing the spaces = row -1 each time.
        }
        //stars
        for(int j =1;j<=i;j++){
            System.out.print("*");//Printing the pattern = row each time.
        }
        System.out.println();
        } 
    }
    
    public static void InvertedHalfPyramidWithNumbers(int rows){
        for (int i = 1; i<=rows;i++){ 
        for(int j=1;j<=rows-i+1;j++){//To print reverse of an pattern We take columns = totalRows-rows+1;
            //for example here 5 - 1 + 1 will print 5 numbers in first row.
            //in second row 5-2+1 will print 4 numbers.
                System.out.print(j+" ");
        }
        System.out.println();
        } 
    }

    public static void Floyd_Triangle(int n){
        int k=1;//This k will be outside of any loop since to not newly start the k from 1.
        for (int i = 1; i<=n;i++){ 
            //int k =1 (if k will be here code will print it again from k=1.)
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");  
        }
    }

    public static void zero_one_Triangle(int rows){
        for (int i = 1; i<=rows;i++){ 
        for(int j=1;j<=rows-i;j++){
            //where the sum of rows and columns is even.
            if((i+j)%2 == 0 ){//for the pattern at (1,1),(2,2),(3,1),(3,3).....(5,5)
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
 
//MOST IMPORTANT PATTERNS.....
public static void Butterfly_pattern(int n){
        //1st Half.
        for (int i = 1; i<=n;i++){ 
            //stars -> i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
 
            //spaces -> 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //stars -> i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }             
            System.out.println();   
    }

    //2nd Half (Inverted Pattern of above)-mirror image.
    for (int i = n; i>=1;i--){ //to print reverse of a pattern just reverse the i from n to 1 .
        //stars -> i
        for(int j=1;j<=i;j++){//to not print the extra line j<i only will be printed.
            System.out.print("*");
        }

        //spaces -> 2*(n-i)
        // for(int j=1;j<=2*(n-i);j++){//for printing a extra line in between OR to copy above pattern as it is.      
        for(int j=(-1);j<=2*(n-i);j++){ // for not printing the extra line in between , starting the pattern from second line    
        System.out.print(" ");
        }

        //stars -> i
        for(int j=1;j<=i;j++){//to not print the extra line j<i only will be printed.
            System.out.print("*");
        }             
        System.out.println(); 

}
}

    public static void Rhombus_Pattern(int n){
        for (int i=1; i<=n;i++){ 
            //spaces
            for(int j=1;j<=n-i;j++){
                //for printing reverse of a pattern OR to decrease columns
                //we take n-i so that increaasing value of i results in decreasing j.
            System.out.print(" ");
        }
        //Stars
        for(int j=1;j<=n;j++){// this print the * every n times in every line.   
            System.out.print("*");
        }
        System.out.println();
    }
}
    
    public static void Hollow_Rhombus_Pattern(int n){
        for (int i=1; i<=n;i++){ 
           //spaces
           for(int j=1;j<=n-i;j++){
            //To print reverse of an pattern We take columns = totalRows-rows;
            //for example here 5 - 1  will print 4 numbers in first row.
            //in second row 5-2will print 3 numbers.
            System.out.print(" ");//Printing the spaces = row -1 each time.
    }
        
        for(int j=1;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
        }

    public static void Diamond_Pattern(int n){
            
            //1st half
             for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }

                //stars
                for(int j=1;j<=(2*i)-1;j++){//printing  a temple patern first line - 1; 2nd line - 3; 3rd line - 5; 4th line - 7....
                    System.out.print("*");
                }
                System.out.println();
             }
             
            //  2nd Half
            //for reversing a loop only reverse the i loop to i=n ,i--
            for(int i=n;i>=1;i--){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }

                //stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
             }

    
    public static void Number_Pyramid(int n){
        //spaces
            for(int i =1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }

                //numbers:
                for(int j=1; j<=i; j++){
                    System.out.print(i + " ");

                }
                System.out.println();
            }
        }

    public static void Palindrome_Pattern_With_Numbers_Pyramid(int n){
            //spaces
                for(int i =1; i<=n; i++){
                    for(int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }

            //Numbers
            //descending
            for(int j=i; j>=1;j--){
                    System.out.print(j);            
            }
            //ascending
            for(int j=2;j<=i;j++){
                System.out.print(j);            
            }
            System.out.println();
                    }
                }
    
    
        public static void main(String[] args) {
        // HollowRectangle(5, 5);
        // InvertedAndRotatedPyramid(5);
        // InvertedHalfPyramidWithNumbers(5);
        // Floyd_Triangle(5);
        // zero_one_Triangle(5);
        // Butterfly_pattern(5);
        // Hollow_Rhombus_Pattern(7);
        // Diamond_Pattern( 4);
        // Number_Pyramid(5);
        // Palindrome_Pattern_With_Numbers_Pyramid(5);


        
    }
}
