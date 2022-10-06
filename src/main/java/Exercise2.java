public class Exercise2 {


    public static void main(String[] args) {
        ExerciseInner exerciseInner = new ExerciseInner();
        int[] numbers = new int[]{4, 3, 2, 1};

        System.out.println(exerciseInner.search(numbers, 1));


    }


    static class ExerciseInner {


        private boolean search(int[] numbers, int x) {

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == x) {
                    return true;
                }
            }
            return false;
        }
        //Zlozonosc obliczeniowa f(n)=2n+1 O(n)
        //
    }

}
