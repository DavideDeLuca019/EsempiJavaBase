public class SortingHat {

   public static java.util.Scanner console = new java.util.Scanner(System.in);
    
   public static String ask(String prompt) {

          System.out.print(prompt + ": ");

          String answer = console.nextLine();
         
          return answer;

   }


 public static int askNumber(string prompt){

   System.out.print(prompt + ": ");

          String answer = console.nextLine();
          int n = Integer.parseInt(answer);
          return n;
   }
         



   public static int hashName (String name){
          String noSpace = name.replace(" ","").toLowerCase();
          int hash = 0
          for(int = 0; i < noSpace.length(); i++) {
                 hash = hash + noSpace.codePointAt(i) * Math.pow (7,i)
                  

          return hash;
     }
   }

  
   public static void main(String[] args){
 
          
          for(int i = 0; i < n +1; i++) {
            String s = ask("nome studente ");         //s --> nome studente
            hashName(s);
            
      } 

   }











//nextLine --> legge cosa abbiamo scritto

//stringhe sono immutabili

//dev --> Java --> Projects --> Javabase -->Hello_World



//Link Ricopiato
public class SortingHat{
	public static java.util.Scanner console = new java.util.Scanner(System.in);

	/*

-con input da tastiera per riempire l'array
-dovrà creare un array di stringhe con nome e cognome
-dovrà modificare l'array togliendo lo spazio e farle diventare minuscole
-per ogni nome deve eseguire un algoritmo che prenda il nome e genererà un numero intero

sum=c0*7^0 + c1*7^1 + c2*7^2 + c3*7^3...

-in maniera random una volta su quattro aggiungere il numero 3(se capita) al totale, questo per ogni persona
-dividere il numero totale per 4, se resto:
		0 = gryffindor
		1 = slytherin
		2 = hufflepuff
		3 = ravenclaw

-calcolare la grandezza massima in base a quanti siamo e tenere traccia delle assegnazioni, quando una casa raggiunge il numero massimo
verrà esclusa dalle assegnazioni quindi verrà assegnata alla casa dopo disponibile (quindi dobbiamo dividerci equamente)
-se ci dovessero essere deile persone restanti e le case sono tutte piene 
i restanti verranno assegnati a caso ad una casa tramite un numero casuale, (massimo 1 per casa)

*/
	}

	public static int hashName(String name){
		String noSpace = name.replace(" ","").toLowerCase();
		int hash = 0;
		for(int i=0;i<noSpace.length();i++){
			hash= hash + noSpace.codePointAt(i) * (int)Math.pow(7, i);
		}
		return hash;
	}



	public static void main(String[] args){
		String s = ask("ciao");
		System.out.println(s);
		hashName(s);
	}

}

/*

-con input da tastiera per riempire l'array
-dovrà creare un array di stringhe con nome e cognome
-dovrà modificare l'array togliendo lo spazio e farle diventare minuscole
-per ogni nome deve eseguire un algoritmo che prenda il nome e genererà un numero intero

sum=c0*7^0 + c1*7^1 + c2*7^2 + c3*7^3...

-in maniera random una volta su quattro aggiungere il numero 3(se capita) al totale, questo per ogni persona
-dividere il numero totale per 4, se resto:
		0 = gryffindor
		1 = slytherin
		2 = hufflepuff
		3 = ravenclaw

-colcolare la grandezza massima in base a quanti siamo e tenere traccia delle assegnazioni, quando una casa raggiunge il numero massimo
verrà esclusa dalle assegnazioni quindi verrà assegnata alla casa dopo disponibile (quindi dobbiamo dividerci equamente)
-se ci dovessero essere deile persone restanti e le case sono tutte piene 
i restanti verranno assegnati a caso ad una casa tramite un numero casuale, (massimo 1 per casa)

*