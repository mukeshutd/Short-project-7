/**  Iterator for arrays
 *   @author rbk
 *  Ver 1.0: 2017/08/08
 *  Ver 1.1: 2017/08/28.  Updated some methods to public
 */
/*
 * Group members:
Mukesh Kumar(mxk170430)
Shikhar Pandya (sdp170030)
Arijeet Roy (axr165030)
*/
package cs6301.g40;
import java.util.Iterator;
import java.lang.UnsupportedOperationException;

public class ArrayIterator<T> implements Iterator<T> {
    T[] arr;
    int startIndex, endIndex, cursor;

    public ArrayIterator(T[] a) {
        arr = a;
        startIndex = 0;
        endIndex = a.length-1;
        cursor = -1;
    }

    public ArrayIterator(T[] a, int start, int end) {
        arr = a;
        startIndex = start;
        endIndex = end;
        cursor = start - 1;
    }

    public boolean hasNext() {
        return cursor < endIndex;
    }

    public T next() {
        return arr[++cursor];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}