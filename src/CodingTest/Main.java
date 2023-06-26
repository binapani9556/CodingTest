package CodingTest;

public class Main {
	public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(5);

        store.addRecentlyPlayed("user1", "song1");
        store.addRecentlyPlayed("user1", "song2");
        store.addRecentlyPlayed("user2", "song3");
        store.addRecentlyPlayed("user2", "song4");
        store.addRecentlyPlayed("user2", "song5");
        store.addRecentlyPlayed("user1", "song6");

        System.out.println(store.getRecentlyPlayed("user1")); // [song6, song2, song1]
        System.out.println(store.getRecentlyPlayed("user2")); // [song5, song4, song3]
    }
}


