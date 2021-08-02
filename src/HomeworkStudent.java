public class HomeworkStudent {

   public String name;
   public String surname;
   public String email;
   public int nick;
   public int index;

   public void info() {
       System.out.println("Nazywam się " + name + " " + surname);
   }

   public void giveLogin() {
       System.out.println("Loguję się za pomocą numeru: " + nick);
   }

   public void giveIndex() {
       System.out.println("Mój nr indeksu to: " + index);
   }

   public void giveEmail() {
       System.out.println("Mój email to: "+ email);
   }
}

