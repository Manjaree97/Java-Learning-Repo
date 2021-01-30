package objectCreation;

import java.io.Serializable;

public class Associate implements Serializable {
    private int id;
    private String name;
    private boolean contractor;
    public static String company = "Cerner";

//    private Associate() {}
    public Associate() {}

    public Associate(int id, String name, boolean contractor) {
        this.id = id;
        this.name = name;
        this.contractor = contractor;
    }

    public String getName()  {  return name;   }
    public int getId()  { return id;  }
    public boolean getContractor()  { return this.contractor;  }
    public void setName(String name) { this.name = name; }
    public void setId(int id) {
        this.id = id;
    }
    public void setContractor(boolean contractor)  { this.contractor = contractor;  }

    public void display() {
        System.out.println("Name: "+this.name);
        System.out.println("Id: "+this.id);
        System.out.println("Permanent: "+this.contractor);
        System.out.println("Company: "+this.company);

    }

    public void changeCompany(String companyName) {
        Associate.company = companyName;
    }

}
