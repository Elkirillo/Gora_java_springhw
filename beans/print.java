
public class print {
	private static print inst;
	void printer(HelloBean doc) {
		System.out.print(doc);
	}
	public static print getPrint() {
		if (inst==null)
			inst=new print();
		return inst;
	}
	private print() {};
}
