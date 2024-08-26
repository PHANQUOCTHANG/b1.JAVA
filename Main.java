package Baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ManagementOffice mng = new ManagementOffice() ;
        String name , sex , address ;
        int age ;
        int key = 1 ;
        while (key == 1) {
            System.out.println("1.Insert to Office.");
            System.out.println("2.Search to Office.");
            System.out.println("3.Print out Information.");
            System.out.println("Enter :");
            int a = new Scanner(System.in).nextInt() ;
            switch (a) {
                // insert to office .
                case 1 :
                    System.out.println("a.Insert to Engineer.");
                    System.out.println("c.Insert to Worker.");
                    System.out.println("b.Insert to Staff.");
                    System.out.println("Enter :");
                    String s = new Scanner(System.in).nextLine();
                    switch (s) {
                        case "a" :
                            System.out.println("Enter Name :");
                            name = sc.nextLine() ;
                            System.out.println("Enter Age :");
                            age = new Scanner(System.in).nextInt() ;
                            System.out.println("Enter Sex :");
                            sex = sc.nextLine() ;
                            System.out.println("Enter Address :");
                            address = sc.nextLine() ;
                            System.out.println("Enter Branch :");
                            String branch = sc.nextLine() ;
                            Office office = new Engineer(name,age,sex,address,branch) ;
                            mng.add(office);
                            break;
                        case "b":
                            System.out.println("Enter Name :");
                            name = sc.nextLine() ;
                            System.out.println("Enter Age :");
                            age = new Scanner(System.in).nextInt() ;
                            System.out.println("Enter Sex :");
                            sex = sc.nextLine() ;
                            System.out.println("Enter Address :");
                            address = sc.nextLine() ;
                            System.out.println("Enter Tier :");
                            int tier = new Scanner(System.in).nextInt() ;
                            Office office1 = new Worker(name,age,sex,address,tier) ;
                            mng.add(office1) ;
                            break ;
                        case "c" :
                            System.out.println("Enter Name :");
                            name = sc.nextLine() ;
                            System.out.println("Enter Age :");
                            age = new Scanner(System.in).nextInt() ;
                            System.out.println("Enter Sex :");
                            sex = sc.nextLine() ;
                            System.out.println("Enter Address :");
                            address = sc.nextLine() ;
                            System.out.println("Enter Work :") ;
                            String work = sc.nextLine() ;
                            Office office2 = new Staff(name,age,sex,address,work) ;
                            mng.add(office2);
                            break;
                        default:
                            System.out.println("Invalid");
                            break ;
                    }
                    break ;
                // search to office .
                case 2 :
                    System.out.println("Enter name :");
                    name = sc.nextLine() ;
                    mng.search(name);
                    break ;
                // print out information .
                case 3 :
                    System.out.println("Information of Office in List : ");
                    mng.Out();
                    break ;
                case 4 :
                    return ;
                default:
                    System.out.println("Invalid");
                    continue ;
            }
        }
    }

}
