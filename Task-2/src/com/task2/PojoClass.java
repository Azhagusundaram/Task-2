package com.task2;

public class PojoClass {
	private String name,city;
	private int id,weight;
	private float height;
	public void setDetails() {
		this.name="Azhagu";
		this.city="NattarasanKottai";
		this.height=6.2f;
		this.weight=70;
		this.id=1713013;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getId() {
		return id;
	}
	public int getWeight() {
		return weight;
	}
	public float getHeight() {
		return height;
	}
	@Override
	public String toString() {
		return "Name :"+name+"\nID : "+id+"\nHeight : "+height+"\nWeight : "+weight+"\nCity : "+city;
	}
}
