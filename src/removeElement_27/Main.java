package removeElement_27;

public class Main {
    public static void main(String[] args) {
        int[] case1 = {3,2,2,3};
        int[] case2 = {0,1,2,2,3,0,4,2};


        var solution = new Solution();

        System.out.println("First case, [3,2,2,3]: " + solution.removeElement(case1, 3));

        System.out.println("-----------------------------------");

        System.out.println("Second case, [0,1,2,2,3,0,4,2]: " + solution.removeElement(case2, 2));

    }
}


      /*
   3     [3,2,2,3] -> [2,2,_,_]  output 2

   2     [0,1,2,2,3,0,4,2] -> [0,1,4,0,3,_,_,_]  output 5

         */