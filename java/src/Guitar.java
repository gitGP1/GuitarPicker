import java.util.Scanner;

public class Guitar extends Time {	
	private String brand;
	private String model;
	private int strings;
	private double price;
	private int id;
	private static int nextId;
	
	public Guitar()	//constructor
	{
		this("Brand", "Model", 6, 999);	//recursive constructor
	}
	
	public Guitar(String brand, String model, int strings, int price)	//constructor overloaded
	{
			id=nextId;
			nextId++;
			this.brand=brand;
			this.model=model;
			this.strings=strings;
			this.price=price;
		
	}
	
	
	//MUTATORS	//////////////////////////////////////////
	public void setBrand(String b)
	{
		brand = b;
	}
	public void setModel(String m)
	{
		model = m;
	}
	public void setStrings(int s)
	{
		strings = s;
	}
	public void setPrice(double p)
	{
		price = p;
	}
	//ACCESORS	//////////////////////////////////////////
	public int getId()
	{
		return id;
		
	}
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public int getStrings()
	{
		return strings;
	}
	public double getPrice()
	{
		return price;
	}
	
	//////////////////////////////////////////////////////
	
	
	public void addGuitar()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Brand");
		setBrand(s.nextLine());
		System.out.println("Model");
		setModel(s.nextLine());
		System.out.println("Number of strings");
		setStrings(s.nextInt());
		System.out.println("Price");
		setPrice(s.nextDouble());
		s.close();
	}
	public void displayGuitar()
	{
		System.out.println("ID: "+getId());
		System.out.println("Brand: "+getBrand());
		System.out.println("Model: "+getModel());
		System.out.println("Strings: "+getStrings());
		System.out.println("Price: $"+getPrice());
	}

	public String toString()
	{
		return "Brand: "+brand+"\nModel: "+model+"\nStrings: "+strings+"\nPrice: "+price;
	}
	
	public static void main(String[] args) {
		
		displayTime();
		Guitar schecter_omen_6 = new Guitar();
		System.out.println(schecter_omen_6);
		
		//schecter_omen_6.addGuitar();
		//schecter_omen_6.displayGuitar();


		
	}
	
	static
	{
		nextId=1;
	}

}
