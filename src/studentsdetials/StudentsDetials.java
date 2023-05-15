/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentsdetials;

/**
 *
 * @author User
 */
public class StudentsDetials {

    /**
     * @param args the command line arguments gandu
     */
    public static void main(String[] args) {
        Students [] list = new list();
        Students s1 = new Students();
        s1.setname("Ankit");
        s1.setage("20");
        
        Students s2 = new Students();
        s2.setname("Aniket");
        s2.setage("15");
        
        Students s3 = new Students();
        s3.setname("Sachin");
        s3.setage("19");
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i=0;i<list.length;i++)
            System.out.println(list[i].getname + " " + list[i].getage);
        // TODO code application logic here
    }
    
}
