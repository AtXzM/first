import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;


public class m2 {
    static List<Integer> [] tree=new List[100];



    public static void main (String a[]) throws IOException{
        StreamTokenizer s=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        s.nextToken();

        int n=(int)s.nval;
        List<v> time=new ArrayList<v>();

        int count[]=new int[100001];
        for(int i=0;i<n;i++){
            s.nextToken();
            int st=(int)s.nval;
            s.nextToken();
            int end=(int)s.nval;
            time.add(new v(st,end));
        }
        Collections.sort(time,(v1,v2)->v1.start-v2.start);
        int max=0;
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            int num=time.get(i).end;
            while(low<high){
                int mid=low+high+1>>1;
                if(time.get(mid).start<=num)low=mid;
                else high=mid-1;
            }
            max=Math.max(max,high-i+1);
            count[max]++;

        }
        System.out.print(max+" "+count[max]);
    }
    static class v{
        int start,end;
        public v(int a,int b){
            this.start=a;
            this.end=b;
        }
        public int getStart(){
            return this.start;
        }
    }
}
