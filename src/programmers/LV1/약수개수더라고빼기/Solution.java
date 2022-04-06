package programmers.LV1.약수개수더라고빼기;

public class Solution {
    public int solution(int left, int right) {

        int answer = 0;


        for (int i = left; i <= right; i++) {

            if (i == 1) {
                answer -= 1;
            } else {
                if (findByMesure(i) % 2 == 0) {
                    answer += findByMesure(i);
                }
                else{
                    answer -= findByMesure(i);
                }
            }

        }

        return answer;
    }

    int findByMesure(int a) {
        int count = 0;
        for (int i = 1; i < a / 2; i++) {
            if (a % i == 0) {
                count += 2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int a = 13;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
