package com.rays.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
	public static void main(String[] args) throws Exception {
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("F://io/pd.dat"));
		
		out.writeInt(22);
		out.writeBoolean(true);
		out.writeChar('S');
		out.writeDouble(23.5);
		out.close();
	}

}
