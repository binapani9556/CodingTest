package CodingTest;
import java.util.*;

public class RecentlyPlayedStore {
	 private final int capacity;
	    private Map<String, LinkedList<String>> recentlyPlayed;

	    public RecentlyPlayedStore(int capacity) {
	        this.capacity = capacity;
	        this.recentlyPlayed = new HashMap<>();
	    }

	    public void addRecentlyPlayed(String user, String song) {
	        LinkedList<String> songsList = recentlyPlayed.getOrDefault(user, new LinkedList<>());

	        // Remove the song from the list if it already exists to maintain the most recent order
	        songsList.remove(song);
	        songsList.addFirst(song);

	        recentlyPlayed.put(user, songsList);

	        // Check if the store has reached its capacity and remove the least recently played song if necessary
	        if (songsList.size() > capacity) {
	            songsList.removeLast();
	        }
	    }

	    public List<String> getRecentlyPlayed(String user) {
	        LinkedList<String> songsList = recentlyPlayed.getOrDefault(user, new LinkedList<>());
	        return new ArrayList<>(songsList);
	    }
	}
	


