import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] deps;
    static int N, M;

    static void rec_func(int k) {
        if (k == M) {
            for(int i=0; i<M;i++) sb.append(deps[i]).append(' ');
            sb.append('\n');
            return;
        } else{
            for(int i=1; i<=N;i++) {
                deps[k]=i;
                rec_func(k+1);
                deps[k] =0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        deps = new int[M];
        rec_func(0);
        System.out.println(sb.toString());
    }
}