package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlasticGarbage extends Garbage {
        boolean clean;
        private static List<Garbage> plasticContent = new ArrayList<>();

        public PlasticGarbage(String name, boolean clean) {
                super(name);
                this.clean = clean;
        }

        public static List<Garbage> getPasticContent() {
                return plasticContent;
        }

        public boolean isClean() {
                return clean;
        }

        public boolean clean() {
                return this.clean ? true : true;
        }

        @Override
        public boolean disposable() {
                if (this.clean)
                        plasticContent.add(this);
                return false;
        }
}
