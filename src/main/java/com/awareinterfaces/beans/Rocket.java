package com.awareinterfaces.beans;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Rocket {
	private int rocketNo;
	private String rocketName;
	private int weight;

	public void propel(){
		System.out.println("rocket no "+rocketNo+" rocket name "+rocketName+" and weight "+weight);
	}

	public void setRocketNo(int rocketNo) {
		this.rocketNo = rocketNo;
	}

	public void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


}
