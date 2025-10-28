class Player{

	String name, position, teamName;
	int age,  overallRating, goals, assists, transferValue;
	



public Player(){
}

public Player(String name, String position, String teamName, int age, int overallRating, int goals, int assists, int transferValue){

	this.name=name;
	this.position=position;
	this.teamName=teamName;
	this.age=age;
	this.overallRating=overallRating;
	this.goals=goals;
	this.assists=assists;
	this.transferValue=transferValue;


}

public void display(){

	System.out.println("Name of the footballer is "+name+". His position is "+position+". He is "+age+" years old and his overall rating is "+overallRating+". He has "+goals+" and "+assists+". He is valued at "+transferValue+"$");

}


public static void main(String[]args){

	Player p=new Player();
	Player p1=new Player("abc", "ST", "Arsenal",24, 105, 28, 189, 4500000);
	p.display();
	p1.display();



}

}
