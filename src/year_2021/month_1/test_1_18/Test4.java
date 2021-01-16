package year_2021.month_1.test_1_18;

public class Test4 {
    public static void main(String[] args) {

        int[][] a = {
                {1, 28, 41, 22, 25, 79, 4},
                {39, 20, 10, 17, 19, 18, 8},
                {21, 4, 13, 12, 9, 29, 19},
                {58, 1, 20, 5, 8, 16, 9},
                {5, 6, 15, 2, 39, 8, 29},
                {39, 7, 17, 5, 4, 49, 5},
                {74, 46, 8, 11, 25, 2, 11}
        };
        System.out.println(new Test4().solution(a, 19 , 6));
    }

    public int solution(int[][] maps, int p, int r) {
        int answer = -1;

        for(int i=0; i < maps[i].length; i ++) {
            for(int j =0; j < maps.length; j ++) {
                int result = attack(maps, p,r,i,j);
                if(answer < result)
                    answer = result;
            }
        }


        return answer;
    }

    public int attack (int[][] maps, int p, int r, int x, int y) {
        int cnt = 0;
        int maxOfMapX = maps[0].length;
        int maxOfMapY = maps.length;
        int maxOfX = x + (r / 2) - 1;
        int maxOfY = y + (r / 2) - 1;

        int minXR = Math.max(0, y - (r / 2) );
        int minYR = Math.max(0, x - (r / 2));

        int resultX = Math.min(maxOfMapX, maxOfX);
        int resultY = Math.min(maxOfMapY, maxOfY);

        for(int i = minYR; i< resultY; i ++) {
            for(int j = minXR ; j <resultX; j ++) {

                if(maps[y][x] < p) {
                    if(true) {
                        if(maps[y][x] < (float)p / 2)
                            cnt ++;

                    } else {
                        cnt ++;
                    }
                }

            }
        }

        return cnt;
    }

    public int[][] box(int[][] maps , int r) {

        return null;
    }
}
