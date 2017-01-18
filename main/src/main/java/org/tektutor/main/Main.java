package org.tektutor;

import org.tektutor.frontend.*;
import org.tektutor.backend.*;
import org.tektutor.businesslayer.*;

public class Main {

	public static void main ( String args[] ) {

		FrontEnd fe = new FrontEnd();
		BusinessLayer bl = new BusinessLayer();
		Backend be = new Backend();

		fe.printModuleName();
		bl.printModuleName();
		be.printModuleName();
	}
}
