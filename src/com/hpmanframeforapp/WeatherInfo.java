package com.hpmanframeforapp;

public class WeatherInfo {

	public String name ; 
	public String hint;
	public String des;
	public String password  ;
	
	public WeatherInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public WeatherInfo(String username, String password) {
		this.name = username;
		this.password = password;
	}

	@Override
	public String toString()
	{
		return "weatherinfo:\n{" +
				"username='" + name + '\'' +
				", password='" + password + '\'' +
				", hint='"+ hint + "'" + 
				", des='"+ des + "'" +
				
				'}' + "\n";
	}

	
}
