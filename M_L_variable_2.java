// 2. IF DATA MEMBER AND FUNCTION MEMBER ASSIGNED BY "NON-STATIC" AND "STATIC" WITH THE HELP OF CREATING "OBJECT"

package OOPS;

public class M_L_variable_2 
{
    // DATA MEMBER IS NON-STATIC
     int A = 500;        // NON-STATIC PRIMITIVE VARIABLES
     String Sub;        // NON-STATIC REFERENCE VARIABLES

    // FUNCTION MEMBER OR METHOD IS STATIC
    public static void test() 
    {
        int A =100;             // NON-STATIC LOCAL PRIMITIVE VARIABLES
        String Sub = "SQL";    // NON-STATIC LOCAL REFERENCE VARIABLES

        System.out.println(A);
        System.out.println(Sub);

        System.out.println(new M_L_variable().A);    // ACCESSING THE DATA FORM DATA MEMBER 
        System.out.println(new M_L_variable().Sub);  //  NEW CLASSNAME().MEMBERNAME   
     }

    public static void main(String[] args) 
    {
        test();
    }
}
