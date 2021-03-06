public void delete(Key key){
	root = delete(root, key);
}

private node delete(Node x, Key key){
	if(x==null) return null;
	int cmp = key.compareTo(x.key);
	if (cmp<0) x.left = delete(x.left, key);
	else if (cmp>0) x.right = delete(x.right, key);
	else{
		if(x.right==null) return x.left;
		if(x.left==null) return x.right;

		Node t = x;
		x = min(t.right);
		
		x.right = deleteMin(t.right);
		x.left = t.left;
		
	}
	x.size = size(x.left) + size(x.right) + 1;
	return x;
}
