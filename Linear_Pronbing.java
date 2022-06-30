public class LinearProbingHash<Key, Value>{
	private int M;
	private Value[] vals =(Value[]) new Object[M];
	private Key[] keys = (Key[]) new Object[M];

	private int hash(Key, key){
		return (key.hashCode() & 0x7fffffff) % M;	
	}

	public void put(Key key, Value val){
		int i = hash(key);
		for(i=hash(key); kes[i]!=null; i=(i+1) % M)
			if(keys[i].equals(key)){
				vals[i] = val;
				return;
			}
		keys[i] = key;
		vals[i] = val;
	}

	public Value get(Key key){
		for(int i=hash(key); keys[i] != null; i=(i+1)%M)
			return vals[i];
		return null;
	}
}
