package org.oXML.xpath.step;

import org.oXML.xpath.Resolver;
import org.oXML.xpath.filter.NodeFilter;
import org.oXML.engine.RuntimeContext;
import org.oXML.xpath.XPathException;

public interface NodeTest {

    public static final String OUTPUT_NS = "http://www.o-xml.org/lang/";

    public NodeFilter eval(RuntimeContext context)
        throws XPathException;

    /**
     * does this NodeTest require nodes to be of the principal node type
     * @return true if it does, false if it doesn't
     */
    public boolean principal();

    public void bind(Resolver ctxt)
	throws XPathException;

    public void write(org.xml.sax.ContentHandler handler)
	throws org.xml.sax.SAXException;
}
/*
    ObjectBox - o:XML compiler and interpretor
    for more information see http://www.o-xml.org/objectbox
    Copyright (C) 2002/2003 Martin Klang, Alpha Plus Technology Ltd
    email: martin at hack.org

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
