package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private StringBuilder answer;
    private Character delimeter;


    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        answer = new StringBuilder();
    }

    public StringAssembler append(String str) {
        answer.append(str);
        answer.append(delimeter);
        return this;
    }

    public String assemble() {
        answer.deleteCharAt(answer.length() - 1);
        return answer.toString();
    }
}
