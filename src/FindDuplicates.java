import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FindDuplicates {

  public static void main(String[] args) {
    List<String> firstList = new ArrayList<>();
    List<String> secondList = new ArrayList<>();

    firstList.add("Morango");
    firstList.add("Uva");
    firstList.add("Acerola");
    firstList.add("Manga");

    secondList.add("Pêra");
    secondList.add("Caju");
    secondList.add("Morango");
    secondList.add("Kiwi");

    List<String> duplicates = findDuplicates(firstList, secondList);

    System.out.println(duplicates);
  }

  public static List<String> findDuplicates(List<String> firstList, List<String> secondList){
    List<String> duplicates = new ArrayList<>();

    for (String firstListElement : firstList) {
      for (String secondListElement : secondList) {
        if (Objects.equals(firstListElement, secondListElement))
          duplicates.add(firstListElement);
      }
    }
    return duplicates;
  }
}
