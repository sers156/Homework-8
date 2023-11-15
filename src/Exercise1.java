public class Exercise1 {

    int sum() {
        int result = 0;
        System.out.println("Сумма всех чисел:" + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Сумма всех чисел:" + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Сумма всех чисел:" + result2);
        return result2;
    }

    int sum(int q, int w, int e) {
        int result3 = q + w + e;
        System.out.println("Сумма всех чисел:" + result3);
        return result3;
    }

    int sum(int r, int t, int y, int u) {
        int result4 = r + t + y + u;
        System.out.println("Сумма всех чисел:" + result4);
        return result4;
    }
}

class Exercise1Test{

    public static void main(String[] args) {
        Exercise1 ex =new Exercise1();
        ex.sum();
        ex.sum(3);
        ex.sum(2,5);
        ex.sum(2,9,6);
        ex.sum(9,7,4,1);

    }
}



