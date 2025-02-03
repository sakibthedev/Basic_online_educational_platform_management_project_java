package Classes;

import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import Frame.*;

public class Account implements IAccountOperations {
    
    private String name;
    private String phn;
    private String email;
    private String password;
    private String Cpass;
    
    File file;
    FileWriter fwrite;
    
    Scanner sc;
    
    public Account() {
        
    }
    
    public Account(String name, String phn, String email, String password, String Cpass) {
        this.name = name;
        this.phn = phn;
        this.email = email;
        this.password = password;
        this.Cpass = Cpass;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPhone(String phn) {
        this.phn = phn;
    }
    
    public String getPhone() {
        return phn;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setConfirmPassword(String Cpass) {
        this.Cpass = Cpass;
    }
    
    public String getConfirmPassword() {
        return Cpass;
    }
    
   
    public void addAccount() {
        try {
            file = new File(".\\Datas\\Data.txt");
            file.createNewFile();
            
            fwrite = new FileWriter(file, true);
            
            fwrite.write(getName() + "\t");
            fwrite.write(getPhone() + "\t");
            fwrite.write(getEmail() + "\t");
            fwrite.write(getPassword() + "\n");
            
            fwrite.flush();
            fwrite.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    
    public boolean checkAccount(String email, String password) {
        boolean flag = false;
        file = new File(".\\Datas\\Data.txt");
        
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                
                if (value[2].equals(email) && value[3].equals(password)) {
                    flag = true;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return flag;
    }
}
