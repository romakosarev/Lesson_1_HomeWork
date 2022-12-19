class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        if (n == 0) return;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[m];
        System.arraycopy(num1, 0, temp, 0, m);
        while (i < m && j < n) {
            if (temp[i] < num2[j]) {
                num1[k] = temp[i];
                i++;
            } else {
                num1[k] = num2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            num1[k] = temp[i];
            i++;
            k++;
        }
        while (j < n) {
            num1[k] = num2[j];
            j++;
            k++;
        }
    }
}