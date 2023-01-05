package Task3;
import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements MyImage{
    private Map<String, MyImage> hm = new HashMap<>();
    private String file;
    @Override
    public void display(){
        MyImage image;
        if (hm.containsKey(file)) {
            image = hm.get(file);
        } else {
            image = new RealImage(file);
            hm.put(file,image);
        }
        image.display();
    }
    public ProxyImage(String file) {
        this.file = file;
    }
}