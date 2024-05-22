public class Main {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();
    a.add("catch");
    a.add("bobcat");
    a.add("catchacat");
    a.add("cat");
    a.add("at");
    
    WordChecker wc = WordChecker(a);

    
    
    System.out.println(wc.createList("cat"));
  }
}
