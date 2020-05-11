import java.util.Scanner;
public class Server{
    Scanner A=new Scanner(System.in);
    
    public int clientSocket=0;
    public String stampaS;
    public String server;
    public String serverPorta;
    public String address; 
    
    public void creazionePorta(){
        System.out.println("Creazione della porta e associazione indirizzo");
        System.out.println("Inserire indirizzo IP");
        address=A.nextLine();
        System.out.printf("Indirizzo:%s\n",address);
        System.out.println("Inserire porta");
        serverPorta=A.nextLine();
        System.out.printf("Porta:%s\n",serverPorta);
    }
    public void Listen(){
        System.out.println("Il server si pone in ascolto sulla porta");
    }
     public void creazioneSocket(){
        System.out.println("Una volta ricevuto la richiesta crea un socket");
    }
     public void attesa(){
        System.out.println("In attesa di una risposta da parte del client");
    }
      public void Accept(){
        System.out.println("Accetta la richiesta di comunicazione");
    }
       public void comunicazione(){
        System.out.printf("Inserisci messaggio\n");
        server=A.nextLine();
    }
       public void close(){      
         System.out.println("Il server chiude il socket client\n");
       }
}
