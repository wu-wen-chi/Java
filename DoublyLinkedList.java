package doublylinkedlist;
import java.io.*;
import java.util.Scanner;

class std{
        public int id=0;
        public String name="";
        public std next;
        public std prev;
    }

    class Doublelinklist{
        std tail,li,head,temp;
        Scanner aa=new Scanner(System.in);
        Doublelinklist(){
            li = new std();
            li.name="";
            li.next=li;
            li.prev=li;
            head=li;
        }

    //    新增
        public void add(){
            li=new std();
            System.out.println("請輸入ID：");
            li.id=aa.nextInt();
            System.out.println("請輸入姓名：");
            li.name=aa.next();

            tail=head;
            // 設定變數輔助鏈結
            temp=head.next;
            while((temp!=head)&&(temp.id>li.id)){
                tail=temp;
                // 下一個
                temp=temp.next;
            }
            li.prev=tail;
            li.next=temp;
            tail.next=li;
            temp.prev=li;
        }

        // 輸出結果
        public void output(){
            if(head.next==head){
                // 當head.next==head,沒有資料
                System.out.println("Npoe");
            }else{
                temp=head.next;
                while(temp!=head){
                    System.out.println("ID:"+temp.id);
                    System.out.println("Name:"+temp.name);
                    temp=temp.next;
                }
            }
        }
        
        public static void main(String[] args) {
            Doublelinklist list=new Doublelinklist();
            list.add();
            System.out.println("----------");
            list.output();
            System.out.println("----------");
            list.add();
            System.out.println("----------");
            list.output();
        }
    }