public static String compressString(String text) {
    int length = text.length();

    if (length > 2) {
        String compressedText = "";
        char lastChar = text.charAt(0);
        int char count = 1;
        for(int i = 1; i < length; i++) {
            if(text.charAt(i) == lastChar)
                charCount++;
            else {
                compressedText += Character.toString(lastChar) + Integer.toString(charCount);
                lastChar = text.CharAt(i);
                charCount = 1;
        }
        }
        compressedText += Character.toString(lastChar) + Integer.toString(charCount):
        if(compressedText.length() < length)
            return compressedText;
            return text;
        }



        }