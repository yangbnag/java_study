package datastructure.chap06.bubble;

public class K_번째수_프로그래머스_42748 {

   /* class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = {};
            return answer;
        }
    }
*/
    public static void main(String[] args) {

        int array[] = {1,5,2,6,3,7,4};
        int commad[] = {2,5,3};

        // 재정렬시킬 배열 생성
        int[] temp = new int[commad[1]-commad[0]+1];


        int startNum = commad[0]-1;
        // 배열 삭제하기
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[startNum++];
            System.out.println(temp[i]);
        }




    }
}
