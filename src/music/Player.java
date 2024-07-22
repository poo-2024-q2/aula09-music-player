package music;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a music player.
 * This is a mutable object, as there are methods to add and remove tracks from
 * the queue, play, pause, stop, skip tracks, shuffle the queue, and change the
 * volume.
 */
public class Player {
    private ArrayList<Track> queue;
    private boolean playing;
    private int volume;
    private Track currentTrack;

    /**
     * Creates a new player
     */
    public Player() {
        this.queue = new ArrayList<>();
        this.playing = false;
        this.volume = 50;
        this.currentTrack = null;
    }

    /**
     * Add a track to the queue
     * 
     * @param track the track to be added
     */
    public void addTrack(Track track) {
        queue.add(track);
    }

    /**
     * Remove a track from the queue
     * 
     * @param track
     */
    public void removeTrack(Track track) {
        queue.remove(track);
    }

    /**
     * Add a playlist to the end of the queue
     * 
     * @param playlist the playlist to be added
     */
    public void addPlaylist(Playlist playlist) {
        for (Track track : playlist.getTracks()) {
            addTrack(track);
        }
    }

    /**
     * Play the current track.
     * If not track is currently playing, the first track in the queue is played.
     * 
     * @throws IllegalStateException if there are no tracks in the queue
     */
    public void play() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Nenhuma faixa na playlist");
        }
        if (currentTrack == null) {
            currentTrack = queue.get(0);
        }
        playing = true;
    }

    /**
     * Pause the current track.
     * For simplicity purposes, this method is equivalent to stop.
     */
    public void pause() {
        stop();
    }

    /**
     * Stop the current track.
     * If play is called again, the track will start from the beginning.
     */
    public void stop() {
        playing = false;
    }

    /**
     * Check if the player is currently playing a track
     * 
     * @return true if the player is playing a track, false otherwise
     */
    public boolean isPlaying() {
        return playing;
    }

    /**
     * Get a playlist with the tracks in the queue.
     * 
     * @return a playlist with the tracks in the queue
     */
    public Playlist getQueuePlaylist() {
        Playlist playlist = new Playlist("Queue");

        for (Track track : queue) {
            playlist.addTrack(track);
        }

        return playlist;
    }

    /**
     * Get the current volume.
     * 
     * @return the current volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Set the volume.
     * 
     * @param volume the new volume, between 0 and 100
     * @throws IllegalArgumentException if the volume is not between 0 and 100
     */
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume inválido");
        }
        this.volume = volume;
    }

    /**
     * Get the current track.
     * 
     * @return the current track
     */
    public Track getCurrentTrack() {
        return currentTrack;
    }

    /**
     * Skip to next track in the queue.
     * If the current track is the last in the queue, the player stops.
     * 
     * @throws IllegalStateException if there are no tracks in the queue
     */
    public void next() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Nenhuma faixa na playlist");
        }
        int index = queue.indexOf(currentTrack);
        index++;

        if (index >= queue.size()) {
            index = 0;
            stop();
        }
        currentTrack = queue.get(index);
    }


    /**
     * Skip to previous track in the queue.
     * If the current track is the first in the queue, the player stops.
     * 
     * @throws IllegalStateException if there are no tracks in the queue
     */
    public void previous() {
        if (queue.size() == 0) {
            throw new IllegalStateException("Nenhuma faixa na playlist");
        }
        int index = queue.indexOf(currentTrack);
        index--;

        if (index < 0) {
            index = 0;
        }
        currentTrack = queue.get(index);
    }

    /**
     * Shuffle the remaining queue.
     * If the player is currently playing a track, only shuffle the remaining tracks.
     * If the player is not playing, shuffle the entire queue.
     * If there are no tracks in the queue, do nothing.
     */
    public void shuffle() {
        if (queue.size() == 0) {
            return;
        }
        int index = queue.indexOf(currentTrack);
        ArrayList<Track> remainingQueue = new ArrayList<>(queue.subList(index, queue.size()));
        Collections.shuffle(remainingQueue);
        
        queue.subList(index, queue.size()).clear();
        queue.addAll(remainingQueue);
    }
}
