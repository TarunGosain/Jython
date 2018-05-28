package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) {

		DemoService demoService = new DemoService();
		Map<String, Double> consistencyMap = demoService.checkConsistency(testData());

		System.out.println("Unit with higher value is more consistent than unit with lower value");

		consistencyMap.forEach((key, value) -> {
			if(value<0) {
				System.out.println(String.format("Unit %s is producing %d units LESS daily", key, value.intValue()).toString());
			}
			else if(value==0) {
				System.out.println(String.format("Unit %s is producing %d units daily", key, value.intValue()).toString());
			}
			else {
				System.out.println(String.format("Unit %s is producing %d units MORE daily", key, value.intValue()).toString());
			}
			
		});
	}

	private static List<UnitData> testData() {

		UnitData unit1 = new UnitData();
		unit1.setName("unit1");
		unit1.setCapacity(100);
		unit1.setProductionData(Arrays.asList(100, 120, 80, 50, 70, 60));

		UnitData unit2 = new UnitData();
		unit2.setName("unit2");
		unit2.setCapacity(100);
		unit2.setProductionData(Arrays.asList(100, 120, 130, 140, 150, 60));

		UnitData unit3 = new UnitData();
		unit3.setName("unit3");
		unit3.setCapacity(100);
		unit3.setProductionData(Arrays.asList(100, 10, 20, 30, 40, 50));

		return Arrays.asList(unit1, unit2, unit3);

	}
}
