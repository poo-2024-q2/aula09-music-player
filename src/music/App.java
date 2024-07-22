package music;

/**
 * Main class of the application
 * 
 * Uncomment the code after you implemented the classes.
 */
public class App {
    /**
     * Generate a playlist with some tracks
     * 
     * @return the playlist
     */
    // private static Playlist generatePlaylist() {
    //     Playlist playlist = new Playlist("Top 20 Hits Ever");

    //     playlist.addTrack(new Track("Bohemian Rhapsody", "Queen", "A Night at the Opera", 1975, new Duration(555)));
    //     playlist.addTrack(new Track("Imagine", "John Lennon", "Imagine", 1971, new Duration(217))); // Duration in seconds
    //     playlist.addTrack(new Track("What a Wonderful World", "Louis Armstrong", "Satchmo Sings Darin", 1968, new Duration(128)));
    //     playlist.addTrack(new Track("Hallelujah", "Leonard Cohen", "Various Positions", 1984, new Duration(240)));
    //     playlist.addTrack(new Track("Singin' in the Rain", "Gene Kelly", "Singin' in the Rain", 1952, new Duration(208)));
    //     playlist.addTrack(new Track("Back in Black", "AC/DC", "Back in Black", 1980, new Duration(255)));
    //     playlist.addTrack(new Track("Billie Jean", "Michael Jackson", "Thriller", 1982, new Duration(334)));
    //     playlist.addTrack(new Track("Clair de Lune", "Claude Debussy", "Unknown", 1890, new Duration(280)));
    //     playlist.addTrack(new Track("Hey Jude", "The Beatles", "Hey Jude", 1968, new Duration(431)));
    //     playlist.addTrack(new Track("Hotel California", "Eagles", "Hotel California", 1976, new Duration(390)));
    //     playlist.addTrack(new Track("Lose Yourself", "Eminem", "The Eminem Show", 2002, new Duration(300)));
    //     playlist.addTrack(new Track("Respect", "Aretha Franklin", "I Never Loved a Man the Way I Love You", 1967, new Duration(157)));
    //     playlist.addTrack(new Track("Light My Fire", "The Doors", "The Doors", 1967, new Duration(428)));
    //     playlist.addTrack(new Track("A Whiter Shade of Pale", "Procol Harum", "Procol Harum", 1967, new Duration(249)));
    //     playlist.addTrack(new Track("Liège Concerto", "Saint-Saëns", "Unknown", 1913, new Duration(917)));
    //     playlist.addTrack(new Track("Somebody That I Used to Know", "Gotye ft. Kimbra", "Making Mirrors", 2011, new Duration(248)));
    //     playlist.addTrack(new Track("Can't Stop the Feeling!", "Justin Timberlake", "Trolls", 2016, new Duration(230)));
    //     playlist.addTrack(new Track("The Sound of Silence", "Simon & Garfunkel", "Wednesday Morning, 3 A.M.", 1964, new Duration(189)));
    //     playlist.addTrack(new Track("The Boxer", "Simon & Garfunkel", "Bridge over Troubled Water", 1970, new Duration(316)));
    //     playlist.addTrack(new Track("The Sound of Silence", "Disturbed", "Immortalized", 2015, new Duration(248)));

    //     return playlist;
    // }

    /**
     * Test the playlist
     * 
     * @param playlist the playlist to test
     */
    // private static void playlistTest(Playlist playlist) {
    //     System.out.println("Playlist: " + playlist.getTitle());
    //     System.out.println("Total duration: " + playlist.getDuration() + "s");
    //     System.out.println("Number of tracks: " + playlist.getNumberOfTracks());
    //     System.out.println("String representation: ");
    //     System.out.println(playlist);
    // }

    /**
     * Test the player, by calling some methods
     * 
     * @param player the player to test
     */
    // private static void playerTest(Player player)  {
    //     System.out.println("Current track: " + player.getCurrentTrack().toString());

    //     player.next();
    //     System.out.println("Next track: " + player.getCurrentTrack().toString());
    //     player.next();
    //     player.next();
    //     player.next();
    //     System.out.println("Next track: " + player.getCurrentTrack().toString());
    //     player.previous();
    //     System.out.println("Previous track: " + player.getCurrentTrack().toString());

    //     player.shuffle();

    //     System.out.println("Shuffled queue: ");
    //     System.out.println(player.getQueuePlaylist());
    // }

    /**
     * Simulate the playback of the player, using a thread to simulate the time
     * Due to the limitations of this model, it is not possible to skip the current track
     * while it is playing
     * 
     * @param player the player to simulate the playback
     */
    // private static void simulatePlayback(Player player) {
    //     player.play();
    //     while (player.isPlaying()) {
    //         System.out.println("Tocando: " + player.getCurrentTrack().toString());
    //         try {
    //             /**
    //              * Simulate the time of the track by using a thread sleep
    //              * The sleep method only accepts milliseconds, but the track duration is in seconds.
    //              * We multiply by 10 to simulate a faster playback and see the results faster
    //              * (the correct would be to muliply by 1000 to get the correct time)
    //              */
    //             Thread.sleep(player.getCurrentTrack().getDuration().getSeconds() * 10);
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //         if (player.getQueuePlaylist().getNumberOfTracks() == 0) {
    //             player.stop();
    //         } else {
    //             player.next();
    //         }
    //     }
    // }

    /**
     * Start one of the main methods of the application
     * @param args
     */
    public static void main(String[] args) {
        // Player player = new Player();

        // Playlist playlist = generatePlaylist();
        // playlistTest(playlist);

        // player.addPlaylist(playlist);

        // // playerTest(player);
        // simulatePlayback(player);        
    }
}
