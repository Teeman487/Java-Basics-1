package DefaultPackage;
// Java Control Statements
// Conditional Statements(selection statements)-->if else, Nested, switch case
// Loops /Iterative Statements: loop is a set of statemnts can be repeated times based on a condition
// Jump statements : break, continue
public class Test2 {
    public static void main(String[] args) {
        //switch case
       /*// switch (expression)
        {
            //case <condition1>: stateents; break;
            //case <condition2>: stateents; break;
            //case <condition3>: stateents; break;
            default: statements;*/
        int day =3;
        switch (day)
        {
            case 1:
                System.out.println("Sunday"); break;
            case 2:
                System.out.println("Monday"); break;
            case 3:
                System.out.println("Tuesday"); break;
            case 4:
                System.out.println("Wednesday"); break;
            case 5:
                System.out.println("Thursday"); break;
            case 6:
                System.out.println("Friday"); break;
            case 7:
                System.out.println("Saturday"); break;
            default:
                System.out.println("Invalid week number");
        }
        //Loop
        //while, do while, for loop

//        // while(condition)
//        {
//            statements;
//        }
       // int i=1;
        /*while (i<=10)
        {
            System.out.println(i);
            i++; // 1 2 3 4 5 6 7 8 9 10
        */
/* int i =2;
       while (i<=10) {
    System.out.println(i);
    i+=2; // 2+2, 4+2....2 4 6 8 10
    }*/
        //decrement
        /*int i =10;
        while (i>0) {
            System.out.println(i);
            i--;//i-- is i=i-1 // 10-1, 9-1....2 4 6 8 10
        }*/

        /*int b=20;
        //b=b-1;
        b--;*/

        // do while
        /*do {
            // statements
        } while (condition);*/

        /*int i =1;
            do { // will not verify any condition
                System.out.println(i); //1 2 3... 10
                i++;
            }while (i<=10);*/

 /*int i =1;
       while (i<=10) {
    System.out.println(i);
    i++; // 1 2 ... 10
    }*/

       /* int i =20;
            do { // will not verify any condition
                System.out.println(i); // 20
                i++; // i = i+1
            }while (i<=10);//1 2 3... 10*/

         /*int i =20;
            do { // will not verify any condition; do while; statement code will execute at least once; condition is checked at the second round
                System.out.println(i); // 20
                i++; // i = i+1
            }while (i<=10);//1 2 3... 10*/

        /*int i =20;
       while (i<=10) { // condition is checked at first round | used when max liit is not known
    System.out.println(i);
    i++; // 1 2 ... 10
    }*/
        // for loop // It will reduce the code | used when max limit is known
        //initiization, condition, inc/dec
        /*for (int i=10; i>0 ; i-=3)// 10>0; i-- is i=i-1,i=9
        {
            System.out.println(i); // 10 9 8...1

        }*/
        /*for (int i=0; i<4 ; i-=1)// 10>0; i-- is i=i-1,i=9
        {
            System.out.println(i); // 10 9 8...1
        }*/
        // Jumping statement
        /*for(int i=1; i<=10; i++) // 1 2 3 ... 10
        {
            if(i==5)
            {
                break; // to exit from loop b4 reaching max comand
            }
            System.out.println(i); // 1 2 3 4
        }*/

        for(int i=1; i<=10; i++) // 1 2 3 ... 10
        {
            if(i==3 || i==5 || i==7)// skipping odd numbers
            {
                continue; // jump or skip to the next number
            }
            System.out.println(i); // 1 2 3 4
        }

    }
}
