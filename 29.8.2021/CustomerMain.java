package Customer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import Student.Student;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> al=new ArrayList<Customer>();
		
		al.add(new Customer(1,"Diya",5000));
		al.add(new Customer(3,"Riya",1000));
		al.add(new Customer(4,"Tintu",6000));
		al.add(new Customer(2,"Pinky",8000));
		al.add(new Customer(8,"Lily",3000));
		al.add(new Customer(5,"Rose",2000));
		al.add(new Customer(9,"Kitty",10000));
		al.add(new Customer(6,"Meera",6000));
		al.add(new Customer(7,"Shyami",7000));
		al.add(new Customer(10,"Devi",15000));
		
		Stream s=al.stream();
		
		IntConsumer bi=((o)->
		{
			int max=5000;
			if(max<o)
			{
				max=o;
			}
			System.out.println("Highest Price : "+max);
			highest(max);
			
		});
		bi.accept(Customer.getBoughtprice());
				
		long high=s.filter((o)->((Customer)o).getBoughtprice()>5000).count();
		
		System.out.print("\nCount of Customer who bought more than 5000 rupees : "+high);


	}

	private static void highest(int max) {
		// TODO Auto-generated method stub
		
		
		if(Customer.getBoughtprice()==max)
		{
			System.out.println("Customer Eligible for a Gift is : ");
			System.out.print("Customer Name : "+Customer.getName());
			System.out.print(" Customer Id : "+Customer.getCid());
			
		}
		
	}

}
