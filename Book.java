public class Book extends MediaItem{
	private String author;
	private String genre;
	private int pageCount;

	public Book(){
		super();
		mediaType="book";
		author="";
		genre="";
		pageCount=0;
	}

	public Book(String t, int i, String a, String g, int p){
		super(t, i);
		mediaType="book";
		author=a;
		genre=g;
		pageCount=p;
	}

	//compareTo
	public int compareTo(MediaItem m){
		return super.compareTo(m);
	};

	//set methods
	public void setAuthor(String a){
		author=a;
	}

	public void setGenre(String g){
		genre=g;
	}

	public void setPageCount(int p){
		pageCount=p;
	}

	//get methods
	public String getAuthor(){
		return author;
	}

	public String getGenre(){
		return genre;
	}

	public int getPageCount(){
		return pageCount;
	}

	//toString
	public String toString(){
		return super.toString();
	}
}