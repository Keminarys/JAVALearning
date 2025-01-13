import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// element in the array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		assertEquals(1, this.myArrayAndArrayList.howMany(array, 4));
		assertEquals(0, this.myArrayAndArrayList.howMany(array, 14));
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 5));
		// TODO write at least 3 additional test cases 
		
	}
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		int[] array2 = {1, 3, 5, 7};
		int[] array3 = {1, 3, 5};
		int[] array4 = {1, 3, 5, 7, 13};
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		assertEquals(7, this.myArrayAndArrayList.findMax(array2));
		assertEquals(5, this.myArrayAndArrayList.findMax(array3));
		assertEquals(13, this.myArrayAndArrayList.findMax(array4));
		// TODO write at least 3 additional test cases 
		
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		testArrayList.add(9);

		int[] array2 = {1, 3, 5, 7, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
		testArrayList2.add(7);

		int[] array3 = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5, 9};
		ArrayList<Integer> testArrayList3 = new ArrayList<Integer>();
		testArrayList3.add(9);
		testArrayList3.add(9);

		int[] array4 = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5, 13};
		ArrayList<Integer> testArrayList4 = new ArrayList<Integer>();
		testArrayList4.add(13);		
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		assertEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array2));
		assertEquals(testArrayList3, this.myArrayAndArrayList.maxArray(array3));
		assertEquals(testArrayList4, this.myArrayAndArrayList.maxArray(array4));
		
		// TODO write at least 3 additional test cases 
		
	}

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		
		int[] array2 = {1, 2, 3, 5};
		int[] testArray2 = {1, 2, 3, 5};
		this.myArrayAndArrayList.swapZero(array2);
		assertArrayEquals(testArray2, array2);		
		// TODO write at least 3 additional test cases 
		int[] array3 = {0, 0, 0, 0};
		int[] testArray3 = {0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array3);
		assertArrayEquals(testArray3, array3);	

		int[] array4 = {0, 0, 0, 0, 1, 2 ,3};
		int[] testArray4 = {1, 2, 3, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array4);
		assertArrayEquals(testArray4, array4);			
	}
}