package com.logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
        private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(com.logger.App.class);
        public static void main( String[] args ) throws IOException {
        Scanner sc = new Scanner(System.in);
        Interest interest = new Interest();
        System.out.write("Enter amount\n".getBytes());
        interest.amount=sc.nextDouble();
        System.out.write("Enter the no. of years\n".getBytes());
        interest.t=sc.nextDouble();
        System.out.write("Enter the rate of interest\n".getBytes());
        interest.rate=sc.nextDouble();
        interest.simpleInterest();
        interest.compoundInterest();
    }
    }
