import java.io.IOException;
import java.util.ArrayList;

public class Test_Sample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Data_driven datas = new Data_driven();
		ArrayList creds = datas.getData("InternalCreds", "HR Login");
		creds.size();
		for(int i=0; i<creds.size(); i++) {
			creds.get(i);
			System.out.println("index of "+i+" is: " +creds.get(i));
		}
		
		
	}

}
