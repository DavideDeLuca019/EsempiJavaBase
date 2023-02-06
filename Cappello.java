public class Cappello { 
	public static java.util.Scanner console = new java.util.Scanner(System.in);

	public static void main(String[] args){ 
		System.out.println("Inserire numero studenti: ");
		String answer = console.nextLine();
		int numStud = Integer.parseInt(answer);	
		
		for (int i = 0; i < numStud; i++) {
			System.out.println("Inserire Nome Studente: ");
			String nome = console.nextLine();
			System.out.println(hashName(nome));
			System.out.println(ranNum(0,3));
			int rNum = ranNum(0,3);
			int hName = hashName(nome);	
			if (rNum == 3) {
				hName = 3 + hName;
			} 
				System.out.println(hName);		
		}

	}
	
	public static int hashName(String name){
		String noSpace = name.replace(" ","").toLowerCase();
		int hash = 0;
		for(int i=0;i<noSpace.length();i++){
			hash= hash + noSpace.codePointAt(i) * (int)Math.pow(7, i);
		}
		return hash;
	}
	
	public static int ranNum(int min, int max) {
		return(int)((Math.random()*(max-min))+min);
	}
	
}

/*
public class Cappello { 
	public static java.util.Scanner console = new java.util.Scanner(System.in);

	public static void main(String[] args){ 
		System.out.println("Inserire numero studendi: ");
		String answer = console.nextLine();
		int numStud = Integer.parseInt(answer);	
		
		for (int i = 0; i < numStud; i++) {
			System.out.println("Inserire Nome Studente: ");
			String nome = console.nextLine();
			System.out.println(hashName(nome));
			System.out.println(ranNum(0,4));
			int rNum = ranNum(0,4);
			int hName = hashName(nome);	
			if (rNum == 3) {
				hName = 3 + hName;
			} 
				System.out.println(hName);		
		}

	}
	
	public static int hashName(String name){
		String noSpace = name.replace(" ","").toLowerCase();
		int hash = 0;
		for(int i=0;i<noSpace.length();i++){
			hash= hash + noSpace.codePointAt(i) * (int)Math.pow(7, i);
		}
		return hash;
	}
	
	public static int ranNum(int min, int max) {
		return(int)((Math.random()*(max-min))+min);
	}

	
}
*/