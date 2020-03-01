package ifsa.org;

import exception.InvalidListException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberService {
    int max;
    public int biggestNumber(List<Integer> list) {
        if(list==null)throw new InvalidListException("La list ne peut pas etre null");

        int max =Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

}
