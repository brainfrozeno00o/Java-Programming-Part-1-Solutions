
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        if (!this.elements.isEmpty()){
            int longestLength = 0;
            String longestString = "";
            for (String element : elements){
                if(element.length() > longestLength){
                    longestLength = element.length();
                    longestString = element;
                }
            }
            return longestString;
        }
        return null;
    }

}
