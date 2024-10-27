import java.util.HashMap;
import java.util.Map;

class SearchingChallenge {

     static int rc = 0;

  public static String maxRepeated(String str){
    String res = "";
    boolean flag = false;
    HashMap<Character,Integer> map = new HashMap<>();
    char[] ch = str.toCharArray();

    for(char c : ch){
      if(map.containsKey(c)){
        map.put(c,map.get(c)+1);
      }else{
        map.put(c,1);
      }
    }

    for(Map.Entry<Character,Integer> e: map.entrySet()){
      char key = e.getKey();
      int value = e.getValue();

      if(value > 1 && value > rc){
        rc = value;
        res = str;
        flag = true;
      }
    }

    if(flag){
    return res;
    }

    return "";


  }

  public static String SearchingChallenge(String str) {
    // code goes here  

    String[] newStr = str.split(" ");

    // ArrayList<String> res = new ArrayList<>();

    String res = "-1";

    for(String x : newStr){
      String newFound = maxRepeated(x);
      if(newFound.equals("-1")){
        continue;
      }else{
        res = newFound;
      }
    }

    if(rc==0){
      return "-1";
    }

    return res;
  }
    public static void main(String[] args) {
        System.out.println(SearchingChallenge("No words"));
    }
}