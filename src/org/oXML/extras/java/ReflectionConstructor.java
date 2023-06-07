package org.oXML.extras.java;

import java.lang.reflect.Constructor;
import org.oXML.type.Type;
import org.oXML.engine.RuntimeContext;
import org.oXML.xpath.XPathException;
import org.oXML.xpath.function.XPathFunction;
import org.oXML.type.Node;
import org.oXML.util.Log;

public class ReflectionConstructor extends XPathFunction{

    private Constructor ctor;

    public ReflectionConstructor(Type type, Type[] sig, 
                                 Constructor ctor){
        super(type.getName(), sig);
        this.ctor = ctor;
    }

    public Node eval(Node args[], RuntimeContext ctxt)
        throws XPathException{
        try{
            return (Node)ctor.newInstance(args);
        }catch(Exception exc){
            throw new XPathException(exc);
        }
    }

    public String toString(){
        return super.toString()+'<'+ctor+'>';
    }
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
