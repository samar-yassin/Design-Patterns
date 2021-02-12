public class main {
    songs s;
    public void printSongs(){
        Iterator it = s.getIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
