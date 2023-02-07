/**
* Credits: https://www.baeldung.com/java-generating-random-numbers-in-range
*/
public int getRandomNumberUsingNextInt(int min, int max) {
    Random random = new Random();
    return random.nextInt((max + 1) - min) + min;
}