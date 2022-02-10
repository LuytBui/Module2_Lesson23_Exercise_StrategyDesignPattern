public class Main {

    public static void main(String[] args) {
        ListSorter sortedList = new ListSorter();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.add("JavaScript");
        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
