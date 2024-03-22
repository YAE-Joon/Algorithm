import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int n = Integer.parseInt(br.readLine());
       List<Integer> list =new ArrayList<>();
       list.add(0);
       list.add(1);
       list.add(1);
       if(n>=3) {
           for (int i = 3; i <= n; i++) {
               list.add(list.get(i - 1) + list.get(i - 2));
           }
       }
       bw.write(Integer.toString(list.get(n)));
       bw.flush();

    }


    }

