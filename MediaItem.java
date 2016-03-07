public abstract class MediaItem implements Comparable{
	private String title;
	private int id;
	protected String mediaType;

	public MediaItem(){
		title="";
		id=0;
	}

	public MediaItem(String t, int i){
		title=t;
		id=i;
	}

	//compareTo
	public int compareTo(Object obj){
		int otherId = ((MediaItem)(obj)).getId();
		if(id==otherId)
			return 0;
		if(id>otherId)
			return 1;
		return -1;
	}

	//set methods
	public void setId(int i){
		id=i;
	}

	public void setTitle(String s){
		title=s;
	}

	//get methods
	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getType(){
		return mediaType;
	}

	//toString
	public String toString(){
		return mediaType+"   "+id+"   "+title;
	}
}