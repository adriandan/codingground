class Persoana {
     
    // Proprietatile persoanei
    // variabile de instanta
    String nume;
    String prenume;
    int varsta;
     
     
    // O clasa poate avea
     
    // 1. Date
    // 2. Metode (subrutine)
}
 
 
public class Aplicatie {
 
    public static void main(String[] args) {
         
         
        // Cream un obiect de tip Persoana folosind clasa Persoana declarata mai sus
        // Persoana are urmatoarele proprietati/atribute:
        // Nume de tip string (caractere)
        // Prenume de tip string (caractere)
        // Varsta de tip integer (numar)
        // Instatiem obiectul Persoana
        Persoana persoana1 = new Persoana();  
        //Dam valori fiecarui atribut in parte
        persoana1.prenume = "Adrian";
        persoana1.nume    = "Dan";
        persoana1.varsta  = 41;
         
        // Cream o a doua persoana
        Persoana persoana2 = new Persoana();
        persoana2.nume    = "River";
        persoana2.prenume = "Song";
        persoana2.varsta  = 20;
         
        // printam atributele:
        // prenume si nume ale primei persoane
        System.out.println(persoana1.nume + ' ' + persoana1.prenume);
         
    }
 
}