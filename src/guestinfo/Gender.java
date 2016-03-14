package guestinfo;

import java.util.HashMap;

public class Gender {

    private String gender;

    public Gender(String gender) {
        this.gender = gender;
    }

    public String getPrefix() {
        HashMap<String ,String> prefixes = new HashMap<>();
        prefixes.put("Male" ,"Mr");
        prefixes.put("Female" ,"Ms");
        return prefixes.get(gender);
    }
}
