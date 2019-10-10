/**
 * 
 */
class SelectBox {
    int[] element = { 3, 4, 6, 1, 8, 2, 5, 4 };

    void select(int[] element) {
        for (int i = 0; i < element.length; i++) {

        }
    }

    int selectmax(int[] element) {
        int max = Integer.MIN_VALUE;
        int mark;
        for (int i = 0; i < element.length; i++) {
            max = comparison(max, element[i]);
            
        }
        return max;

    }

    int comparison(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

}

class xuanzhe {
    public static void main(String[] args) {
        int[] element = { 3, 4, 6, 1, 8, 2, 5, 4 };
        SelectBox s1 = new SelectBox();
        System.out.println(s1.selectmax(element));
    }
}