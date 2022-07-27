import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int size = arr.length;
        int[] newArr = new int[size+1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần chèn: ");
        int num = scanner.nextInt();
        System.out.println("Nhập vào vị trí chèn: ");
        int index = scanner.nextInt();
        if(index<=-1||index>= arr.length){
            System.out.println("Vị trí cần chèn không đúng");
        }
        for(int i =0; i< newArr.length;i++){
            if (i<index){
                newArr[i]=arr[i];
            }else if (i==index){
                newArr[i]=num;
            }else {
                newArr[i]=arr[i-1];
            }
        }
        for (int item:
                newArr) {
            System.out.print(item+"\t");
        }
    }
}

