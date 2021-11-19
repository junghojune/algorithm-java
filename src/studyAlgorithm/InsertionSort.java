package studyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        // 데이터 크기만큼 반복문을 돌려 정렬을 한다
        for (int index = 0; index < dataList.size() - 1; index++) {

            // 선택적으로 첫번째부터 하나씩 비교하여 가장작은값을 순서대로 정렬한다.
            for (int index2 = index + 1; index2 > 0; index2--) {
                if (dataList.get(index2) < dataList.get(index2 - 1)) {
                    Collections.swap(dataList, index2, index2 - 1);
                }
                // 만약 더이상 바꿀 곳이 없다면 반목문을 종료한다
                else {
                    break;
                }
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 100; index++) {
            testData.add((int)(Math.random() * 100));
        }
        InsertionSort iSort = new InsertionSort();
        System.out.println(iSort.sort(testData));
    }
}
