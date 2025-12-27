import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       char p1, p2;
        int a=0,b=0;
        for(int i = 0; i < 3; i++) {
       p1 = s.next().charAt(0);
       p2 = s.next().charAt(0);
       if(p1 == 'R' && p2 == 'P') b++;
       else if(p1 == 'P' && p2 == 'R') a++;
       else if(p1 == 'P' && p2 == 'S') b++;
       else if(p1 == 'S' && p2 == 'P') a++;
       else if(p1 == 'S' && p2 == 'R') a++;
       else if(p1 == 'R' && p2 == 'S') b++;
       else System.out.println("Invalid Input");
    }
        if(a>b) System.out.println("P1");
        if(a<b) System.out.println("P2");
        if(a==b) System.out.println("Tied");
    }
        
}
