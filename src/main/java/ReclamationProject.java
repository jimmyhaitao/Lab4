/**
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */


public class ReclamationProject {
    /**
     *reclamation of a string a to b.
     *@param a is a string
     *@param b is a string
     *@param c is a string
     *@return return r
     */
    public static String reclamation(final String[] a, final String[] b, final String[] c) {
        if (a.length > b.length) {
            for (int l = 0; l < b.length; l++) {
                b[l] = a[l];

            }
        }
             String r = null;
            if (a.equals(b)) {
                r = " ";
            } else {
                r = " ";
            }
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - i; j > 0; j--) {
                for (int k = 0; k < b.length - j; k++) {
                    if (a.length > b.length && j > r.length() == true) {
                        r = a[j];
                    } else {
                        return r;
                    }
                        }
            }
        }
     return r;
     }
}
