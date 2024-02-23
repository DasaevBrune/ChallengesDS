public class App {


    private void m1InvertString(String text){
        String[]  array = text.split("");
        StringBuilder newText = new StringBuilder();
        for (int i = array.length; i > 0 ; i--) {
            newText.append(array[i - 1]);
        }

        System.out.println(newText);
    }

    private void m1InvertStringII(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    private void m2Capicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)){
            System.out.println("Is Capicua");
        }else {
            System.out.println("Not Capicua");
        }
    }


    private void m3CounterCharacterTimes(String text){
        int counter[] = new int[256];
        for (int i = 0; i < text.length(); i++) {
            counter[text.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (counter[i] !=0){
                System.out.println((char) i + " : " + counter[i]);
            }
        }
    }


    public static void main(String[] args) {
        App app = new App();
        //app.m1InvertString("mitocode");
        //app.m1InvertStringII("mitocode");
        //app.m2Capicua(565);
        app.m3CounterCharacterTimes("dasaev");
    }
}
