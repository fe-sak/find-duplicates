import java.util.ArrayList;
import java.util.List;

public class Main {

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

    List<String> duplicates = DuplicatesFinder.find(firstList, secondList);

    System.out.println(duplicates);
  }
}
