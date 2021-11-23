package studyAlgorithm;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        if(dataList.size() <= 1){
            return dataList;
        }
        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        for(int index = 1 ; index< dataList.size(); index++){
            if(dataList.get(index) < pivot){
                leftArr.add(dataList.get(index));
            }else{
                rightArr.add(dataList.get(index));
            }
        }

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        mergedArr.addAll(this.sort(leftArr));
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(this.sort(rightArr));

        return mergedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }
        QuickSort qSort = new QuickSort();
        System.out.println(qSort.sort(testData));
    }
}
