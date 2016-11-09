package com.genyherrera.crackingthecodeinterview.interviewquestions;

/**
 * @problem: Implement a world population counter in Java
 * @author geny.herrera
 */
public class WorldPopulationCounter {

	private int year;
	private long initialPopulation;
	private double growRate;
	private double deathRate;
	
	public WorldPopulationCounter(int year, long initialPopulation, double growRate, double deathRate) {
		this.year = year;
		this.initialPopulation = initialPopulation;
		this.growRate = growRate;
		this.deathRate = deathRate;
	}
	
	public long[] getPopulationCounter(int year) {
		long[] years = new long[year];
		for (int i = 0; i < year; i++) {
			long anualPopulationIncrease = i == 0 ? Math.round((growRate  / 100) * initialPopulation) : Math.round((growRate  / 100) * years[i-1]);
			long anualPopulationDecrease = i == 0 ? Math.round((deathRate / 100) * initialPopulation) : Math.round((deathRate / 100) * years[i-1]);
			years[i] = i == 0 ? initialPopulation + (anualPopulationIncrease - anualPopulationDecrease) : years[i-1] + (anualPopulationIncrease - anualPopulationDecrease);
		}
		return years;
		
	}
	
	public static void main(String[] args) {
		WorldPopulationCounter world = new WorldPopulationCounter(2016, 75000000000L, 2.2, 1.13);
		long[] result = world.getPopulationCounter(10);
		for (long population : result) {
			world.year++;
			System.out.println("Year: "+ world.year + " Population: "+population);
		}
	}
}
