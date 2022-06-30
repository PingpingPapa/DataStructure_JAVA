import java.util.*

public static void main(String[] args){
	//Splits the String to words
	String[] data = new String("nothing is as easy as it looks").split(" ");

	//make multiple kinds of Map
	HashMap<String, Integer> m = new HashMap<String, Integer>();
	LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
	TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

	for(int =0;i<data.length;i++){
		String key = data[i];

		if(m.get(key)==null) m.put(key, 1);
		else m.put(key, m.get(key)+1);
	}
}
