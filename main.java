import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // takes the anti-sense strand as an input
    System.out.print("enter anti-sense strand: ");
    String dnaSequence = scanner.nextLine();
    String mRNA = "";
    char[] transcriptionSequence = dnaSequence.toCharArray();
    for (int i = 0; i < transcriptionSequence.length; i++) {
      switch (Character.toUpperCase(transcriptionSequence[i])) {
        case 'A':
          System.out.print('U');
          mRNA += 'U';
          break;
        case 'T':
          System.out.print('A');
          mRNA += 'A';
          break;
        case 'G':
          System.out.print('C');
          mRNA += 'C';
          break;
        case 'C':
          System.out.print('G');
          mRNA += 'G';
          break;
        default:
          if (Character.toUpperCase(transcriptionSequence[i]) == 'U') {
            System.out.println();
            System.out.println("DNA does not contain Uracil");
          } else {
            System.out.println();
            System.out.println("base pair not recognized at pair " + (i + 1));
          }
          return;
      }
    }
    scanner.close();
  }
}