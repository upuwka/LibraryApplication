package controlPanel;

import entityPanel.Reader;

import java.util.ArrayList;

public class Registration {
    private ArrayList<Reader> readers = new ArrayList<Reader>();

    public String addReader(Reader reader){
        this.readers.add(reader);
        return "Reader " + reader.getName() + " created successfully,";
    }

    public ArrayList<Reader> getAllReaders(){
        return readers;
    }
}
