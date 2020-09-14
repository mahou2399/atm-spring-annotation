package csku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        ATM atm = context.getBean(ATM.class);

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();

//        String name = atm.validateCustomer(2, 2345);
//        System.out.println(name + " has " + atm.getBalance());
//        atm.withdraw(200);
//        System.out.println(name + " has " + atm.getBalance());
//
//        Bank bank = context.getBean(Bank.class);
    }
}
