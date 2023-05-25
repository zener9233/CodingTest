import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> st = new Stack<>();
        while(true)
        {
            String str[] =  br.readLine().split("");
            if(str.length == 1 && str[0].equals("."))
                break;

            int count = 0;
            for(int i = 0; i<str.length; i++)
            {
                if (str[i].equals("("))
                {
                    st.add("(");
                }
                else if (str[i].equals(")"))
                {
                    if (st.size() > 0)
                    {
                        if (st.peek().equals("("))
                            st.pop();
                        else
                        {
                            bw.write("no" + "\n");
                            count = 1;
                        break;
                        }
                    }
                    else
                    {
                        bw.write("no" + "\n");
                        count = 1;
                        break;
                    }

                }
                if (str[i].equals("["))
                {
                    st.add("[");
                }
                else if (str[i].equals("]"))
                {
                    if (st.size() > 0)
                    {
                        if (st.peek().equals("["))
                            st.pop();
                        else
                        {
                            bw.write("no" + "\n");
                            count = 1;
                            break;
                        }
                    }
                    else
                    {
                        bw.write("no" + "\n");
                        count = 1;
                        break;
                    }
                }
            }
            if(count == 0&&st.size() == 0)
                bw.write("yes"+"\n");
            else if(count == 0&&st.size() != 0)
                bw.write("no"+"\n");

            st.clear();
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
