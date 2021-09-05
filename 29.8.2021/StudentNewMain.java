package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import Student.Student;
@SuppressWarnings("Unchecked")
public class StudentNewMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StudentNew> al=new ArrayList<StudentNew>();
		
		
		al.add(new StudentNew(1,"priya","Tvl",98,99,96));
		al.add(new StudentNew(2,"shivani","Ngl",68,93,86));
		al.add(new StudentNew(3,"guganya","Chennai",58,80,76));
		al.add(new StudentNew(4,"harini","Tuty",88,87,76));
		al.add(new StudentNew(5,"dhanam","Tvl",96,99,98));
		al.add(new StudentNew(6,"chan","Ngl",68,93,86));
		al.add(new StudentNew(7,"harry","Chennai",58,80,76));
		al.add(new StudentNew(8,"prisha","Tuty",88,87,76));
		al.add(new StudentNew(9,"janet","Tvl",98,97,95));
		
		/*ArrayList<StudentNew> total=(ArrayList<StudentNew>) s.map(o->((StudentNew)o).total=(((StudentNew) o).getMathmark()+((StudentNew)o).getScimark()+((Student)o).getSocmark())).collect(Collectors.toList());
		
		ArrayList<StudentNew> u1=(ArrayList<StudentNew>)s.map((o)->{
			StudentNew p=(StudentNew)o;
			p.total=(int)p.getMathmark()+(int)p.getScimark()+(int)p.getSocmark();
			return p;
		}).collect(Collectors.toList());
		
		System.out.println(u1);
		
		List<StudentNew> l=(List<StudentNew>) u1.stream().sorted((o1,o2)->((StudentNew)o1).total.compareto(((StudentNew)o2).total);
		
	System.out.println(l);*/
		
			StudentNew c=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		   System.out.println(c);
		   List<StudentNew> l=al.stream().sorted((i1,i2)->((StudentNew)i1).name.length()>((StudentNew)i2).name.length()?-1:1).collect(Collectors.toList());
		   System.out.println(l);
		   List<StudentNew> l1=al.stream().sorted((i1,i2)->((StudentNew)i1).total/3>((StudentNew)i2).total/3?-1:1).collect(Collectors.toList());
		   System.out.println(l1);

	}

}
       