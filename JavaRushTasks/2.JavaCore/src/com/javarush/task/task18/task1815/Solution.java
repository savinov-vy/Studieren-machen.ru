package com.javarush.task.task18.task1815;

import java.util.List;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        String HeaderText;
        private TableInterface original;

        public TableInterfaceWrapper(TableInterface original) {
            this.original = original;
        }

        public TableInterfaceWrapper() {
            super();
        }

        @Override
        public int hashCode() {
            return original.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return original.equals(obj);
        }

        @Override
        public String toString() {
            return original.toString();
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            original.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return original.getHeaderText().toUpperCase();

        }

        @Override
        public void setHeaderText(String newHeaderText) {
            original.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}