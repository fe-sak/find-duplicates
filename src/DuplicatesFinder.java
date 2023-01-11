import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DuplicatesFinder {
  static List<String> duplicates = new ArrayList<>();

  public static List<String> find(List<String> firstList, List<String> secondList){
    for(int i = 0; i < firstList.size(); i++){
      for(int j = 0; j < secondList.size(); j++){
        if (Objects.equals(firstList.get(i), secondList.get(j))) duplicates.add(firstList.get(i));
      }
    }
    return duplicates;
  }
}
