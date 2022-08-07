package Ejercicio1;
public class Test {

	public static void main(String[] args) {
        BTree<String, String> st = new BTree<String, String>();

        st.put("www.cs.princeton.edu", "128.112.136.11");
        st.put("www.cs.princeton.edu", "128.112.136.12");
        st.put("www.cs.princeton.edu", "128.112.136.10");
        st.put("www.simpsons.com", "209.052.165.60");
        st.put("www.simpsons.com", "209.052.165.61");
        st.put("www.simpsons.com", "209.052.165.62");
        st.put("www.simpsons.com", "209.052.165.63");
        st.put("www.apple.com", "17.112.152.32");
        st.put("www.apple.com", "17.112.152.33");
        st.put("www.apple.com", "17.112.152.34");
        st.put("www.amazon.com", "207.171.182.16");
        st.put("www.amazon.com", "207.171.182.17");
        st.put("www.amazon.com", "207.171.182.18");
        st.put("www.ebay.com", "66.135.192.87");
        st.put("www.ebay.com", "66.135.192.88");
        st.put("www.ebay.com", "66.135.192.89");
        st.put("www.slashdot.org", "66.35.250.151");
        st.put("www.slashdot.org", "66.35.250.152");
        st.put("www.slashdot.org", "66.35.250.153");


        System.out.println("A continuación se obtiene los valores a partir de una llave proporcionada.");
        System.out.println("cs.princeton.edu:  " + st.get("www.cs.princeton.edu"));
        System.out.println("simpsons.com:      " + st.get("www.simpsons.com"));
        System.out.println("apple.com:         " + st.get("www.apple.com"));
        System.out.println("ebay.com:          " + st.get("www.ebay.com"));
        System.out.println("slashdot.org:          " + st.get("www.slashdot.org"));
        System.out.println();
        
    }
}
