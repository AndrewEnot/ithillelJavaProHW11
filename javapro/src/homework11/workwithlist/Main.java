package homework11.workwithlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

  public static void main(String[] args) {

    List<Object> array = new ArrayList<>();
    array.add("super");
    array.add("advance");
    array.add("super");
    array.add("advance");
    array.add("super");
    array.add("medium");
    array.add("medium");
    array.add("medium");
    System.out.println(countOccurrence(array, "super") + "\n");

    int[] arrayInt = {1, 2, 3, 1, 2, 3, 1, 2, 3};
    System.out.println(toList(arrayInt) + "\n");

    List<Object> arrayInteger = new ArrayList<>();
    arrayInteger.add(1);
    arrayInteger.add(2);
    arrayInteger.add(3);
    arrayInteger.add(2);
    arrayInteger.add(1);
    arrayInteger.add(1);
    System.out.println(findUnique(arrayInteger) + "\n");

    calcOccurrence(array);

    for (Occurrence occurrence : findOccurrence(array)) {
      occurrence.print();
    }
  }

  //method counting numbers of string in List of Strings
  public static int countOccurrence(List<Object> arrayList, Object object) {
    int result = 0;
    if (object != null || arrayList != null) {
      for (Object s : arrayList) {
        if (Objects.equals(s, object)) {
          result++;
        }
      }
    }
    return result;
  }

  //method transform array of integers to list of Integers
  public static List<Integer> toList(int[] arrInt) {
    List<Integer> integerArrayList = new ArrayList<>(arrInt.length);
    for (int i : arrInt) {
      integerArrayList.add(i);
    }
    return integerArrayList;
  }

  //method create list of unique objects from list of objects
  public static List<Object> findUnique(List<Object> arrayList) {
    List<Object> numberArrayList = new ArrayList<>();
    if (arrayList != null) {
      numberArrayList.add(arrayList.get(0));
      for (Object number : arrayList) {
        if (!numberArrayList.contains(number)) {
          numberArrayList.add(number);
        }
      }
    }
    return numberArrayList;
  }

  //method calculating and printing in console unique objects from list of objects and its quantity
  public static void calcOccurrence(List<Object> arrayList) {
    if (arrayList != null) {
      for (Object o : findUnique(arrayList)) {
        int sum;
        sum = countOccurrence(arrayList, o);
        System.out.println(o + " " + sum);
      }
      System.out.println();
    }
  }

  //method calculating and creating list of objects type Occurrence which contains unique objects
  // from list of objects and its quantity
  public static List<Occurrence> findOccurrence(List<Object> arrayList) {
    List<Occurrence> arrayListOccurrence = new ArrayList<>();
    if (arrayList != null) {
      for (Object o : findUnique(arrayList)) {
        int sum;
        sum = countOccurrence(arrayList, o);
        arrayListOccurrence.add(new Occurrence(o, sum));
      }
    }
    return arrayListOccurrence;
  }
}
