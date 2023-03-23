package com.Factory;

public interface Factory {
        void hasLegs();
        void sitOn();
    }
    abstract class Chairs implements Factory{
    }
    abstract class Couch implements Factory{
    }
    abstract class Tables implements Factory{
    }

    abstract class VictorianChair extends Chairs{
        public void hasLegs(){
            System.out.println("Yes :)");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }

    abstract class ModernChair extends Chairs{
        public void hasLegs(){
            System.out.println("No :(");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }
    abstract class ArtDecoChair extends Chairs {
        public void hasLegs() {
            System.out.println("No :(");
        }

        public void sitOn() {
            System.out.println("Yes :)");
        }
    }

    abstract class VictorianCouch extends Couch{
        public void hasLegs(){
            System.out.println("No :(");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }

    abstract class ModernCouch extends Couch{
        public void hasLegs(){
            System.out.println("No :(");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }
    abstract class ArtDecoCouch extends Couch{
        public void hasLegs() {
            System.out.println("No :(");
        }

        public void sitOn() {
            System.out.println("Yes :)");
        }
    }

    abstract class VictorianTable extends Tables{
        public void hasLegs(){
            System.out.println("Yes :)");
        }
        public void sitOn(){
            System.out.println();
        }
    }

    abstract class ModernTable extends Tables{
        public void hasLegs(){
            System.out.println("Yes :)");
        }
        public void sitOn(){
            System.out.println("No :(");
        }
    }
    abstract class ArtDecoTable extends Tables {
        public void hasLegs() {
            System.out.println("No :(");
        }

        public void sitOn() {
            System.out.println("No :(");
        }
    }

   class Main {
       public static void main(String[] args) {
           ArtDecoTable adt = new ArtDecoTable(){
           };
           System.out.println("Art Deco Style selected");
           System.out.println("You choosed table");
           System.out.println("The product has legs?");
           adt.hasLegs();
           System.out.println("Can you sit in that?");
           adt.sitOn();
       }
   }

