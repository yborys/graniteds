/*
  GRANITE DATA SERVICES
  Copyright (C) 2013 GRANITE DATA SERVICES S.A.S.

  This file is part of Granite Data Services.

  Granite Data Services is free software; you can redistribute it and/or modify
  it under the terms of the GNU Library General Public License as published by
  the Free Software Foundation; either version 2 of the License, or (at your
  option) any later version.

  Granite Data Services is distributed in the hope that it will be useful, but
  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE. See the GNU Library General Public License
  for more details.

  You should have received a copy of the GNU Library General Public License
  along with this library; if not, see <http://www.gnu.org/licenses/>.
*/

package org.granite.messaging.jmf;

import java.io.IOException;
import java.io.ObjectOutput;
import java.lang.reflect.Field;

/**
 * @author Franck WOLFF
 */
public interface ExtendedObjectOutput extends ObjectOutput {

	/**
	 * Return the {@link ClassLoader} registered in the global JMF {@link SharedContext}.
	 * 
	 * @return A <tt>ClassLoader</tt> that can be used to load classes during the
	 * 		serialization process.
	 */
	ClassLoader getClassLoader();
	
	void getAndWriteField(Object obj, Field field) throws IOException, IllegalAccessException;
	
	@Deprecated
	public void write(int b) throws IOException;

	@Deprecated
	public void write(byte[] b) throws IOException;

	@Deprecated
	public void write(byte[] b, int off, int len) throws IOException;

	@Deprecated
	public void writeBytes(String s) throws IOException;
	
	@Deprecated
	public void writeChars(String s) throws IOException;
}
