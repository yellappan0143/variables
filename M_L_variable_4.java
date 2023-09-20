//4. IF DATA MEMBER AND FUNCTION MEMBER ASSIGNED BY "NON-STATIC" AND "NON-STATIC" WITH THE HELP OF CREATING "OBJECT"

package OOPS;

public class M_L_variable_4
{
    // DATA MEMBER IS NON-STATIC
      int A = 500;        // NON-STATIC PRIMITIVE VARIABLES
      String Sub;        // NON-STATIC REFERENCE VARIABLES

    // FUNCTION MEMBER OR METHOD IS NON-STATIC
    public  void test() 
    {
        int A =100;             // NON-STATIC LOCAL PRIMITIVE VARIABLES
        String Sub = "SQL";    // NON-STATIC LOCAL REFERENCE VARIABLES

        System.out.println(A);
        System.out.println(Sub);

        System.out.println(this.A);    // ACCESSING THE DATA FORM DATA MEMBER 
        System.out.println(this.Sub);  //  THIS.MEMBERNAME  
    }

    public static void main(String[] args) 
    { 
        // BY CREATING THE OBJECT IN MAIN METHOD IS NEW CLASSNAME.MEMBERNAME
        new M_L_variable().test();
    }
}
