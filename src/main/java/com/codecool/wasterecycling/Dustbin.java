package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.List;

public class Dustbin {
        private String color;
        List<Garbage> houseGarbageContent = new ArrayList<>();


        public Dustbin(String color) {

                setColor(color);
        }

        public String getColor() {
                return color;
        }

        private void setColor(String color) {
                this.color = color;
        }

        public void throwOutGarbage(Garbage garbage) {
                if (!garbage.disposable())
                        houseGarbageContent.add(garbage);
        }

//        public String getHouseWasteCount() {
//                var house = new ArrayList<>();
//                for (Garbage item : houseGarbageContent)
//                        house.add(item.getName());
//                return house.toString();
//        }
//
//        public String getPaperCount() {
//                var paper = new ArrayList<>();
//                for (Garbage item : houseGarbageContent)
//                        paper.add(item.getName());
//                return paper.toString();
//        }
//
//        public String getPlasticCount() {
//                var plastic = new ArrayList<>();
//                for (Garbage item : houseGarbageContent)
//                        plastic.add(item.getName());
//                return plastic.toString();
//        }

        @Override
        public String toString() {
                var house = new ArrayList<>();
                var paper = new ArrayList<>();
                var plastic = new ArrayList<>();
                StringBuilder stringHouse = new StringBuilder("Green Dustbin! House waste content: " + houseGarbageContent.size() + " item(s)" + "\n");
                StringBuilder stringPaper = new StringBuilder("Paper content: " + PaperGarbage.getPaperContent().size() + "item(s)" + "\n ");
                StringBuilder stringPlastic = new StringBuilder("Plastic content: " + PlasticGarbage.getPasticContent().size() + "item(s)" + "\n ");
                for (Garbage item : houseGarbageContent)
                        house.add(item.getName());
                for (int i = 0; i < house.size(); i++)
                        stringHouse.append(house.get(i)).append("nr.").append(i + 1).append(",");
                for (Garbage item : PlasticGarbage.getPasticContent())
                        paper.add(item.getName());
                for (int i = 0; i < paper.size(); i++)
                        stringPaper.append(house.get(i)).append("nr.").append(i + 1).append(",");
                for (Garbage item : PlasticGarbage.getPasticContent())
                        plastic.add(item.getName());
                for (int i = 0; i < plastic.size(); i++)
                        stringPlastic.append(plastic.get(i)).append("nr.").append(i + 1).append(",");
                return stringHouse.toString() + "\n" + stringPaper.toString() + "\n" + stringPlastic.toString();

        }
}
