import java.util.ArrayList;

public class ProblemSet11 {

    public static void main(String[] args) {

    }

    public ArrayList<String> fizzBuzz(int start, int end) {
        ArrayList<String> str = new ArrayList<>();
        int index = 0;

        if (start >= end) {
            return null;
        }

        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str.add(index, "FizzBuzz");
                index++;
            } else if (i % 3 == 0) {
                str.add(index, "Fizz");
                index++;
            } else if (i % 5 == 0) {
                str.add(index, "Buzz");
                index++;
            } else {
                String other = Integer.toString(i);
                str.add(index, other);
                index++;
            }
        }
        return str;
    } //DONE
    private String strALToString(ArrayList<String> aL) {
        try {
            if (aL.size() <= 0) return "null";

            String lString = "";

            int i = 1;
            for (String s : aL)
            {
                lString += s;

                if (i < aL.size())
                    lString += ", ";

                i++;
            }

            return lString;
        }
        catch (Exception e) {
            return "null";
        }
    }


    public int maxSpan(ArrayList<Integer> numbers) {
        int largest = 0, span;

        for(int i = 0; i < numbers.size(); i++) {

            span = 0;

            for(int j = i; j < numbers.size(); j++) {

                span++;

                if(numbers.get(i) == numbers.get(j)) {

                    if(span > largest) {

                        largest = span;

                    }

                }

            }

        }

        return largest;
        }//DONE



        public ArrayList<Integer> fix34(ArrayList<Integer> numbers) {

            int frequency1 = 0;
            int frequency2 = 0;
            int three = 3;
            int four = 4;
            int index = 1;


            if(numbers == null){
                return null;
            }
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == four) {
                    frequency1++;
                }
                else {
                    frequency1 = frequency1;
                }
            }
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == three) {
                    frequency2++;
                }
                else {
                    frequency2 = frequency2;
                }

                if(numbers.get(i) == four && frequency2 < 1){
                    return null;
                }
            }
            if(frequency1 != frequency2){
                return null;
            }
            for(int i = 0; i < numbers.size(); i++) {
                if (numbers.get(numbers.size() - 1) == three) {
                    return null;
                }
            }
            for(int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == three && numbers.get(i+1) == three) {
                    return null;
                }
            }

            for(int i = 0; i < numbers.size() - 1; i++) {
                if(numbers.get(i) == 3 && numbers.get(i+1) != 4) {
                    for(; numbers.get(index) != 4; index++);
                    int idk = numbers.get(index);
                           idk  = numbers.get(i+1);
                    int idk2 = numbers.get(i);
                            idk2= 4;
                }
            }
            return numbers;
        }


        public ArrayList<Integer> fix45(ArrayList<Integer> numbers) {
            int frequency1 = 0;
            int frequency2 = 0;
            int four = 4;
            int five = 5;

            if(numbers == null){
                return null;
            }
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == four) {
                    frequency1++;
                }
                else {
                    frequency1 = frequency1;
                }
            }
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == five) {
                    frequency2++;
                }
                else {
                    frequency2 = frequency2;
                }
            }
            if(frequency1 != frequency2){
                return null;
            }
            for(int i = 0; i <numbers.size(); i++) {
                if (numbers.get(numbers.size()-1) == four) {
                    return null;
                }
            }

            for(int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == four && numbers.get(i+1) == four) {
                    return null;
                }
            }

            int index = 0;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) == 4 && numbers.get(i+1) != 5) {
                    for (; !(numbers.get(index) == 5 && (index == 0 || index > 0 && numbers.get(index - 1) != 4)); index++) ;
                    int idk = numbers.get(index);
                    idk  = numbers.get(i+1);
                    int idk2 = numbers.get(i);
                    idk2= 5;
                }
            }

            return numbers;
        }

    public boolean canBalance(ArrayList<Integer> numbers) {
        int left = 0;
        int right = 0;

        if (numbers == null) {
            return false;
        }
        if (numbers.size() == 0) {
            return false;
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            left += numbers.get(i);
            right = numbers.get(numbers.size() - 1);
        }
        for (int i = numbers.size() - 2; i > 0; i--) {
            if (left == right)
                return true;
            left -= numbers.get(i);
            right += numbers.get(i);
        }
        return (left == right);

    }//DONE


        public boolean linearIn(ArrayList<Integer> outer, ArrayList<Integer> inner) {
        int in = 0;
        int out = 0;
        int count = 0;
            for(int i = 0; i < outer.size()-1; i++) {
                if (outer.get(i) > outer.get(i+1)) {
                    return false;
                }
            }
            for(int i = 0; i < inner.size()-1; i++){
                if(inner.get(i) > inner.get(i+1)){
                    return false;
                }
            }
            if(inner == null || outer == null){
                return false;
            }
            if(inner.size() == 0 || outer.size() == 0){
                return false;
            }

        while(in < inner.size() && out < outer.size()){
            if(inner.get(in).equals(outer.get(out))){
                count++;
                in++;
                out++;
            } else if (inner.get(in) > outer.get(out)) {
                out++;
            }
            else if(outer.get(out) > inner.get(in)){
                in++;
            }
        }
        return (count == inner.size());
        }//DONE


    public ArrayList<Integer> squareUp(int n) {
        try {
            if (n < 0) {
                return null;
            }

            int square = n * n;
            ArrayList<Integer> nums = new ArrayList<Integer>();

            for (int i = 0; i < square; i++)
                nums.add(0);

            if (n == 0)
                return nums;

            for (int i = n - 1; i < square; i = i + n)
                for (int j = i; j >= (i - (i / n)); j--)
                    nums.set(j, (i - j + 1));

            return nums;
        } catch (Exception e) {
            return null;
        }
    }//DONE

    public ArrayList<Integer> seriesUp(int n) {
        try {
            if (n < 0) return null;

            int series = (n * (n + 1)) / 2;
            ArrayList<Integer> nums = new ArrayList<Integer>();

            for (int i = 0; i < series; i++)
                nums.add(0);

            int k = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    int index = k + j;
                    nums.set(index, (j + 1));
                }
                k += (i + 1);
            }

            return nums;
        } catch (Exception e) {
            return null;
        }

    }//DONE

    public int maxMirror(ArrayList<Integer> numbers) {
      int len = numbers.size();
      int count = 0;
      int max = 0;

      for(int i = 0; i < len; i++) {
          count = 0;

          for (int j = len - 1; i + count < len && j > -1; j--) {
              if (numbers.get(i + count) == numbers.get(j)) {

                  count++;
              }
              else{
                  if(count > 0){
                      max = Math.max(count,max);
                      count = 0;
                  }
              }
          }
          max = Math.max(count,max);
      }
    return max;
    }//DONE

    public int countClumps(ArrayList<Integer> numbers) {
        int count = 0;
        boolean clump = false;

        if (numbers == null) {
            return -1;
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (clump) {
                if (numbers.get(i) != numbers.get(i + 1))
                    clump = false;
            } else if (numbers.get(i) == numbers.get(i + 1)) {
                clump = true;
                count++;
            }
        }
        return count;

    }//DONE
}
