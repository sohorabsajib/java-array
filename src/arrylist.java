import java.util.ArrayList;

public class arrylist {

	public static void main(String[] args) {
		ArrayList<Object> userinfo = new ArrayList();
		userinfo.add("sajib");
		userinfo.add(25);
		userinfo.add(1900);
		//set(0,"kamruzzaman");
		//userinfo.remove(2);
		
		for(Object value:userinfo) {
			System.out.println(value);
		}


	}

}
