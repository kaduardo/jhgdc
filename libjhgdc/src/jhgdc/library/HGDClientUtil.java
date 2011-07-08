/*
 * Copyright (c) 2011, Carlos Eduardo da Silva <kaduardo@gmail.com>
 *
 *
 * This file is part of libjhgdc.
 *
 * libjhgdc is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * libjhgdc is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with libjhgdc. If not, see <http://www.gnu.org/licenses/>.
 */
package jhgdc.library;

/**
 * Class with different util methods used by the libjhgdc library.
 * 
 * @author Matthew Mole
 * @author Carlos Eduardo da Silva
 */
public class HGDClientUtil {

	/**
	 * Parse a String containing a playlist item return by HGD daemon, returning
	 * a PlaylistItem. This method is dependent on the HGD protocol, which
	 * defined the format of playlist item.
	 * 
	 * @param item
	 *            A String containing the playlist item. This String must be in
	 *            the following format:
	 *            <track-id>|<filename>|<artist>|<title>|<user>. The <artist>
	 *            and <title> fields are generated from metadata using taglib at
	 *            time of upload. If no tag information was available, the
	 *            <artist> and <title> fields remain blank.
	 * @return A PlaylistItem object populated with the received String
	 *         contents.
	 */
	public static PlaylistItem parsePlaylistItem(String item) {
		String[] tempArray = item.split("|");

		return new PlaylistItem(tempArray[0], // The track-id
				tempArray[1], // The filename
				tempArray[2], // The artist
				tempArray[3], // The title
				tempArray[4] // The user
		);
	}
}
