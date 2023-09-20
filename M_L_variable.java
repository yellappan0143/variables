// 1. IF DATA MEMBER AND FUNCTION MEMBER ASSIGNED BY "STATIC" AND "STATIC" ONLY ACCESING MEMBERNAME
package OOPS;

public class M_L_variable 
{
    // DATA MEMBER IS STATIC
    static int A = 500;        // STATIC PRIMITIVE VARIABLES
    static String Sub;        // NON-STATIC REFERENCE VARIABLES

    // FUNCTION MEMBER OR METHOD IS STATIC
    public static void test() 
    {
        int A =100;             // NON-STATIC LOCAL PRIMITIVE VARIABLES
        String Sub = "SQL";    // NON-STATIC LOCAL REFERENCE VARIABLES

        System.out.println(A);
        System.out.println(Sub);

        System.out.println(M_L_variable.A);    // CALLING FROM DATA MEMBER
        System.out.println(M_L_variable.Sub);  // CLASSNAME.MEMBERNAME
    }
  
    public static void main(String[] args) 
    {
        test();
    }
}
