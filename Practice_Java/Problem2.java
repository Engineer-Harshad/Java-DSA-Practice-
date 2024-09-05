package harshad;
class Sammple{
    int a;
    public int Input(){
java.util.Scanner sc = new java.util.Scanner(System.in);
int a = sc.nextInt();
return a;
    }
}
class Sample2 extends Sammple{
    public void Prinnt(){
if(a==5){
System.out.println("Hello I am the superhero");
    }
    }
}
public class Problem2 {
public static void main(String[] args){
Sample2 s = new Sample2();
s.Input();
s.Prinnt();
    }
}
