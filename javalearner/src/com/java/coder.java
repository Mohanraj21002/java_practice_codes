package com.java;

public class coder{
    public static void main(String[] args) {

                int n = 5;      // Change this number as needed
                int fact = 1;   // Factorial starts with 1

                int i = 1;
                while(i <= n) {
                    fact = fact * i;
                    i++;
                }

                System.out.println("Factorial of " + n + " is: " + fact);
            }
    }

