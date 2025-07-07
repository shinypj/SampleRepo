package aggregation;

public class AggregationChild {
	
	String city;
	String state;
	AggregationParent ref;
	
	public AggregationChild(String city, String state, AggregationParent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println(city +""+ state);
		System.out.println(ref.name+""+ref.rollno+""+ref.address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationParent obj1 = new AggregationParent("Shiny ", 20," India");
		
		
		AggregationChild obj2 = new AggregationChild("Kochi ","Kerala ", obj1);
		obj2.display();
		
	}

}
