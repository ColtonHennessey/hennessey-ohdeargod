/**
 * @author Colton Hennessey
 */
public class PartTimeStudent extends Student
{
   private int numCourses;

   public PartTimeStudent (int numCourses)
   {
      this.numCourses = numCourses;
   }

   public int getNumCourses ()
   {
      return numCourses;
   }

   public void setNumCourses (int numCourses)
   {
      this.numCourses = numCourses;
   }


}
