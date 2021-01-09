package year_2020.month_11.test_2020_11_7;

import java.util.Scanner;

public class BackJun {

    private Scanner sc;

    private static final int NORTH = 0;
    private static final int EAST  = 1;
    private static final int SOUTH = 2;
    private static final int WEST  = 3;

    private static final int GROUND = 0;
    private static final int SEA    = 0;

    public static void main(String[] args) {
        System.out.println(new BackJun().game());
    }

    public int game(){
        sc = new Scanner(System.in);
        int[] map;
        int[] point;
        while(true){
            try {
                //map = Arrays.stream(sc.nextLine().split(" ")).mapToInt(i -> i.length()).toArray();
                map = new int[]{4, 4};
                if(map.length != 2){ System.out.println("다시 입력해주세요."); continue;}
                break;
            } catch (Exception e){
                System.out.println("다시 입력해주세요. 인자 2개");
                continue;
            }
        }

        while(true){
            try {
                //point = Arrays.stream(sc.nextLine().split(" ")).mapToInt(i -> i.length()).toArray();
                point = new int[]{1,1,0};
                if(point.length != 3) continue;
                break;
            } catch (Exception e){
                System.out.println("다시 입력해주세요. 인자 3개");
                continue;
            }
        }
        int[][] world = new int[map[0]][map[1]];
//        for(int i=0; i<map[0]; i++){
//            try{
//                int[] in = Arrays.stream(sc.nextLine().split(" ")).mapToInt(z -> z.length()).toArray();
//
//                if(in.length != map[1]) throw new Exception();
//                for(int j =0; j< in.length; j++){
//                    world[i][j] = in[j];
//                }
//            } catch (Exception e){
//                i --;
//                System.out.println("다시 입력해주세요. 인자 "+ map[1]+"개");
//                continue;
//            }
//        }
        world = new int[][]{
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };

        return start(map, point, world);
    }

    public int start(int[] map, int[] point, int[][] world){
        int answer = 0;
        long start = System.currentTimeMillis();

        int x = point[0];
        int y = point[1];
        int way = point[2];
        int count = 0;

        int[][] check = new int[world.length][world[0].length];
        for(int i=0; i<check.length;i++)
            for(int j=0; j<check[i].length;j++)
                check[i][j] = 0;
        int endCount =0;
        //로직 Start
        while(true){
            count ++;
            endCount ++;
            //90도 돌리기 && 무빙
            way = (way == 3 ? 0: way +1);
            if(check(x,y,way,world,check)) {
                endCount =0;
                if(way == NORTH){
                    y ++;
                }else if(way == EAST){
                    x --;
                }else if(way == SOUTH){
                    y --;
                }else if(way == WEST){
                    x ++;
                }
            }

            System.out.println("point "+x+" , "+y);
            if(endCount > 0){
                if(endCheckPosition(x,y,way,world,check)) break;
                else{
                    if(way == NORTH){
                        y --;
                    }else if(way == EAST){
                        x ++;
                    }else if(way == SOUTH){
                        y ++;
                    }else if(way == WEST){
                        x --;
                    }
                }
            }
        }
        //로직 END

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : "+ (end - start) /1000.0);
        return count;
    }

    // 진행 가능여부 체크
    public boolean check(int x,int y,int way,int[][] world,int[][] check){
        boolean result = false;

        try{
            if(way == NORTH){
                if(world[x][y+1] == 0 && check[x][y+1] == 0) {
                    check[x][y+1] = 1;
                    result = true;
                }
            }else if(way == EAST){
                if(world[x-1][y] == 0 && check[x-1][y] == 0){
                    check[x-1][y] = 1;
                    result = true;
                }
            }else if(way == SOUTH){
                if(world[x][y-1] == 0 && check[x][y-1] == 0) {
                    check[x][y-1] = 1;
                    result = true;
                }
            }else if(way == WEST){
                if(world[x+1][y] == 0 && check[x+1][y] == 0){
                    check[x+1][y] = 1;
                    result = true;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
        }

        return result;
    }

    public boolean endCheckPosition(int x, int y,int way, int[][] world,int[][] check){
        boolean result = false;
        boolean north = false;
        boolean east = false;
        boolean south = false;
        boolean west = false;

        try{ if(world[x][y+1] == 0) north = true; }catch (Exception e){}
        try{ if(world[x-1][y] == 0) east = true; }catch (Exception e){}
        try{ if(world[x][y-1] == 0) south = true; }catch (Exception e){}
        try{ if(world[x+1][y] == 0) west = true; }catch (Exception e){}

        if(way == NORTH){ if(world[x][y-1] == 1) result =true;}
        else if(way == EAST){if(world[x-1][y] == 1) result =true;}
        else if(way == SOUTH){if(world[x][y+1] == 1) result =true;}
        else if(way == WEST){if(world[x+1][y] == 1) result =true;}

        return result;
    }

}
