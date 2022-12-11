import java.util.Scanner;

class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max=0;
		int min=0;
		int temp;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]= sc.nextInt();
		}
		if(N>1) {		
			for(int j=1; j<N; j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					max=temp;
				}else {
					max=arr[j];		
				}
			}
			
			for(int j=1; j<N; j++) {
				if(arr[j-1]<arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					min=temp;
				}else {
					min=arr[j];
				}
			}
		}else{
            max=min=arr[0];
}
		System.out.println(min + " " + max);

	}
	
}

