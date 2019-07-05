package com.gp;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class TestClient1
{
	public static void main(String args[])
	{
		Configuration cfg=new AnnotationConfiguration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		/*Person person = new Person();
		person.setPersonName("dia");
		person.setMobile("9948585789");
		session.save(person);*/
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Mercedes Benz");
		vehicle.setModel("dhi");
		session.save(vehicle);
		tx.commit();
	} 
}