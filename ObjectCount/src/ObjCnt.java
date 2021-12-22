
public class ObjCnt {
	static int count;
	ObjCnt(){
		count++;
	}
	static void display() {
		System.out.println("Counts of objects: "+count);
	}
}
