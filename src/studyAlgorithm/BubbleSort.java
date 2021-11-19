package studyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        // 순서대로 정렬하기 위해 지속적으로 반복문 사용
        for (int index = 0; index < dataList.size() - 1; index++) {
            // boolean형을 사용하여 만약 자리정렬이 끝나면 바로 반복문을 종료
            boolean swap = false;
            
            // 두수를 비교하는 반복문
            for (int index2 = 0; index2 < dataList.size() - index - 1; index2++) {
                if (dataList.get(index2) > dataList.get(index2 + 1)) {
                    Collections.swap(dataList, index2, index2 + 1);
                    swap = true;
                }
            }
            
            // 정렬이 끝나 자리바꿈이 없다면 반복문 바로 종료
            if (swap == false) {
                break;
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        BubbleSort bSort = new BubbleSort();
        System.out.println(bSort.sort(testData));
    }
}
