package 브루트포스;

import java.util.Scanner;
class Person{
    int w;
    int h;
    int p;
    public Person(int w, int h) {
        this.w = w;
        this.h = h;
        this.p = 1;
    }
}
public class 덩치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        int N = sc.nextInt();
        Person [] people = new Person[N];
        for (int i = 0; i < people.length ; i++) {
            people[i] = new Person(sc.nextInt(),sc.nextInt());
        }
        for (int i = 0; i < people.length ; i++) {
            for (int j = 0; j < people.length ; j++) {
                if(i!=j && people[i].h<people[j].h && people[i].w<people[j].w){
                    people[i].p++;
                }
            }
            sb.append(people[i].p+" ");
        }
        System.out.println(sb);
    }

}
