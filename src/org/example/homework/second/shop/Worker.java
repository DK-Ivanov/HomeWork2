package org.example.homework.second.shop;

public class Worker {
    String name;
    int age;
    char sex;
    Item[] itemList;

    Worker(String name, int age, char sex, Item[] itemList) {
        this.name = name;
        this. age = age;
        this.sex = sex;
        this.itemList = new Item[itemList.length];
        for (int i = 0; i < itemList.length; i++) {
            this.itemList[i] = itemList[i];
        }
    }

    public void BraggingAboutThings() {
        for (int i = 0; i < itemList.length; i++) {
            System.out.println(name + ": смотрите какая у меня вещь - " + itemList[i].name);
        }
    }
}
