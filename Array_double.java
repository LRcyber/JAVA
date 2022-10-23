import java.util.Scanner;
  

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int numAlunos =5;
    double[]notaAlunos= new double [numAlunos];

    for (int i=0; i<numAlunos; i++){
      System.out.println("Digite a nota do aluno:"+ (i+1));
      notaAlunos[i] = input.nextDouble();
  }
      
    }
    
}