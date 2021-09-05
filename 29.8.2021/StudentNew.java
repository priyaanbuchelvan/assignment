package student;

public class StudentNew implements Comparable{
	
	private int id;
	String name;
	private String add;
	private int mathmark;
	private int scimark;
	private int socmark;
	int total;
	public StudentNew() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentNew(int id, String name, String add, int mathmark, int scimark, int socmark) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.mathmark = mathmark;
		this.scimark = scimark;
		this.socmark = socmark;
		int val=(mathmark+scimark+socmark);
		this.total=val;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+add+" "+total;
	}

	@Override
	public int compareTo(Object o) {
		StudentNew s=(StudentNew)o;
		if(s.total>this.total||(s.total==this.total&&s.mathmark>this.mathmark)) {
		return -1;
		}
		else {
		return 1;
		}
	}
	}

