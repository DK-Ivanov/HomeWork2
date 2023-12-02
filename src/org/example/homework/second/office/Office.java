package org.example.homework.second.office;

public class Office {
    Boss boss;
    Manager manager;
    Secretary secretary;
    Guard guard;

    Office(Boss boss, Manager manager, Secretary secretary, Guard guard) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.guard = guard;
    }
    public void workingDay() {
        boss.customizeTheManager(manager.name);
        manager.shout();
        guard.askForAnAdvancePayment();
        secretary.request(boss.name, manager.name, guard.name);
    }

}
