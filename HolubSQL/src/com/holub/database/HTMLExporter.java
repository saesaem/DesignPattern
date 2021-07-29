package com.holub.database;

import java.io.*;
import java.util.*;

public class HTMLExporter implements Table.Exporter {
    private final Writer out;
    private int width;

    public HTMLExporter(Writer out) {
        this.out = out;
    }

    public void storeMetadata(String tableName, int width, int height, Iterator columnNames) throws IOException

    {
        this.width = width;
        out.write(tableName == null ? "<anonymous>" : tableName);
        out.write("\n");
        storeRow(columnNames); // comma separated list of columns ids
    }

    public void storeRow(Iterator data) throws IOException {
        int i = width;
        while (data.hasNext()) {
            Object datum = data.next();

            // Null columns are represented by an empty field
            // (two commas in a row). There's nothing to write
            // if the column data is null.
            if (datum != null)
                out.write(datum.toString());

            if (--i > 0)
                out.write(",\t");
        }
        out.write("\n");
    }

    public void startTable() throws IOException {
        /* nothing to do */}

    public void endTable() throws IOException {
        /* nothing to do */}
}
