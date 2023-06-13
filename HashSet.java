
public class HashSet<v> {
	private int size=10;
	private bucket[] buckets;
	private int size1=10;
	public HashSet() {
		buckets=new bucket[size];
	}
	private int hash(v val) {
		return (val.hashCode() & 0xffffffff) % size;
	}
	private value val(v val) {
		int hash=hash(val);
		if(buckets[hash]==null) {
			return null;
		}
		for(int i=0;i<buckets[hash].getValue().size();i++) {
			value currentVal=buckets[hash].getValue().get(i);
			if(currentVal.getValue().equals(val)) {
				return currentVal;
			}
		}
		return null;
	}
	public boolean contains(v val) {
		value curVal=val(val);
		if(curVal==null) {
			return false;
		}
		else {
			return true;
		}
	}
	public void put(v val){
		int hash=hash(val);
		if(buckets[hash]==null) {
			buckets[hash]=new bucket();
		}
		buckets[hash].add(new value<>(val));
		size++;
	}
	public void remove(v val) {
		if(contains(val)) {
			int hash=hash(val);
			buckets[hash].remove(val(val));
			size--;
		}
		else if(!contains(val)) {
			System.out.println("There is no such element, there is nothing to delete");
			System.exit(1);
		}
	}
}
