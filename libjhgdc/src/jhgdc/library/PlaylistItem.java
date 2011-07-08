/*
 * Copyright (c) 2011 Matthew Mole <code@gairne.co.uk>
 *
 * 
 *  This file is part of libjhgdc.
 * 
 *  libjhgdc is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  libjhgdc is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with libjhgdc.  If not, see <http://www.gnu.org/licenses/>.
 */
package jhgdc.library;

/**
 * A class representing an item in a playlist. This class captures the the
 * playlist information return by the HGD daemon. This class is heavily
 * dependent of the protocol defined by HGD, as it abstracts away the format of
 * the String returned by the daemon.
 * 
 * 
 * @author Matthew Mole
 * @author Carlos Eduardo da Silva
 */
public class PlaylistItem {

	/**
	 * The track id in the HGD daemon.
	 */
	private String trackId;

	/**
	 * The file name as returned by the HGD daemon.
	 */
	private String filename;

	/**
	 * The artist of the track.
	 */
	private String artist;

	/**
	 * The song title;
	 */
	private String title;

	/**
	 * The user that queued the song.
	 */
	private String user;

	/**
	 * Constructor.
	 * 
	 * @param trackId
	 *            The ID of the song, typically an incrementing natural
	 * @param filename
	 *            The filename of the uploaded song
	 * @param artist
	 *            The song's artist
	 * @param title
	 *            The song's title
	 * @param user
	 *            The user who uploaded the file
	 */
	public PlaylistItem(String trackId, String filename, String artist,
			String title, String user) {
		this.trackId = trackId;
		this.filename = filename;
		this.artist = artist;
		this.title = title;
		this.user = user;
	}

	/**
	 * @return The trackId
	 */
	public String getId() {
		return this.trackId;
	}

	/**
	 * @return The filename
	 */
	public String getFilename() {
		return this.filename;
	}

	/**
	 * @return The artist
	 */
	public String getArtist() {
		return this.artist;
	}

	/**
	 * @return The song title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * @return The user who enqueued the file
	 */
	public String getUser() {
		return this.user;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("TrackId: " + this.trackId);
		result.append("Filename: " + this.filename);
		result.append("Artist: " + this.artist);
		result.append("Title: " + this.title);
		result.append("User: " + this.user);
		return result.toString();
	}
}