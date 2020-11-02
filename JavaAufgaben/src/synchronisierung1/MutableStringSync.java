package synchronisierung1;

import java.util.Arrays;

public class MutableStringSync {
    private char[] chars;

    private int nextFreeIndex;

    public MutableStringSync(String s) {
        synchronized (this) {
            chars = s.toCharArray();
            nextFreeIndex = s.length();
        }
    }

    public synchronized MutableStringSync append(String s) {
        for (int i = 0; i < s.length(); i++) {
            append(s.charAt(i));
        }
        return this;
    }

    synchronized private void append(char c) {
        if (chars.length == nextFreeIndex) {
            chars = Arrays.copyOf(chars, chars.length * 2);
        }
        chars[nextFreeIndex] = c;
        nextFreeIndex++;
    }

    synchronized public int length() {
        return nextFreeIndex;
    }

    @Override
    public synchronized String toString() {
        return new String(Arrays.copyOfRange(chars, 0, nextFreeIndex));
    }
}