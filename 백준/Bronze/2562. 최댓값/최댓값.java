import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max;
        int e;
        int[] list = new int[9];
        for(int j = 0; j<9; j++){
          	list[j] = sc.nextInt();
        }
        max = list[0];
        for( int i = 0; i<9; i++){
       		if ( max < list[i]){
          		max = list[i];
          		}
        }
        
        for(e = 0; e<list.length; e++) {
        	if(max == list[e]) {
        		break;
        	}
        }
        
       
        System.out.println(max);
        System.out.print(e+1);
    }
}