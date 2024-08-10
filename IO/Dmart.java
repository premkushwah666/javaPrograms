/*import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> items;
    private double discountThreshold = 500;
    private double discount = 50;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }

        if (total >= 500 && total < 5000) {
            total -= 50;
        } else if (total >= 5000 && total < 10000) {
            total -= 1000;
        } else if (total >= 10000) {
            total -= 1500;
        }

        if (total > discountThreshold) {
            total -= discount;
        }

        return total;
    }

    public void clearCart() {
        items.clear();
    }

    public void displayCart() {
        System.out.println("Cart Contents:");
        for (Product item : items) {
            System.out.println(item.getName() + " - MRP " + item.getPrice());
        }
        double total = calculateTotal();
        System.out.println("Total Bill: MRP " + total);
    }
}

class Product1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Your order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(name, price);
                    cart.addItem(product);
                    System.out.println(name + " added to cart.");
                    break;

                case 2:
                    cart.displayCart();
                    break;

                case 3:
                    System.out.println("Your order:");
                    cart.displayCart();
                    System.out.println("done");
                    cart.clearCart();
                    break;

                case 4:
                    System.out.println("Fir aana ");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Your choice is invalid. Please select the right key.");
            }
        }
    }
}*/

























import java.util.*;

class Product{
    public static void main(String[] args)throws Exception{
        Scanner sc= new Scanner(System.in);
       int finalpr=0;
       int total;
       int amt=0;
       ArrayList<Object> a=new ArrayList();
       int stop=1;
       String typ="yup";
       while(stop==1)
        {
            System.out.println("Press 1 for add item");
            System.out.println("Press 2 for generate bill");
            System.out.println("Press 3 for exit");
          int choice = sc.nextInt();
           switch(choice)
           {
             case 1:
                System.out.println("enter product name");
                 String product=sc.next();
                System.out.println("enter price");
                  int price = sc.nextInt();
                System.out.println("enter dicount");
                 int dis = sc.nextInt(); 
                System.out.println("Enter discount typ\n1 for flat\n2 for percent");
                 int distyp = sc.nextInt(); 
                   switch(distyp)
                   {
                     case 1 : 
                     finalpr=price - dis;
                     typ="rs flat off";
                     break;
                     case 2:
                        typ="% off";
                      finalpr=price-(dis*price/100);
                      break; 
                   }
                System.out.println("enter qty");
                 int qty=sc.nextInt();
                 total=finalpr*qty;
                 productList p=new productList(product,price,dis,typ,finalpr,qty,total); 
                  amt=amt+p.getTotal(total);
                 a.add(p);
                 break;
              case 2:
                 System.out.println("================================================");
                for(Object ob : a)
                 {                  
                    System.out.println(ob);
                 } 
                 System.out.println("================================================");
                 System.out.println("                             Total amount = "+amt);
                 System.out.println("================================================");
              case 3:
              stop=0;
              break;

           }
        }
    }
}

  

class productList{
    String product;
    int price;
    int discount;
    String discounttyp;
    int finalpr;
    int qty;
    int total;
     productList(String product,int price,int discount,String discounttyp,int finalpr,int qty,int total)
    {
        this.product=product;
        this.price=price;
        this.discount=discount;
        this.discounttyp=discounttyp;
        this.finalpr=finalpr;
        this.qty=qty;
        this.total=total;
    }

    public int getTotal(int total)
    {
        return total;
    }

    public String toString()
    {
        return product+"\n   MRP:"+price+"rs    Dis.:"+discount+discounttyp+"   fin.pr: "+finalpr+"  QTY.: "+qty+"  Amt: "+total;
    }       
}