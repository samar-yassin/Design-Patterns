import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
        ArrayList<Object> myArrayList;
        int position;

        ArrayListIterator(ArrayList<Object> temp){
            this.myArrayList =temp;
        }

        @Override
        public boolean hasNext() {
            if(position>=this.myArrayList.size())
                return false;
            else
                return true;
        }

        @Override
        public Object next() {
            Object temp = myArrayList.get(position);
            position++;
            return temp;
        }

}
