/*
 * Copyright (c) 2011, Carlos Eduardo da Silva <kaduardo@gmail.com>
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


import org.junit.After;
import org.junit.Before;

/**
 * This class contains the test cases of the login command.
 *
 * @author Carlos Eduardo da Silva
 * @version 0.1.0
 *
 */
public class HGDClientTestLogin {

	/**
	 * The client.
	 */
	HGDClient client;
	
	/**
	 * Creates a new client, and opens a connection before execution 
	 * of each test case.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		client = new HGDClient();
		client.connect(HGDConsts.DEFAULT_HOST);
	}

	/**
	 * Disconnects the client, in case it is still connected at
	 * the end of the test case.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (client.isConnected())
			client.disconnect(true);
	}
	

}
