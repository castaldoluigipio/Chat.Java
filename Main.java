import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner A=new Scanner(System.in);
        Server S=new Server();
        Client C=new Client();
        
        System.out.println("-->SERVER<--\n");
        S.creazionePorta();
        S.Listen();
        S.attesa();
        System.out.println("-->CLIENT<--\n");
        C.indirizzamento();
        C.connect();
        System.out.println("-->SERVER<--\n");
        S.creazioneSocket();
        S.Accept();
        System.out.println("-->CLIENT<--\n");
        C.comunicazione();
        C.stampaC=C.client;
        System.out.println("-->SERVER<--\n");
        S.comunicazione();
        S.stampaS=S.server;
        System.out.println("-->CLIENT<--\n");
        System.out.println("Il client vuole chiudere la comunicazione?Se Si,premere 1, altrimenti premere 0");
        C.close=A.nextInt();
        if(C.close==1){
        C.close();
        System.out.println("-->SERVER<--\n");
        S.close();
        System.out.printf("Messaggio:\nClient= %s\nServer= %s",C.stampaC,S.stampaS);
        }else{
        System.out.println("-->CLIENT<--\n");
        C.comunicazione();
        System.out.println("-->SERVER<--\n");
        S.comunicazione();  
        C.close();
        S.close();
        System.out.printf("Messaggio:\nClient= %s\nServer= %s\nClient= %s\nServer= %s\n",C.stampaC,S.stampaS,C.client,S.server);
        }
    }
}
