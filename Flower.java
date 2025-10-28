class Flower{
public String name, color;
public int price;
	
public Flower(){
}

public Flower(String name, String color, int price){

	this.name=name;
	this.color=color;
	this.price=price;
}

public void display(){

	System.out.println("The name of the flower is " + name + "." + "The color is "+color+ " and the price is " + price +"/-");

}

public static void main(String[]args){
	Flower f=new Flower();
	Flower f1=new Flower("rose", "red", 300);
	f.display();
	f1.display();

}


}