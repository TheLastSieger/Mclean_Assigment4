
public class Application {
   
	public static void main(String[] args) {
       
		String inFilename = "problem2.txt";
		String outFilename = "unique_word_counts.txt";
       
		DuplicateCounter dupeCount = new DuplicateCounter();
       
		dupeCount.count(inFilename);
        dupeCount.write(outFilename);
        
        System.out.println("Unique word count file updated");
   }
}
