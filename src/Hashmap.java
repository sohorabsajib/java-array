import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Object> userinfo = new HashMap();
		userinfo.put("name", "sajib");
		userinfo.put("age", 23);
		
		for(String keys: userinfo.keySet()) {
			System.out.println(userinfo.get(keys));
		}

	}

}
