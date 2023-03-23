package com.Bill;

import com.Bill.Client.Client;
import com.Bill.Client.ClientController;
import com.Bill.Client.ClientView;
import com.Bill.Product.Product;
import com.Bill.Product.ProductController;
import com.Bill.Product.ProductView;

public class MainBill {
    public static void main(String[] args) {

        Client model = retriveClientFromDatabase();
        
        ClientView view = new ClientView();

        ClientController controller = new ClientController(model, view);

        controller.updateView();

        controller.setClientName("Ricardo");
        System.out.println("\nClient Details after updating ");

        controller.updateView();


        Product modelP = retriveProductFromDatabase();
        
        ProductView viewP = new ProductView();

        ProductController controllerP = new ProductController(modelP, viewP);

        controllerP.updateViewP();

        controllerP.setProductName("Aguja");
        System.out.println("\nProduct Details after updating ");

        controllerP.updateViewP();
    
    }

    private static Product retriveProductFromDatabase(){
        Product Product = new Product();
        Product.setProductName("Hilo crochet");
        Product.setProductId("12837");
        Product.setProductPrice("12000");
        return Product;
    }
    private static Client retriveClientFromDatabase(){
        Client Client = new Client();
        Client.setClientName("Gabriel");
        Client.setClientId("36");
        Client.setClientPhone("41874981274");
        return Client;
    }
}
