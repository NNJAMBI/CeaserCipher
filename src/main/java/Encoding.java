public class Encoding {
    private int mKey;
    private String mInputText;

    //instantiate code
    public Encoding(String inputText, int key) {
        mKey = key;
        mInputText = inputText;
    }

    //create a getter method and check if inputText is saved
    public String getInputText() {
        return mInputText;
    }

    //create a getter method and check if key is saved
    public int getKey() {
        return mKey;
    }

    public boolean isNotEmpty() {
        return !mInputText.trim().isEmpty();
    }

    public boolean isValidInputText() {
        char[] chars = mInputText.toCharArray();

        for (char c : chars) {
            if (Character.isLetter(c) && c != ' ') {
                return true;
            }

        }
        return false;
    }
      public boolean isValidKey(){
        return mKey >1 && mKey < 26;
      }


      //encoding logic
      public String encode() {
        String encoded = "";
        String encodedArray[] = mInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length; i++) {
            if (mInputText.charAt(i) == ' ') {
                encoded += " ";}
                    else {
                        int charPosition = alphabet.indexOf(mInputText.charAt(i));
                        int key = (mKey + charPosition) % 26;
                        encoded += alphabet.charAt(key);
                    }
                }
                return encoded.toUpperCase();
            }
        }



