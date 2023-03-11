package Greedy;

public class MinLight {

    public static int light(String road) {
        char[] str = road.toCharArray();
        int index = 0;
        int light = 0;
        while (index < str.length) {
            if (str[index] == 'x') {
                index++;
            } else {
                light++;
                if (index + 1 == str.length) {
                    break;
                } else {
                    if (str[index + 1] == 'x') {
                        index = index + 2;
                    } else {
                        index = index + 3;
                    }
                }

            }
        }
        return light;
    }


}
