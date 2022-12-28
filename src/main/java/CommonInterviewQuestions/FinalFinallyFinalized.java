package CommonInterviewQuestions;

public class FinalFinallyFinalized {
    public static void main(String[] args) {
    /****************************** FINAL keyword in Variable **********************/
        final int constant = 7;
        System.out.println("The final constant is " + constant);
        // constant = 10; // Once variable is initialized to final value it cannot be changed
    }

    /********************** FINAL keyword in Method **********************/
    final public void finalClass() {
        System.out.println("I am not in child Class");

    }
    public void theClass() {
        System.out.println("I am accessible in child Class");
    }

    class ChildClass extends FinalFinallyFinalized{
        @Override
        public void theClass() {
            super.theClass();
        }

        // 'finalClass()' cannot override 'finalClass()' in 'CommonInterviewQuestions.FinalFinallyFinalized'; overridden method is final
//        @Override
//        public void finalClass() {
//            super.finalClass();
//        }
    }

    /********************** FINAL keyword in Class **********************/

    final class FinalClass {

    }

    // Cannot inherit from final
//    class ExtendFinalClass extends FinalClass {
//
//    }

}
