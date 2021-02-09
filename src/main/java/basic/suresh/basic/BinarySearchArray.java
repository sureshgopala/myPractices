package basic.suresh.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchArray {

	@Autowired
	private sortAlgorithm quickSort;

	public int myBinary(int[] numbers, int numberForSearch) {

		// binary search requies sorting
		// bubble sort
		// quick sort
		int[] Sortednumbers = quickSort.bubbleSort(numbers);
		System.out.println(quickSort);

		return 3;

	}

}
