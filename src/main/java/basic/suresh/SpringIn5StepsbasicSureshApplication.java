package basic.suresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import basic.suresh.basic.BinarySearchArray;

@SpringBootApplication
public class SpringIn5StepsbasicSureshApplication {

	public static void main(String[] args) {

		ApplicationContext appcontext = SpringApplication.run(SpringIn5StepsbasicSureshApplication.class, args);
		BinarySearchArray bnr = appcontext.getBean(BinarySearchArray.class, args);
		int result = bnr.myBinary(new int[] { 1, 4, 6, 8, 3 }, 3);
		System.out.println(result);

		// BinarySearchArray arr = new BinarySearchArray(new QuickSort());
		// int result = arr.myBinary(new int[] { 12, 13, 9, 8 }, 3);
		// System.out.println(result);

	}

}
