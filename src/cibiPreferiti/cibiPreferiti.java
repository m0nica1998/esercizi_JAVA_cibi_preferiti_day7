package cibiPreferiti;

public class cibiPreferiti {
 public static void main(String[] args) {
	 /*"pizza", "sushi", "lasagna", "insalata", "pane"
 
stampa a schermo  la lunghezza della lista di cibi preferiti
 
mostra a schermo il cibo in prima posizione
 
mostra a schermo il cibo all'ultima posizione
 
mostra a schermo il cibo che sta al centro
  */
	 
	 String[] cibiPreferiti = {"pizza", "sushi", "lasagna", "insalata", "pane"};
	 System.out.println(cibiPreferiti.length);
	 System.out.println(cibiPreferiti[0]);
	 System.out.println(cibiPreferiti[(cibiPreferiti.length)-1]);
	 if((cibiPreferiti.length) % 2 == 0) {
		 
		 System.out.println("Non esiste un elemento centrale");
	 } else {
		 int n = (cibiPreferiti.length - 1);
		 int m = (n / 2);
		 System.out.println(n + " " + m);
		int indiceElemCentrale = m;
		System.out.println(cibiPreferiti[indiceElemCentrale]);
	 }
	 
 }
}
