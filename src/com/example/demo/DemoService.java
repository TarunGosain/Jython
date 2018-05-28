package com.example.demo;

import java.util.HashMap;
import java.util.List;

public class DemoService {
	HashMap<String, Double> consistencyMap = new HashMap<>();

	public HashMap<String, Double> checkConsistency(List<UnitData> unitsData) {
		unitsData.forEach(unitData -> {
			consistencyMap.put(unitData.getName(),
					unitData.getProductionData().stream().mapToInt(Integer::intValue).average().orElse(0)
							- unitData.getCapacity());
		});
		return consistencyMap;
	}
}
