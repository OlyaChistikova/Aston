package ProselyteTutorials;


import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {

        // Перевернуть строку и вывести на консоль
        String string = "I love Java";
        turnString(string);

        // Удалить дубликаты из массива и вывести в консоль
        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        getDistinctNumbers(ints);

        //Дан массив, заполненный уникальными значениями типа int
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
        System.out.println(findSecondMaxElement(arr));

        // Найти длину последнего слова в строке. В строке только буквы и пробелы.
        String string1 = "Hello world"; //5
        String string2 = "    fly me    to the moon    "; // 4
        System.out.println(lengthOfLastWord(string1));
        System.out.println(lengthOfLastWord(string2));

        // Определить, что строка является палиндромом
        // Сложность по памяти O(1), не создавать новые String, StringBuilder
        String string3 = "боб";
        String string4 = "1234311";
        System.out.println(isPalindrome(string3));
        System.out.println(isPalindrome(string4));

    }
    public static void turnString(String string) {
        String[] words = string.split(" ");
        for (int i = words.length - 1; i > -1; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
    public static void getDistinctNumbers(int[] ints) {
        for (int i = 0; i < ints.length; i++){
            int x = ints[i];
            for (int j = i+1; j < ints.length; j++){
                if (ints[j] == x){
                    ints[j] = 0;
                }
            }
        }
        for (int i = 0; i < ints.length; i++){
            if (ints[i] != 0)
                System.out.print(ints[i]);
        }
        System.out.println();
    }

    public static Integer findSecondMaxElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static Integer lengthOfLastWord(String string) {
        String str = string.trim();
        int lastIndexSpace = str.lastIndexOf(" ");
        return (str.length() - 1) - lastIndexSpace;
    }

    public static boolean isPalindrome(String string) {
        int start = 0;
        int end = string.length() - 1;
        while (start < end) {
            if (string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
