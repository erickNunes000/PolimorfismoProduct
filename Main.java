import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        ArrayList<Product> produtos = new ArrayList<Product>();
        Scanner in = new Scanner(System.in);
        int n=0;
        double price, customs;
        String opc = "", name, date;
        boolean flag = true;
        System.out.println("digite 0 para sair.");
        while(flag){
            
            System.out.print("Common, used or imported (c/u/i)? ");
            opc = in.next();
            switch(opc){
                case "c":
                    System.out.printf("Product #%d data:\n", n+1);
                    System.out.print("Name: ");
                    name = in.next();
                    System.out.print("Price: ");
                    price = in.nextDouble();
                    produtos.add(new Product(name, price));
                    n++;
                break;

                case "u":
                    System.out.printf("Product #%d data:\n", n);
                    System.out.print("Name: ");
                    name = in.next();
                    System.out.print("Price: ");
                    price = in.nextDouble();
                    System.out.print("Manufacture date: ");
                    date = in.next();
                    produtos.add(new UsedProduct(name, price, date));
                    n++;
                break;

                case "i":
                    System.out.printf("Product #%d data:\n", n);
                    System.out.print("Name: ");
                    name = in.next();
                    System.out.print("Price: ");
                    price = in.nextDouble();
                    System.out.print("Customs fee: ");
                    customs = in.nextDouble();
                    produtos.add(new ImportedProduct(name, price, customs));
                    n++;
                break;

                case "0":
                    System.out.println("PRICE TAGS:");
                    for(int i = 0; i < n; i++){
                        System.out.println(produtos.get(i).priceTag());
                    }
                    flag = false;
                break;

                default:
                    System.out.println("opcao invalida!");
                break;
            }
        }
    }
}
