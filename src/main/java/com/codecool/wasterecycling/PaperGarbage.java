package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.List;

public class PaperGarbage extends Garbage {
        boolean squeezable;
        private static List<Garbage> paperContent = new ArrayList<>();

        public PaperGarbage(String name, boolean squeezable) {
                super(name);
                this.squeezable = squeezable;
        }

        public static List<Garbage> getPaperContent() {
                return paperContent;
        }

        public boolean isSqueezable() {
                return this.squeezable;
        }

        public boolean squeezable() {
                return this.squeezable ? true : true;
        }

        @Override
        public boolean disposable() {
                if (this.squeezable)
                     paperContent.add(this);
                return false;
        }
}
