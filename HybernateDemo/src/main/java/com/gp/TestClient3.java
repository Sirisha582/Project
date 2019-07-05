package com.gp;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class TestClient3
{
	public static void main(String args[])
	{
		Configuration cfg=new AnnotationConfiguration();

		cfg=cfg.configure("hibernate.cfg.xml");

		SessionFactory factory=cfg.buildSessionFactory();

		Session session=factory.openSession();
		
		Transaction tx = session.beginTransaction();
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		Person person = new Person();
		person.setPersonName("Malavika");
		person.setMobile("9898789899");
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleId(1);
		vehicle1.setVehicleName("BMW Car");
		vehicle1.setModel("XYZ ABC");
		//person.setVehicles(vehicle1);
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleId(2);
		vehicle2.setVehicleName("I20 GRAND");
		vehicle2.setModel("MAGNA");
		
		//person.getVehicles().add(vehicle1);
		//person.getVehicles().add(vehicle2);
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		//vehicle1.setPerson(person);
		//vehicle2.setPerson(person); 
		person.setVehicles(vehicles);
		session.save(person);
		session.save(vehicle1);
		session.save(vehicle2);
		
		tx.commit();
		session.close();
		System.out.println("Objects saved successfully...");
	} 
}