import java.util.ArrayList;

public class songs {
    ArrayList<Object> mySongs;


    public Iterator getIterator(){
        Iterator it = new ArrayListIterator(mySongs);
        return it;
    }

}
