package com.theqvd.client.jni;
/*
 * libqvdclient-java QvdProgressHandler.java
 *
 * Copyright (C) 2016  theqvd.com trade mark of Qindel Formacion y Servicios SL
 *
 * libqvdclient is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * This interface is invoked by the progress callback from the JNI interface
 * 
 */

public interface QvdProgressHandler {
	/*
	 * Message that will be printed or otherwise shown to the user
	 */
	public void print_progress(String message);
}
