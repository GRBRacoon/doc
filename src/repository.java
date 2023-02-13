import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class repository {

    private  static ArrayList<Data> data= new ArrayList<>();

    //private static HashMap<String ,String> db=new HashMap<>();
    public Optional<Data> search(String str) {
        return data.stream().filter(data->data.getName().equals(str)).findAny();
    }
    public void add(String name, String des){

        Data d=new Data(name,des);

        data.add(d);
    }
    public void change(String name, String des){
       search(name).get().setDes(des);
    }
    public void delete(String name){
        data.remove(name);
    }

    public void showList(){
       // System.out.println(data.get(2));


    }


    void line(){
        System.out.println("..........................");
    }

     repository() {
        while(true){
            line();
            System.out.println("잡학 doc");
            System.out.println("선택지를 고르세요");
            System.out.println("1.검색");
            System.out.println("2.추가");
            System.out.println("3.수정");
            System.out.println("4.삭제");
            System.out.println("3.종료");
            System.out.print(":");
            Scanner scanner = new Scanner(System.in);
            String in=scanner.next();


            if(in.equals("1")){
                line();
                System.out.println("검색어를 입력하세요.");
                System.out.print(":");
                String target= scanner.next();
                System.out.println(search(target).get().getDes());

            }
            else if(in.equals("2")){
                line();
                System.out.println("추가하려는 단어를 입력하세요.");
                System.out.print(":");
                String target=scanner.next();
                System.out.println("설명을 입력하세요.");
                System.out.print(":");
                String des=scanner.next();
                add(target,des);
                showList();
            }
            else if(in.equals("3")){
                line();
                System.out.println("수정하려는 단어를 입력하세요.");
                System.out.print(":");
                String target=scanner.next();
                System.out.println("내용을 새로 입력하세요.");
                System.out.print(":");
                String des= scanner.next();
                change(target,des);
            }
            else if(in.equals("4")){
                line();
                System.out.println("삭제하려는 단어를 입력하세요");
                System.out.print(":");
                String target=scanner.next();
                delete(target);
            }
            else if(in.equals("6")){
                line();
                System.out.println("종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }


    }
}
