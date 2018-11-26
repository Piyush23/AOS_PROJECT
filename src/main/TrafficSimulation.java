package main;

import java.sql.Time;
import java.time.Instant;
import java.util.ArrayList;

import environment.Car;

public class TrafficSimulation {

	public final static int NUM_OF_CARS = 8;

	public static void main(String[] args) {

		ArrayList<Car> carList = new ArrayList<>();
		for (int i = 0; i < NUM_OF_CARS; i++) {
			carList.add(new Car(1, Instant.now(), null, i));
		}
		
		
	}

}
