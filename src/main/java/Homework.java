import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework {
  public static void main(String[] args) {
    // задача 1: поиск общих элементов
    int[] array1 = {1, 2, 6, 6, 8, 9, 7, 10};
    int[] array2 = {1, 0, 5, 15, 6, 4, 7, 0};
    ArrayList<Integer> commonElements = findCommonElements(array1, array2);
    System.out.println("Common elements: " + commonElements);

    // задача 2: удаление повторяющихся элементов
    int[] arrayWithoutDuplicates = removeDuplicates(new int[]{0, 3, -2, 4, 3, 2});
    System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));

    // задача 3: поиск второго по величине элемента
    int secondLargest = findSecondLargest(new int[]{-1, 4, 0, 2, 7, -3});
    System.out.println("Second largest element: " + secondLargest);

    // задача 4: поиск второго наименьшего элемента
    int secondSmallest = findSecondSmallest(new int[]{-1, 4, 0, 2, 7, -3});
    System.out.println("Second smallest element: " + secondSmallest);
  }

  // задача 1: поиск общих элементов между двумя массивами
  protected static ArrayList<Integer> findCommonElements(int[] array1, int[] array2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    ArrayList<Integer> result = new ArrayList<>();

    for (int num : array1) {
      set1.add(num);
    }

    for (int num : array2) {
      if (set1.contains(num) && !set2.contains(num)) {
        result.add(num);
        set2.add(num);
      }
    }

    return result;
  }

  // задача 2: удаление повторяющихся элементов из массива
  protected static int[] removeDuplicates(int[] array) {
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> resultList = new ArrayList<>();

    for (int num : array) {
      if (set.add(num)) {
        resultList.add(num);
      }
    }

    int[] result = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
      result[i] = resultList.get(i);
    }

    return result;
  }

  // задача 3: поиск второго по величине элемента в массиве
  protected static int findSecondLargest(int[] array) {
    Arrays.sort(array);
    int n = array.length;

    if (n < 2) {
      System.out.println("Array doesn't have a second largest element");
      return -1;
    }

    return array[n - 2];
  }

  // задача 4: поиск второго наименьшего элемента в массиве
  protected static int findSecondSmallest(int[] array) {
    Arrays.sort(array);
    int n = array.length;

    if (n < 2) {
      System.out.println("Array doesn't have a second smallest element");
      return -1;
    }

    return array[1];
  }
}
