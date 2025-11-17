package stringCahin.stringCahin;

//מחלקה E (סיום השרשרת)
public class E {
public String process(String prefix) {
	if (prefix.length() < 4) {
        throw new IllegalArgumentException("קלט קצר מדי");
    }
   return prefix + "O";
}
}
