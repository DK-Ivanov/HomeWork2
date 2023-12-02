package org.example.homework.second.shop;

public class Shop {
    Worker[] workers;
    int indexesOfAvailableWorkers = 0;

    Shop(Worker[] workers) {
        this.workers = new Worker[workers.length];
        for (int i = 0; i < workers.length; i++) {
            this.workers[i] = workers[i];
        }
    }

    public void workersList() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].name);
        }
    }

}
