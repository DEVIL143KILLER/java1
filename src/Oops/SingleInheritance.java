package Oops;

class anime
{
	String type;
	public anime(String type)		//constructor
	{
	this.type=type;
	System.out.println(this.type);
	}
	void disAnime()				//default method
	{
		System.out.println("Anime/parrent :"+type);
	}
}
class movie extends anime			//new inheritance class
{
	int ratings;
	public movie(String type,int ratings)	//constructor
	{
		super(type);
		this.ratings=ratings;
	}
	void favAnime()
	{
		System.out.println("anime:from Child :"+type+" ratings :"+this.ratings);
	}
}
public class SingleInheritance 
{
	public static void main(String[] args)
	{
		
		movie m=new movie("Jujutsu kaisen",9);
		m.favAnime();
		m.disAnime();
		anime A=new anime("naruto");
		
	}
}
