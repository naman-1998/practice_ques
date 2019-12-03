import java.util.*;
public class phoneBook {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);

		TreeMap<String,Integer>tmap= new TreeMap<String,Integer>();  
		
		System.out.println("Enter the number of inputs:");
		
		int n=sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
		
			System.out.println("Enter name ");
			
			String str=sc.nextLine();
			
			System.out.println("Enter number");
			
			int phone=sc.nextInt();
			
			tmap.put(str,phone);
			
			sc.nextLine();
			
		}
		System.out.print("Enter the names you want to search:");
		
		String arr[]=new String[n];
		
		for(int j=0;j<n;j++) {
		
			arr[j]=sc.nextLine();
		}
		//to use for each loop,we use SET
		/*Set st=tmap.keySet();
		for(int l=0;l<n;l++) {
			if(arr[l].equals(tmap.get(l)))
				System.out.println(l+" "+tmap.get(l));
			else
				System.out.println("Not Found");
		//st.forEach(k->{
			//System.out.println(k+" "+tmap.get(k));
		//});
		}*/
		int i=0;
		while(n>0) {
			if(tmap.get(arr[i])!=null) {
				System.out.println(arr[i]+" = "+tmap.get(arr[i]));
			}
			else
				System.out.println("Not Found");
			n--;
			i++;
		}
	}
	}

