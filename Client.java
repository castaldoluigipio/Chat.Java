import java.util.Scanner;
public class Client{
    Scanner A=new Scanner(System.in);
    Server S=new Server();
    
    public int close=0;
    public String stampaC;
    public String client;
    public String indirizzo;
    public String porta;
    
     public void indirizzamento(){
        System.out.println("Creazione del socket");
        System.out.println("Il client specifica l'indirizzo IP del server e il numero di porta");
        System.out.println("Inserire indirizzo IP");
        indirizzo=A.nextLine();
        System.out.println("Inserire porta");
        porta=A.nextLine();
        }
     
       public void connect(){
        System.out.println("Il client inizia la comunicazione attivando 3-way handshake\n");
    }
       
       public void comunicazione(){
        System.out.printf("Inserisci messaggio\n");
        client=A.nextLine();
        System.out.println("Invio del messaggio al server");
    }
       
       public void close(){      
         System.out.println("Il client chiude la comunicazione\n");
       }
     }
