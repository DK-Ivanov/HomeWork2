package org.example.homework.second.shop;

public class Runner {
    public static void main(String[] args) {
        Item item1 = new Item("Молот", 1000);
        Item item2 = new Item("Отвертка", 50);
        Item item3 = new Item("Тетрадь", 30);
        Item item4 = new Item("Ручка", 10);
        Worker worker1 = new Worker("Василий", 30, 'М', new Item[]{item1, item2});
        Worker worker2 = new Worker("Марьяна", 25, 'Ж', new Item[]{item3, item4});
        Shop myShop = new Shop(new Worker[]{worker1, worker2});
        myShop.workersList();
        for (int i = 0; i < myShop.workers.length; i++) {
            myShop.workers[i].BraggingAboutThings();
        }

    }
}
