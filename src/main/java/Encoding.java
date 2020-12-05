public class Encoding {
    private int mKey;
    private String mInputText;
    public Encoding(String inputText, int key) {
        mKey = key;
        mInputText = inputText;
    }
    //create a getter method
    public String getInputText(){
        return mInputText;
    }

}
