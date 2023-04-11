
import java.util.Scanner;
import lab08.csc229_lab08.SinglyLinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dandr
 */
public class PrimeNumbersDemo {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        SinglyLinkedList primes = new SinglyLinkedList();
        SinglyLinkedList primesWith3 = new SinglyLinkedList();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.addNode(i);
                if (Integer.toString(i).contains("3")) {
                    primesWith3.addNode(i);
                }
            }
        }

        System.out.print("Prime numbers: ");
        primes.printList();

        System.out.print("Prime numbers with 3: ");
        primesWith3.printList();

        int sum = primesWith3.getSum();
        System.out.println("Sum of prime numbers with 3: " + sum);
    }
   }

