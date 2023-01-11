import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    List<String> duplicates = findDuplicates(firstList, secondList);

    System.out.println(duplicates);
  }

  public static List<String> findDuplicates(List<String> firstList, List<String> secondList){
    List<String> duplicates = new ArrayList<>();

    for(int i = 0; i < firstList.size(); i++){
      for(int j = 0; j < secondList.size(); j++){
        if (Objects.equals(firstList.get(i), secondList.get(j))) duplicates.add(firstList.get(i));
      }
    }
    return duplicates;
  }
}
