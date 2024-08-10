import java.io.*;
import java.util.*;


 /*class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int n = sc.nextInt();
            Long mohan=0l;
            Long rohan=0l;
            for(int i=0; i<n; i++)
            {
                char ch;
                String s = sc.next();

                if(s.equals(""))
                s = sc.next(); 
                
                ch = s.charAt(0);   
                
                if(ch=='H')
                {
                    //System.out.println(mohan +"H1");

                   mohan /= 2;
                    // System.out.println(mohan + "h2");
                }
                else if(ch=='D')
                {
                   // System.out.println(mohan+"  d1");

                   mohan *= 2;
                   //  System.out.println(mohan+  "d2");
                }
                else 
                {
                   mohan += Integer.parseInt(s); 
                  //  System.out.println(mohan + "else "+ch);

                }
            }
            
            for(int i=0; i<n; i++)
            {
                 char ch;
                String s = sc.next();

                if(s.equals(""))
                s = sc.next(); 
                
                ch = s.charAt(0);

                 if(ch=='H')
                {
                 rohan /= 2;
                }
                else if(ch=='D')
                {
                   rohan *= 2;
                }
                else
                {
                   rohan += Integer.parseInt(s); 
                   // System.out.println(rohan + "else "+ch); 
                }
            }
            
            if(mohan>rohan)
            {
                System.out.print("Mohan "+mohan);
            }
            else
            {
                System.out.print("Rohan "+rohan);
            }
            
                
        }
            
           
            
        
    }
}
*/

//________________________________________day 2___________________________________________________


/*Diwali, the festival of lights, is here, and Meera is getting ready to illuminate her house. She has a series of lights, each representing a different Diwali lamp. The brightness of each lamp is symbolized by a positive integer in an array. Meera wants to create a stunning Diwali display, and she can achieve this by rotating the array in a specific direction and a certain number of times. The direction and the number of rotations are determined by two integers: direction and noOfRotations.

Rules for rotation:

The direction can have value either 0 or 1
If direction is 0, Meera should rotate the array to the left by noOfRotations time, and
If direction is 1, Meera should rotate the array to the right by noOfRotations time
Input Format

The First line will indicate T, the number of testcases
The First line of each testcase will contain direction, noOfRotations and number of lights in series N.
The Second line of each testcase is series of lights, where L[i] represents brightness of each light.
Constraints

1<=T<=500
direction = {0,1}
1<=noOfRotations<=N<=1000
1<=L[i]<=10,000
Output Format

For each testcase after performing the rotation, output the arrangement of lights in the array, showcasing the vibrant Diwali atmosphere she has created.

Sample Input 0

1
0 3 9
1 2 3 4 5 6 7 8 9
Sample Output 0

4 5 6 7 8 9 1 2 3
Explanation 0

directrion = 0
noOfRotations = 3
N = 9
therefore, we rotate the array to left by 3 digits*/


/*



//___________________________________DAY-3_________________________________________

class Solution3 {
    
    public static void moveLeft(int[] arr)
    {
        int t = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = t;
    }
    
    public static void moveRight(int[] arr)
    {
        int t = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = t;
    }

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T--!=0)
        {
            int direction = sc.nextInt(); //0->left 1->right  //left 123 => 231
            int noOfRotations = sc.nextInt();
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            while(noOfRotations--!=0)
            {
                if(direction==0)
                {
                    moveLeft(arr);
                }
                else
                {
                    moveRight(arr);
                }
            }
            
            for(int a : arr)
            {
                System.out.print(a+" ");
            }
            
            
        }
    }
}*/




/*class Solution {
  
    public static void reverse(int[] a,int i,int j)
    {
        while(i++<j--)
        a[i]=(a[i]+a[j])-(a[j]=a[i]);   
    }
    
    public static void rotateL(int[] arr,int k)
    {
        reverse(arr,0,k-1); 
        //reverse(arr,k,arr.length);
        //reverse(arr,0,arr.length);
    }
    
    public static void rotateR(int[] arr,int k)
    {
        reverse(arr,0,k); 
        reverse(arr,k,arr.length);
        reverse(arr,0,arr.length);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T--!=0)
        {
            int direction = sc.nextInt(); //0->left 1->right  //left 123 => 231
            int noOfRotations = sc.nextInt();
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            if(noOfRotations==0)
                rotateL(arr,noOfRotations);
            else
                rotateL(arr,noOfRotations);
                
            
            for(int a : arr)
            {
                System.out.print(a+" ");
            }
            
            
        }
    }
}

*/

/// giving wrong output ok

// SOLUTION DAY 4
/*
 class Solution4 {
    
    public static int equal(int[] a1,int[] a2,int n)
    {
        for(int i=n-2; i>=1; i--)
        {
            if(a1[i-1]==a2[i+1])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        //2 4 1 3  3
        //2 6 7 10 13 i-1
       //13 11 7 6 3  i+1  == then yes from backside 
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T--!=0)
        {
            int n =sc.nextInt();
        
            int[] arr2 = new int[n];
            int[] arr1 = new int[n];

            for(int i=0; i<n; i++)
            arr2[i] = arr1[i] = sc.nextInt();
            
            
            for(int i=1; i<n; i++)
            {
                arr1[i] += arr1[i-1];
                //System.out.print(arr1[i]+" ");//ye bhi 1 index se hu print krega
            }

            //System.out.println();
           
            for(int i=n-2; i>=0; i--)
            {
                arr2[i] += arr2[i+1];
               // System.out.print(arr2[i]+" ");
            }
            
            int ans = equal(arr1,arr2,n);
            System.out.print(ans);
            
        }
    }
}
*/

//______________________________________Day-5________________________________________________________

/* question

Ram is celebrating Diwali with his family and friends. He has a box of firecrackers that contains different types of firecrackers, such as rockets, chakris, anaars, and phuljharis. Each firecracker has a number written on it, which represents its loudness level. The loudness level of each firecracker is given in the form of an array L of N positive integers.

He also has an array of auspicious numbers A of M numbers that are considered lucky for Diwali. The luckiness score of an auspicious number is the number of firecrackers in the box that have a loudness level divisible by that auspicious number.

Your task is to print the auspicious number with the maximum luckiness score. If there is more than one auspicious number with the maximum score, print the minimum of them.

Input Format

The first line gives T, the number of testcases
The first line of each testcase denotes N and M.
The second line of each testcase will give array L where L[i] denotes the loudness of ith cracker.
The third line of each testcase will give array A where A[i] is the ith auspicious number.
Constraints

1<=T<=500
1<=M<=1000
1<=N<=1000
1<=L[i]<=100,000
1<=A[i]<=100,000
Output Format

For each testcase print the auspicious number with the maximum luckiness score. If there is more than one auspicious number with the maximum score, print the minimum of them.

Sample Input 0

1
5 3
4 7 9 3 9
5 2 3
Sample Output 0

3
Explanation 0

The luckiness score for every auspicious number in divisors is:
The luckiness score of A[0] is 0 since no number in L is divisible by 5.
The luckiness score of A[1] is 1 since L[0] is divisible by 2.
The luckiness score of A[2] is 3 since L[2], L[3], and L[4] are divisible by 3.
Since A[2] has the maximum divisibility score, we return it.


*/

// 5
// 79 19
// 12 13 33 13 70 19 54 35 8 10 17 61 16 9 75 77 26 2 27 3 78 60 55 9 80 15 86 95 25 79 53 13 60 46 95 68 81 97 26 54 92 10 69 17 45 39 58 40 39 67 66 63 88 60 58 18 92 3 59 15 3 12 71 93 19 15 90 18 61 4 5 94 55 16 15 93 61 62 75
// 320 135 119 299 459 364 877 549 167 129 367 943 895 537 740 803 429 193 777
// 82 26
// 47 4 64 71 89 87 89 83 3 50 70 16 35 46 5 28 72 23 79 80 100 27 33 77 5 39 63 24 14 37 23 95 12 20 91 100 36 29 24 19 9 88 15 49 9 80 30 45 29 48 48 55 65 76 28 48 38 72 86 96 97 63 79 73 39 10 99 43 61 36 66 99 61 50 68 20 71 79 39 39 55 7
// 65 962 289 984 25 271 442 884 124 998 652 643 755 637 136 427 262 907 868 382 277 381 789 691 945 750
// 59 21
// 84 74 4 69 36 82 46 22 23 83 10 38 22 29 62 54 40 14 59 45 76 93 63 29 76 99 43 31 25 63 16 97 40 80 33 97 69 47 9 26 62 42 5 63 43 44 80 34 66 52 49 20 30 93 71 88 26 1 68
// 55 535 363 416 619 201 642 915 438 455 502 368 47 397 744 346 292 279 583 772 665
// 80 3
// 96 75 38 3 85 60 99 63 23 39 62 10 59 23 29 32 27 11 98 81 9 70 87 24 53 18 16 29 2 17 63 13 63 78 81 25 89 96 92 5 83 88 59 58 36 35 4 25 54 50 65 47 95 73 17 24 9 95 77 54 18 98 77 55 28 48 35 43 62 25 42 69 61 41 51 16 20 27 13 27
// 996 783 103
// 7 76
// 91 76 1 83 49 81 34
// 269 840 803 855 303 526 410 816 664 176 742 573 576 371 532 845 884 10 932 799 870 609 490 46 292 894 316 926 553 646 218 331 143 180 746 681 477 231 288 141 790 65 606 396 341 502 468 994 775 103 724 699 982 746 241 523 845 956 500 528 534 664 915 420 773 962 190 992 893 788 263 264 16 291 676 407
 

/* class Solution5 {
    
    public static int auspiciousNo(int[] a1,int[] a2)//4 7 9 3 9   5 2 3
    {
        int c=0;
        int lc = 0;
        int ans = 0;
       for(int i=0; i<a2.length; i++)
       {
           c = 0;
           for(int j=0; j<a1.length; j++)
           {
               if(a1[j]%a2[i]==0)
               {
                   c++;
               }
           }
           if(c>lc)
           {
               lc = c;
               ans = i;
               
           }
           else if(c == lc)
           {
               if(ans!=-1)
               if(a2[ans]>a2[i])
               ans = i;    
           }
          
       }
         return a2[ans];
    }

    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int[] a1 = new int[n1];
            int[] a2 = new int[n2];
            for(int i=0; i<n1; i++)
                a1[i] = sc.nextInt();
            for(int i=0; i<n2; i++)
                a2[i] = sc.nextInt();
           int ans = auspiciousNo(a1,a2);
            System.out.println(ans);
        }
    
    }
}*/



//DAY-6______________________reverse specific String_______________________________________________
/*
class Solution6 {

    static String reverse(String s,int i,int j)
    {
        j-=1;
        char[] c = s.toCharArray();
        while(i<j)
        {
           c[i] = (char)((c[i]+c[j])-(c[j]=c[i]));  
           i++;j--;
        }
        
       return new String(c); 
    }
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int pos = sc.nextInt();
            String s = sc.next();
            s = reverse(s,0,pos);
            System.out.println(s);
        }
    
    }
}*/

//________________________________________DAY 7____________________________________________________

/* class Solution7 {
    //NOT ACCEPTED BUT ITS RIGHT

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean f = false;
    while(T--!=0)
    {
        String s = sc.nextLine();
        if(s.equals(""))
            s = sc.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                System.out.print(s.charAt(i));
                f = true;
            }
            else if(f==true)
            {
                System.out.println();
                f = false;
            }

        }
        System.out.println();
    }   
    }
}
*/
//it is accepted but last me problem hi h
/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean f = false;
    while(T--!=0)
    {
        String s = sc.nextLine();
        if(s.equals(""))
            s = sc.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                System.out.print(s.charAt(i));
                f = true;
            }
            else if(f==true  && i!=s.length()-1 )//<-----yha
            {
                System.out.println();
                f = false;
            }

        }
      
        System.out.println();
    }   
    }
}*/


//output should me   ans==count no of days(not leap year)
/*
class Solution8 {

    static int noOfDays(String month,int date)
    {
        int ans = 0;
        
        if(month.equals("JAN")) ans = 0;            
        else if(month.equals("FEB")) ans = 31;
        else if(month.equals("MAR")) ans = 59;
        else if(month.equals("APR")) ans = 90;
        else if(month.equals("MAY")) ans = 120;
        else if(month.equals("JUN")) ans = 151;
        else if(month.equals("JUL")) ans = 181;
        else if(month.equals("AUG")) ans = 212;
        else if(month.equals("SEP")) ans = 243;
        else if(month.equals("OCT")) ans = 273;
        else if(month.equals("NOV")) ans = 304;
        else if(month.equals("DEC")) ans = 334;
     
      return ans+date;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T--!=0)
    {
        String s = sc.nextLine();
        
            if(s.equals(""))
                s = sc.nextLine();

        String month = s.substring(2,s.length());
        int date = Integer.parseInt(s.substring(0,2));
        
        
        System.out.println(noOfDays(month,date));
        
    }
    }
}*/



//_________________________________________DAY 9__________________________________________________________
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;


/*The festival of lights is approaching and it’s time to send gifts to family and friends. Shivaay is at
a store to buy Diwali presents and he has selected a total of n gifts out of all the gifts available 
at the store. The price of each present is represented in the form of array L of M elements(where L[i]
 represent the cost of i th gift in Rupees). He initially has X Rupees to spend and he wants to buy 
as many gifts as possible. Your task is to find the maximum number of gifts, Shivaay can buy with an
 available purse of X Rupees.*/

// 1
// 5 7
// 1 3 2 4 1

 // output  4
 // Shivaay can buy gifts at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.

/*public class Solution9 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            
            int size = sc.nextInt();
            int money = sc.nextInt();
            int moneySpent=0;
            
            int[] a = new int[size];
            for(int i=0; i<size; i++)
            {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int i;
            for(i=0; i<size; i++)
            { 
                if(money>=moneySpent+a[i])
                moneySpent += a[i];   
                else
                break;
            }
            System.out.println(i);//i because vo next index pr hoga us time pr jab break hoga
        }
    }
}*/



//_______________________________________DAY-10___________________________________________
/*Dev has a palindromic string of lowercase English letters palindrome, he needs to perform a pruning operation on string that is to replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.

Help Dev write a code that outputs the resulting string after performing pruning operation. If there is no way to replace a character to make it not a palindrome, output -1.

Input Format

The first line will be T, the number of testcases.
Each testcase will provide a palindromic string that needs to be pruned.
Constraints

1<=T<=1000
1 <= palindrome.length <= 1000
palindrome consists of only lowercase English letters.
Output Format

For each testcase output the lexicographically smallest resulting (non palindromic) string after pruning operation.
Sample Input 0

1
azbbza
Sample Output 0

aabbza
Explanation 0

There are many ways to make "azbbza" not a palindrome, such as "zzbbza", "aabbza", and "azabza".
Of all the ways, "aabbza" is the lexicographically smallest.
Sample Input 1

1
a
Sample Output 1

-1

aaa
output aab


*/



// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

/*public class Solution10 {
    
    public static boolean isPalindrome(String s)
    { 
        int i=0,j=s.length()-1;
        while(i<j)
        {
           if(s.charAt(i)!=s.charAt(j))
               return false;
            i++;j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            boolean f = true;
            String s = sc.next();
            
            if(s.equals(""))
            s=sc.next();
            
            
            if(isPalindrome(s)){
            
            
            if(s.length()==1)
            {    
             System.out.println("-1");
                f =false;
            }
            else
            {
                
                  int i;
                  for(i=0; i<s.length(); i++)
                  {
                      if(s.charAt(i)!='a')
                      {      
                        s = s.substring(0,i)+"a"+s.substring(i+1,s.length());
                        break;
                      }
                    
                  }
                  if(i==s.length())//if string is already smallest lexicografically smallest
                  s = s.substring(0,i-1)+"b";
                      
            }
                
            }//if palindrome vala
            else
            {
                f= false;
                System.out.println("-1");
            }
            
                
          
            if(f)
            {
               System.out.println(s);
            }
            
        }
    }
}*/

//____________________________________DAY-11___________________________________________________

/*Meera was celebrating Diwali and had a pile of sweets. She couldn't fall asleep and was getting 
bored, so she started counting imaginary friends who wanted to take her Diwali sweets. Meera
that at every k-th friend she threw sweets to walk them away, every l-th friend had
their hands tied with a ribbon, every m-th friend had their hands lightly tapped with a lantern,
and she threatened every n-th friend to give away some of their sweets without actually providing
any to that friend.

If Meera counted a total of d friends, then how many of her imaginary friends were not able to get sweets ?

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will be d, total number of friends.
The second line of each testcase will be k,l,m,n respectively.
Constraints

1<=T<=1000
1 ≤ k, l, m, n ≤ 10
1 ≤ d ≤ 100,000
Output Format

For each testcase, output the number of imaginary friends that weren't able to get any sweets.

Sample Input 0

1
24
2 3 4 5
Sample Output 0

17
Explanation 0

In this case, friend 1, 7, 11, 13, 17, 19 and 23 got sweets and rest didn't.

Sample Input 1

1
12
1 2 3 4
Sample Output 1

12
Explanation 1

In this case, none of the friends got any sweets.*/

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

 /*class Solution11 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int friends = sc.nextInt();
            int ans = 0;
            int k = sc.nextInt();
            int l = sc.nextInt();
            int m = sc.nextInt();
            int n = sc.nextInt();

            for(int i=1; i<=friends; i++)
            {
                System.out.println("for i = "+i);
                System.out.println(i%k);
                System.out.println(i%l);
                System.out.println(i%m);
                System.out.println(i%n);

                if(i%k!=0 && i%l!=0 && i%m!=0 && i%n!=0)
                    ans++;
            }
            System.out.println(friends-ans);
        }
    
    }
}*/







//____________________________________DAY-12___________________________________________________

/*Reena and Meena are playing an interesting game. They start from specific coordinates and take 
turns giving each other directions. Reena starts at point (x, y), and they follow a series of 
directions given by instructions through a string s, the instructions are as follows : -

There are following symbols in the String
N - North direction
S - South direction
E - East direction
W - West direction
The integers followed by the above symbols in the string signify the distance to be covered in the 
direction mentioned through the symbols (N,S,E,W).
Your task is to calculate the Euclidean distance from the origin (0,0) to their final position 
after following the directions.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give x and y, the initial coordinates.
The second line of each testcase will be string s, giving the instructions.
Constraints

1<=T<=1000
-100,000<=x,y<=100,000
s only contains numbers, and some alphabets (capital N,E,W,S).
1<=s.length()<=1000
Output Format

For each testcase, output the Euclidean distance from the origin (0,0) to the final position with a
precision of 2 decimal places.For example if distance is 1.41421 then output 1.41 and if distance
is 4 then output 4.00

Sample Input 0

1
3 4
N2E3S6
Sample Output 0

6.00
Explanation 0

here, initial coordinates x=3, y=4. now first they went north 2 units therefore now coordinates (3,6), now east 3 units coordinates= (6,6), and finally south 6 units so coordinates=(6,0). Now distance from origin = ((6*6)+(0*0))^1/2 = 6 units therefore output is 6.00
*/

//by me

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

//addition will be performed in east and north
// Euclidean distance from the origin (0,0)  => sqrt( pow(x,2) + pow(y,2) )

/*public class Solution {
    
    public static double EuclideanDistance(int x,int y,String instuctions)
    {
        String[] t = instuctions.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        //in java 7 0->"" 1->N  2->2
        //in java 8 0->N  1->2
        //that's why we are starting from 1
        for(int i=0; i<t.length; i+=2)
        {
           String direction = t[i];
           int distance = Integer.parseInt((t[i+1]));
          //  System.out.println(direction);
          //  System.out.println(distance);
            
            
           if(direction.equals("E"))
               x+=distance;
           else if(direction.equals("N"))
               y+=distance;
           else if(direction.equals("W"))
               x-=distance;
           else
               y-=distance;
            
               
            
               
        }
        
        return Math.sqrt(x*x+y*y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            sc.nextLine();
            String instructions = sc.nextLine();
            double ans = EuclideanDistance(x,y,instructions);
            System.out.printf("%.2f\n",ans);
        }
    }
}
*/

// by chatGPT
/*class EuclideanDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            String instructions = scanner.nextLine();

            double distance = calculateEuclideanDistance(x, y, instructions);
            System.out.printf("%.2f%n", distance);
        }
    }

    public static double calculateEuclideanDistance(int x, int y, String instructions) {
        // String[] tokens = instructions.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String[] tokens = instructions.split(""); //same working

        for (int i = 0; i < tokens.length; i += 2) {
            String direction = tokens[i];
            int distance = Integer.parseInt(tokens[i + 1]);

            switch (direction) {
                case "N":
                    y += distance;
                    break;
                case "S":
                    y -= distance;
                    break;
                case "E":
                    x += distance;
                    break;
                case "W":
                    x -= distance;
                    break;
            }
        }

        return Math.sqrt(x * x + y * y);
    }
}*/

//____________________________________DAY-13___________________________________________________

/*During the Cricket World Cup, each participating team is assigned a unique jersey number for their players. The jersey numbers range from 0 to n, where n is the total number of players in the team. The numbers are assigned in a consecutive manner without any duplicates.

You are given an array jerseyNumbers of n elements representing the jersey numbers of the players in a particular team. However, one player's jersey number is missing. Can you write a program to find the missing jersey number?

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will provide n.
The second line of each testcase will be an array jerseyNumbers of n elements.
Constraints

1<=T<=1000
1<=n<=10,000
All elements in jerseyNumbers are distinct and are within range of 0 to n (inclusive).
Output Format

For each testcase out the missing players jersey number.
Sample Input 0

1
3
3 0 1
Sample Output 0

2
Explanation 0

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in jerseyNumbers.

Sample Input 1

1
2
0 1
Sample Output 1

2
Explanation 1

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in jerseyNumbers.
*/


// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

/*class Solution13 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
        while(T--!=0)
        {
            int n = sc.nextInt();
            boolean[] checker = new boolean[n+1];
            while(n--!=0)
            {
                int t = sc.nextInt();
                checker[t] = true;
            }
            int i;
            for(i=0; i<checker.length; i++)
            {
                if(checker[i]==false)
                    break;
            }
            System.out.println(i);
            
        }
    }
}*/



// ____________________________________DAY-14_____________________________________________________________________

/*It's Diwali time, that means fun time! Enjoying with the family, playing interesting games and 
eating a lot of delicious sweets. And the flavor of the season is always our very own favorite soan 
papadi! That we all love to eat.

Imagine you and your family members are playing an amazing game of passing soan papadi.
In this game your n members of the family are standing in a line labeled from 1 to n.
The first person in the line is holding the packet of soan papdi initially. Every second,
the person holding the packet passes it to the next person standing in the line. Once the
packet reaches the end of the line, the direction changes, and people continue passing the 
packet in the opposite direction.

For example, once the packet of soan papdi reaches the nth person they pass it to the n - 1th
person, then to the n - 2th person and so on.

Given the two positive integers n and time, return the position of the person who wins the 
game and get the packet of soan papdi after time seconds.

Input Format

The first line will give T, number of testcases.
Every testcase will provide two positive integers n and time.
Constraints

1<=T<=1000
2<=n<=1000
1<=time<=1000
Output Format

The position of the person who wins the game

Sample Input 0

1
4 5
Sample Output 0

2
Explanation 0

People pass the soan papdi in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2. Afer five seconds,
the soan papdi is given to the 2nd person.

Sample Input 1

1
3 2
Sample Output 1

3
Explanation 1

People pass the soan papdi in the following way: 1 -> 2 -> 3.

Afer two seconds, the soan papdi is given to the 3rd person.*/

//approach as given in the question
/*class Solution14A {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int n = sc.nextInt();
            int time = sc.nextInt();
            int t = 1;
            boolean b = true;
            
            while(time--!=0)
            {
               if(t==n)b = false;
               if(t==1)b = true;
                
                if(b)
                t++;
                else
                t--;    
            }
            
            System.out.println(t);
        }
    }
}*/


// thingking to better it

/*class Solution14B {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int n = sc.nextInt();
            int time = sc.nextInt();
            time %= ((n-1)*2);    // by this we can reduce time comlexity
            //ham usi place pr aa jayege kuch moves k bad  
            int t = 1;
            boolean b = true;
            
            while(time--!=0)
            {
               if(t==n)b = false;
               if(t==1)b = true;
                
                if(b)
                t++;
                else
                t--;    
            }
            
            System.out.println(t);
        }
    }
}*/


//____________________________________DAY-15___________________________________________________

/*You have an array called 'indian_team' that contains the jersey numbers of players currently in the squad. The goal is to intelligently pick k distinct players (represented as positive integers) who are not presently in the team. Each player's cost is determined by the number on their jersey. Your objective is to choose k new distinct players, not in the current team, in a way that minimizes the total cost acquired by adding them to the team. Provide the minimum cost required to add k new players.

Input Format

First line will be T, the number of testcases.
The first line of each testcase will be n, the number of players already in team and k (number of players to add to team).
The second line of each testcase will be array indian_team of n elements.
Constraints

1<=T<=10^3
1<=K<=10^8
1<=n<=10^5
1<=indian_team[i]<=10^9
Output Format

For each testcase output the cost added to total cost by adding k new players.

Sample Input 0

1
5 2
1 4 25 10 25
Sample Output 0

5
Explanation 0

The two unique positive integers that do not appear in array which we append are 2 and 3. The resulting sum of nums is 1 + 4 + 25 + 10 + 25 + 2 + 3 = 70, which is the minimum. The sum of the two integers appended is 2 + 3 = 5, so we return 5.

Sample Input 1

1
2 6
5 6
Sample Output 1

25
Explanation 1

The six unique positive integers that do not appear in array which we append are 1, 2, 3, 4, 7, and 8. The resulting sum of nums is 5 + 6 + 1 + 2 + 3 + 4 + 7 + 8 = 36, which is the minimum. The sum of the six integers appended is 1 + 2 + 3 + 4 + 7 + 8 = 25, so we output 25.
*/

/*class Solution15 {

   public static boolean isExists(int []a,int n)
   {
      for(int i=0; i<a.length; i++)
      {
          if(a[i]==n)
              return true;
      }
      return false;
   }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int size = sc.nextInt();
            int playersToAdd = sc.nextInt();
            int[] a = new int[size];
            for(int i=0; i<a.length; i++)
                a[i] = sc.nextInt();
            
            int t = 1;
            long ans = 0;  // int ans =0;not accepted 
            while(playersToAdd!=0)
            {
                if(isExists(a,t)==false)
                {
                ans+= t;
                playersToAdd--;    
                }
                
                t++;
            }
            System.out.println(ans);
            
        }
    
    }
}*/

// ____________________________________DAY-14___________________________________________________
// sort by bits
/*Its the World Cup season and the Indian Squad is just smashing its opponent one after the other in a row making us invincible!! How can one forget the sensational half century of the centuries scored by the King of Cricket , the G.O.A.T - Virat Kohli. You are given an array of runs scored by the King in any number of overs throughout the match. Your task is to sort the runs in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order. Output the array of runs after sorting it.

Input Format

The first line will be T, the number of testcases.
The first line of each testcase will give N the size of the array
The second line of each testcase will give array arr where arr[i] denotes the score of ith over.
Constraints

1<=T<=100

1 <= N <= 1000

0 <= arr[i] <= 1000000

Output Format

For each testcase output the sorted array

Sample Input 0

1
7
5 3 2 5 8 2 7
Sample Output 0

2 2 8 3 5 5 7
Submissions: 5
Max Score: 1
Difficulty: Medium
*/

class Solution16
{
    public static int countBits(int n)
    {
        int c = 0;
        while(n!=0)
        {
            c += n&1;
            n=n>>1;
        }

        return c;
    }

    public static void sortByBeats(int[] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(countBits(a[i])>countBits(a[j]) )
                {
                    a[i]=(a[i]+a[j])-(a[j]=a[i]);
                }     
                else if(countBits(a[i])==countBits(a[j]) && a[i]>a[j])
                {
                    a[i]=(a[i]+a[j])-(a[j]=a[i]);  
                }

            }
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //int []a = {5,3,2,5,8,2,7};//output 2 2 8 3 5 5 7 correct
        int T = sc.nextInt();
        while(T--!=0)
        {

          int size = sc.nextInt();
          int[] a = new int[size];
          for(int i=0; i<size; i++)
          {
            a[i] = sc.nextInt();
          }

          sortByBeats(a);

          for (int x : a) 
          System.out.print(x+" ");
          System.out.println();
          

        }
        

    }
}

// ____________________________________DAY-17___________________________________________________

/*The Cricket World Cup final is just around the corner, and teams are gearing up for a special pairing competition. Each team has a roster of players, each identified by a unique jersey number. In this competition, players need to be paired up into n/2 pairs, and the challenge is to minimize the maximum pair sum.

The pair sum of a pair (a, b) is equal to a + b. For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.

Given an array jerseyNumber of even length n in which each element represent the jersey number of the particular player, pair up the players into n / 2 pairs such that:

Each player is in exactly one pair.
The maximum pair sum is minimized.
Output the minimized maximum pair sum after optimally pairing up the players.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n.
The Second line of each testcase will give array jerseyNumber of length n.
Constraints

1<=T<=1000
n is even.
2<=n<=10^5
1<=jerseyNumber[i]<=10^9
Output Format

For each testcase output the minimized maximum pair sum after optimally pairing up the players.
Sample Input 0

1
4
3 5 2 3
Sample Output 0

7
Explanation 0

The players can be paired up into pairs (3,3) and (5,2). The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.

Sample Input 1

1
6
3 5 4 2 4 6
Sample Output 1

8
Explanation 1

The players can be paired up into pairs (3,5), (4,4), and (6,2). The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.*/

// test case 3
// 1
// 2
// 2147483640 2147483640

class Solution17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int size = sc.nextInt();
            ArrayList<Long> al = new ArrayList<>(size);

            long var=0;
            while(size--!=0)
            {
            var = sc.nextInt();    
            al.add(var);     
            }

          //  al.sort(); //for costum comparator and dont know how to use it
            Collections.sort(al);

            long max = 0;
            // System.out.println(al.size());
            for(int i=0; i<al.size()/2; i++)
            {
                long t = al.get(i)+al.get(al.size()-i-1);
                if(t>max)
                    max = t;
            }

            System.out.println(max);

        }
    }
}


// ____________________________________#DAY-18___________________________________________________

/*Day 18: World Cup Ticket Pricing

In the midst of the Cricket World Cup excitement, a unique ticketing system has been introduced. Each cricket match offers different ticket prices, and the challenge is to create packages of k distinct ticket types. The thrill of attending the match is determined by the smallest absolute difference in prices between any two selected ticket types. You are given an array of integer prices where price [i] denotes the price of the ith type of match ticket and an integer k, which represents the number of distinct ticket types in a package. The enjoyment value of a ticket package is the smallest absolute difference of the prices of any two tickets in the package. In the Cricket World Cup Ticket Pricing challenge, the goal is to find the maximum enjoyment value of a ticket package by selecting k distinct ticket types.

Input Format

The first line will be T, the number of testcases.
The first line of each testcase will give N the size of the array and a positive integer k which is the number of distinct candies in the basket.
The second line of each testcase will give array arr where arr[i] denotes the price of the ith candy.
Constraints

1<=T<=100

1 <= N <= 1000

0 <= arr[i] <= 1000000

Output Format

For each testcase output the maximum enjoyment value of a ticket package

Sample Input 0

1
6 3
13 5 1 8 21 2
//by me
//1 2 5 8 13 21
//4 3 3 3  
Sample Output 0

8
Explanation 0

Choose the tickets with the prices [13,5,21].
The enjoyment value of the ticket package is:
 min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8.
It can be proven that 8 is the maximum enjoyment value that can be achieved.*/

//?
//how can i choose the ticket prices



//--------------solution provided by them------------------//
/*#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int maximumEnjoyment(vector<int>& price, int k) {
        sort(price.begin(), price.end());
        auto check = [&](int target, int count = 1) {
            for (int i = 1, j = 0; i < price.size(); i++) 
                if (price[i] - price[j] >= target) j = i, count++;
            return count >= k;
        };
        auto left = 0, right = (int) price.back() - price.front() + 1;
        while (left < right) {
            auto mid = left + (right - left) / 2;
            if (check(mid)) left = mid + 1; else right = mid;
        }
        return left - 1;
    }
};
int main(){
    vector<int> ans;
    int t;
    cin>> t;
    Solution s=Solution();
    while(t--){
        int n,k;
        cin>>n>>k;
        vector<int> aux(n);
        for(int i=0;i<n;i++)cin>>aux[i];
        ans.push_back(s.maximumEnjoyment(aux,k));
    }
    for(auto it:ans)cout<<it<<endl;
}

*/

// ____________________________________DAY-19___________________________________________________

/*
Day 19: Wicket-Taking Heroes
Problem
Submissions
Leaderboard
In the thrilling world of cricket, each bowler is a wicket-taking superhero, showcasing their skills in different matches. Your mission is to unveil the matches where these bowling heroes achieved a specific target number of wickets. You are given an array of wickets where each element represents the wickets taken by a bowler in a specific match and an integer target which represents the target number of wickets that the bowler managed to take. Your task is to output the space separated indices representing the matches where the bowlers achieved the target number of wickets after sorting the array of wickets in non-decreasing order. If there are no target indices, return an empty list. The output indices must be sorted in increasing order.

Input Format

The first line will be T, the number of testcases.
The first line of each testcase will give N the size of the array and a positive integer target which is the target number of wickets that the bowler managed to take.
The second line of each testcase will give array arr where arr[i] denotes the wickets taken by a bowler in a specific match.
Constraints

1<=T<=100

1 <= N <= 1000

1 <= target <= 1000

0 <= arr[i] <= 1000

Output Format

For each testcase output the space separated indices representing the matches where the bowlers achieved the target number of wickets after sorting the array of wickets in non-decreasing order

Sample Input 0

2
3 12
12 15 0
10 6
9 10 8 1 6 10 6 11 2 14
Sample Output 0

1
2 3
Explanation 0

Test Case 1: The first line of the test case indicates that there are 3 elements in the array (N = 3) and the target value is 12. The second line provides the elements of the array: 12 15 0. After sorting the array in non-decreasing order, we get: 0 12 15. The indices where the element is equal to the target value (12) in the sorted array are [1] so the output for this test case is 1.

Test Case 2: The first line of the test case indicates that there are 10 elements in the array (N = 10) and the target value is 6. The second line provides the elements of the array: 9 10 8 1 6 10 6 11 2 14. After sorting the array in non-decreasing order, we get: 1 2 6 6 8 9 10 10 11 14. The indices where the element is equal to the target value (6) in the sorted array are [2, 3] so the output for this test case is 2 3.*/

class Solution19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int size = sc.nextInt();
            int target = sc.nextInt();
            ArrayList<Integer> al1 = new ArrayList<>(size);
            ArrayList<Integer> al2 = new ArrayList<>(size);
            for(int i=0; i<size; i++)
            al1.add(sc.nextInt());
            
            Collections.sort(al1);
            
            for(int i=0; i<al1.size(); i++)
            {
                if(al1.get(i)==target)
                {
                    al2.add(i);
                }
            }
            
            for(int i=0; i<al2.size(); i++)
            {
                System.out.print(al2.get(i)+" ");
            }
                System.out.println();
            
            
        }
    }
}

// ____________________________________#DAY-20___________________________________________________
// i did'nt understand the questions

/*Day 20: Removing Planet Pairs
Problem
Submissions
Leaderboard
Imagine you have a list of numbers that represent the masses of some planets in a solar system in kilograms. You also have a constant k.

In one step, you can choose two planets from the list whose masses add up to k and remove them from the list.

Find the maximum number of steps you can do on the list.

Input Format

First line will be T, the number of testcases.
The first line of each testcase will be n, the number of planets in team and k.
The second line of each testcase will be array masses of n elements.
Constraints

1<=T<=10^3
1<=K<=10^8
1<=n<=10^3
1<=masses[i]<=10^9
Output Format

For each testcase output the maximum number of steps you can do on the list.

Sample Input 0

1
4 5
1 2 3 4
Sample Output 0

2
Explanation 0

Starting with masses = [1,2,3,4]: - Remove planets 1 and 4, then masses = [2,3] - Remove planets 2 and 3, then masses = [] There are no more pairs that sum up to 5, hence a total of 2 operations.

Sample Input 1

1
5 6
3 1 3 4 3
Sample Output 1

1
Explanation 1

Starting with masses = [3,1,3,4,3]: - Remove the first two 3's, then masses = [1,4,3] There are no more pairs that sum up to 6, hence a total of 1 operation.*/

// class Solution20
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
//         while(T--!=0)
//         {
//             int size = sc.nextInt();
//             int target = sc.nextInt();
//             int[] a = new int[size];

//             for(int i=0; i<a.length; i++)
//             {
//                 a[i] = sc.nextInt();
//             }

           
//             int ansCount = 0;
            
            
//             for(int i=0; i<a.length; i++)
//             {
//                 for(int j=i+1; j<a.length; j++)
//                 {
//                     if(a[i]+a[j]==target)
//                     {
//                         a[i] = Integer.MIN_VALUE;
//                         a[j] = Integer.MIN_VALUE;
//                         ansCount++;
//                     }   
//                 }
//             }
                
             
          
//             System.out.println(ansCount);
//         }
//     }
// }

//by pratham and chatgpt
/*def max_steps(n, k, masses):
    masses.sort()  # Sort the masses in ascending order
    steps = 0
    left, right = 0, n - 1

    while left < right:
        current_sum = masses[left] + masses[right]
        if current_sum == k:
            steps += 1
            left += 1
            right -= 1
        elif current_sum < k:
            left += 1
        else:
            right -= 1

    return steps

def main():
    # Input the number of test cases
    t = int(input())

    for _ in range(t):
        # Input for each test case
        n, k = map(int, input().split())
        masses = list(map(int, input().split()))

        # Calculate and print the result for each test case
        result = max_steps(n, k, masses)
        print(result)

if __name__ =="__main__":
    main()*/

//(ii)
/*Redemption 1: Third Farthest Galaxy
Problem
Submissions
Leaderboard
Suppose you have a array of numbers dist, of n elements that represent the distances of some galaxies from Earth in light-years. Find the third farthest galaxy in this list. If there are less than three distinct distances, output the farthest one.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n, the number of elements in dist.
The second line of each testcase will give array dist.
Constraints

1<=T<=1000
1<=n<=10,000
-2^31 <= dist[i] <= 2^31 - 1
Output Format

For each testcase output the third farthest galaxy in this list, If there are less than three distinct distances, output the farthest one.

Sample Input 0

1
3
3 2 1
Sample Output 0

1
Sample Input 1

1
2
1 2
Sample Output 1

2
Sample Input 2

1
4
2 2 3 1
Sample Output 2

1*/



/*# Function to find the third farthest galaxy
def third_farthest(distances):
    unique_distances = sorted(set(distances), reverse=True)
    
    # Check if there are less than three unique distances
    if len(unique_distances) < 3:
        # If less than three unique distances, return the farthest distance
        return unique_distances[0]
    else:
        # Return the third farthest distance
        return unique_distances[2]

# Read the number of test cases
T = int(input())

# Iterate through each test case
for _ in range(T):
    # Read the number of elements in the distance array
    n = int(input())
    
    # Read the array of distances
    distances = list(map(int, input().split()))
    
    # Find and output the third farthest galaxy for each test case
    result = third_farthest(distances)
    print(result)
*/    

// ____________________________________#DAY-21___________________________________________________

//########except test case 3 all are working##########

/*class Solution21 {
    
     public static void printspiralPattern(int[][] matrix,int rows,int columns)
    {
        
        int topRow = 0,bottomRow = rows-1,leftCol = 0, rightCol = columns-1;
        
        int totalElements=1; 
        while(totalElements <= rows*columns)
        {
            //topRow -> leftCol to rightCol
            for (int j=leftCol; j<=rightCol&&totalElements <= rows*columns; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }

            topRow++;

            //rightCol -> topRow to BottomRow
            for (int i=topRow; i<=bottomRow&&totalElements <= rows*columns; i++) {
                 System.out.print( matrix[i][rightCol]+" ");totalElements++;

            }
            rightCol--;

            //bottomRow -> rigthCol to leftCol
            for (int j=rightCol; j>=leftCol&&totalElements <= rows*columns; j--) {
                System.out.print(matrix[bottomRow][j]+" ");totalElements++;
                
                    
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
            for (int i=bottomRow; i>=topRow&&totalElements <= rows*columns; i--) {
                System.out.print(matrix[i][leftCol]+" ");totalElements++;
            
            }
            leftCol++;
            

      }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] a = new int[rows][columns];
            for(int i=0; i<a.length; i++)
            {
                for(int j=0; j<a[i].length; j++)
                {
                   a[i][j] = sc.nextInt();
                }
            }
            
            printspiralPattern(a,rows,columns);
         //   System.out.println();
        }
        
    }
}    */

//########################by @chatgpt##############
/*import java.util.*;

public class Solution {
    static void spiralTraversal(int[][] matrix, int m, int n) {
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++)
                    System.out.print(matrix[top][i] + " ");
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++)
                    System.out.print(matrix[i][right] + " ");
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
            direction = (direction + 1) % 4;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] matrix = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            spiralTraversal(matrix, m, n);
            System.out.println(); // For a new line after each test case
        }
    }
}
*/

// ____________________________________#DAY-22___________________________________________________

/*
Day 22: Sorting Stars
Problem
Submissions
Leaderboard
you have an m x n matrix mat of integers, where each integer represents the brightness of a star in a patch of the sky. A matrix diagonal is a line of stars that forms a diagonal pattern from some star in either the topmost row or leftmost column and going in the bottom-right direction until reaching the edge of the sky. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes stars mat[2][0], mat[3][1], and mat[4][2].

Given the matrix mat of stars, sort each matrix diagonal in ascending order of brightness and print the resulting matrix of the sky.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give m and n.
The next lines will provide the matrix.
Constraints

1<=T<=1000
1<=m,n<=100
1<=matrix[i][j]<=100
Output Format

Sort each matrix diagonal in ascending order of brightness and output the resulting matrix of the sky.

Sample Input 0

1
3 4
3 3 1 1
2 2 1 2
1 1 1 2
Sample Output 0

1 1 1 1
1 2 2 2
1 2 3 3
*/

//by me with commants but ************passing only one test case**************

/*class Solution22
{
    //sorting funtion for sorting matrix first colums then rows
    public static void sort(int[][] a,int r,int c)
    {

        for(int k=0; k<c; k++)
        {    
            for(int i=0; i<r; i++)
            {
                for(int j=i+1; j<r; j++)
                {
                    if(a[i][k]>a[j][k])
                    {
                        int t = a[i][k];
                        a[i][k] = a[j][k];
                        a[j][k] = t;
                    }
                }
            }
        } 

        for(int k=0; k<r; k++)
        {    
            for(int i=0; i<c; i++)
            {
                for(int j=i+1; j<c; j++)
                {
                    if(a[k][i]>a[k][j])
                    {
                        int t = a[k][i];
                        a[k][i] = a[k][j];
                        a[k][j] = t;
                    }
                }
            }
        }    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            //declaring array
            int[][] a = new int[rows][columns];

            //getting the matrix values
            for(int i=0; i<rows; i++)
            {
                for (int j=0; j<columns; j++) {
                    a[i][j] = sc.nextInt();                    
                }
            }

            sort(a,rows,columns);


            for(int i=0; i<rows; i++)
            {
                for (int j=0; j<columns; j++) {
                   System.out.print(a[i][j]+" ");                  
                }
                System.out.println();
            }

        }
    }
}*/


// by chatGPT passing all test cases
/*
public class Solution {

    static void diagonalSort(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, new ArrayList<>());
                diagonalMap.get(key).add(mat[i][j]);
            }
        }

        for (List<Integer> diagonal : diagonalMap.values()) {
            Collections.sort(diagonal);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                mat[i][j] = diagonalMap.get(key).remove(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            int m = scanner.nextInt();  
            int n = scanner.nextInt();  
            int[][] matrix = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            diagonalSort(matrix);

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
*/

// ____________________________________#DAY-23___________________________________________________

/*Day 23: Pixel Art Challenge
Problem
Submissions
Leaderboard
Ram and Priya are digital artists participating in a Pixel Art Challenge, where they are creating mesmerizing artwork on a digital canvas. The canvas is represented as a 2D grid of pixels, where each pixel can either be illuminated (1) or in shadow (0). Each pixel interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules-

Any pixel with fewer than two illuminated(1) neighbors is shadowed(0)
Any pixel with two or three illuminated(1) neighbors remains illuminated(1)
Any pixel with more than three illuminated(1) neighbors gets shadowed(0)
Any shadowed(0) pixel with exactly three illuminated(1) neighbors becomes an illuminated(1) pixel
The next state is created by applying the above rules simultaneously to every pixel in the current state, where illumination and shadowing occur simultaneously. The challenge involves creating the artwork through iterations based on the rules. Your task is to output the next state after applying the above rules to the given mxn grid.

Input Format

First line will be T, the number of testcases. The first line of each testcase will give m and n. The next lines will provide the pixel matrix.

Constraints

1<=T<=10^3 1<=m,n<=25 matrix[i][j] is 0 or 1

Output Format

for each testcase output the next state of matrix.

Sample Input 0

1
4 3
0 1 0
0 0 1
1 1 1
0 0 0
Sample Output 0

0 0 0
1 0 1
0 1 1
0 1 0
Sample Input 1

1
2 2
1 1
1 0
Sample Output 1

1 1
1 1*/

 class Solution {

    // Function to update the grid based on rules
    public static void updateGrid(int[][] grid, int m, int n) {
        int[][] newGrid = new int[m][n];

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int illuminatedNeighbors = 0;

                for (int k = 0; k < 8; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];

                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                        illuminatedNeighbors++;
                    }
                }

                if (grid[i][j] == 1) {
                    if (illuminatedNeighbors < 2 || illuminatedNeighbors > 3) {
                        newGrid[i][j] = 0;
                    } else {
                        newGrid[i][j] = 1;
                    }
                } else {
                    if (illuminatedNeighbors == 3) {
                        newGrid[i][j] = 1;
                    } else {
                        newGrid[i][j] = 0;
                    }
                }
            }
        }

        // Update the original grid
        for (int i = 0; i < m; i++) {
            System.arraycopy(newGrid[i], 0, grid[i], 0, n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int m = scanner.nextInt(); // Rows
            int n = scanner.nextInt(); // Columns

            int[][] grid = new int[m][n];

            // Reading the pixel matrix
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }

            // Update the grid based on rules
            updateGrid(grid, m, n);

            // Output the updated matrix
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


// ____________________________________#DAY-24___________________________________________________

/*Day 24: The Unimatrix Challenge
Problem
Submissions
Leaderboard
Its game time! We have an interesting game for you and your friend, imagine that you have a mxn number matrix, you give an integer x to your friend. He or she can add or subtract the number x from any element in the matrix. The task for your friend is to create a uni value matrix which means all the elements of the matrix should be equal or should have equal value by performing the operations of addition and subtraction on elements of the matrix using the number x. You need to output the minimum number of operations performed by your friend to make the matrix uni-value. If it is not possible to make one, output -1.

Input Format

First line will be T, the number of testcases.

The first line of each testcase will give m and n.

The next lines will provide the matrix.

Constraints

1<=T<=10^3

1<=m,n<=25

1<=x<=10

-100000<=matrix[i][j]<=100000

Output Format

You need to output the minimum number of operations performed by your friend to make the matrix uni-value. If it is not possible to make one, output -1.

Sample Input 0

1
2 2 2
2 4
6 8
Sample Output 0

4
Sample Input 1

1
2 2 1
1 5
2 3
Sample Output 1

5
*/

/*
def min_operations_to_univalue(matrix, m, n, x):
    unique_values = set()

    # Store unique values present in the matrix
    for i in range(m):
        for j in range(n):
            unique_values.add(matrix[i][j])

    min_operations = float('inf')

    # Try making each unique value a uni-value and calculate operations needed
    for value in unique_values:
        operations = 0

        for i in range(m):
            for j in range(n):
                diff = abs(matrix[i][j] - value)

                if diff % x != 0:
                    operations = float('inf')
                    break

                operations += diff // x

        min_operations = min(min_operations, operations)

    return min_operations if min_operations != float('inf') else -1

if _name_ == "_main_":
    T = int(input())

    for _ in range(T):
        m, n, x = map(int, input().split())
        matrix = [list(map(int, input().split())) for _ in range(m)]

        result = min_operations_to_univalue(matrix, m, n, x)
        print(result)
*/


// ____________________________________DAY-25___________________________________________________

/*
Day 25: Diagonal Dominance
Problem
Submissions
Leaderboard
Om and Ram decided to play an interesting game with their family members to enjoy the weekend, in which they gave everyone tickets consisting of a square matrix. Rules for deciding the winner are- At all the diagonal elements must be non zero All other elements should be zero

Task for you is to design a program which will output whether the participant is the winner or not depending upon the above conditions of the game.

Input Format

The first line contains an integer T, the number of test cases.

For each test case:

The first line contains two integers m and n, representing the dimensions of the matrix.

The next m lines contain n integers each, representing the elements of the matrix.

Constraints

1 <= T <= 100

3 <= m, n <= 100:

-100000<=matrix[i][j]<=100000

Output Format

For each test case, output a single line: "true" if the participant is the winner. "false" if the the participant is not the winner.

Sample Input 0

1
3 3
5 7 0
0 3 1
0 5 0
Sample Output 0

false
Sample Input 1

1
4 4
2 0 0 1
0 3 1 0
0 5 2 0
4 0 0 2
Sample Output 1

true
*/

class Solution25 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T--!=0)
        {
             boolean flag = true;

            int row = sc.nextInt();
            int col = sc.nextInt();
            
            if(row!=col)
                flag = false;
            
            for(int i=0; i<row; i++)
            {
                for(int j=0; j<col; j++)
                {
                    int temp = sc.nextInt();
                    //     00 01 02 03
                    //     10 11 12 13
                    //     20 21 22 23
                    //     31 32 33 34   
                    
                    if(i==j || i+j==row-1){
                        if(temp==0)
                        flag = false;    
                    }
                    else{
                        if(temp!=0)
                        flag = false;  
                    }
                    
                }
            }
            System.out.println(flag);
        }
    }
}

// ____________________________________DAY-26___________________________________________________

/*
Day 26: Finding Stable Object
Problem
Submissions
Leaderboard
You are given an array of n cosmic objects, each with a numerical value representing its mass. Find the stable object in the array. A stable object is one whose mass is equal to the number of times it appears in the array.

Input Format

The first line will give the number of testcase T.
The first line of each testcase will give n, the number of objects in array.
The next line will give the array mass of n objects.
Constraints

1<=T<=10^3
1<=n<=1000
1<=mass[i]<=1000
Output Format

For each testcase output the element whose mass is equal to the number of times it appears in the array. If there exist multiple objects, output all of them seperated by space in sorted order. If there exist none, output -1.

Sample Input 0

1
6
1 1 1 2 2 3
Sample Output 0

2
Explanation 0

here occurances of:-

1=3
2=2
3=1 therefore stable = 2
*/

class Solution26 {

    public static int frequency(int[] a,int val)
    {
        int c =0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==val)
                c++;
        }
        return c;
    }
    
    public static boolean isrepeated(int[] a,int index)
    {
        int val = a[index];
        for(int i=0; i<index; i++)
        {
          if(a[i]==val)return true;  
        }
        return false;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            ArrayList<Integer> al = new ArrayList<>();
            int size = sc.nextInt();
            int[] a = new int[size];
            boolean f = true;
            for(int i=0; i<a.length; i++)
            {
                a[i] = sc.nextInt();
            }
            
            for(int i=0; i<size; i++)
            {
                if(a[i]==frequency(a,a[i]) && !isrepeated(a,i))
                {
                   al.add(a[i]);
                   f = false;
                }
            }
            
            if(f)
            System.out.print("-1"); 
            else
            {
                Collections.sort(al);
                Iterator i = al.iterator();
                while(i.hasNext())
                {
                    System.out.print(i.next()+" ");
                }
            }
            System.out.println(); 
                
            
        }
    
    }
}

// ____________________________________DAY-27___________________________________________________

/*
Day 27: Secret Message
Problem
Submissions
Leaderboard
Secret agents communicate through a unique set of codes and symbols. Agent X, an expert cryptographer, has devised a typing challenge for fellow spies to ensure secure communication.

Agent X uses the American keyboard layout for typing secret messages.

The first row of the keyboard consists of the characters "qwertyuiop".
The second row consists of "asdfghjkl", and
The third row consists of "zxcvbnm".
Agent X gave some array of strings to the fellow spies and asked them to identify whether the string can be typed using letters from only one row of the American keyboard or not. Your task is to help Agent X in evaluating whether the answer provided by the fellow spies is correct or not by designing a program which will check the belonging of the given string to a particular row of the keyboard. Print "yes" if its possible else "no"

Input Format

The first line will provide T, number of testcases.
Each testcase will provide string message.
Constraints

1<=T<=100
string.length<=1000
Output Format

For each testcase output "yes" if the given message can be typed with help of single row, else output "no"

Sample Input 0

2
Alaska
Dad
Sample Output 0

yes
yes
Sample Input 1

1
Hello
Sample Output 1

no
*/



class Solution27 {
    
    static boolean contains(String s,char c)
    {
       String t = ""+c;
       int i = s.indexOf(t);
        return i>=0?true:false;
    }
    
    static boolean isInPerticularRow(String s){
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        int i,j,k; 
        char ch ;
        
        for(i=0; i<s.length(); i++)
        {
            
            if(!contains(s1,s.charAt(i)))
            {
                // System.out.println("i");
               break; 
            }
        }
        
        for(j=0; j<s.length(); j++)//dad    0 to 2 
        {
            if(!contains(s2,s.charAt(j)))
            {
                // System.out.println(j);
               break; 
            }
        }                       
        for(k=0; k<s.length(); k++)
        {
            if(!contains(s3,s.charAt(k)))
            {
                // System.out.println("k");
               break; 
            }
        }
        
        if(i==s.length()||j==s.length()||k==s.length())
            return true;
        else
            return false;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
            sc.nextLine();
        while(T--!=0)
        {
            String s = sc.nextLine();
            s = s.toLowerCase();
            if(isInPerticularRow(s))
            {
               System.out.println("yes"); 
            }
            else
            {
               System.out.println("no"); 
                
            }
            
        }
    }
}

// ____________________________________#DAY-27___________________________________________________

//uderstand by chatgpt

/*
sare number agar evan time aayege mltb possible h otherwise no
{Of course! The problem describes Mikasa and Eren observing a galaxy cluster with N stars, each having a spectral type denoted by an array S. Mikasa records some stars, and Eren records the remaining ones. The task is to determine if it's possible for Mikasa and Eren to end up with the same multiset of spectral types.

The Java code provided solves this problem by:

Taking input:

First, it reads the number of test cases (T).
Then, for each test case:
It reads the number of stars (N).
It reads the array of spectral types (S).
The isSameMultisetPossible method:

It checks if it's possible for Mikasa and Eren to have the same multiset of spectral types.
It uses a HashMap (counts) to store the count of occurrences of each spectral type.
It iterates through the spectral types array and updates the counts in the HashMap.
After counting, it checks if the count of occurrences for each spectral type is even.
 If any count is odd, it means Mikasa and Eren cannot have the same multiset, and it returns false.
If all counts are even, it returns true, indicating that Mikasa and Eren can have the same multiset.
The main method:

It runs through each test case.
For each test case, it calls isSameMultisetPossible and prints "yes" if the multiset can be the same, or "no" otherwise.
}*/


//Que

/*import java.util.*;

public class GalaxyCluster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of stars
            int[] spectralTypes = new int[n];

            for (int i = 0; i < n; i++) {
                spectralTypes[i] = scanner.nextInt(); // array of spectral types
            }

            System.out.println(isSameMultisetPossible(spectralTypes) ? "yes" : "no");
        }
    }

    public static boolean isSameMultisetPossible(int[] spectralTypes) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int type : spectralTypes) {
            counts.put(type, counts.getOrDefault(type, 0) + 1);//by me it is counting 
            //agar key ho to to uski value return krdo ni to default me 0 value return krdo
        }

        for (int count : counts.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
*/

// ____________________________________DAY-29___________________________________________________

/*Day 29: Longest Palindrome
Problem
Submissions
Leaderboard
Given a string S of alphanumeric characters, you must select a subset of those characters and arrange them to form the longest possible palindromic string. Print the length of longest possible palindromic string.

Input Format

The First line will give T, the number of testcases.
Each testcase will provide you with the string S.
Constraints

1<=T<=1000
S.length <=1000
S only contains alphanumeric characters.
Output Format

For each testcase, Print the length of longest possible palindromic string.

Sample Input 0

1
babadab
Sample Output 0

5
Explanation 0

Some Possible Palindrome that can be constructed from given string are:-

babab
abbba
baaab
ababa etc.
Maximum length that can be achieved is 5.*/

//it is solved by me approach is agar count event h to plus krdo of ek bhi odd h do case h (i) num>0 num-- and ans me plus krdo(ii) last me +1 add krna hi h and 
class Solution29 {
    
    static int longestPossibleString(String s)
    {
        int ans = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        Collection<Integer> c = hm.values();
        
        int f = 0;
        for(int i:c)
        {
             // System.out.println("i is " + i);
            if(i>0)
            {    
                if(i%2==0)
                {
                   ans += i; 
                   // System.out.println("ans1 is "+ans);
                }
                else
                {
                   f = 1;
                    i--;
                   ans += i;
                   // System.out.println("ans2 is "+ans);
                }
            }   
            
        }
        
        
        return ans+f;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T--!=0)
        {
             String s = sc.next();
            int ans = longestPossibleString(s);
            System.out.println(ans);
        }
    }
}



// ____________________________________DAY-30___________________________________________________
//submitted by chatgpt than after made by me using collection without chatgpt

/*Day 30: Sorting Frequencies
Problem
Submissions
Leaderboard
You are given a string s of alphanumeric characters, write a code that outputs the string by modifying it such that all the characters are sorted in descending order of their frequencies. If there exist two characters with the same frequency output them in ascending order of their ASCII values.

Input Format

The First line will give T, the number of testcases.
Each testcase will provide you with the string s.
Constraints

1<=T<=1000
s.length <= 10000
Output Format

Output the modified string.

Sample Input 0

1
tree
Sample Output 0

eert
Explanation 0

'e' appears twice while 'r' and 't' both appear once. So 'e' must appear before both 'r' and 't'. And 'r' must appear before 't' as its ascii value is smaller.*/

//solution by me 

class Entry{
   public char k;
   public int v;
    Entry(char k,int v)
    {
        this.k = k;
        this.v = v;
    }    
     public String toString()
     {
         return ""+k+v;
     }
     
     char getK(){
         return k;
     }
}

class Solution30 {
    
    public static void sortFrequencies(String s)
    {
        
         Map<Character, Integer> freq = new HashMap<>();
         for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
         }
          
         List<Entry> l = new ArrayList<>();
        
         
         for(char c:s.toCharArray())
         {
             Entry e = new Entry(c,freq.get(c));
             l.add(e);
         }
        
        
        Collections.sort(l,new Comparator<Entry>(){
            public int compare(Entry e1,Entry e2)
            {
                if(e2.v==e1.v)
                {
                    return e1.k-e2.k;
                }
                return e2.v-e1.v;
            }
        });
        
        StringBuffer sb = new StringBuffer("");
        for(int i=0; i<l.size(); i++)
        { 
            
            sb = sb.append(l.get(i).getK());
        }
        
        System.out.println(sb.toString());
    }
    
    public static void main(String args[] ) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T--!=0)
        {
            String s = sc.next();
            
            sortFrequencies(s);
        }
        
          
    }
}
// ------------------------------chartgpts solution

/*import java.util.*;

public class ModifiedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < T; i++) {
            String s = scanner.nextLine();
            String modified = getModifiedString(s);
            System.out.println(modified);
        }
        
        scanner.close();
    }
    
    public static String getModifiedString(String s) {
        // Count frequencies of characters
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        // Custom sorting based on frequency and ASCII values
        List<Character> charList = new ArrayList<>(freq.keySet());
        Collections.sort(charList, (a, b) -> {
            int freqCompare = Integer.compare(freq.get(b), freq.get(a));
            if (freqCompare == 0) {
                return Character.compare(a, b);
            }
            return freqCompare;
        });
        
        // Construct modified string
        StringBuilder result = new StringBuilder();
        for (char c : charList) {
            int count = freq.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
*/

// ____________________________________#DAY-31___________________________________________________

/*Day 31: Inosuke vs Zenitsu
Problem
Submissions
Leaderboard
Inosuke and Zenitsu are playing a game. They are given two strings a and b. Inosuke would win if a is a subsequence of b and if its not then Zenitsu would win. Write a program that outputs the winner of game.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give a.
The second line of each testcase will give b.
Constraints

1<=T<=1000
a.length <=10000
b.length <=10000
Output Format

For each testcase print "Inosuke" if Inosuke is the winner, print "Zenitsu" otherwise.

Sample Input 0

1
oreo
onionfrylemon
Sample Output 0

Inosuke
Sample Input 1

1
orange
redcolour
Sample Output 1

Zenitsu*/


/*import java.util.Scanner;

public class GameWinner {

    public static boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == a.length();
    }

    public static void gameWinner(int T, String[][] testcases) {
        for (int i = 0; i < T; i++) {
            String a = testcases[i][0];
            String b = testcases[i][1];

            if (isSubsequence(a, b)) {
                System.out.println("Inosuke");
            } else {
                System.out.println("Zenitsu");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[][] testcases = new String[T][2];
        for (int i = 0; i < T; i++) {
            testcases[i][0] = scanner.nextLine().trim();
            testcases[i][1] = scanner.nextLine().trim();
        }

        gameWinner(T, testcases);
        scanner.close();
    }
}
*/


// ____________________________________#DAY-32___________________________________________________
//I did not get the question as well as its logis but get it from chatgpt

/*Day 32: Magical Scroll
Problem
Submissions
Leaderboard
Imagine you have a magical scroll with a word s written on it. You want to cut the scroll into smaller pieces, but you have to follow these rules:

Each piece must have at least one letter on it.
No letter can appear on more than one piece.
When you put the pieces together, they must form the original word s.
Cut the word in maximum number of pieces possible.
How long is each piece? Print your answer as a list of numbers, where each number is the length of a piece.

Input Format

The first line will give T, the number of testcases.
Each testcase will provide you with the word s.
Constraints

1<=T<=1000
s.length()<=1000
Output Format

For each testcase, print the size of pieces in which you would divide the word s. (in order of division)

Sample Input 0

1
ababcbacadefegdehijhklij
Sample Output 0

9 7 8
Explanation 0

The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
Sample Input 1

1
eccbbbbdec
Sample Output 1

10*/

/*
import java.util.*;

public class Main {
    public static List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastOccurrence.get(s.charAt(i)));

            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int t = 0; t < T; t++) {
            String word = scanner.nextLine().trim();
            List<Integer> partitions = partitionLabels(word);

            for (int partition : partitions) {
                System.out.print(partition + " ");
            }
            System.out.println();
        }
    }
}


*/

// ____________________________________DAY-33___________________________________________________

/*Day 33: Trainers Matching
Problem
Submissions
Leaderboard
You are the leader of a team of anime characters, each with a different level of skill. You want to train them to become stronger, so you hire some professional trainers who can help them improve. Each trainer has a certain amount of training power, which determines how much they can teach a character.

You can only pair up a character with a trainer if the character’s skill is not higher than the trainer’s power. Also, you can only pair up each character and each trainer once. You want to maximize the number of pairs you can make.

How many pairs can you form between your characters and the trainers?

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will provide n and m, size of character array, and size of trainer array respectively.
The next two line will give character array, and trainer array respectively.
Constraints

1<=T<=1000
1<=n<=1000
1<=m<=1000
1<=character[i]<=10000
1<=trainer[i]<=10000
Output Format

For each testcase, print the maximum number of pairs you can form between your characters and the trainers.

Sample Input 0

1
3 4
4 7 9
8 2 5 8
Sample Output 0

2
Explanation 0

One of the ways we can form two matchings is as follows:

character[0] can be matched with trainers[0] since 4 <= 8.
character[1] can be matched with trainers[3] since 7 <= 8.
It can be proven that 2 is the maximum number of matchings that can be formed.

Sample Input 1

1
3 1
1 1 1
10
Sample Output 1

1
Explanation 1

The trainer can be matched with any of the 3 characters.
Each character can only be matched with one trainer, so the maximum answer is 1.*/

//by me
class Solution33 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
        while(T--!=0)
        {
            int size1 = sc.nextInt();
            int size2 = sc.nextInt();
            int[] a1 = new int[size1];
            int[] a2 = new int[size2];
            for(int i=0; i<size1; i++)
                a1[i] = sc.nextInt();
            for(int i=0; i<size2; i++)
                a2[i] = sc.nextInt();
            
            //sorting dono ko
            Arrays.sort(a1);
            Arrays.sort(a2);
            int j = 0;
            int ans =0;
            
            //4 7 9 
            //8 2 5 8 
            // 4<=8 true 
            // 7<=2 false
            // 7<=5 f
            // 7<=8 t
            // ans = 2;
            
            for(int i=0; i<size1; i++)
            {
                while(j<size2)
                {
                     if(a1[i]<=a2[j])
                     {
                        ans++;
                         j++;
                        break;
                     }
                     j++;
                }
              
            }
            System.out.println(ans);
           
           
        }
    
    }
}


// ____________________________________DAY-34___________________________________________________

/*Day 34: Word Reversal
Problem
Submissions
Leaderboard
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position. All the English letters (lowercase or uppercase) should be reversed.

Print s after reversing it.

Input Format

The first line will give T, the number of testcases.
Each testcase will give string s.
Constraints

1<=T<=1000
s.length()<=1000
Output Format

For each testcase, Print s after reversing it.

Sample Input 0

2
ab-cd
a-bC-dEf=ghIj
Sample Output 0

dc-ba
j-Ih-gfE=dCba*/

class Solution34 {
    
    static String reverseWords(String s)
    {
      char[] a= s.toCharArray();
      int i=0,j=s.length()-1;
     
      while(i<j)
      {
          while( !((a[i]>='a'&& a[i]<='z') || (a[i]>='A'&& a[i]<='Z')) )
          {
             //System.out.println(" i "+ a[i] );   
             i++;
          }
          while( !((a[j]>='a'&& a[j]<='z') || (a[j]>='A'&& a[j]<='Z')) )
          {
             //System.out.println(" j "+ a[j] );   
             j--;     
          }
          if(i<j)
          {
             char t = a[i];
              a[i] = a[j];
              a[j] = t;
          }
          else
          break;
          i++;j--;
      }
      return new String(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
        sc.nextLine();
        while(T--!=0)
        {
            String s = sc.nextLine();
            System.out.println(reverseWords(s));
        }
    }
}

// ____________________________________DAY-35___________________________________________________

/*Day 35: k-diff hacks
Problem
Submissions
Leaderboard
You are a hacker who has infiltrated a secret facility that stores an array of integers nums and an integer k. You want to find out how many unique k-diff pairs are hidden in the array.

A k-diff pair is a pair of numbers (nums[i], nums[j]) that satisfy the following conditions:

0 <= i, j < nums.length i != j.
The absolute difference between nums[i] and nums[j] is equal to k.
The absolute difference is calculated as |val|, which means the positive value of val.
How many unique k-diff pairs can you discover in the array?

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n, size of nums and k.
The second line of each testcase will give array nums
Constraints

1<=T<=1000
1 <= nums.length <= 10^4
-10^7 <= nums[i] <= 10^7
0 <= k <= 10^7
Output Format

For each testcase, Print the number of unique k-diff pairs can be discovered in the array?

Sample Input 0

1
5 2
3 1 4 1 5
Sample Output 0

2
Explanation 0

There are two 2-diff pairs in the array, (1, 3) and (3, 5). Although we have two 1s in the input, we should only print the number of unique pairs.

Sample Input 1

1
5 1
1 2 3 4 5
Sample Output 1

4
Explanation 1

There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).*/


/*Explaination by chatgpt i did not unserstoood the question

### Sample Input 0
```
1
5 2
3 1 4 1 5
```

#### Explanation 0
- **Number of Test Cases (`T`):** 1
- **For the First Test Case:**
  - **Size of `nums` (`n`):** 5
  - **Value of `k`:** 2
  - **Array `nums`:** [3, 1, 4, 1, 5]
  
#### Expected Output 0
```
2
```

#### Explanation of Output 0
- For the given array `[3, 1, 4, 1, 5]` and `k = 2`:
  - The pairs satisfying the condition `|nums[i] - nums[j]| = k` and `i != j` are:
    - (3, 1) and (5, 3)
  - Even though there are two 1s in the input, the output should only count the number of unique pairs, so the answer is `2`.

### Sample Input 1
```
1
5 1
1 2 3 4 5
```

#### Explanation 1
- **Number of Test Cases (`T`):** 1
- **For the First Test Case:**
  - **Size of `nums` (`n`):** 5
  - **Value of `k`:** 1
  - **Array `nums`:** [1, 2, 3, 4, 5]
  
#### Expected Output 1
```
4
```

#### Explanation of Output 1
- For the given array `[1, 2, 3, 4, 5]` and `k = 1`:
  - The pairs satisfying the condition `|nums[i] - nums[j]| = k` and `i != j` are:
    - (1, 2), (2, 3), (3, 4), and (4, 5)
  - There are four pairs that fulfill the conditions, so the output is `4`.
*/


/*import java.util.*;

public class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int n = scanner.nextInt(); // Size of nums
            int k = scanner.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int result = findPairs(nums, k);
            System.out.println(result);
        }
        scanner.close();
    }
}
*/


// ____________________________________DAY-36___________________________________________________


/*Day 36: Maximum Subarray Average
Problem
Submissions
Leaderboard
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.(Upto 5 digits of decimal)

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n, size of nums and k.
The second line of each testcase will give array nums
Constraints

1<=T<=1000
n == nums.length
1 <= k <= n <= 10^5
-10^4 <= nums[i] <= 10^4
Output Format

For each testcase, output the maximum average value of subarray whose length is k.

Sample Input 0

1
6 4
1 12 -5 -6 50 3
Sample Output 0

12.75000
Sample Input 1

1
1 1
5
Sample Output 1

5.00000*/

//not all testcases were cleared except given test cases
//then get the problem showed in the answer

class Solution36 {
    
    public static void MaximumSubarrayAverage(int[] a,int k)
    {
        //array   1 12 -5 -6 50 3
        //index   0 1 2 3  4  5 6
        // if size = 7 & if k = 4 then 3 will be last index
        // i = 0 to <=size-k
        
        //finding max in array
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=a.length-k; i++)
        {            
            int temp = 0;
            for(int j=i; j<i+k; j++)
            {
               temp += a[j];                
            }
            if(max<temp)
             max = temp;
        }
        
        // System.out.printf("%.5f\n",(float)max/k);//not aception in this case
        System.out.printf("%.5f\n",(double)max/k);//accepted
        // System.out.printf("%.5f\n", max*1.0 / k);//accepted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int size = sc.nextInt();
            int[] a = new int[size];
            int k = sc.nextInt();
            for(int i=0; i<size; i++)
            {
                a[i] = sc.nextInt();
            }
            MaximumSubarrayAverage(a,k);
        }
    }
}

// ____________________________________#DAY-37___________________________________________________

//i got the solution but could not think about solution
/*Day 37: Flip And Maximise
Problem
Submissions
Leaderboard
Given a binary array nums and an integer k, Print the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n, size of nums and k.
The second line of each testcase will give array nums.
Constraints

1<=T<=1000
1 <= nums.length <= 10^5
nums[i] is either 0 or 1.
0 <= k <= nums.length
Output Format

Print the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Sample Input 0

1
11 2
1 1 1 0 0 0 1 1 1 1 0
Sample Output 0

6
Explanation 0

[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is italic.*/

/*gpt Explaination
Certainly! The logic behind finding the maximum consecutive 1's in the array while allowing at most `k` flips from 0 to 1 involves using a sliding window approach.

Here's a breakdown of the logic in the `maxConsecutiveOnes` method:

1. **Initialization**:
   - Initialize `maxOnes` to keep track of the maximum consecutive 1's.
   - Initialize `left` to keep track of the left boundary of the window.
   - Initialize `zerosCount` to count the number of zeros within the current window.

2. **Sliding Window Approach**:
   - Iterate through the array using the variable `right` as the right boundary of the window.
   - If the current element at `right` is 0, increment `zerosCount`.
   
   - Enter a `while` loop:
     - While `zerosCount` exceeds the allowed flips `k`, move the window by incrementing `left` and decrementing `zerosCount` if the element at the left boundary (`nums[left]`) is 0.
   
   - Calculate the length of the current window (`right - left + 1`) and update `maxOnes` if needed.

3. **Return the Maximum Consecutive 1's**:
   - After iterating through the entire array, `maxOnes` holds the maximum length of consecutive 1's possible with at most `k` flips.

The idea is to maintain a window with at most `k` zeros, allowing for flips as needed to maximize the consecutive 1's within that window. As the window slides through the array, it keeps track of the maximum length of consecutive 1's encountered so far.*/

/*import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] nums, int k) {
        int maxOnes = 0;
        int left = 0;
        int zerosCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerosCount++;
            }

            while (zerosCount > k) {
                if (nums[left] == 0) {
                    zerosCount--;
                }
                left++;
            }

            maxOnes = Math.max(maxOnes, right - left + 1);
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Size of nums
            int k = scanner.nextInt();

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int result = maxConsecutiveOnes(nums, k);
            System.out.println(result);
        }
        scanner.close();
    }
}
*/


// ____________________________________#DAY-38___________________________________________________

//explaination by me after several tryings
//max sum krna h without repeated ka 
//first example me hamko jab 2nd time 4 mila to last 4 occured ko hata kr 2 se sum krna h
//second me bhi first se kro ya last se 

// by sloding window

/*Day 38: Tresure Hunt
Problem
Submissions
Leaderboard
You are an adventurer who has discovered a hidden cave full of gold coins. The cave has n chambers, each containing a positive number of coins. You want to collect as many coins as possible, but there is a catch: the cave is booby-trapped, and you can only take the coins from one chamber at a time. If you take coins from a chamber that has the same number of coins as any previous chamber, the trap will be activated and you will lose everything.

How can you maximize your profit by choosing exactly one subarray of chambers to loot, such that the number of coins in each chamber is unique? The profit you get is equal to the sum of the coins in the subarray.

Input Format

The first line will give T,the number of testcases.
The first line of each testcase will give n, the number of chambers in cave.
The second line of each testcase will give the array chamber, where chamber[i] represents the number of coins the ith chamber has.
Constraints

1<=T<=1000
1<=n<=10^5
1<=chamber[i]<=10^4
Output Format

For each testcase, print the maximum loot/profit you can get.

Sample Input 0

1
5
4 2 4 5 6
Sample Output 0

17
Explanation 0

The optimal subarray here is [2,4,5,6].

Sample Input 1

1
9
5 2 1 2 5 2 1 2 5
Sample Output 1

8
Explanation 1

The optimal subarray here is [5,2,1] or [1,2,5].*/


/*import java.util.*;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of chambers
            int[] chambers = new int[n];

            // Reading the array of chamber values
            for (int i = 0; i < n; i++) {
                chambers[i] = scanner.nextInt();
            }

            int result = getMaxProfit(chambers);
            System.out.println(result);
        }
        scanner.close();
    }

    public static int getMaxProfit(int[] chambers) {
        Set<Integer> unique = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxProfit = 0;

        while (right < chambers.length) {
            if (unique.contains(chambers[right])) {
                // Move the left pointer to the right until the repeated element is removed from the set
                while (chambers[left] != chambers[right]) {
                    unique.remove(chambers[left]);
                    left++;
                }
                left++; // Move left pointer one step ahead to skip the repeated element
            } else {
                unique.add(chambers[right]);
                maxProfit = Math.max(maxProfit, calculateSum(chambers, left, right));
            }
            right++;
        }

        return maxProfit;
    }

    public static int calculateSum(int[] chambers, int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += chambers[i];
        }
        return sum;
    }
}
*/

// ____________________________________#DAY-39___________________________________________________

/*Day 39: Nice Clues
Problem
Submissions
Leaderboard
Imagine you are a detective who has a list of clues called nums and a number called k. Each clue is a number, and some of them are odd and some are even. A sequence of clues is a part of the list that is continuous, meaning there are no gaps between the clues. A sequence of clues is called nice if it has k odd clues in it.

How many nice sequences of clues are there in nums?

Input Format

The first line will give T, the number of testcase.
The first line of each testcase will give n and k.
The second line of each testcase will be the array nums.
Constraints

1<=T<=1000
1<=K<=N<=50,000
1 <= nums[i] <= 100,000
Output Format

For each testcase print the number of nice sequences of clues in nums.

Sample Input 0

1
5 3
1 1 2 1 1
Sample Output 0

2
Explanation 0

The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

Sample Input 1

1
3 1
2 4 6
Sample Output 1

0
Explanation 1

There is no odd numbers in the array.

Sample Input 2

1
10 2
2 2 2 1 2 2 1 2 2 2
Sample Output 2

16*/

/*import java.util.Scanner;

public class NiceClues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of clues
            int k = scanner.nextInt(); // Desired count of odd clues
            int[] nums = new int[n];

            for (int j = 0; j < n; j++) {
                nums[j] = scanner.nextInt();
            }

            int niceSequences = countNiceSequences(nums, k);
            System.out.println(niceSequences);
        }

        scanner.close();
    }

    private static int countNiceSequences(int[] nums, int k) {
        int countOdd = 0;
        int result = 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;

        for (int i = 1; i <= nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + (nums[i - 1] % 2);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                countOdd = prefixSum[j] - prefixSum[i];

                if (countOdd == k) {
                    result++;
                }
            }
        }

        return result;
    }
}
*/


// ____________________________________#DAY-40___________________________________________________
// ###########and no# today is two questions

/*Day 40: Dungeon Dilemma
Problem
Submissions
Leaderboard
You are exploring a dungeon that has a single row of treasure chests arranged from left to right. The chests are represented by an integer array treasures where treasures[i] is the type of treasure the ith chest contains.

You want to collect as much treasure as possible. However, the dungeon has some strict rules that you must follow:

You only have two bags, and each bag can only hold a single type of treasure. There is no limit on the amount of treasure each bag can hold.
Starting from any chest of your choice, you must open exactly one chest from every chest (including the start chest) while moving to the right. The opened treasures must fit in one of your bags.
Once you reach a chest with treasure that cannot fit in your bags, you must stop.
Given the integer array treasures, print the maximum number of treasures you can open.

Input Format

The first line will give T, the number of testcase.
The first line of each testcase will give n, the number of treasure chests.
The next line of each testcase will be an array treasures, where treasures[i] is the type of treasure the ith chest contains.
Constraints

1<=T<=1000
1<=n<=10,000
1<=treasure[i]<=100
Output Format

For each testcase, print the maximum number of treasures you can open.
Sample Input 0

3
3
1 2 1
4
0 1 2 2
5
1 2 3 2 2
Sample Output 0

3
3
4
Explanation 0

We can pick from all 3 chests.
We can pick from chests [1,2,2]. If we had started at the first chest, we would only pick from chests [0,1].
We can pick from chests [2,3,2,2]. If we had started at the first chest, we would only pick from chests [1,2].*/

/*import java.util.Scanner;
import java.util.HashMap;

public class DungeonDilemma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Number of treasures in the current test case
            int[] treasures = new int[n]; // Array to store the treasures
            
            // Reading the treasures' values
            for (int i = 0; i < n; i++) {
                treasures[i] = scanner.nextInt();
            }
            
            int maxTreasures = getMaxTreasures(n, treasures);
            System.out.println(maxTreasures);
        }
        
        scanner.close();
    }
    
    public static int getMaxTreasures(int n, int[] treasures) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int maxCount = 0;
        int uniqueTreasures = 0;
        
        for (int i = 0, j = 0; i < n; i++) {
            count.put(treasures[i], count.getOrDefault(treasures[i], 0) + 1);
            if (count.get(treasures[i]) == 1) {
                uniqueTreasures++;
            }
            
            while (uniqueTreasures > 2) {
                count.put(treasures[j], count.get(treasures[j]) - 1);
                if (count.get(treasures[j]) == 0) {
                    uniqueTreasures--;
                }
                j++;
            }
            
            maxCount = Math.max(maxCount, i - j + 1);
        }
        
        return maxCount;
    }
}
*/


//------------reeption question done by me 

/*Redemption 2: Paint the Canvas
Problem
Submissions
Leaderboard
You are a painter who loves to create art. You have a 1-D canvas, where each pixel is either white or black. You can represent the canvas as a string pixels, where pixels[i] is either ‘W’ or ‘B’, indicating the color of the ith pixel. The characters ‘W’ and ‘B’ stand for white and black, respectively.

You want to create a masterpiece that has at least one streak of k consecutive black pixels. However, your canvas currently has some white pixels that you need to paint over.

In one stroke, you can paint over a white pixel and make it black.

Print the minimum number of strokes you need to make in order to create your masterpiece?

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give k.
The second line of each testcase will give string pixels.
Constraints

1<=T<=1000
pixels.length<=10,000
k<=pixels.length
Output Format

For each testcase, print the minimum number of strokes required in order to get the required canvas.
Sample Input 0

1
7
WBBWWBBWBW
Sample Output 0

3
Explanation 0

One way to achieve 7 consecutive black pixels is to recolor the 0th, 3rd, and 4th pixel so that pixels = "BBBBBBBWBW". It can be shown that there is no way to achieve 7 consecutive black pixels in less than 3 operations. Therefore, we print 3.*/

class CanvasPainter40_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Move to the next line
        
        for (int t = 0; t < T; t++) {
            int k = scanner.nextInt();
            scanner.nextLine(); // Move to the next line
            String pixels = scanner.nextLine();
            
            int strokes = minStrokesToCreateMasterpiece(k, pixels);
            System.out.println(strokes);
        }
        
        scanner.close();
    }
    
    public static int minStrokesToCreateMasterpiece(int k, String pixels) {
        // WBBWWBBWBW   k=7
        // 0123456789   len =10
        int minCount = 0;
        
        for (int i = 0; i <= pixels.length()-k; i++) {
           
            int tempCount = 0;
            for(int j=i; j<i+k; j++)//here i made mistake
            {       
                if(pixels.charAt(j)=='W')
                {
                    tempCount++;
                }
                
            }
            if(minCount==0 || minCount>tempCount)
            {
                minCount = tempCount;
            }
        }
        
        return minCount;
    }
}

// ____________________________________#DAY-41___________________________________________________

/*Day 41: Time Paradox
Problem
Submissions
Leaderboard
In a mysterious realm where time paradoxes abound, you find yourself facing a unique challenge involving a sequence of integers from 1 to n. The time-traveling algorithm you possess has the power to manipulate the array in a peculiar manner:

You start by traversing the array from left to right, removing the first number and then every other number that follows, creating an alternate timeline. Following this, you reverse the process by traversing the array from right to left, removing the rightmost number and every other number in the reverse timeline. This pattern repeats, jumping between timelines, until only a single number remains.

Your task is to determine the last number that persists through the time paradox. Given an integer n, adhere to the rules of the algorithm, and output the final integer that defies the paradoxical forces.

Input Format

The first line will give T, the number of testcase.
The first line of each testcase will give n.
Constraints

1<=T<=1000
1<=n<=1000
Output Format

For each testcase output the final integer that remains.

Sample Input 0

1
9
Sample Output 0

6
Explanation 0

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
arr = [2, 4, 6, 8]
arr = [2, 6]
arr = [6]
*/

/*
public class TimeParadox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // Value of n for each test case
            int result = lastRemaining(n);
            System.out.println(result);
        }
        scanner.close();
    }

    public static int lastRemaining(int n) {
        boolean leftToRight = true;
        int remaining = 1;
        int step = 1;
        int head = 1;
        int remainingCount = n;

        while (remainingCount > 1) {
            if (leftToRight || remainingCount % 2 == 1) {
                head += step;
            }
            remainingCount /= 2;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return head;
    }
}
*/


// ____________________________________# kamal sir sol by jaya DAY-42___________________________________________________


/*Day 42: Climbing Stairs
Problem
Submissions
Leaderboard
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1, 2 or 3 steps. In how many distinct ways can you climb to the top?

Input Format

The first line will be T, number of testcases.
Each testcase will give n.
Constraints

0 <= n <= 32
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
Output Format

For each testcase, print the number of distinct ways you can climb to the top.

Sample Input 0

1
4
Sample Output 0

7
Explanation 0

these are the 7 ways

1 step + 1 step + 1 step + 1 step
1 step + 3 step
1 step + 2 step + 1 step
1 step + 1 step + 2 step
2 step + 2 step
2 step + 1 step + 1 step
3 step + 1 step*/

/*import java.io.*;
import java.util.*;

class Solution42 {

    public static int climbingStairs(int n)
    {
       // if(n<=0)return 0;
        if(n==1 || n==2)return n;
        else if(n==3)return n+1;
        return climbingStairs(n-1)+climbingStairs(n-2)+climbingStairs(n-3);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
           System.out.println(climbingStairs(sc.nextInt()));
        }
    }
}*/

// ____________________________________#DAY-43___________________________________________________

//by first all test cases are passed by ChatGpt 
//first it had gived second code only one test case is not passing and i have used this prompt
// prompt by me => write code with handling test case
/*This problem can be solved using Dynamic Programming with a depth-first search (DFS) approach. Here's an example solution in Java that should help you get started:*/


/*Day 43: Treasure Hunt 2
Problem
Submissions
Leaderboard
You are an adventurer who enters a dungeon full of gold and monsters. The dungeon is a m x n grid, where each cell contains a number of gold coins or a monster (represented by 0). You want to collect as much gold as possible before leaving the dungeon.

How can you do that, given the following rules:

You start from any cell that has gold coins, and you can end at any cell that has gold coins.
You can move one step up, down, left, or right from your current cell, as long as you don’t go outside the grid or enter a cell that you have already visited.
You can’t enter a cell that has a monster.
You collect all the gold coins in the cell that you enter.
Input Format

The first line will give T, the number of testcases.
The fisrt line of each testcase will give m and n.
The next few lines will give the grid.
Constraints

m == grid.length
n == grid[i].length
1 <= m, n <= 15
0 <= grid[i][j] <= 100
There are at most 25 cells containing gold.
Output Format

For each testcase, print the maximum amount of gold you can take from the dungeon.
Sample Input 0

1
3 3
0 6 0
5 8 7
0 9 0
Sample Output 0

24
Explanation 0

Path to get the maximum gold, 9 -> 8 -> 7.

Sample Input 1

1
5 3
1 0 7
2 0 6
3 4 5
0 3 0
9 0 20
Sample Output 1

28
Explanation 1

Path to get the maximum gold, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.*/

/*import java.util.*;

//code 2

public class TreasureHunt {
    static int maxGold = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of testcases

        while (T-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] grid = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }

            System.out.println(getMaxGold(grid));
        }
    }

    static int getMaxGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        maxGold = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, visited, i, j));
                }
            }
        }

        return maxGold;
    }

    static int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;

        if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == 0 || visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;
        int currentGold = grid[row][col];

        int up = dfs(grid, visited, row - 1, col);
        int down = dfs(grid, visited, row + 1, col);
        int left = dfs(grid, visited, row, col - 1);
        int right = dfs(grid, visited, row, col + 1);

        visited[row][col] = false;

        return currentGold + Math.max(Math.max(up, down), Math.max(left, right));
    }
}
*/


//code 1 for same problem day 43
/*import java.util.*;

public class TreasureHunt {
    static int maxGold = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of testcases

        while (T-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] grid = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }

            System.out.println(getMaxGold(grid));
        }
    }

    static int getMaxGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, visited, i, j));
                }
            }
        }

        return maxGold;
    }

    static int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;

        if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == 0 || visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;
        int currentGold = grid[row][col];

        int up = dfs(grid, visited, row - 1, col);
        int down = dfs(grid, visited, row + 1, col);
        int left = dfs(grid, visited, row, col - 1);
        int right = dfs(grid, visited, row, col + 1);

        visited[row][col] = false;

        return currentGold + Math.max(Math.max(up, down), Math.max(left, right));
    }
}
*/


// ____________________________________#DAY-44___________________________________________________
// i not even tried

/*Day 44: Palindrome Partitioning
Problem
Submissions
Leaderboard
Given a string s, partition s such that every substring of the partition is a palindrome . Print the number of all possible palindrome partitioning of s.

Input Format

The first line will give T, the number of testcases.
Each testcase will give the string s.
Constraints

1<=T<=1000
1 <= s.length <= 16
s contains only lowercase English letters.
Output Format

For each testcase print the number of all possible palindrome partitioning of s.

Sample Input 0

1
aab
Sample Output 0

2
Explanation 0

these are two possible partitions

"a","a","b"
"aa","b"*/

/*import java.util.*;


public class PalindromePartitioning {

    public static int partitionPalindrome(String s) {
        int n = s.length();
        List<List<String>> partitions = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();
        boolean[][] dp = new boolean[n][n];

        for (int end = 0; end < n; end++) {
            for (int start = 0; start <= end; start++) {
                if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || dp[start + 1][end - 1])) {
                    dp[start][end] = true;
                }
            }
        }

        backtrack(0, s, currentPartition, partitions, dp);
        return partitions.size();
    }

    public static void backtrack(int start, String s, List<String> currentPartition, List<List<String>> partitions, boolean[][] dp) {
        if (start == s.length()) {
            partitions.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (dp[start][end - 1]) {
                currentPartition.add(s.substring(start, end));
                backtrack(end, s, currentPartition, partitions, dp);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T--!=0)
        {      
        String testString = sc.nextLine();
        int numOfPartitions = partitionPalindrome(testString);
        System.out.println(numOfPartitions);
        }
    }
}
*/

// ____________________________________#DAY-45___________________________________________________

/*Day 45: Matchsticks to Square
Problem
Submissions
Leaderboard
You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.

Print Yes and the side of square if you can make this square and No otherwise.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n, the number of matchsticks.
The next line will be the array matchsticks where matchsticks[i] is the length of the ith matchstick.
Constraints

1<=T<=1000
1 <= matchsticks.length <= 15
1 <= matchsticks[i] <= 10^8
Output Format

For each testcase, Print Yes and the side of the square if you can make this square and No otherwise.

Sample Input 0

1
5
1 1 2 2 2
Sample Output 0

Yes 2
Explanation 0

You can form a square with length 2, one side of the square came two sticks with length 1. You can see the image here.

Sample Input 1

1
5
3 3 3 3 4
Sample Output 1

No
Explanation 1

You cannot find a way to form a square with all the matchsticks.*/

/*import java.util.*;

public class MatchsticksToSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of testcases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of matchsticks
            int[] matchsticks = new int[n];
            
            for (int i = 0; i < n; i++) {
                matchsticks[i] = scanner.nextInt();
            }
            
            if (canFormSquare(matchsticks)) {
                System.out.println("Yes " + calculateSquareSide(matchsticks));
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }

    // Function to check if a square can be formed with matchsticks
    private static boolean canFormSquare(int[] matchsticks) {
        if (matchsticks == null || matchsticks.length < 4) {
            return false;
        }
        
        int sum = 0;
        for (int stick : matchsticks) {
            sum += stick;
        }
        
        if (sum % 4 != 0) {
            return false;
        }
        
        int side = sum / 4;
        Arrays.sort(matchsticks);
        return canFormSquareHelper(matchsticks, new int[4], matchsticks.length - 1, side);
    }

    // Recursive helper function to find if square can be formed
    private static boolean canFormSquareHelper(int[] matchsticks, int[] sides, int index, int target) {
        if (index < 0) {
            return sides[0] == target && sides[1] == target && sides[2] == target;
        }

        for (int i = 0; i < 4; i++) {
            if (sides[i] + matchsticks[index] <= target) {
                sides[i] += matchsticks[index];

                if (canFormSquareHelper(matchsticks, sides, index - 1, target)) {
                    return true;
                }

                sides[i] -= matchsticks[index];
            }
        }

        return false;
    }

    // Function to calculate the side length of the square
    private static int calculateSquareSide(int[] matchsticks) {
        int sum = 0;
        for (int stick : matchsticks) {
            sum += stick;
        }
        return sum / 4;
    }
}
*/


// ____________________________________DAY-46___________________________________________________

/*Day 46: Special Array
Problem
Submissions
Leaderboard
You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Print x if the array is special, otherwise, Print -1. It can be proven that if nums is special, the value for x is unique.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n, the size of nums.
The next line of each testcase will be the array nums.
Constraints

1<=T<=1000
1 <= nums.length <= 100
0 <= nums[i] <= 1000
Output Format

For each testcase Print x if the array is special, otherwise, Print -1.

Sample Input 0

1
2
3 5
Sample Output 0

2
Explanation 0

There are 2 values (3 and 5) that are greater than or equal to 2.

Sample Input 1

1
2
0 0
Sample Output 1

-1
Explanation 1

No numbers fit the criteria for x. If x = 0, there should be 0 numbers >= x, but there are 2. If x = 1, there should be 1 number >= x, but there are 0. If x = 2, there should be 2 numbers >= x, but there are 0. x cannot be greater since there are only 2 numbers in nums.

Sample Input 2

1
5
0 4 3 0 4
Sample Output 2

3
Explanation 2

There are 3 values that are greater than or equal to 3.*/

class Solution46 {
    
    public static int nOfGreater(int[] a,int n)
    {
        int c =0;
         for(int i=0; i<a.length; i++){
            if(a[i]>=n)
            {
                c++;
            }
         }
        return c;
    }
        
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0)
        {
            int size = sc.nextInt();
            if(size<1)
            {
                System.out.println(0);
               continue; 
            }
            // ArrayList<Integer> al = new ArrayList<>(size);
            int[] a = new int[size];
            for(int i=0; i<size; i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            
            boolean flag = true;
            for(int i=0; i<size; i++)
            {
                int g = nOfGreater(a,i+1);
               // System.out.println(g+" "+(i+1));
                if(g==i+1)
                {
                     flag = false;
                    System.out.println(i+1);
                    break;
                }    
            }
            if(flag)
                System.out.println("-1");
        }
        
    }
}


// ____________________________________#DAY-47___________________________________________________
//not even tried

/*Day 47: Reach a Number
Problem
Submissions
Leaderboard
You are standing at position 0 on an infinite number line. There is a destination at position target.

You can make some number of moves numMoves so that:

On each move, you can either go left or right.
During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
Given the integer target, print the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.

Input Format

The first line will give T, the number of testcases.
Each testcase will give target.
Constraints

1<=T<=1000
-10^9 <= target <= 10^9
target != 0
Output Format

For each testcase, print the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.

Sample Input 0

1
2
Sample Output 0

3
Explanation 0

On the 1st move, we step from 0 to 1 (1 step).
On the 2nd move, we step from 1 to -1 (2 steps).
On the 3rd move, we step from -1 to 2 (3 steps).
Sample Input 1

1
3
Sample Output 1

2
Explanation 1

On the 1st move, we step from 0 to 1 (1 step). On the 2nd move, we step from 1 to 3 (2 steps).*/

/*import java.util.Scanner;

public class ReachDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int target = scanner.nextInt(); // Target position

            // Taking the absolute value of target for simplicity
            int targetAbs = Math.abs(target);
            
            int steps = 0;
            int sum = 0;

            while (sum < targetAbs || (sum - targetAbs) % 2 != 0) {
                steps++;
                sum += steps;
            }

            System.out.println(steps);
        }
    }
}
*/



// ____________________________________DAY-#48___________________________________________________
//SOLUTION BY KRATIKA'S FRIEND

/*Day 48: Quirk Challange
Problem
Submissions
Leaderboard
You are a student at the prestigious Hero Academy, where you are training to become a pro hero. You have a special quirk that allows you to manipulate the numbers in any array. However, your quirk has a limitation: you can only change the numbers that are larger than a certain value to be equal to that value. For example, if the value is 5, you can change 6, 7, 8, etc. to 5, but you cannot change 4, 3, 2, etc.

One day, you are given a challenge by your teacher: you are given an array of numbers arr and a target number. You have to use your quirk to make the sum of the array as close as possible to the target number. If there are multiple ways to do this, you have to choose the smallest value that you can use to change the numbers.

Print the value which you are going to use for your quirk to make the sum of the array as close as possible to the target number.

Input Format

The first line will give T, the number of testcases.
The first line of each testcase will give n and target, the size of array and target.
The second line of each testcase will give the array arr.
Constraints

1 <= n <= 10^4
1<=T<=1000
1 <= arr[i], target <= 10^5
Output Format

For each testcase Print the value which you are going to use for your quirk to make the sum of the array as close as possible to the target number.

Sample Input 0

1
3 10
4 9 3
Sample Output 0

3
Explanation 0

When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.

Sample Input 1

1
3 10
2 3 5
Sample Output 1

5
Sample Input 2

1
5 56803
60864 25176 27249 21296 20204
Sample Output 2

11361*/


/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int a = 0; a<t; a++){
            int n = s.nextInt();
            int target = s.nextInt();
            
        int nums[] = new int[n];
            long sum = 0;
            int maxElement = Integer.MIN_VALUE;
            for(int i = 0; i<n; i++){
                nums[i] = s.nextInt();
                sum+= (long)nums[i];
                if(nums[i] > maxElement){
                    maxElement = nums[i];
                }
            }
        
            if(sum <= target){
                System.out.println(maxElement);
            }
            else{
                int x = Math.round((float)target/n);
                int y = target/n;
                
                if(Math.abs(target - n*x) == target - y){
                    System.out.println(Math.min(x,y));
                }
                else{
                System.out.println(x);
                }
            }
        }
    }
}*/

// ____________________________________DAY-49___________________________________________________

/*You are given a 0-indexed integer array nums and an integer k.

A subarray is called equal if all of its elements are equal. Note that the empty subarray is an equal subarray.

Print the length of the longest possible equal subarray after deleting at most k elements from nums.

A subarray is a contiguous, possibly empty sequence of elements within an array.

Input Format

The first line will give T, the number of testcase.
The first line of each testcase will give nums.length and k.
The next line will give array nums.
Constraints

1<=T<=1000
1 <= nums.length <= 10^5
1 <= nums[i] <= nums.length
0 <= k <= nums.length
Output Format

For each testcase Print the length of the longest possible equal subarray after deleting at most k elements from nums.

Sample Input 0

1
6 3
1 3 2 3 1 3
Sample Output 0

3
Explanation 0

It's optimal to delete the elements at index 2 and index 4. After deleting them, nums becomes equal to [1, 3, 3, 3]. The longest equal subarray starts at i = 1 and ends at j = 3 with length equal to 3. It can be proven that no longer equal subarrays can be created.

Sample Input 1

1
6 2
1 1 2 2 1 1
Sample Output 1

4
Explanation 1

It's optimal to delete the elements at index 2 and index 3. After deleting them, nums becomes equal to [1, 1, 1, 1]. The array itself is an equal subarray, so the answer is 4. It can be proven that no longer equal subarrays can be created.*/


// ____________________________________DAY-13___________________________________________________


// ____________________________________DAY-51___________________________________________________

/*not have que but it was easy*/
/*#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T; // Number of testcases

    while (T--) {
        int n;
        cin >> n; // Number of candies

        // If the number of candies is a multiple of 4, you cannot win.
        // Otherwise, you can win by strategically picking candies.
        cout << ((n % 4 == 0) ? "No" : "Yes") << endl;
    }

    return 0;
}*/


// ____________________________________DAY-52___________________________________________________

/*Day 52: Sum Game
Problem
Submissions
Leaderboard
Alice and Bob take turns playing a game, with Alice starting first.

You are given a string num of even length consisting of digits and '?' characters. On each turn, a player will do the following if there is still at least one '?' in num:

Choose an index i where num[i] == '?'.
Replace num[i] with any digit between '0' and '9'.
The game ends when there are no more '?' characters in num.
For Bob to win, the sum of the digits in the first half of num must be equal to the sum of the digits in the second half. For Alice to win, the sums must not be equal.

For example, if the game ended with num = "243801", then Bob wins because 2+4+3 = 8+0+1. If the game ended with num = "243803", then Alice wins because 2+4+3 != 8+0+3. Assuming Alice and Bob play optimally, Print Alice if Alice will win and Bob if Bob will win.

Input Format

The first line will give T, the number of testcases.
Each testcase will give a string num.
Constraints

1<=T<=1000
2 <= num.length <= 10^5
num.length is even.
num consists of only digits and '?'.
Output Format

For each testcase print Alice if Alice will win and Bob if Bob will win.

Sample Input 0

1
5023
Sample Output 0

Bob
Explanation 0

There are no moves to be made. The sum of the first half is equal to the sum of the second half: 5 + 0 = 2 + 3.

Sample Input 1

1
25??
Sample Output 1

Alice
Explanation 1

Alice can replace one of the '?'s with '9' and it will be impossible for Bob to make the sums equal.

Sample Input 2

1
?3295???
Sample Output 2

Bob
Explanation 2

It can be proven that Bob will always win. One possible outcome is:

Alice replaces the first '?' with '9'. num = "93295???".
Bob replaces one of the '?' in the right half with '9'. num = "932959??".
Alice replaces one of the '?' in the right half with '2'. num = "9329592?".
Bob replaces the last '?' in the right half with '7'. num = "93295927".
Bob wins because 9 + 3 + 2 + 9 = 5 + 9 + 2 + 7.*/


// ____________________________________#DAY-61___________________________________________________
//using stack

/*Day 61: Minimise the string
Problem
Submissions
Leaderboard
You are given a string s consisting only of uppercase English letters.

You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.

Print the minimum possible length of the resulting string that you can obtain.

Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.

Input Format

The first line will give T, the number of testcase.
Each testcase will give the string s.
Constraints

1 <= s.length <= 100
s consists only of uppercase English letters.
1 <= T <= 1000
Output Format

For each testcase, print the minimum possible length of the resulting string that you can obtain.

Sample Input 0

1
ABFCACDB
Sample Output 0

2
Explanation 0

We can do the following operations:

Remove the substring "ABFCACDB", so s = "FCACDB".
Remove the substring "FCACDB", so s = "FCAB".
Remove the substring "FCAB", so s = "FC".
So the resulting length of the string is 2. It can be shown that it is the minimum length that we can obtain.

Sample Input 1

1
ACBBD
Sample Output 1

5
Explanation 1

We cannot do any operations on the string so the length remains the same.*/

/*import java.util.Scanner;
import java.util.Stack;

public class RemoveSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            String s = scanner.next(); // Input string for each test case
            int result = getMinLengthAfterOperations(s);
            System.out.println(result);
        }
    }

    public static int getMinLengthAfterOperations(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && shouldRemove(stack.peek(), ch)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }

    public static boolean shouldRemove(char prev, char curr) {
        return (prev == 'A' && curr == 'B') || (prev == 'C' && curr == 'D');
    }
}*/


// -------------------------------rediption questions 3-------------------------------

/*Redemption 3: Valid Parenthesis
Problem
Submissions
Leaderboard
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Input Format

The first line will give T, the number of testcase.
Each testcase will give the string s.
Constraints

1 <= t <= 1000
1 <= s.length <= 10^4
s consists of parentheses only '()[]{}'.
Output Format

For each testcase, print "yes" if string is valid else print "no".

Sample Input 0

3
()
()[]{}
(]
Sample Output 0

yes
yes
no*/



/*import java.io.*;
import java.util.*;

public class Solution {
    
        public static boolean isValid(String str) {
        boolean ans = true;
        Stack<Character> s = new Stack<>();
        for(char c: str.toCharArray())
        {
            if(c=='{' || c=='[' || c =='(')
            {
                // System.out.println("pushed"+c);
                s.push(c);
            }
            else
            {
               if(s.isEmpty())
               return false;
               char t = s.pop();
                //  System.out.println("poped"+t);

               if(c==')')
               {
                   if(t!='(')
                   return false;
               }
               else if(c==']')
               {
                   if(t!='[')
                   return false;
               }
               else if(c=='}')
               {
                   if(t!='{')
                   return false;
               }
            }
            
        }
        if(!s.isEmpty())
        {
            return false;
        }
        return  ans;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
        sc.nextLine();
        while(T--!=0)
        {
            String s = sc.nextLine();
            
            if(isValid(s))
                System.out.println("yes");
            else
                System.out.println("no");
                
            
        }
    }
}*/



// ____________________________________DAY-62___________________________________________________