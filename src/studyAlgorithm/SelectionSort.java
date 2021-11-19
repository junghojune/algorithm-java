package studyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        // 최소값을 저장할 공간 배정
        int lowest;

        // 배열의 크기만큼 반복문을 돌릴 준비
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;

            // 두 수를 비교하면서 최소값 저장
            for (int index = stand + 1; index < dataList.size(); index++) {
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }

            // 순서대로 가장 적은 순서부터 저장
            Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            testData.add((int)(Math.random() * 100));
        }
        SelectionSort sSort = new SelectionSort();
        System.out.println(sSort.sort(testData));
    }
}
