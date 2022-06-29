package com.ad.homework04;

import com.ad.homework04.impl.SimperShopman;
import com.ad.homework04.interfaces.Customer;
import com.ad.homework04.interfaces.Shopman;
import com.ad.homework04.interfaces.ShoppingCart;
import com.ad.homework04.interfaces.SuperMarket;

import static com.ad.homework04.util.ShoppingUtil.*;

public class ShoppingMain {
    public static void main(String[] args) {
        SuperMarket superMarket=creatSuperMarket();
        Shopman shopman=new SimperShopman(superMarket);

        boolean open=true;
        while (open){
            new ShoppingTask(shopman).executeTask();
            output("是否继续营业？(Yes)");
            open = ! input().next().trim().equalsIgnoreCase("no");
        }

        superMarket.dailyReport();
    }}

        class ShoppingTask {

            private Shopman Shopman;

             public ShoppingTask(Shopman shopman) {
                this.Shopman = shopman;
            }
            public void executeTask() {
                Customer customer = customer(true);

                Shopman.serveCustomer(customer);

            }
        }


