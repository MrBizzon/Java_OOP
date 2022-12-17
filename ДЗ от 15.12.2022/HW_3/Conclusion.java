package HW_3;

import java.util.ArrayList;

public class Conclusion {

    public static String Member(ArrayList<FamilyMember> Data) {
        StringBuilder res = new StringBuilder();
        for (FamilyMember FamilyMember : Data) {
            res.append(FamilyMember.getFullName() + '\t');
        }
        return res.toString();
    }
}