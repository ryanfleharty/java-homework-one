import java.util.ArrayList;
import java.util.Arrays;

public class Homework {
	public static void main(String[] args) {
		int[] arrayTest = {
			1,
			5,
			6,
			12,
			2,
			3,
			6,
			90,
			19
		};

		int[] mergedArrayTest = {
			22,
			45,
			67,
			34,
			112,
			567,
			4
		};

		int[] bubbleTest = bubbleSort(arrayTest);
		System.out.println(Arrays.toString(bubbleTest));

		int[] insertionTest = insertionSort(arrayTest);
		System.out.println(Arrays.toString(insertionTest));

		int[] mergedSortTest = mergedSortedArray(arrayTest, mergedArrayTest);
		System.out.println(Arrays.toString(mergedSortTest));
	}

	public static int[] bubbleSort(int[] arr) {
		int placeholder = 0;
		Boolean doneSorting = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				placeholder = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = placeholder;
				doneSorting = false;
			}
		}
		if (doneSorting) {
			return arr;
		} else {
			return bubbleSort(arr);
		}
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) { 
			int smallArrayIndex = i - 1; 
			while (smallArrayIndex >= 0 && arr[smallArrayIndex] > arr[i]) { 
				arr[smallArrayIndex + 1] = arr[smallArrayIndex]; 
				smallArrayIndex = smallArrayIndex - 1; 
			}
			arr[smallArrayIndex + 1] = arr[i]; 
		}
		return arr;
	}

	public static int[] mergedSortedArray(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			mergedArray[i] = arr1[i];
		}
		for (int k = 0; k < arr2.length; k++) {
			mergedArray[mergedArray.length - 1 - k] = arr2[k];
		}
		return bubbleSort(mergedArray);
	}
}