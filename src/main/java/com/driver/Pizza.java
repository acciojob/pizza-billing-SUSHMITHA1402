package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    static int countChee =0;
    static int countTop =0;
    static int countTake =0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
        }
        else{
            price = 400;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        countChee++;
    }

    public void addExtraToppings(){
        // your code goes here
        countTop++;
    }

    public void addTakeaway(){
        // your code goes here
        countTake++;
    }

    public String getBill(){
        // your code goes here
        String out ="Base Price Of The Pizza: "+price+"\n";
        if(countChee>0){
            out+="Extra Cheese Added: 80"+"\n";
            price+=80;
        }
        if(countTop>0){
            if(isVeg){
                out+="Extra Toppings Added: 70"+"\n";
                price+=70;
            }
            else{
                out+="Extra Toppings Added: 120"+"\n";
                price+=120;
            }
        }
        if(countTake>0){
            out+="Paperbag Added: 20"+"\n";
            price+=20;
        }
        bill = out+"Total Price: "+price+"\n";
        return this.bill;
    }
}
