import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class Main {
//    static StringBuilder sb = new StringBuilder();
//    static int N, M;
//    static int[] deps;
//    static boolean[] visit;
//
//    static void rec_func(int k) {
//        if (k == M) {
//            for (int i = 0; i < M; i++) sb.append(deps[i]).append(' ');
//            sb.append('\n');
//            return;
//        }
//
//        for (int i = 1; i <= N; i++) {
//            if(!visit[i]) {
//                visit[i] = true;
//                deps[k] = i;
//                rec_func(k + 1);
//                deps[k] = 0;
//                visit[i] = false;
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//        deps = new int[M];
//        visit = new boolean[N+1];
//        rec_func(0);
//        System.out.println(sb.toString());
//    }
//}

public class Main {
    static int N, M;
    static int[] depth;
    static boolean[] isVisited;
    static StringBuilder sb  = new StringBuilder();
    static void backTracking (int start, int x) {
        if(x == M) {
            for(int i=0; i<M; i++) {
                sb.append(depth[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=N; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                depth[x] = i;
                backTracking(i+1, x+1);
                isVisited[i] = false;
            }
         }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        depth= new int[M];
        isVisited = new boolean[N+1];
        backTracking(1,0);
        System.out.println(sb);
    }
}