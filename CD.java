public class CD extends MediaItem{
	private String genre;
	private int timeSeconds;

	public CD(){
		super();
		mediaType="cd";
		genre="";
		timeSeconds=0;
	}

	public CD(String t, int i, String g, int s){
		super(t, i);
		mediaType="cd";
		genre=g;
		timeSeconds=s;
	}
	
	//compareTo
	public int compareTo(MediaItem m){
		return super.compareTo(m);
	}

	//set methods
	public void setGenre(String g){
		genre=g;
	}

	public void setTime(int s){
		timeSeconds=s;
	}

	//get methods
	public String getGenre(){
		return genre;
	}

	public int getTime(){
		return timeSeconds;
	}

	//toString
	public String toString(){
		return super.toString();
	}
}