import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	double n1 = sc.nextDouble();
	double n2 = sc.nextDouble();
	double n3 = sc.nextDouble();
	double n4 = sc.nextDouble();
	
	
	double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
	if (media >= 7) {
		System.out.printf("Media: %.1f\n",media);
		System.out.println("Aluno aprovado.");
	
	}else if (media <= 4.9) {
		System.out.println("Aluno reprovado.");
	//entre 5.0 e 6.9
	}else {
		System.out.println("Aluno em exame.");
		double notaExame = sc.nextDouble();
		System.out.println("Nota do exame: %.1f\n",notaExame);
		double mediaFinal = (notaExame + media) / 2;
	if mediaFinal = sc.nextDouble();
	
		
	}
			
	
	sc.close();
	
	}
}
