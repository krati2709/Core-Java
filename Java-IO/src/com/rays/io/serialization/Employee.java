package com.rays.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	
	public int employeeId;
	public String name;
	
	public Employee() {
	}
	
	public Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	
	

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);;
		out.writeInt(employeeId);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "EmployeeId: " + employeeId + ", name: " + name;
	}

}
