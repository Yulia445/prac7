public class Practice7 {

    int[] queue = new int[13]; 
    int head = 0;              
    int tail = 0;              

    public void add(int value) {
        if (tail == queue.length) {
            System.out.println("Черга переповнена!");
            return;
        }
        queue[tail] = value;
        tail++;
    }

    public int remove() {
        if (head == tail) {
            System.out.println("Черга порожня!");
            return -1;
        }
        int value = queue[head];
        head++;
        return value;
    }

    public int peek() {
        if (head == tail) {
            System.out.println("Черга порожня!");
            return -1;
        }
        return queue[head];
    }

    public int size() {
        return tail - head;
    }

    public String toString() {
        if (head == tail) {
            return "[]";
        }
        String result = "[";
        for (int i = head; i < tail; i++) {
            result += queue[i];
            if (i < tail - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        Practice7 queue = new Practice7();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Черга: " + queue.toString());
        System.out.println("Кількість елементів (size): " + queue.size());
        System.out.println("Перший елемент (peek): " + queue.peek());

        System.out.println("Видалили (remove): " + queue.remove());
        System.out.println("Черга після remove: " + queue);
        System.out.println("Нова кількість елементів: " + queue.size());
    }
}
