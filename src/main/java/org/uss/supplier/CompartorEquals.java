package org.uss.supplier;

import org.uss.supplier.model.Supplier;


public class CompartorEquals {
    public static void main(String[] args) {
        Supplier supplier = new Supplier("sara");
        Supplier supplier2 = new Supplier("sara");
        if(supplier.getResponse().equals(supplier2.getResponse())){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


        if(supplier.equals(supplier2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


        if(supplier==supplier2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
