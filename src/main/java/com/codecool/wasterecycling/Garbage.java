package com.codecool.wasterecycling;

public abstract class Garbage {
        public String name;

        public Garbage(String name) {
                this.name = name;
        }

        public String getName() {
                return name.toString();
        }
        public abstract boolean disposable();

}
