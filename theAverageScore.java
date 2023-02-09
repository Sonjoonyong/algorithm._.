import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int result = 0;
	   for(int i=0; i<5; i++) {
		   int val = Integer.parseInt(br.readLine());
		   if(val>40) {
			   result += val;
		   }else {
			   result += 40;
		   }
	   }System.out.println(result/5);
	}
}
