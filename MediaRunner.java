import java.util.ArrayList;
public class MediaRunner{
	public static void main(String[] args){
		ArrayList<MediaItem> list = new ArrayList<MediaItem>();

		list.add(new Book("Communist Manifesto", 25538, "Marx, Karl", "Sociology", 304));
		list.add(new CD("Harry Potter Super Deluxe Edition Audiobook", 36912, "Audiobook", 36000));
		list.add(new Book("Mein Kampf", 25539, "Hitler, Adolf", "Autobiography", 720));

		for(MediaItem m: list){
			System.out.println(m.toString());
		}
	}
}