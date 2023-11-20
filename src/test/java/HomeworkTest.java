import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTest {

  // тесты для метода findCommonElements

  // тест на наличие общих элементов в двух массивах
  @Test
  void testFindCommonElements_WhenCommonElementsPresent() {
    int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
    int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(1);
    expected.add(7);
    assertEquals(expected, Homework.findCommonElements(array1, array2));
  }

  // тест на отсутствие общих элементов в двух массивах
  @Test
  void testFindCommonElements_WhenNoCommonElements() {
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals(expected, Homework.findCommonElements(array1, array2));
  }

  // тест метода на случай, если массивы пустые
  @Test
  void testFindCommonElements_WhenEmptyArrays() {
    int[] array1 = {};
    int[] array2 = {};
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals(expected, Homework.findCommonElements(array1, array2));
  }

  // тест метода на случай, если массивы полностью идентичны
  @Test
  void testFindCommonElements_WhenArraysAreIdentical() {
    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(1);
    expected.add(2);
    expected.add(3);
    assertEquals(expected, Homework.findCommonElements(array1, array2));
  }

  // тесты для метода removeDuplicates

  // тест на наличие повторяющихся элементов в массиве
  @Test
  void testRemoveDuplicates_WhenDuplicatesPresent() {
    int[] array = {0, 3, -2, 4, 3, 2};
    int[] expected = {0, 3, -2, 4, 2};
    assertArrayEquals(expected, Homework.removeDuplicates(array));
  }

  // тест на отсутствие повторов в массиве
  @Test
  void testRemoveDuplicates_WhenNoDuplicates() {
    int[] array = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 4, 5};
    assertArrayEquals(expected, Homework.removeDuplicates(array));
  }

  // тест на случай, если массив пустой
  @Test
  void testRemoveDuplicates_WhenEmptyArray() {
    int[] array = {};
    int[] expected = {};
    assertArrayEquals(expected, Homework.removeDuplicates(array));
  }

  // тест на случай, если массив состоит из элементов с одинаковым значением
  @Test
  void testRemoveDuplicates_WhenAllElementsAreDuplicates() {
    int[] array = {1, 1, 1, 1, 1};
    int[] expected = {1};
    assertArrayEquals(expected, Homework.removeDuplicates(array));
  }

  // тесты для метода findSecondLargest

  // тест для массива с несколькими элементами
  @Test
  void testFindSecondLargest_WhenMultipleElements() {
    int[] array = {5, 8, 2, 10, 3};
    int expected = 8;
    assertEquals(expected, Homework.findSecondLargest(array));
  }

  // тест для массива, где все элементы равны
  @Test
  void testFindSecondLargest_WhenAllElementsAreEqual() {
    int[] array = {7, 7, 7, 7, 7};
    int expected = 7;
    assertEquals(expected, Homework.findSecondLargest(array));
  }

  // тест для массива с двумя различными элементами
  @Test
  void testFindSecondLargest_WhenTwoDistinctElements() {
    int[] array = {6, 9};
    int expected = 6;
    assertEquals(expected, Homework.findSecondLargest(array));
  }

  // тест для массива с одним элементом
  @Test
  void testFindSecondLargest_WhenSingleElement() {
    int[] array = {3};
    int expected = -1;
    assertEquals(expected, Homework.findSecondLargest(array));
  }

  // тесты для метода findSecondSmallest

  // тест для массива с несколькими элементами
  @Test
  void testFindSecondSmallest_WhenMultipleElements() {
    int[] array = {5, 8, 2, 10, 3};
    int expected = 3;
    assertEquals(expected, Homework.findSecondSmallest(array));
  }

  // тест для массива, где все элементы равны
  @Test
  void testFindSecondSmallest_WhenAllElementsAreEqual() {
    int[] array = {7, 7, 7, 7, 7};
    int expected = 7;
    assertEquals(expected, Homework.findSecondSmallest(array));
  }

  // тест для массива с двумя различными элементами
  @Test
  void testFindSecondSmallest_WhenTwoDistinctElements() {
    int[] array = {6, 9};
    int expected = 6;
    assertEquals(expected, Homework.findSecondSmallest(array));
  }

  // тест для массива с одним элементом
  @Test
  void testFindSecondSmallest_WhenSingleElement() {
    int[] array = {3};
    int expected = -1;
    assertEquals(expected, Homework.findSecondSmallest(array));
  }
}
