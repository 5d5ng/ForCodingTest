package lv1;

import java.util.Arrays;
import java.util.*;


public class 완주하지못한_선수 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hash = new HashMap<>();
        for(String s :participant){
            hash.put(s,hash.getOrDefault(s,0)+1);
        }
        for(String s: completion){
            hash.put(s,hash.get(s)-1);
        }
        for(String key:hash.keySet()){
            if(hash.get(key) !=0) return key;
        }
        return "";
    }

}
