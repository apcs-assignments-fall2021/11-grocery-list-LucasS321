public class GroceryList {
    private String[] arr;
    private int itemnum = 0;
    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        arr = new String[10];
    }

    // Adds an item to the grocery list
    public void add(String item) {
        arr[itemnum] = item;
        itemnum+=1;
    }

    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        for (int x = 0; x < 10; x++) {
            if (arr[x] == item) {
                arr[x] = null;
                itemnum -= 1;
                for (int i = x + 1; i < 10; i++) {
                    arr[i - 1] = arr[i];
                }
            }
        }
    }

    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {
        String str = "Grocery List: ";
        for (String x: arr) {
            if (x != null) {
                str += x+", ";
            }
        }
        return str.substring(0, str.length()-1);
    }
}
