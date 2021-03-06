// SimpleTableModel.java
package com.jdojo.swing.component;

import javax.swing.table.AbstractTableModel;

public class SimpleTableModel extends AbstractTableModel {
    private final Object[][] data = {};
    private final String[] columnNames = {"ID", "Name", "Gender"};
    private final Class[] columnClass = {Integer.class, String.class, String.class};
    private final Object[][] rowData = new Object[][]{
        {100, "John Jacobs", "Male"},
        {101, "Barbara Gentry", "Female"}
    };

    public SimpleTableModel() {
    }

    @Override
    public int getRowCount() {
        return rowData.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        boolean isEditable = true;
        if (columnIndex == 0) {
            isEditable = false; // Make the ID column non-editable 
        }
        return isEditable;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rowData[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        rowData[rowIndex][columnIndex] = aValue;
    }
}
