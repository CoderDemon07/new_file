import java.util.Scanner;
public class Strings {
    public static void printLetters(String str){
     for(int i=0; i<str.length(); i++){
        System.out.print(str.charAt(i) + " ");
     }
     System.out.println();
    }

    public static boolean palindrome(String str){
        for(int i=0; i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("not a palindrome");
                return false;
            }  
        }
        System.out.println("is palindrome");
    return true;
    }

    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //South
            if(dir=='S'){
                y--;
            }
            //North
            if(dir=='N'){
                y++;}
            //East
            if(dir=='E'){
                x++;
            }
            //West
            if(dir=='E'){
                x--;
            }

        }
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2+y2);

    }

    public static String SubString(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static String ToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
  /*  //BASICS OF STRINGS ->
    String str = "abcd";
        String str1 = new String("xyz1234@#$");//any data type can be entered.
        char arr[] = {'a','b','@','4','^'};//any data type can be entered in array through char type.

        //Strings are immutable - This means that once you create a String object, its value cannot be changed.
        //Arrays are mutable.

         Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();//for one word next().next() will treat every letter of word as an index for length. 

        String fame = sc.nextLine();//for entire line. nextline() will treat every full word as an index for length. 

        System.out.println(fame.length());//length is apply with brackets.
        System.out.println(name.length());
        System.out.println(arr.length);//No need of bracket with length in array as here length is a function.

       
    //concatenation - adding of Strings. 
        String firstName = "Prince";
        String LastName = "Singh";
        String fullname = firstName + " " + LastName;
        System.out.println(fullname);
        System.out.println("Length of the String is " + fullname.length());
        printLetters(fullname);//printing letters 



        Scanner sc = new Scanner(System.in);
        String boo = sc.next();
        palindrome(boo);



    // String path = "WNEENESENNN";
    // System.out.println(getShortestPath(path));


    //COMPARING STRINGS
    String s1 = "Tony";
    String s2 = "Tony";
    ////here s1 and s2 are equal but s3 is not equal to any of them.
    ////As both s1 and s2 are pointing to one memory only. 
    String s3 = new String("Tony");

    //for comparing two strings with different memories,we use equals()
    if(s1.equals(s3)){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not equal.");
    }

    
 
    String vk = "jodhpur is in rajasthan";
    System.out.println(SubString(vk, 0, 12));

    
    //FINDING LARGEST STRING
    String fruits[] = {"Apple","mango","Ananas","Litchi"};
    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++){

//This compareto() method returns 0 if the string is equal to the other string.
//A value less than 0 is returned if the string is less than the other string (less characters or precedence check of letters) 
//and a value greater than 0 if the string is greater than the other string (more characters or precedence check of letters ).
        if(largest.compareTo(fruits[i])<0){
            largest = fruits[i];
        }
    }
    System.out.println(largest);
    */

/*String is immutabmle, creating new objects for modifications,
consuming memory and slowing execution. 
In contrast, `StringBuilder` is mutable, making it efficient for frequent concatenation, string modification, and large string construction. */

 String sr = "hello, my name is yuvraj";
 System.out.println( ToUpperCase(sr));
 

}
}
