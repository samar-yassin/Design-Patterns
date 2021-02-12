import java.lang.reflect.Array;
import java.util.ArrayList;


public class ArrayIterator implements Iterator{
        Object[] myArray;
        int position;


        ArrayIterator(Object[] temp){
            this.myArray =temp;
        }

        @Override
        public boolean hasNext() {
            if(position >= myArray.length)
                return false;
            else
                return true;
        }

        @Override
        public Object next() {
            Object temp = myArray[position];
            position++;
            return temp;
        }


}
