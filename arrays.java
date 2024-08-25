import java.util.*;

public class arrays {
    public static void update(int marks[],int nonChangeable){
        nonChangeable = 10; //will not change with array.
        for(int i=0; i<marks.length;i++){
            // System.out.println(marks[i]);
            marks[i] = marks[i] + 1;
        }
    }

    public static int LinearSearch(String menu[], String key){
        for(int i=0;i<menu.length; i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infintiy
        int smallest = Integer.MAX_VALUE;//+infinity
        for(int i=0; i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
                System.out.println(largest);
                if(smallest>numbers[i]){
                    smallest = numbers[i];
            }
        }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }

    public static int Binary_Search(int hello[],int key){
        int start = 0;
        int end = hello.length - 1;
        
        while(start<=end){
            int mid = hello[(start + end)/2];
            if (mid == key){
                System.out.println("Found");
            }
            else if(mid>key){
                start = hello[0];
                end = hello[mid -1];
            }
            else if(mid<key){
                start = hello[mid + 1];
                end = hello[n-1];
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creation 
        // int marks2[] = new int[6]; 
        // System.out.println(marks2);//this will not print the array.
        // int hello[] = {1,5,6,7,3};
        // String fruits[] = {"hello","hii","tata","bye"};
        // int numbers[] = {1,2,3};
        // System.out.println(numbers);
        // String String[] = {"String1","String2","String3"}; 
        // System.out.println(String);

        // int marks[] =  new int[40]; 
        // marks[0] = sc.nextInt();
        // // marks[1] = sc.nextInt();
        // // marks[2] = sc.nextInt();
        // // marks[3] = sc.nextInt();
        // System.out.println("marks1 : " + marks[0]);

        //updating marks by individual method,
        // marks[1] = marks[0] + 1;
        // marks[2] = marks[1] + 1;
        // marks[3] = marks[2] + 1;
        // System.out.println("marks2 : " + marks[1]);
        // System.out.println("marks3 : " + marks[2]);
        // System.out.println("marks4 : " + marks[3]);
        // System.out.println();
        // System.out.println("length of array : " + marks.length);

        // int marks[] = {90,98,76,54,76,74,86};
        // int nonChangeable = 56;
        // update(marks,nonChangeable);
        // System.out.println(nonChangeable);
        // //printing the array
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println(); 

        // String menu[] = {"dosa","chola","somasa","bindi"};
        // String key = "bindi";
        // int index = LinearSearch(menu, key);
        // if(index==-1){
        //     System.out.println("NOT Found");
        // }
        // else{
        //     System.out.println("Key is at index : " + index );
        // } 

        // int numbers[] = {23,56,87,56,98,34,56,83};
        // System.out.println("largest value is : " + getLargest(numbers));//firstly the getLargest will run and smallest number will be printed first.
        
 
        


        } 
}





