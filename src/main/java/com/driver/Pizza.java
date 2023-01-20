package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int countChee =0;
    int countTop =0;
    int countTake =0;

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

        return price;
    }

    public void addExtraCheese(){
        // your code goes here
        countChee++;
        if(countChee==1){
            price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        countTop++;
        if(isVeg){
            price+=70;
        }
        else{
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        countTake++;
        if(countTake==1){
            price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        String out="";
        if(isVeg){
            out ="Base Price Of The Pizza: 300"+"\n";
        }
        else{
            out ="Base Price Of The Pizza: 400"+"\n";
        }

        if(countChee>0){
            out+="Extra Cheese Added: 80"+"\n";

        }
        if(countTop>0){
            if(isVeg){
                out+="Extra Toppings Added: 70"+"\n";
            }
            else{
                out+="Extra Toppings Added: 120"+"\n";
            }
        }
        if(countTake>0){
            out+="Paperbag Added: 20"+"\n";
        }
        bill = out+"Total Price: "+price+"\n";
        return this.bill;
    }
}
