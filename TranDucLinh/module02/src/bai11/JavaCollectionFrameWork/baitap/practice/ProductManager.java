package bai11.JavaCollectionFrameWork.baitap.practice;

import java.util.*;

public class ProductManager {
    static List<Product> productList;
    static Scanner scanner = new Scanner(System.in);
    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "iphone", 100, "abc"));
        productList.add(new Product(2, "xaomi", 200, "cdssf"));
        productList.add(new Product(3, "samsung", 300, "agrg"));
        productList.add(new Product(4, "Redmix", 500, "sfgdf"));

    }
    public static void menu() {
        int choice = -1;
        do {
            System.out.println("Pls enter choice" +
                    "\n 1.Show all product"+
                    "\n 2. Add new product" +
                    "\n 3. Edit product"+
                    "\n 4. Search product"+
                    "\n 5. Delete product"+
                    "\n 6.Exit");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice){
                case 1 :
                    displayAllProduct();
                    break;
                case 2 :
                    addProduct();
                    break;
                case 3:
                    editProduct();
                case 4 :
                    searchProductByID();
                    break;
                case 5:
                    deleteProductByID();
                case 6:
                    System.exit(0);
            }

        } while (true);
    }
    public static void displayAllProduct () {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    public static void addProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }

        System.out.println("Pls enter name product");
        String nameProduct = scanner.nextLine();
        System.out.println("Pls enter price");
        double price = scanner.nextDouble();
        scanner.skip("\\R");
        System.out.println("Pls enter description");
        String description = scanner.nextLine();
        Product product = new Product(id, nameProduct, price, description);
        productList.add(product);
    }
    public static void deleteProductByID(){
        System.out.println("Pls enter id product");
        int id = scanner.nextInt();
        scanner.skip("\\R");
        for (int i = 0; i < productList.size() ; i++) {
            if(id == productList.get(i).getId()){
                productList.remove(i);
                break;
            }

        }
    }
    public static void editProduct(){
        System.out.println("Pls enter id product");
        int id = scanner.nextInt();
        scanner.skip("\\R") ;
        int choice =-1;
        for (int i = 0; i < productList.size() ; i++) {
            if (id == productList.get(i).getId()){
                System.out.println("Pls enter property edit" +
                        "\n 1.Name" +
                        "\n 2. Price" +
                        "\n 3.Description "+
                        "\n 4.Back to menu");

                choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 1:
                        System.out.println("Pls name");
                        String name = scanner.nextLine();
                        productList.get(i).setNameProduct(name);
                        break;
                    case 4:
                        menu();
                        break;
                    default:
                        System.out.println("Pls choice again");
                }
            }

        }

    }
    public static void searchProductByID(){
        System.out.println("Pls enter id product");
        int id = scanner.nextInt();
        scanner.skip("\\R");
        for (int i = 0; i < productList.size() ; i++) {
            if (id == productList.get(i).getId()) {
                System.out.println(i);
                break;
            }
        }
    }

}
