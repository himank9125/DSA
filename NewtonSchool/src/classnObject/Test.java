package classnObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Info implements Comparable<Info> {
    char ch;
    int freq;

    Info(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
    @Override
    public int compareTo(Info info) {
        if (this.freq < info.freq) {
            return -1;
        } else if (this.freq > info.freq) {
            return 1;
        }
        if (this.ch < info.ch) {
            return -1;
        } else if (this.ch > info.ch) {
            return 1;
        }
        return 0;
    }
}


public class Test {

	public static void main(String[] args) {
        char[] arr = {'a','a','b','c','b','d','a','a','e','d'};
        sortOnFrequency(arr);
    }
    public static void sortOnFrequency(char[] arr) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : arr) {
            if (freqMap.containsKey(ch)) {
                int prevFreq = freqMap.get(ch);
                prevFreq = prevFreq + 1;
                freqMap.put(ch, prevFreq);
            } else {
                freqMap.put(ch, 1);
            }
        }
//        System.out.print(freqMap.keySet());
        // ________________________________________________________________________________________________________
        List<Info> list = new ArrayList<>();
        for (char ch : freqMap.keySet()) {
            Info info = new Info(ch, freqMap.get(ch));
            list.add(info);
        }
        Collections.sort(list);

        for (Info i : list) {
            System.out.println(i.ch + " " + i.freq);
        }
        //________________________________________________________________________________________________________
	}

}
