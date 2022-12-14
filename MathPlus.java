public class MathPlus {
    //The function returns the value of the factorial of a number in the range from 1 to 20
    public static long Factorial(int number){
        long out = 1;
        for (long i = 1; i <= number; i++) {
            out *= i;
        }
        return out;
    }
    //The function returns the value of the subfactorial of a number in the range from 1 to 20
    public static float SubFactorial(int number){return Factorial(number) / (float)Math.E ;}
    //The function returns the value of the double factorial of a number in the range from 1 to 40
    public static long DoubleFactorial(int number){
    long out = 1;
    if(number % 2 == 0){
        for (int i = 2; i <= number; i+= 2) {
            out *=i;
        }
    }
    if (number % 2 !=0){
        for (int i = 1; i <= number ; i+= 2) {
            out *=i;
        }
    }
    return out;
    }
    //The function returns the root of any power
    public static double root(double number, float pow){
        double out = Math.pow(number, 1/pow);
        return out;}

    public static float min(float[] array){
        float min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static long min(long[] array){
        long min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static float max(float[] array){
        float max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static long max(long[] array){
        long max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
