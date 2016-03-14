import guestinfo.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class DataReader {
    private String fileName;

    public DataReader(String fileName) {
        this.fileName = fileName;
    }
    LinkedList<Person> list = new LinkedList<>();
    public List<Person> getData() {
        FileReader file;
        try {
            file = new FileReader(this.fileName);
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            while (line != null) {
                Person person = new Person(line);
                person.initialiseValues();
                list.add(person);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}