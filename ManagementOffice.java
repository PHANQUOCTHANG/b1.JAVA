package Baitap1;

import java.util.ArrayList;
import java.util.List;

public class ManagementOffice {
    private List<Office> list ;

    public ManagementOffice() {
        this.list = new ArrayList<>() ;
    }

    public void add(Office office) {
        this.list.add(office) ;
    }
    public void search (String name) {
        boolean check = false ;
        for (Office office : this.list) {
            if (office.getName().equals(name)) {
                check = true ;
                System.out.println(office);
            }
        }
        if (!check) System.out.println("Not Found !");
    }

    public void Out () {
        for (Office office : this.list) {
            System.out.println(office);
        }
    }

}
