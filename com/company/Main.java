package com.company;

public class Main {
        public static void main(String[] args){

            String str = "Hello";
            String str1 = "Hello";

            System.out.println(str + " " + str1);

            String st = new String("Hello");
            String st1 = new String("Hello");
          //  System.out.println(st);

            //str = str + "bye";
            //st1 = st1 + "bye";

            //System.out.println(str + " " + st1);
           // System.out.println(str.length());

            System.out.println(st1==st ); //Compares address
            System.out.println(st1.equals(st)); //Compares content


            String x = "abcdef";
            System.out.println(x.charAt(1)); //Prints index
            System.out.println(x.substring(2, 5));
            System.out.println(x.substring(2));

            System.out.println(str.concat(x));

            String s2 = "xbz";

            if(x.compareTo(s2)>0) {
                System.out.println(x.compareTo(x));
            }
            else {
                System.out.println(s2);
            }

            String s3 = "hello";
            System.out.println(s3 + (10 + 40));
        }
    }