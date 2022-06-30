private void swim(int k){
	while(k>1 && less(k/2, k)){
		exch(k, k/2);
		k = k/2;
	}
}

private void sink(int k){
	while(2*k <= N){
		int j = 2*k;
		if(j<N && less(j,j+1)) j++;
		if(!less(k, j)) break;
		exch(k, j);
		k=j;
	}
}

public Key delMax(){
	Key max = pq[1];
	exch(1, N--);
	sink(1);
	pq[N+1]=null;
	return max;
}


## Heap Sort
# Heap Construction

for(int k = N/2; k>=1; k--)
	sink(a, k, N)
  
# Sortdown
while(N>1){
	exch(a, 1, N--);
	sink(a, 1, N);
}
