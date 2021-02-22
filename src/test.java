import java.util.ArrayList;

public class test {
        public static void main(String[] args){
            ProblemSet11 pst = new ProblemSet11();

            int[] iarr = {};
            ArrayList<Integer> test;
            ArrayList<Integer> idk = new ArrayList<>();
            idk.add(1);
            idk.add(3);
            idk.add(1);
            idk.add(4);

            ArrayList<Integer> idk2 = new ArrayList<>();
            idk.add(2);
            idk.add(4);


            boolean b = false;
            int i = 0;
            String s = "";
            int[] input1 = {1,2,3,4};
            int[] input2 = {2,3,4};
            String[] input3 = {};
            String[] input4 = {};
            int input5=2;
            int input6=11;

           test = pst.fix34(idk);
            System.out.printf("%s\n", test);
            // System.out.printf("%s\n", Arrays.toString(iarr));
        }
}
