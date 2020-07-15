package SixKyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOdd {
	public static int findIt(int[] a) {
		Map<Integer, Integer> odd = new HashMap<>();

		Arrays.stream(a).forEach(x -> odd.merge(x, 1, (old, nw) -> old + nw));

		int oddInt = odd.entrySet().stream().filter(map -> map.getValue() % 2 != 0).map(k -> k.getKey()).findFirst()
				.get();

		return oddInt;
	}
}