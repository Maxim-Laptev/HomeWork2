import java.util.List;
import java.util.LinkedList;
public class bucket {
	List<value> val;
	public bucket() {
		val=new LinkedList<>();
	}
	public List<value> getValue(){
		return val;
	}
	public void add(value val1) {
		val.add(val1);
	}
	public void remove(value val1) {
		val.remove(val1);
	}
	
}
