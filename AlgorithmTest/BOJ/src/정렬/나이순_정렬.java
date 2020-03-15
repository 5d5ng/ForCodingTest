package 정렬;
import java.io.*;
import java.util.*;
class Client{
    int index ;
    int age;
    String name;

    public Client(int age, String name,int index) {

        this.age = age;
        this.name = name;
        this.index = index;
    }
}
public class 나이순_정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int index = 0;
        ArrayList<Client> list = new ArrayList<Client>();
        for (int i = 0; i < n; i++) {
            String [] input = br.readLine().split(" ");
            int inputAge = Integer.parseInt(input[0]);
            String inputName = input[1];
            list.add(new Client(inputAge,inputName,index++));
        }
        Comparator<Client> c = new Comparator<Client>(){
            @Override
            public int compare(Client c1,Client c2){
                if(c1.age > c2.age) return 1;
                else if(c1.age == c2.age){
                    if(c1.index>c2.index){
                        return 1;
                    }
                    else return 0;
                }
                return -1;
            }
        };
        list.sort(c);
        for(Client client:list){
            System.out.println(client.age+" "+client.name);
        }

    }
}
