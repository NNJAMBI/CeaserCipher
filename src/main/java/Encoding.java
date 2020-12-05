public class Encoding {
    private int mKey;
    private String mInputText;
    //instantiate code
    public Encoding(String inputText, int key) {
        mKey = key;
        mInputText = inputText;
    }
    //create a getter method and check if inputText is saved
    public String getInputText(){
        return mInputText;
    }

}
