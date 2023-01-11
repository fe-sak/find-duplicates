import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindDuplicates {

  public static void main(String[] args) {
    String[] firstArray = new String[]{"Morango", "Uva", "Acerola", "Manga"};
    String[] secondArray = new String[]{"Morango", "Uva", "Acerola", "Manga"};

    List<String> firstList = Arrays.asList(firstArray);
    List<String> secondList = Arrays.asList(secondArray);

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
