public class Iterator {
    
    static class MyIterator {
        private int[] array;
        private int index = 0;
        private int size;

        public MyIterator(int[] array) {
            this.array = array;
            this.index = 0;
            this.size = array.length;
        }

        public boolean hasNext() {
            return index < size;
        }

        public int getNext() {
            return array[index++];
        }
    }

    public static void main(String[] args) {
        var testArray = new int[] { 10, 22, -3, 4, 100 };
        var it = new MyIterator(testArray);

        while (it.hasNext()) {
            System.out.println(it.getNext());
        }
    }
}