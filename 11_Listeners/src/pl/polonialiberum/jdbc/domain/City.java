package pl.polonialiberum.jdbc.domain;

public class City {
	private String cityName;
	private int populationOfCity;

	public City() {
	}

	public City(String name, int population) {
		this.cityName = name;
		this.populationOfCity = population;
	}

	public String getCityName() {
		return cityName;
	}

	public int getPopulationOfCity() {
		return populationOfCity;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setPopulationOfCity(int populationOfCity) {
		this.populationOfCity = populationOfCity;
	}

}